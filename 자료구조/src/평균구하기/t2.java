package ��ձ��ϱ�;
import java.io.*;
import java.util.StringTokenizer;

public class t2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //���� �б� ***N�������
		
		//
		StringTokenizer st = new StringTokenizer(br.readLine()); //���� ���� ***st��������
		
		//���� st�� ������ �ƴ϶� StringTokenizer ��ü�̱� ������ ������.
		//�� ��� st.countTokens()�� ����Ͽ� ��ū�� �� ����
		//double A[] = new double[st.countTokens()]; << �� ����� �ƴ� N�� st�� ����
		double A[] = new double[N]; //N�� ������ ����(������ ������)
		
		for(int i=0; i<N; i++) {
			//�̳��� ���� ��������......
			//A[i] = Integer.parseInt(br.readLine());
			//st ������ StringTokenizer�� �̿��Ͽ� �������� ���ڿ��� �и�����
			//st.nextToken()�� ���ڿ����� ���� ��ū�� �������� �޼ҵ�
			//��, ������ ���鼭 ���� ��ū�� ������ �迭�� ������
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		double max=0;
		//double Ʋ��. long���� �߾���(���� ������ �����߻�)
		double sum=0;
		for(int i=0; i<N; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			sum += A[i];
		}
		System.out.println("�����: "+ (sum/max)*100/N);
	}

}
