public class Admin extends User {

    @Override
    String getPermissions() {
        return null;
    }

    @Override
    public
    boolean authenticate() {
        return false;
    }
}