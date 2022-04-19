import java.sql.SQLOutput;

public class palindrom {
    static boolean isPalindrom(int number){
        int temp = number,reverseNumber = 0,lastNumber;
        while(temp!=0){

            lastNumber = temp%10;

            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /=10; //böyle yaparak sondaki basamagı her döngüde atıyoz.
        }
        if(number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        /*Static bir metodun içerisine dışarıdan bir metot çağırmak istiyorsak
        * O metotta static başlamalıdır. */
        System.out.println( isPalindrom(341));
    }
}
