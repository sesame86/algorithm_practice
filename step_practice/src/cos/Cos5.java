//package cos;
//
//public class Cos5 {
//	public int solution(int n) {
//		int arrSize = n;
//		int[][] arr = new int[n][n];
//		int row = 0;
//		int col = -1;
//		int value = 1;
//		int inc = 1;
//		while (n > 0) {
//			for (int i = 0; i < n; i++) {
//				// 행 inc 1이면 증가 -1이면 감소
//				col += inc;
//				arr[row][col] = value;
//				value++;
//			}
//			n--;
//			if (n == 0)
//				break;
//			for (int i = 0; i < n; i++) {
//				// 열 inc 1이면 증가 -1이면 감소
//				row += inc;
//				arr[row][col] = value;
//				value++;
//			}
//			inc *= -1;
//		}
//		int answer = 0;
//		for (int i = 0; i < arrSize; i++) {
//			for (int j = 0; j < arrSize; j++) {
//				if (i == j) {
//					answer += arr[i][j];
//				}
//			}
//		}
//		return answer;
//	}
//
//	public static void main(String[] args) {
//		Cos5 sol = new Cos5();
//		int n1 = 3;
//		int ret1 = sol.solution(n1);
//		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
//
//		int n2 = 2;
//		int ret2 = sol.solution(n2);
//		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
//	}
//}
