interface DaoI{
    public abstract void login();
    public abstract void logout();
}
interface USI{
    public abstract void forgotpassword();
}

class DaoImpl implements DaoI,USI{
    public void login(){
        System.out.println("balu");
    }
    public void logout(){
        System.out.println("logout");
    }
    public void forgotpassword(){
        System.out.println("password updated succesfully");
    }

}
public class multiple{
    public static void main(String[] args) {
        DaoImpl obj=new DaoImpl();
        obj.login();
        obj.logout();
        obj.forgotpassword();
    }
}


