package 기초부터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기_1929 {
//<문제> M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//<입력> 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
	//ex) 3 16
//<출력> 	
/*
 * 3
 * 5
 * 7
 * 11
 * 13
 */
	//입력에서 빈 칸을 사이에 두고 주어짐 >> StringTokenizer 사용 >> 사용안하면 NumberFormatException 발생
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=N; i<=M; i++) {
			// 2로 나눠서 나머지가 1 (이거아님) 다시
			if(i%2==1) {
				System.out.println(i);
			}
		}
		br.close();
	}

}
