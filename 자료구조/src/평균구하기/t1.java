package ��ձ��ϱ�;
import java.util.*;

public class t1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N]; //������ �� ���̸�ŭ�� �迭 ����
		
//		for(int i=0; i<A.length; i++) {
//			s += A[i];	//�� ���� ����
//		}
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt(); //�迭�� �� ����
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
		System.out.println("�����: "+ (sum/max)*100/N);
	}
}
