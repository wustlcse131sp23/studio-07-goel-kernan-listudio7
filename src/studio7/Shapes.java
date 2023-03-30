package studio7;

public class Shapes {
	public static void main(String[] args) {
		Fraction x = new Fraction(1, 1);
		Fraction y = new Fraction(2, 1);
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
		return numerator / denominator;
	}

	public Fraction addFraction(Fraction x) {
		Fraction z = new Fraction(getNumerator() * x.getDenominator() + x.getNumerator() * getNumerator(),
				getDenominator() * x.getDenominator());
		return z;
	}

	public Fraction multFraction(Fraction x) {
		Fraction z = new Fraction(getNumerator() * x.getNumerator(), getDenominator() * x.getDenominator());
		return z;
	}

	public Fraction reciprocal(Fraction x) {
		Fraction z = new Fraction(getDenominator(), getNumerator());
		return z;
	}
}

class Complex {
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public Complex add(Complex z) {
		Complex x = new Complex(getReal() + z.getReal(), getImaginary() + z.getImaginary());
		return x;
	}

	public Complex multipy(Complex z) {
		double r = getReal() * z.getReal() - getImaginary() * z.getImaginary();
		double i = getReal() * z.getImaginary() + getImaginary() * z.getReal();
		Complex x = new Complex(r, i);
		return x;
	}
}

class Player {
	private String name;
	private int jersey;
	private boolean rightHanded;
	private int games;
	private int goals;
	private int assists;

	public Player(String name, int jersey, boolean rightHanded, int games, int goals, int assists) {
		this.name = name;
		this.rightHanded = rightHanded;
		this.games = games;
		this.goals = goals;
		this.assists = assists;
	}

	public void newGame(int goals, int assists) {
		this.goals += goals;
		this.assists += assists;
		games++;
	}

	public int getGoals() {
		return goals;
	}

	public int getAssists() {
		return assists;
	}

	public int getPoints() {
		return getGoals() + getAssists();
	}
	
	public String getName() {
		return name;
	}
	
	public int getJersy() {
		return jersey;
	}
	
	public boolean rightHanded() {
		return rightHanded;
	}
	
	public int getGames() {
		return games;
	}
}