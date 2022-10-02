class Solution {
    public static boolean isValid(char c1, char c2) {
		if (c1 == '1' || (c1 == '2' && c2 <= '6'))
			return true;
		return false;
	}

	public static int numDecodings(String s) {
		int tp, attach = 0;
		int notAttach = s.charAt(0) == '0' ? 0 : 1;

		for (int i = 1; i < s.length(); i++) {
			tp = notAttach;
			notAttach = s.charAt(i) == '0' ? 0 : attach + tp;
			attach = isValid(s.charAt(i - 1), s.charAt(i)) ? tp : 0;
		}

		return attach + notAttach;
	}
}