package level1;

import java.util.Arrays;

public class 완주하지못한선수 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		int size = participant.length - 1;

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				return answer;
			}
		}
		return participant[size];
	}
	
	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		String answer = solution(participant, completion);
		System.out.println(answer);
	}
}
