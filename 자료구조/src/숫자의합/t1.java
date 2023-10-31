package 숫자의합;
import java.util.*;

public class t1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		
		System.out.println("cNum: "+cNum.length);
		
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i]-'0';
			System.out.println("반복문안에서..."+sum);
		}
		System.out.println("최종값"+sum);
	}

}
