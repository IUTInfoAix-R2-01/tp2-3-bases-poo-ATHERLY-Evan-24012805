package Rectangle;

public class rectangle {
	private float length, width;
	
	rectangle(){
		this.length = 1.0f;
		this.width = 1.0f;
	}
	rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return this.length * 2 + this.width * 2;
	}
	
	public String toString() {
		return "Rectangle[length="+this.length+" ,width="+this.width+"]";
	}
}
