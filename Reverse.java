package dsa;

public class reverse_string {

	public static void reverse(StringBuilder sb){
		for (int i=0; i<sb.length()/2; i++) {
			int front= i;
			int back=sb.length()-1-i;
			char frontChar =sb.charAt(front);
			char backChar= sb.charAt(back);
			sb.setCharAt(front, backChar);
			sb.setCharAt(back,frontChar);
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder("Welcome");
		StringBuilder s2 = new StringBuilder("Madam");
		reverse(s1);
		reverse(s2);
	}

}
