package vn.poly.sof302.lesson03.form;

/**
 * Login form
 * 
 * @author duongnguyen
 * @since 1.0.0
 */
public class LoginForm {

    private String username;

    private String password;

    private boolean remember;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the remember
     */
    public boolean getRemember() {
        return remember;
    }

    /**
     * @param remember
     *            the remember to set
     */
    public void setRemember(boolean remember) {
        this.remember = remember;
    }

}
