package level1;

public class 가운데글자가져오기 {
	public static String solution(String s) {
		String answer = "";
		int status = s.length()/2;
		if(s.length() % 2 == 0) {
			answer = s.charAt(status-1) + "" + s.charAt(status) + ""; 
		}else {
			answer = s.charAt(status) + "";
		}
		return answer;
	}
	public static void main(String[] args) {
		String s = "abcde";
		String answer = solution(s);
		System.out.println(answer);
	}
}
