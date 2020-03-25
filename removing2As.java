package Epam;
public class removing2As {
  public String remove(String string) {
		StringBuilder s = new StringBuilder(string);
		if(string.charAt(0) == 'A' && string.charAt(1) == 'A') {
			s.deleteCharAt(0);
			s.deleteCharAt(0);
		} else {
		if(string.charAt(0) == 'A') {
			s.deleteCharAt(0);
      }
		if(string.charAt(1)=='A') {
			s.deleteCharAt(1);
      }
		}
		String ans = s.toString();
    /* After removing 2 As */
		return ans;
	}
}
