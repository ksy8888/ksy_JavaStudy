package ������_2;

import java.io.*;
import java.util.StringTokenizer;

public class ������2_test1 {
//���� �¶������� 11660��
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer >> � �������� �Է� �����͸� ���� ���ΰ�.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//N�� �迭 ũ�� NxN�� 2���� �迭
		int M = Integer.parseInt(st.nextToken());	//M�� ���Ǽ�
		
		//���� �迭 A����
		int A[][] = new int[N+1][N+1]; //�迭 ������ new int[N][N]
		//�������� �־��� ���� �״�� �迭�� �ε����� ����Ϸ��� �迭�� ũ�⸦ 1�� �� ũ�� �����ؾ���
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//������ �迭 D����
		//***ArrayIndexOutOfBoundsException ���� 0-1�� �ع����� ������ ��
		int D[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				D[i][j] = D[i][j-1]+D[i-1][j]-D[i-1][j-1]+A[i][j];
			}
		}
		
		//���Ǹ� �޾� �������� ���Ѵ�
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			//x1 y1 x2 y2
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			// 2 2 3 4
			int result = D[x2][y2]-D[x2][y1-1]-D[x1-1][y2]+D[x1-1][y1-1];
			System.out.println(result);
		}
		
	}

}
