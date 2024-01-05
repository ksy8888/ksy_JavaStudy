package 평균구하기;
import java.io.*;
import java.util.StringTokenizer;

public class t2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //한줄 읽기 ***N은과목수
		
		//
		StringTokenizer st = new StringTokenizer(br.readLine()); //공백 제거 ***st는점수들
		
		//변수 st는 정수가 아니라 StringTokenizer 객체이기 때문에 오류남.
		//이 경우 st.countTokens()를 사용하여 토큰의 수 얻음
		//double A[] = new double[st.countTokens()]; << 이 방식이 아님 N과 st는 따로
		double A[] = new double[N]; //N은 과목의 갯수(루프를 결정함)
		
		for(int i=0; i<N; i++) {
			//이놈이 제일 문제였음......
			//A[i] = Integer.parseInt(br.readLine());
			//st 변수는 StringTokenizer를 이용하여 공백으로 문자열을 분리했음
			//st.nextToken()은 문자열에서 다음 토큰을 가져오는 메소드
			//즉, 루프를 돌면서 다음 토큰을 가져와 배열에 저장함
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		double max=0;
		//double 틀림. long으로 했었음(정수 나눗셈 문제발생)
		double sum=0;
		for(int i=0; i<N; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			sum += A[i];
		}
		System.out.println("평균은: "+ (sum/max)*100/N);
	}

}
