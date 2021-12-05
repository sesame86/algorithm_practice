package cos;

import java.util.Arrays;

public class cos7 {
	public int[] solution(int[] arrA, int[] arrB) {
		int arrA_idx = 0, arrB_idx = 0;
		int arrA_len = arrA.length;
		int arrB_len = arrB.length;
		int answer[] = new int[arrA_len + arrB_len];
		int answer_idx = 0;
		while (arrA_idx < arrA_len && arrB_idx < arrB_len) {
			if (arrA[arrA_idx] < arrB[arrB_idx])
				answer[answer_idx++] = arrA[arrA_idx++];
			else
				answer[answer_idx++] = arrB[arrB_idx++];
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		// a 배열은 2개 까지만 써졌기 때문에 뒤에 추가한다
		// answer_idx=5, arrA_idx=2, arrB_idx=3
		while (arrA_idx < arrA_len)
			answer[answer_idx++] = arrA[arrA_idx++];
		while (arrB_idx < arrB_len)
			answer[answer_idx++] = arrB[arrB_idx++];
		return answer;
	}

	public static void main(String[] args) {
		cos7 sol = new cos7();
		int[] arrA = { -2, 3, 9, 5 };
		int[] arrB = { 0, 1, 5 };
		int[] ret = sol.solution(arrA, arrB);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
	}
}
