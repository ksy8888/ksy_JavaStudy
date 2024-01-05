package 구간합구하기_1;

import java.io.*;
import java.util.*;

public class test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());   //수의 갯수 입력받기
		int M = Integer.parseInt(st.nextToken());   //범위 입력받기
		//합 배열 생성
		long[] S = new long[N+1];
		
		st = new StringTokenizer(br.readLine()); //구간 합 구할 숫자들 2번째줄 >> 수 전체
		for(int i=1; i<=N; i++) {
			S[i] = S[i-1]+ Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<M; j++) {
			//범위받기
			st = new StringTokenizer(br.readLine());
			//a부터 b까지
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(S[b]-S[a-1]);
		}
		

	}

}
