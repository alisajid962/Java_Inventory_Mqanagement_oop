package pack;

class User {
    // Private fields for encapsulation
    private String username;
    private String password;

    // Constructor to set credentials
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to validate login
    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(this.username) && this.password.equals(inputPassword);
    }
}