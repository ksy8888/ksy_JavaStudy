/*
 * 	피연산자 / 연산자
 * ------ 연산 대상
 * 
 * 피연산자 1개: 단항연산자
 * a++
 * 피연산자 2개: 이항연산자
 * 10+20
 * 피연산자 3개: 삼항연산자
 * 
 * 1. 단항연산자
 * 	***= 증감연산자 ( ++, -- ) 한개 증가/ 한개 감소 => 반복문
 * 		int a=10;
 * 		a++;
 * 			=> 11
 * 	***= 부정연산자 ( boolean만 사용가능 ) ! => 턴
 * 		boolean b = true;
 * 		!b;
 * 		=> false	//예약가능한 날
 * 		
 * 	***= 형변환연산자 (데이터형)
 * 		(int)10.5 => 소수점 제거	
 * 		(char)65 ==> 'A'
 * =================================downcasting (강제형변환)
 * 		(double)10 ==> 10.0
 * 		(int)'A' ==> 65
 * =================================upcasting (자동형변환)
 * 	
 * = 반전연산자 (양수 -> 음수) 음수표현 ~
 * 	int 이하 데이터형은 연산시에 결과값이 int다.
 * 	----- byte/short/char	 
 * 	int + double => double
 *  char + long => long
 *  
 *  byte + char => int
 *  
 *  		1. 단항 연산자
 *  			++ : 1개 증가
 *  			--: 1개 감소
 *  
 *  		형식
 *  			= 전치연산자 : 먼저 증가/감소
 *  				++a (그자리에서 증가)
 *  			= 후치연산자 : 나중에 증가/감소
 *  				a++ (다음거a에서 증가) >> 다음거에 넘겨줌
 *  
 *  		int a=10;
 *  		int b=++a;
 *  
 *  		int a=10;
 *  		int b=a++;
 *  
 *  		int a = 10;			//12
 *  		int b=a++ + a++	//21
 *  				 10     11
 *  
 *  		int a= 10; 	//12
 *  		int b = ++a + ++a 	//23
 *  		
 *  		int a = 10;
 *  		int  b =++a + a++;
 *  				10 		12
 *  
 *  		int a = 10;
 *  		int b = a++ + a++ + ++a + a++;
 *  					10     11    13      13
 *  
 *  		int a = 10;
 *  		int b = a++ + a++ + a++ + a++;
 *  					10     11      12    13
 *  		
 *  		int a = 10;
 *  		int b = ++a + ++a + ++a + ++a;
 *  				   11      12     13     14
 *  
 *  		int a = 10;
 *  		int b = a-- + a-- + --a;
 *  				  10      9       7
 *  
 *  		2. 부정 연산자 (!) ==> true/false
 *  			!true => false
 *  			!false => true
 *  
 *  		3. 형변환 연산자
 *  			10.5+10.5 ==> 21.0
 *  			(int)10.5 + (int)10.5  ==> 20
 *  			(int)(10.5+10.5) => 21
 *  
 *  			double d=10; ==> 10.0
 *  			int a='A'; => 65
 *  		-----------------------------
 *  			int a = (int)10.5;   => 10
 *  		==> int 이하 데이터형은 연산시 => int
 *  				----byte, short, char
 *  				ex. char+char : int
 *  					char+byte : int
 *  					char+double : double
 *					==> char는 연산이 되면 정수로 변경된다
 *
 *			---------------------------------
 *			5%2 = 1
 *			-5%2 = -1
 *			5%-2 = 1
 *			-5%-2 = -1
			-----------------------=> 부호는 왼편을 따라간다.
			문자열 결합 (+)
			"77" + 7 => 777
			7+7+"7" => 147
			7+"7"+7+7 => 7777
		    --"77"
			 --"777"
			   -"7777"
			7+"7"+(7+7) => 7714
 */		
public class 연산자의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
//					=================
//			   ====
//									  ===
		//System.out.println(a);
		
		System.out.println(10/3);
		System.out.println((double)10/3);
		System.out.println(10/3.0);
	/*	byte b=20;
		byte c=20; 
		double d=b+c; */
		
	/*	int a=10;
		int b = a-- + a-- + --a;
		System.out.println("a=" + a);
		System.out.println("b=" + b); */
		
		/* int c=10;
		int d=c++;
		System.out.println("c=" + c);
		System.out.println("d=" + d); */
		
		boolean bCheck = false;
		//System.out.println(bCheck);
		//System.out.println(!bCheck);

	}

}
