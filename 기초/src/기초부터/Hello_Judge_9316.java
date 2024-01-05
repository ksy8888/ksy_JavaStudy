package 기초부터;
import java.io.*;
//숫자 입력
/* 입출력 결과
* <입력> 3
* <출력>
* Hello Judge 1
* Hello Judge 2
* Hello Judge 3
*/
//BufferedReader 사용을 연습해보자.
public class Hello_Judge_9316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			System.out.println("Hello Judge "+i);
		}
	}
}
