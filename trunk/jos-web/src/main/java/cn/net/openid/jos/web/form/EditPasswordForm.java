/**
 * Created on 2006-10-29 上午02:58:18
 */
package cn.net.openid.jos.web.form;

import java.io.Serializable;

/**
 * @author Sutra Zhou
 * 
 */
public class EditPasswordForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5154439238450014108L;

	private String credentialId;
	private String password;
	private String retypedPassword;

	/**
	 * @return the credentialId
	 */
	public String getCredentialId() {
		return credentialId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the retypedPassword
	 */
	public String getRetypedPassword() {
		return retypedPassword;
	}

	/**
	 * @param credentialId
	 *            the credentialId to set
	 */
	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param retypedPassword
	 *            the retypedPassword to set
	 */
	public void setRetypedPassword(String retypedPassword) {
		this.retypedPassword = retypedPassword;
	}

}