package �����ձ��ϱ�_1;

import java.io.*;
import java.util.*;

public class test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());   //���� ���� �Է¹ޱ�
		int M = Integer.parseInt(st.nextToken());   //���� �Է¹ޱ�
		//�� �迭 ����
		long[] S = new long[N+1];
		
		st = new StringTokenizer(br.readLine()); //���� �� ���� ���ڵ� 2��°�� >> �� ��ü
		for(int i=1; i<=N; i++) {
			S[i] = S[i-1]+ Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<M; j++) {
			//�����ޱ�
			st = new StringTokenizer(br.readLine());
			//a���� b����
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(S[b]-S[a-1]);
		}
		

	}

}
