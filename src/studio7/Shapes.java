package studio7;

public class Shapes {
public static void main(String[] args) {
	Fraction x = new Fraction(1,1);
	Fraction y = new Fraction(2,1);
	x.addFraction(y);
}
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

class Fraction {
	public double numerator;
	public double denominator;
	
	public Fraction(double numerator, double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double getNumerator() {
		return numerator;
	}
	
	public double getDenominator() {
		return denominator;
	}
	
	public double getFraction() {
		return numerator/denominator;
	}
	
	public Fraction addFraction(Fraction x) {
		Fraction z = new Fraction(getNumerator()*x.getDenominator()+x.getNumerator()*getNumerator(),getDenominator()*x.getDenominator());
		return z;
	}
	public Fraction multFraction(Fraction x) {
		Fraction z = new Fraction (getNumerator()*x.getNumerator(), getDenominator()*x.getDenominator());
	return z;
	}
	
	public Fraction reciprocal(Fraction x) {
		Fraction z = new Fraction (getDenominator(),getNumerator());
		return z;
	}
	
	
	
}