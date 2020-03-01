package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
	String caps= "";
for (int i = 0; i < s.length(); i++) {
	if (i%3==2) {
		String p = String.valueOf(s.charAt(i));
		p=p.toUpperCase();
		caps = caps + p;
	}else {
		 String letter = String.valueOf(s.charAt(i));
		 letter=letter.toLowerCase();
		caps=caps+letter;
	}
}
return caps;
	}


}