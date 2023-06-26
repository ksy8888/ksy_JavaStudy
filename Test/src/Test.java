
public class Test {

	public static void main(String[] args) {
		String test="서울특별시 강서구 양천로47가길 43 지번 서울시 강서구 가양동 239-14";
		String addr1=test.substring(test.indexOf(" "));
		addr1 = addr1.trim();
		System.out.println(addr1);
		
		String addr2 = addr1.substring(0, addr1.indexOf(" "));
		System.out.println(addr2);
	}

}
