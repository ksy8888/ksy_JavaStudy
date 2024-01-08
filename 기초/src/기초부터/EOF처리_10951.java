package 기초부터;

import java.io.*;
import java.util.StringTokenizer;

public class EOF처리_10951 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input ="";
		//br.readLine()을 호출하여 한 줄을 읽어 input 변수에 저장
		while((input=br.readLine()) != null && !input.isEmpty()) {	//EOF 처리 방법
			StringTokenizer st = new StringTokenizer(input); //여기서 다시 br.readLine()시 다시 읽어서 공란일때가 발생.
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());		
			
			bw.write((a+b)+"\n");
		}
		bw.flush(); 
		br.close();
		
	}

}
