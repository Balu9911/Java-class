public class testservice {
    public static void main(String[] args) {
        paymentservice ps=new paymentservice();
        ps.setStatus("Yes");
        String acc_status=ps.getStatus();
        System.out.println(acc_status);
    }
    
}
