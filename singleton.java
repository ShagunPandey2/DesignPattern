public class singleton {

    private static singleton instance = new singleton();
    private singleton(){}
    public static singleton getInstance(){
       return instance;
    }
 
    public void showMessage(){
       System.out.println("Singleton Design Method ");
    
    }
 }
 
 