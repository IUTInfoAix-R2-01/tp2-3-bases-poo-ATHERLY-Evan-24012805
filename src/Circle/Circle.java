package Circle;

public class Circle {
	private double radius;
	private String color;
	
	Circle(){
		this.radius = 0.1;
		this.color = "red";
	}
	Circle(final double radius){
		this.radius = radius;
		this.color = "red";
	}
	
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
