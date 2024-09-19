    // interface account{
    //     int get_bal();
    //     void close_acc();
    // }
    // class SA implements account{
         
    // }
    
    interface A{

        public abstract void m1();

    }
    interface B{

        public abstract void m2();


    }
    class Test implements A,B{
        public void m1(){
            
            System.out.println("acc opened");
        }
        public void m2(){
            System.out.println("acc closed");
        }

        public static void main(String[] args) {
            Test t1=new Test();
            t1.m1();
            t1.m2();
        }

    }