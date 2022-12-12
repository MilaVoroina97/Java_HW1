import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class task3 {

    public static String addSpaces(String exp){
        exp = exp.replaceAll("(?<=[0-9()])[\\/]", " / ");
        exp = exp.replaceAll("(?<=[0-9()])[\\^]", " ^ ");
        exp = exp.replaceAll("(?<=[0-9()])[\\*]", " * ");
        exp = exp.replaceAll("(?<=[0-9()])[+]", " + "); 
        exp = exp.replaceAll("(?<=[0-9()])[-]", " - ");
        exp = exp.replaceAll(" {2,}", " ");
    
           return exp;
    }
    // Реализовать простой калькулятор
    public static int calculator(String ex){
        String exp = addSpaces(ex);
        List<Integer> nums = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(exp);
        while(matcher.find()) {
            String s = matcher.group(0);
            if (s.replaceAll("\\D", "").length() == s.length()) {
                nums.add(Integer.parseInt(s));
            }
        }

        int res = 0;
        if(exp.contains("+") == true){
            res = nums.get(0) + nums.get(1);
        }else if(exp.contains("-") == true){
            res = nums.get(0) - nums.get(1);
        }else if(exp.contains("*") == true){
            res = nums.get(0) * nums.get(1);
        }else if(exp.contains("/") == true){
            res = nums.get(0) / nums.get(1);
        }else{
            System.out.println("Такой операции нет или возможно Вы неверно ввели выражение, выражение должно быть в формате 8 + 6");
        }
        return res;
}
    public static void main(String[] args) {
    
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите,пожалуйста, числовое выражение,состоящие из двух цифр и операции: ");
            String a = iScanner.nextLine();
            int result = calculator(a);
            System.out.printf("Результат выражения %s = %d",a,result);
            iScanner.close();
      

    }
}
