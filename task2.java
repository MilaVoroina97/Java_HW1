public class task2 {
    // Вывести все простые числа от 1 до 1000
public static void main(String[] args) {

    int count = 0;
    for(int i = 2; i <= 100; i++){
        for(int j = 2; j < i; j++){
            if(i % j != 0){
                count++;
            }
        }
        if(count == i-2){
            System.out.println(i);

        }
        count = 0;
    }
    
}
    
}
