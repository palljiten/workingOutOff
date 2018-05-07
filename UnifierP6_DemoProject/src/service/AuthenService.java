package service;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.oracle.xmlns.primavera.p6.ws.authentication.v1.AuthenticationService;
import com.oracle.xmlns.primavera.p6.ws.authentication.v1.AuthenticationServicePortType;

import configuration.P6WSConfiguration;

public class AuthenService  extends P6WSConfiguration 
{
	private List<String> m_cookieHeaders = null;
	
	public boolean authenticationP6() throws Exception {
		//Authentication URL
		String url = makeHttpURLString(authenticationService);
		URL wsdlURL = new URL(url);
		AuthenticationService service = new AuthenticationService(wsdlURL);
		//Service Port is a port on which authentication services work
		AuthenticationServicePortType servicePort = service.getAuthenticationServiceSOAP12PortHttp();
		BindingProvider bp = (BindingProvider) servicePort;
		bp.getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        // Login with user name and password, using database instance 1, and
		// verbose faults
		Boolean retVal = servicePort.login(username, password, 1);
		Map<String, Object> responseContext = bp.getResponseContext();
		//System.out.println(responseContext);

		// Cookie must be used in all subsequent calls
		@SuppressWarnings("unchecked")
		Map<String, List<String>> responseHeaders = (Map<String, List<String>>) responseContext
				.get("javax.xml.ws.http.response.headers");
		/*for(String val:responseHeaders.get("Set-Cookie"))
		{
			System.out.println("value-----------"+val);
		}*/
		//System.out.println(responseHeaders.get("Set-Cookie").size());
		m_cookieHeaders = responseHeaders.get("Set-Cookie");
		//System.out.println("Cookies------------------------------------"+m_cookieHeaders);
		return retVal.booleanValue();
	}

	public void logout(/*AuthenService authService*/) throws Exception 
	{
		/*String url = makeHttpURLString(authenticationService);
		URL wsdlURL = new URL(url);
		
		//AuthenticationService service = new AuthenticationService(wsdlURL);
		AuthenticationServicePortType servicePort = authService.getAuthenticationServiceSOAP12PortHttp();
		
		
		// Client client = ClientProxy.getClient(servicePort);
		
		setCookieOrUserTokenData((BindingProvider) servicePort);
		
		//servicePort.l;
		
		servicePort.logout(authService);
		
		servicePort.logout("");
		
		//servicePort.logout(authenticationService);
*/		
		
		
		String url = makeHttpURLString(authenticationService);
		URL wsdlURL = new URL(url);
		AuthenticationService service = new AuthenticationService(wsdlURL);
		AuthenticationServicePortType servicePort = service.getAuthenticationServiceSOAP12PortHttp();
		// Client client = ClientProxy.getClient(servicePort);
		setCookieOrUserTokenData((BindingProvider) servicePort);
		servicePort.logout("");
	}
	
	 private AuthenticationServicePortType getAuthenticationServiceSOAP12PortHttp() {
		// TODO Auto-generated method stub
		return null;
	}

	String makeHttpURLString(String suffix) {

		StringBuilder sb = new StringBuilder(Boolean.valueOf(useSSL) ? https : http);
		
		sb.append(hostname).append(":").append(Boolean.valueOf(useSSL) ? httpsPort : httpPort).append(suffix);

		return sb.toString();
	}
	
	 void setCookieOrUserTokenData(BindingProvider bp) {

		// System.out.println("-----------------in setCookieOrUserTokenData----------------------");
		Binding binding = bp.getBinding();
		List<Handler> handlerChain = binding.getHandlerChain();
		handlerChain.add(new LoggingHandler());
		setCookie(bp);

	}

	 void setCookie(BindingProvider bp) 
	 {
		 
		//System.out.println("----------------In setCookie----------------------");
		bp.getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
		// System.out.println(bp.getRequestContext().get(BindingProvider.SESSION_MAINTAIN_PROPERTY));

		@SuppressWarnings("unchecked")
		Map<String, List<String>> headers = (Map<String, List<String>>) bp.getRequestContext()
				.get("javax.xml.ws.http.request.headers");

		if (headers == null) {
			headers = new HashMap<String, List<String>>();
			bp.getRequestContext().put("javax.xml.ws.http.request.headers", headers);
		}

		headers.put("cookie", m_cookieHeaders);
		//System.out.println("-------------------setting m_cookieHeaders in subsquent call--------------------------");
		//System.out.println(m_cookieHeaders);
	}

}
