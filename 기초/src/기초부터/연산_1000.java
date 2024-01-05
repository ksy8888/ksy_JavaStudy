package 기초부터;

import java.io.*;
import java.util.StringTokenizer;

public class 연산_1000 {
// 0<A , B<10
/* <입력> 1 2
 * <출력> 3
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int[] sNum = new int[2];
	sNum[0] = Integer.parseInt(st.nextToken());
	sNum[1] = Integer.parseInt(st.nextToken());
	
	System.out.println(sNum[0]+sNum[1]);
	br.close();
	}
// 배열 말고 더 간단하게. 이 문제에 굳이 배열을 왜 썼을까...
/*
* int a = Integer.parseInt(st.nextToken());
* int b = Integer.parseInt(st.nextToken());
* System.out.println(a+b);  끗
*/
	
}
