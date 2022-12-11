import java.util.Scanner;

public class task1 {
    // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static int sum_numbers(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static int prod_number(int m){
        int prod = 1;
        for(int i = 1; i <=m; i++){
            prod *=i;
        }
        return prod;
    }
    public static boolean isTriangle(int s){
        if(s < 0){
            return false;
        }
        int sum = 0;
        for(int i = 1; i <= s; i++){
            sum += i;
            if(sum == s){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        try{
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите, пожалуйста любое целое число: ");
            int a = iScanner.nextInt();
            int b = sum_numbers(a);
            System.out.printf("Сумма чисел от 1 до %d = %d ",a,b);
            System.out.println();
            System.out.println("Введите, пожалуйста другое целое число: ");
            int c = iScanner.nextInt();
            int d = prod_number(c);
            System.out.printf("Произведение чисел от 1 до %d = %d ",c,d);
            System.out.println();
            System.out.println("Введите число для проверки: ");
            int e = iScanner.nextInt();
            boolean f = isTriangle(e);
            if (f){
                System.out.println("Это число является треугольным");
            }
            else{
                System.out.println("Это число не является треугольным");
            }
            iScanner.close();

    
        }
        catch(Exception e)
        {   
            System.out.println("Введите,пожалуйста,именно целое число");
        }


    }
    
}
