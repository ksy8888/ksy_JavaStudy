package ���ʺ���;

import java.io.*;
import java.util.*;

public class �Ҽ����ϱ�2_1929 {
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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=N; i<=M; i++) {
			 if(check(i)) {
				//���
				 bw.write(String.valueOf(i+"\n"));
			} else {
				continue;
			}
		}
		bw.flush(); 
		br.close();
	}
	
	public static boolean check(int num) {
		if(num==1) {
			return false;
		} 
		for(int i=2; i<=(int)Math.sqrt(num); i++) {
			//i%2==0
			//�Ҽ��� 1�� �ڱ� �ڽ� �ܿ��� � ���ε� ������ �������� �ʴ� ���� ����.
			//num�� i�� ������ ������ �� false�� ��ȯ�϶�"�� �ǹ̷�, num�� i�� ������ �������ٴ� ���� �Ҽ��� �ƴ϶�� ��
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
}
