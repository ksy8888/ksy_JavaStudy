package 기초부터;

import java.io.*;
import java.util.*;

public class AB_5_10952 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//StringTokenizer st = new StringTokenizer(br.readLine()); //밖에서 선언 시 첫번째 입력 줄의 토큰만 분리가능함.
		//NoSuchElementException
		while(true) {
			//while 문이 반복될 때마다 새로운 줄을 읽어들이고, 그 줄의 토큰을 분리해야 하기 때문에 안쪽에서 선언해야함
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
