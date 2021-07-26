package testes;

import org.junit.jupiter.api.Test;
 
class CountNumbersTest {
 
    @Test
    void test() {
    	int lessers = CountNumber.countNumbers(new int[] {1,3,5,7}, 4);
		System.out.println(lessers + " menor(es)");
		if(lessers != 2){
			System.out.println("Problemsqq!!");			
		}
 
    }
}