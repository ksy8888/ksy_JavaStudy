package �迭;

import java.io.*;
import java.util.*;

public class �迭����_10807 {
//�� N���� ������ �־����� ��, ���� v�� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
/* <�Է�>
 * ù° �ٿ� ������ ���� N(1 �� N �� 100)�� �־�����. ��° �ٿ��� ������ �������� ���еǾ����ִ�. 
 * ��° �ٿ��� ã������ �ϴ� ���� v�� �־�����. �Է����� �־����� ������ v�� -100���� ũ�ų� ������, 100���� �۰ų� ����.
 */
	/*<���>
	 * ù° �ٿ� �Է����� �־��� N���� ���� �߿� v�� �� ������ ����Ѵ�.
	 */
	public static void main(String[] args)  throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//N���� ����
		int N = Integer.parseInt(br.readLine());
//*** ���� ����Ʈ������ N+1�� �����ϰ� �ݺ��� ������ i=1���ϸ� Ʋ�ȴٰ� ������
//	int[] nums = new int[N];
// 	for(int i=0; i<N; i++) { .. } �̷�������... �ð��� ���ȴ�.. 
		//N���� ������ ��� nums �迭 ����
		int[] nums = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		//nums �迭�� �� ä���
		for(int i=1; i<=N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		//v �Է� �ޱ�
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		for(int j=0; j<nums.length; j++) {
			//�Է¹��� vã��
			if(nums[j]==v) {
				count++;
			}
		}
		
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
