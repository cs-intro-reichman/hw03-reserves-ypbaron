/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newString = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
			if (ch == ' ') {
				newString += ch;
			} else {
				boolean isDuplicate = false;
				for (int n = 0; n < newString.length(); n++){
					char newCh = newString.charAt(n);
					if (ch == newCh) {
						isDuplicate = true;
					}
				}
				if (isDuplicate == false){
					newString += ch;
				}
			}
		}
		return newString;
	}
    
}
