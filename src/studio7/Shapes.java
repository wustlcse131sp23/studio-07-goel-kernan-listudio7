package studio7;

public class Shapes {

}

class Rectangle {
	private double height;
	private double length;

	public Rectangle(double height, double length) {
		this.height = height;
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return getHeight() * getLength();
	}

	public double getPremimeter() {
		return 2 * getHeight() + 2 * getLength();
	}

	public boolean isSquare() {
		return getHeight() == getLength();
	}
}

class Die {
	private int sides;

	public Die(int sides) {
		this.sides = sides;
	}

	public int rollDie() {
		return (int) Math.floor(Math.random() * sides) + 1;
	}

}