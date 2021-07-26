package contanumero;

import java.util.Arrays;

public class CountNumber {
       
       private static int countNumbers(int[] numbers, int lessThan){
             
             Arrays.sort(numbers);
             return Arrays.stream(numbers).filter(number -> number < lessThan ).toArray().length;
             
       }
       
       
       public static void main(String[] args) {
             
             System.out.println(countNumbers(new int[] {1,3,5,7}, 10));
             
       }

}

