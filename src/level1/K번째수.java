package level1;

import java.util.Arrays;

public class K번째수 {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int n = 0; n < commands.length; n++) {
			int i = commands[n][0];
			int j = commands[n][1];
			int k = commands[n][2];

			int size = 0;
			int[] tmp = new int[(j - i) + 1];
			for (int m = i - 1; m < j; m++) {
				tmp[size] = array[m];
				size++;
			}
			Arrays.sort(tmp);
			answer[n] = tmp[k - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int[] answer = solution(array, commands);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
