package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> lst = new ArrayList();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                lst.add("Fizz Buzz");
            } else if (i % 3 == 0){
                lst.add("Fizz");
            } else if (i % 5 == 0){
                lst.add("Buzz");
            }
        }
        return lst;
    }
}