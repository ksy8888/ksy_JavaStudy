package �����ձ��ϱ�_1;
import java.io.*;
import java.util.StringTokenizer;

public class test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = Integer.parseInt(br.readLine());	//���� ���� �Է�
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); //���� ���� �Է�
		int M = Integer.parseInt(st.nextToken()); //���� �Է�
		
		long[] S = new long[N+1];  //
		 st = new StringTokenizer(br.readLine());
		 
		for(int i=1; i<=N; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken()); //�չ迭 ����
		}
		for(int k=0; k<M; k++) {
			st = new StringTokenizer(br.readLine());
			//�����ޱ� i~j
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			//������ ���
			System.out.println(S[j]-S[i-1]);
		}
		
		
		
		
	}

	

}
