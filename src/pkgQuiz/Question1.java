package pkgQuiz;

public class Question1 {

	private double CarCost;
	private double InterestRate;
	private int Length;
	
	public Question1(double carCost, double interestRate, int length) {
		super();
		CarCost = carCost;
		InterestRate = interestRate;
		Length = length;
	}
	public double carPayment(double cc, double ir, int length) {
		
		return ((ir/12)*cc)/(1 - Math.pow((1+(ir/12)),-length));
	}
	public double interestCost(double cc, double ir, int length) {
		return (((ir/12)*cc)/(1 - Math.pow((1+(ir/12)),-length))*length - cc);
	}
	
	
}
