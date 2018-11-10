package Amazon;
/**
 * LeetCode 537
 * @author kokonatsudream
 *
 */
public class ComplexNumberMultiplication {
	public String complexNumberMultiply(String a, String b) {
        String[] complexA = a.split("\\+");
        String[] complexB = b.split("\\+");
        
        int complexA_num = getNum(complexA[0]);
        int complexA_i = getNum(complexA[1]);
        int complexB_num = getNum(complexB[0]);
        int complexB_i = getNum(complexB[1]);
        
        int total_i = 0;
        int num = 0;
        
        num = complexA_num * complexB_num - complexA_i * complexB_i;
        total_i = complexB_i * complexA_num + complexA_i * complexB_num;
        
        
        String res = num + "+" + total_i + "i";
       
        return res;
       
    }
	
	public int getNum(String number){
		int sign = 1;
		
		if(number.contains("-")){
        	sign = -1;
        	number = number.replace("-", "");
        }
		if(number.contains("i")){
			number = number.replace("i", "");
		}
		
		return Integer.valueOf(number) * sign;
	}
}
