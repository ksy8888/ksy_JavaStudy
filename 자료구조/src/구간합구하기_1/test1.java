package 구간합구하기_1;
import java.io.*;
import java.util.StringTokenizer;

public class test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = Integer.parseInt(br.readLine());	//숫자 갯수 입력
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); //숫자 갯수 입력
		int M = Integer.parseInt(st.nextToken()); //범위 입력
		
		long[] S = new long[N+1];  //
		 st = new StringTokenizer(br.readLine());
		 
		for(int i=1; i<=N; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken()); //합배열 생성
		}
		for(int k=0; k<M; k++) {
			st = new StringTokenizer(br.readLine());
			//범위받기 i~j
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			//구간합 출력
			System.out.println(S[j]-S[i-1]);
		}
		
		
		
		
	}

	

}
