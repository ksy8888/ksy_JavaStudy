package ���ʺ���;

import java.io.*;
import java.util.*;

public class AB_5_10952 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//StringTokenizer st = new StringTokenizer(br.readLine()); //�ۿ��� ���� �� ù��° �Է� ���� ��ū�� �и�������.
		//NoSuchElementException
		while(true) {
			//while ���� �ݺ��� ������ ���ο� ���� �о���̰�, �� ���� ��ū�� �и��ؾ� �ϱ� ������ ���ʿ��� �����ؾ���
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			} else {
				bw.write((a+b)+"\n");
				
			}
		}
		bw.flush(); 
		br.close();
	}

}
