package Part1;

public class Interest {
	// Task 1: simpleInterest method
	// Your code here
	public static double simpleInterest(double principleAmount, double rateOfInterest, double timePeriod) {
		double answer = principleAmount * (rateOfInterest/100.0) * timePeriod;
		answer = (Math.round(answer * 100.0)) / 100.0;
		return answer;
	}

	// Task 2: compoundInterest method
	// Your code here

	public static double compoundInterest(double principleAmount, double rateOfInterest, double timePeriod, double n) {
		double answer = 0.0;
		rateOfInterest /= 100.0; //0.03875
		double exponent = timePeriod * n; //12
		answer = Math.pow((1 + rateOfInterest / n), exponent);
		answer = principleAmount * (answer - 1);
		answer = (Math.round(answer * 100.0)) / 100.0;
		return answer;
	}

	public static void main(String[] args) {
		double answer = simpleInterest(10000.00, 3.875, 5); //1937.5
		System.out.println(answer);
//		answer = compoundInterest(2.0, 3.2712, 2, 7/2);
		answer = compoundInterest(10000.00, 3.875, 5, 12); //2134.14
		System.out.println(answer);
	}
}
