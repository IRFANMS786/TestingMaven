package programmingProblems;

public class printPartialString {
	public static void main(String[] args) {
		String userName = "irfanms@dxc.com";
		String original=userName;
		extractUserId(userName);
		System.out.println(original);

	}

	public static String extractUserId(String userName) {
        if (userName.contains("@")) {
            return userName.split("@")[0];
        }
        return userName;
    }

}
