//package star;
//
//import java.util.Scanner;
//
//public class Star {
//	public static void main(String[] args) {
//		//���� ��
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("===============================");
//		//������ ��
//		//Scanner sc = new Scanner(System.in);
//		//int num = sc.nextInt();
//		int num = 5;
//		for(int i=1; i<=num; i++) {
//			for(int j=num; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//sc.close();
//		System.out.println("===============================");
//		//�Ųٷ� ���� ��
//		for(int i=5; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("===============================");
//		//�Ųٷ� ������ ��
//		for(int i=5; i>0; i--) {
//			for(int j=5; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("===============================");
//		//���̾Ƹ��
//		num = 3;
//		for(int i = 0; i < num; i++) {
//			for(int j = num-i-1; j > 0; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < i*2+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < i+1; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = (num-i-1)*2 -1; k > 0; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		num = 6;
//		for(int i = 0; i < num/2; i++) {
//			for(int j = num/2-i-1; j > 0; j--) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < i*2+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < num/2; i++) {
//			for(int j = 0; j < i+1; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = (num/2-i-1)*2 -1; k > 0; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}