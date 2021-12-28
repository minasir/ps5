/* Prolem Set 6 
* Problem 4
* Misha Nasir 
* This problem implement sgenerate sum efficiently -- runtime is O(n)
*/

public class GenerateSums {
    public static String generateSums(int n) {
        int sum = 0; 
        String addition = "";
        String result = "";
        for (int i = 1; i <= n; i++){ 
            sum += i;
            if (i == 1){
                result += i + " \n";
                addition = Integer.toString(i);
            }else if (i != 1 && i < n){
                result += addition + " + " + i;
                addition = addition + " + " + i;

                if (i != 1){
                    result += " = " + sum + " \n";
                }
            }else{
                result += addition + " + " + i + " = " + sum;
            }  
        }
        return result; 
    }




     public static void main(String[] args) { 
        
        System.out.println(generateSums(4));
        System.out.println(generateSums(6));
    }
}



