package OOPS;

public class getterAndSetter {

	public static void main(String[] args) {
		MeraPen p1 = new MeraPen();
		
		p1.setColor("SKIN");
		System.out.println(p1.getColor());

		p1.setTip(10);
		System.out.println(p1.getTip());
		
		p1.setColor("sankatgodon");//To set 
		System.out.println(p1.getColor());
	}

}
class MeraPen{
	private String color;
	private int tip;
	
	String getColor() {
		return this.color;
	}
	int getTip(){
		return this.tip;
	}
	void setColor(String newColor) {
		this.color = newColor;
	}
	void setTip(int newTip) {
		this.tip = newTip;
	}
}
