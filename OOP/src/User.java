public abstract class User implements Authenticable {
    private String email;
    private String password;

    public User() {
    }

    public boolean authenticate() {
        return false;
    }

    public String otp() {
        return "";
    }

    public String passkey() {
        return "";
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    abstract String getPermissions();
}
