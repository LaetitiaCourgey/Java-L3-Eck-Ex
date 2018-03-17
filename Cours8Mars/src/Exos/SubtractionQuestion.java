package Exos;

public class SubtractionQuestion implements IntQuestion{
	private int a;
	private int b;
	private String str =new String (a+"-"+b+"=?");
	private int result = a-b;
	public SubtractionQuestion() {
        a = (int)(Math.random() * 50);
        b = (int)(Math.random() * a);
    }
	public String getQuestion(){
		System.out.println(str);
		return str;
	}
    public int getCorrectAnswer(){
    	System.out.println("The correct answer was "+result);
    	return result;
    }
}
