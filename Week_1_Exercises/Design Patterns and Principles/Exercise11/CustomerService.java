public class UserService {
    private UserRepository userDataAccess;

    // Constructor injection
    public UserService(UserRepository userDataAccess) {
        this.userDataAccess = userDataAccess;
    }

    public User getUserById(int userId) {
        return userDataAccess.fetchUserById(userId);
    }
}