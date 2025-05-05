package gm.grp.Model;

public class PasswordResetRequest {
    private String email;
    private String password;

    public PasswordResetRequest() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}