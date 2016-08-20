package br.com.fiap.captura.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RestAuthenticationFilter implements javax.servlet.Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		if(request instanceof HttpServletRequest){
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			String authCredentials = httpServletRequest.getHeader("Authorization");
			AuthenticationService authenticationService = new AuthenticationService();
			boolean authStatus = authenticationService.authentication(authCredentials);
			
			if(authStatus){
				filter.doFilter(request, response);
			}else{
				if(response instanceof HttpServletResponse){
					HttpServletResponse httpServletResponse = (HttpServletResponse) response;
					httpServletResponse.setStatus(httpServletResponse.SC_UNAUTHORIZED);
					httpServletResponse.getWriter().write("deu ruim parça");
					httpServletResponse.getWriter().flush();
					httpServletResponse.getWriter().close();
				}
			}
			
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
