package SimpleFactoryPattern.AuthorityManagement;

public class Client {
    public static void main(String args[]){
        try{
            User user;
            UserDao userDao = new UserDao();
            int permission = userDao.findPermission("zhangsan","123456");
            user = UserFactory.getUser(permission);
            user.sameOperation();
            user.diffOperation();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
