package 구간합_2;

import java.io.*;
import java.util.StringTokenizer;

public class 구간합2_test1 {
//백준 온라인저지 11660번
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer >> 어떤 시점에서 입력 데이터를 받을 것인가.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//N은 배열 크기 NxN의 2차원 배열
		int M = Integer.parseInt(st.nextToken());	//M은 질의수
		
		//원본 배열 A생성
		int A[][] = new int[N+1][N+1]; //배열 생성을 new int[N][N]
		//문제에서 주어진 값을 그대로 배열의 인덱스로 사용하려면 배열의 크기를 1씩 더 크게 설정해야함
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//구간합 배열 D생성
		//***ArrayIndexOutOfBoundsException 주의 0-1을 해버리니 오류가 남
		int D[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				D[i][j] = D[i][j-1]+D[i-1][j]-D[i-1][j-1]+A[i][j];
			}
		}
		
		//질의를 받아 구간합을 구한다
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
