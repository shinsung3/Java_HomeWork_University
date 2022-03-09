interface Number {
	int numerator();

	int denominator();

	Number add(Number other);

	Number multiply(Number other);

	String toText();

	double toDouble();
}

class WholeNumber implements Number {
	int n;

	WholeNumber(int a) {
		this.n = a;
	}
	
	public int numerator() {
		return this.n;
	}

	public int denominator() {
		return 1;
	}

	public Fraction add(Number other) {
		int numSon = other.numerator(); //7
		int numMother = other.denominator(); //2
		this.n = this.n * numMother; // 10
		return new Fraction(n+numSon, numMother);
	}

	public Fraction multiply(Number other) { //3.5 -> 3.0
		int numSon = other.numerator(); //1
		int numMother = other.denominator(); //2
		this.n = this.n * numSon; // 1*5 = 5/2 
		return new Fraction(n*numSon, numMother);
	}

	public String toText() {
		return String.valueOf(n);
	}

	public double toDouble() {
		return Double.valueOf(n);
	}

}

class Fraction implements Number {
	int n;
	int d;

	Fraction(int a, int b) {
		this.n = a;
		this.d = b;
	}

	public int numerator() {
		return this.n;
	}

	public int denominator() {
		return this.d;
	}

	public Fraction add(Number other) {
		return new Fraction(((this.denominator() * other.numerator()) + (other.denominator() * this.numerator())),
				this.denominator() * other.denominator());
	}

	public Fraction multiply(Number other) {
		return new Fraction((this.numerator() * other.numerator()), (this.denominator() * other.denominator()));
	}

	public String toText() {
		return String.valueOf(this.n) + "/" + String.valueOf(this.d);
	}

	public double toDouble() {
		double n = this.n;
		double d = this.d;
		return n / d;
	}

}

class Decimal implements Number {
	int mantissa;
	int exponent;

	Decimal(String number){
		String[] string = number.split("\\."); //소수점 이하로 몇개의 숫자가 있는지 파악
		int stringLength = string[1].length(); //그 길이만큼 x10 할 예정
		
		double parseNumber = Double.parseDouble(number);
		int localMantissa = (int)(parseNumber * Math.pow(10, stringLength));
		this.mantissa = localMantissa;
		this.exponent = -1 * stringLength;
	}
	
	@Override
	public int numerator() {
		return this.mantissa;
	}

	@Override
	public int denominator() {
		int tenValue = this.exponent*(-1)*10;
		return tenValue;
	}

	@Override
	public Number add(Number other) {
		//분모 확인
		int positiveExponent = this.exponent * -1;
		int tenValue = (int) Math.pow(10, positiveExponent);
		int number1 = this.mantissa/tenValue;
		int number2 = this.mantissa%tenValue;
		String makeDouble = number1 + "."+number2;
		double decimalNum = Double.parseDouble(makeDouble);
		double otherDouble = other.toDouble();
		double answer = (Math.round((decimalNum + otherDouble)*tenValue))/(double)tenValue;
		String numToString = answer+"";
		return new Decimal(numToString);
	}

	@Override
	public Number multiply(Number other) {
		int positiveExponent = this.exponent * -1;
		int tenValue = (int) Math.pow(10, positiveExponent);
		int number1 = this.mantissa/tenValue;
		int number2 = this.mantissa%tenValue;
		String makeDouble = number1 + "."+number2;
		double decimalNum = Double.parseDouble(makeDouble);
		double otherDouble = other.toDouble();
		double answer = (Math.round((decimalNum * otherDouble)*tenValue))/(double)tenValue;
		String numToString = answer +"";
		return new Decimal(numToString);
	}

	@Override
	public String toText() {
		//mantissa = 314
		//exponent = -2
		int positiveExponent = -1 * exponent;
		int tenValue = (int) Math.pow(10,positiveExponent);
		int number1 = mantissa/tenValue;
		int number2 = mantissa%tenValue;
		String makeDouble = number1 + "."+number2;
		return makeDouble;
	}

	@Override
	public double toDouble() {
		//mantissa = 314
		//exponent = -2
		int positiveExponent = -1 * exponent;
		int tenValue = (int) Math.pow(10,positiveExponent);
		int number1 = mantissa/tenValue;
		int number2 = mantissa%tenValue;
		String makeDouble = number1 + "."+number2;
		double answer = Double.parseDouble(makeDouble);
		return answer;
	}

}