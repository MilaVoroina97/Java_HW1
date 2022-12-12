import java.util.ArrayList;
import java.util.List;



public class task2 {


    public static List<Integer> prime_num(int n){

        List<Integer> res = new ArrayList<>();
        int k = 0;
        for(int i = 2; i <=n; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){ //ищем количество делителей
                    k++;
                }
            }
            if(k == 0){//если делителей нет, то добавляем в список
                res.add(i);
            }else{
                k = 0;
            }
        }
        return res;
    }

public static void main(String[] args) {

    List<Integer> result = prime_num(1000);
    System.out.println(result);

    
}
    
}
