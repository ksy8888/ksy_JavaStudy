package �迭.���ֱ�_10810;

import java.io.*;
import java.util.*;

public class ���ֱ�_10810 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		//�ٱ��� N���� M���� ���ִ� ���
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//�ٱ��� �迭 ����
		int[] ba = new int[N]; // ��� �ٱ��ϰ� 0���� �ʱ�ȭ ���ױ� ������, �ٱ��� ����ִ� ��츦 ó�� �����൵��.
		// I�� �ٱ��Ϻ��� J�� �ٱ��ϱ����� K�� ��ȣ�� ������ �ִ� ��
		//���ִ� ��� �Է�
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			//�ٱ��� �迭�� �ֱ�. I�������ε� �迭�̴� -1����
			for(int j=I-1; j<J; j++) {
				ba[j] = K;
			}
		}
		for(int k=0; k<ba.length; k++) {
//			if(ba[k]==0) {
//				�ʿ����. ������ 0���� �ʱ�ȭ�߰�, ��� �ٱ��Ͽ��� �ּ��� �ϳ��� ���� ��������.
//			}
			bw.write(ba[k]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
