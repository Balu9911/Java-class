interface DaoI{
   void login();
   void logout();
}
interface USI extends DaoI{
    void forgotpassword();
}
class USImpl implements  USI{
    public void login(){
        System.out.println("login successfully");
    }
    public void logout(){
        System.out.println("logout succesfully");
    }
    public void forgotpassword(){
        System.out.println("password updated successfully");
    }
    

}
public class inter_inter {
    public static void main(String[] args) {
       USImpl obj=new USImpl();
       obj.login();
       obj.logout();
       obj.forgotpassword();
    }
    
}
