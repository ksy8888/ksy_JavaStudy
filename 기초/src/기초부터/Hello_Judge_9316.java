package ���ʺ���;
import java.io.*;
//���� �Է�
/* ����� ���
* <�Է�> 3
* <���>
* Hello Judge 1
* Hello Judge 2
* Hello Judge 3
*/
//BufferedReader ����� �����غ���.
public class Hello_Judge_9316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			System.out.println("Hello Judge "+i);
		}
	}
}
