package �迭;

import java.io.*;
import java.util.StringTokenizer;

public class �迭����4_2562 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nums = new int[9];
		for(int i=0; i<nums.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = nums[0];
		//ù ��° ���� �Է¹ް� �����߱� ������ ������ �� �ڿ� ó���� �ϴ� ���� �´�.
		int count = 1; //�׷��� ī��Ʈ 1����...
		for(int j=0; j<nums.length; j++) {
			if(max < nums[j]) {
				max = nums[j];
				//max���� ��ġ�� ã�� ���ؼ���, max���� ���ŵ� ������ �� ���� �ε����� �����ؾ���
				//count++;�̰žƴ�
				count = j+1; //�迭�̴� +1
			}
		}
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(count));
	//	System.out.println(max);
		//System.out.println(count);
		bw.flush();
		bw.close();
		br.close();
	}

}
