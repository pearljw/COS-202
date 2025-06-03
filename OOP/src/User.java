public abstract class User implements Authenticate {
    private String email;
    private String password;

    @Override
    public boolean authenticate(String email, String) {
        return  false;
    }
  @Override
  public String otp(){
        return  null;
  }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

//    public String getPassword() {
//        return password;
//    }
//Setting the password but not viewing
    public void setPassword(String password) {
        this.password = password;
    }

    abstract String getPermissions();
}