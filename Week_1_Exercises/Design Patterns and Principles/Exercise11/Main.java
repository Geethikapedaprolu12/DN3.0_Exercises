public class Main {
    public static void main(String[] args) {
        // Create the data access object implementation
        UserDataAccess userDataAccess = new UserDataAccessImpl();

        // Inject the data access object into the business logic
        UserService userService = new UserService(userDataAccess);

        // Use the business logic to find a user
        User user = userService.getUserById(1);
        System.out.println(user);
    }
}