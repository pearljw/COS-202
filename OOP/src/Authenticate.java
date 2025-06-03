public interface Authenticate {
    boolean authenticate(String email, String password);

    boolean authenticate();
    String otp();
    String passKey();
}
