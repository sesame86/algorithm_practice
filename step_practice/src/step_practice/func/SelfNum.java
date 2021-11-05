package step_practice.func;

public class SelfNum {
	public static int selfNum(int n) {
		int num = n;
		while(n>0) {
			num += n % 10;
			n /= 10;
		}
		return num;
	}
//	public static void main(String[] args) {
//		boolean[] notSelfNum = new boolean[10001];
//		for(int i=1; i <= 10000; ++i) {
//			int dn = selfNum(i);
//			if(dn <= 10000) {
//				notSelfNum[dn] = true;
//			}
//		}
//		for(int i=1; i<notSelfNum.length; ++i) {
//			if(!notSelfNum[i]) {
//				System.out.println(i);
//			}
//		}
//	}
}