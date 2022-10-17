import java.sql.*;
import java.util.Arrays;

public class UserDao {
    private static final String CREATE_USER_QUERY = "INSERT INTO users(username,email,password) VALUES (?,?,?)";
    private static final String GET_USER_QUERY = "SELECT * FROM users WHERE id = ?";
    private static final String UPDATE_USER_QUERY = "UPDATE users SET username = ?, email = ?, password = ? where id = ?";

    private static final String GET_USERS_QUERY = "SELECT * FROM users";
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";

    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public User create(User user) {
        try (Connection conn = DbUtil.connect()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, hashPassword(user.getPassword()));
            statement.executeUpdate();
            //Pobieramy wstawiony do bazy identyfikator, a następnie ustawiamy id obiektu user.
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User read(int userId) {
        try (Connection conn = DbUtil.connect()) {
            PreparedStatement preStmt = conn.prepareStatement(GET_USER_QUERY);
            preStmt.setInt(1, userId);
            ResultSet rs = preStmt.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUserName(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public void update(User user){
        try (Connection conn = DbUtil.connect()) {
         PreparedStatement preStmt = conn.prepareStatement(UPDATE_USER_QUERY);
         preStmt.setString(1,user.getUserName());
         preStmt.setString(2,user.getEmail());
         preStmt.setString(3,this.hashPassword(user.getPassword()));
         preStmt.setInt(4,user.getId());
         preStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public User[] findAll() {
        try (Connection conn = DbUtil.connect()) {
            User[] users = new User[0];
            PreparedStatement preStmt = conn.prepareStatement(GET_USERS_QUERY);
            ResultSet rs = preStmt.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUserName(rs.getString("userName"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                users = Arrays.copyOf(users,users.length+1);
                users[users.length-1] = user;
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }
    public void delete(int userId){
        try (Connection conn = DbUtil.connect()) {
            PreparedStatement statement = conn.prepareStatement(DELETE_USER_QUERY);
            statement.setInt(1, userId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
