package ���ʺ���;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �Ҽ����ϱ�_1929 {
//<����> M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//<�Է�> ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ��� �ϳ� �̻� �ִ� �Է¸� �־�����.
	//ex) 3 16
//<���> 	
/*
 * 3
 * 5
 * 7
 * 11
 * 13
 */
	//�Է¿��� �� ĭ�� ���̿� �ΰ� �־��� >> StringTokenizer ��� >> �����ϸ� NumberFormatException �߻�
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=N; i<=M; i++) {
			// 2�� ������ �������� 1 (�̰žƴ�) �ٽ�
			if(i%2==1) {
				System.out.println(i);
			}
		}
		br.close();
	}

}
