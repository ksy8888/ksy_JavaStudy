package 평균구하기;
import java.util.*;

public class t1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N]; //과목의 수 길이만큼의 배열 선언
		
//		for(int i=0; i<A.length; i++) {
//			s += A[i];	//각 점수 저장
//		}
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt(); //배열에 수 저장
		}
		
		long max=0;
		double sum=0;
		for(int i=0; i<N; i++) {
			//int temp = A[i];
			if(A[i] > max) max = A[i];
			sum = sum + A[i];
			//sum += A[i];
		//	System.out.println(sum);
		}
		//System.out.println(sum*100.0/max/N);
		System.out.println("평균은: "+ (sum/max)*100/N);
	}
}
