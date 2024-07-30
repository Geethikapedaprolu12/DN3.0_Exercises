public class UserRepositoryImpl implements UserRepository {
    @Override
    public User fetchUserById(int userId) {
        // For demonstration purposes, we'll just return a dummy user.
        return new User(userId, "Jane Smith");
    }
}