package dsa;

public class palindrome_string {
	public static String rev(StringBuilder sb){
		for (int i=0; i<sb.length()/2; i++) {
			int front= i;
			int back=sb.length()-1-i;
			char frontChar =sb.charAt(front);
			char backChar= sb.charAt(back);
			sb.setCharAt(front, backChar);
			sb.setCharAt(back,frontChar);
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		String st=("madam");
		String reverse=rev(new StringBuilder(st));
		System.out.println(reverse);
		
		if (reverse.equals(st)) {
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}
