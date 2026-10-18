public class Main {
    public static void main(String []args){
        Greeting g1 = () ->{
            System.out.println("hello world!");
        };
        g1.greet();
    }
}