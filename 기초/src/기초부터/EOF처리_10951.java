package ���ʺ���;

import java.io.*;
import java.util.StringTokenizer;

public class EOFó��_10951 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input ="";
		//br.readLine()�� ȣ���Ͽ� �� ���� �о� input ������ ����
		while((input=br.readLine()) != null && !input.isEmpty()) {	//EOF ó�� ���
			StringTokenizer st = new StringTokenizer(input); //���⼭ �ٽ� br.readLine()�� �ٽ� �о �����϶��� �߻�.
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());		
			
			bw.write((a+b)+"\n");
		}
		bw.flush(); 
		br.close();
		
	}

}
