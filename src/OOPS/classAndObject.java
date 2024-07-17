package OOPS;

public class classAndObject {

	public static void main(String[] args) {
		
		Pen p1 = new Pen(); 
		
		p1.setColor("BLACK");
		System.out.println(p1.color);
		
		p1.setTip(13);
		System.out.println(p1.tip);

	}

}

	class Pen{
		String color;
		int tip;
		
	void setColor(String newColor) {
			color = newColor;
			
		}
	void setTip(int newTip) {
		tip = newTip;
	}
		
	}
