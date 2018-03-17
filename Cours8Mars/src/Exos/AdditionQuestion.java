package Exos;

public class AdditionQuestion implements IntQuestion{
	private int a;
	private int b;
	private String str =new String (a+"+"+b+"=?");
	private int result =a+b;
	public AdditionQuestion() { 
        a = (int)(Math.random()*50);
        b = (int)(Math.random()*50);
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
