package ���ʺ���;

import java.io.*;
import java.util.StringTokenizer;

public class ����_1000 {
// 0<A , B<10
/* <�Է�> 1 2
 * <���> 3
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int[] sNum = new int[2];
	sNum[0] = Integer.parseInt(st.nextToken());
	sNum[1] = Integer.parseInt(st.nextToken());
	
	System.out.println(sNum[0]+sNum[1]);
	br.close();
	}
// �迭 ���� �� �����ϰ�. �� ������ ���� �迭�� �� ������...
/*
* int a = Integer.parseInt(st.nextToken());
* int b = Integer.parseInt(st.nextToken());
* System.out.println(a+b);  ��
*/
	
}
