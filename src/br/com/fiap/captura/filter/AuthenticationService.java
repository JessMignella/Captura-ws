package br.com.fiap.captura.filter;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.StringTokenizer;

public class AuthenticationService {

	public boolean authentication(String autCredentials) {
		if (autCredentials == null) {
			return false;
		}

		final String encodedUserPassword = autCredentials.replaceFirst("Basic ", "");
		String userNamedPassword = null;

		try {
			byte[] decodeByte = Base64.getDecoder().decode(encodedUserPassword);

			userNamedPassword = new String(decodeByte, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final StringTokenizer token = new StringTokenizer(userNamedPassword, ":");
		if (token.countTokens() < 2) {
			return false;
		}
		String user = token.nextToken();
		String pass = token.nextToken();

		if (!("jess".equals(user) && "123".equals(pass))) {
			return false;
		}

		return true;
	}
}
