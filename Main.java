public class Main {
    public static void main(String[]args){
System.out.println(square(2));
System.out.println(cubic(4));
String names=getNames("Benigne","Agasaro");
System.out.println(names);
System.out.println(checkage(2));
    }
    static double square(double number){
        return number* number;

    }
    static  double cubic(double number ){
        return number*number*number;
    }
    static String getNames(String firstname,String lastname){
        return firstname+ " "+" "+ lastname;
    }
    static boolean checkage(int age){
         if (age  >= 18){
            return true;
         }
         else{
            return false;
         }
    }
    
    
}