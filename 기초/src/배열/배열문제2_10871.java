package �迭;

import java.io.*;
import java.util.StringTokenizer;

public class �迭����2_10871 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int X = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine()); 	///////
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<A.length; j++) {
			//x �� a ��
			if(A[j] < X) {
				// A[j]�� X���� ���� ��� StringBuilder�� A[j]�� �߰��ؾ� �Ѵ�.
				// str = sb.toString();
				sb.append(A[j]).append(' ');	////
			}
		}
		String str = sb.toString();
		bw.write(str);
		bw.flush();
		bw.close();
		br.close();
	}

}
