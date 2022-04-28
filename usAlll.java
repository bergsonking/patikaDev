import java.util.Scanner;
public class usAlll {

    static int power(int a,int b) {
        int result = 1; 
        for(int i = 1; i<=b; i++){
            result *=a;
        }
        System.out.println("Sonuç: "+result);
        return result;
    }

     public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
       
        System.out.println("Taban: ");
        int a = scan.nextInt();
        
        System.out.println("Üs: ");
        int b = scan.nextInt();
        
        
        System.out.println(power(a, b));

        
    }
    
}
