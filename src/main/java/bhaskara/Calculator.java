package bhaskara;


public class Calculator {

	public double delta(double a, double b, double c) {
		
		return b * b - 4 * a *c;
	}
	
	public double[] calculate(double a, double b, double c) throws Exception {
		
		double delta = this.delta(a,b,c);
		
		if(delta < 0) {
			throw new Exception("Delta < 0, impossível calcular");
		}
		
		return new double[] { (-1 * b + Math.sqrt(delta)) / (2 * a) , (-1 * b - Math.sqrt(delta)) / (2 * a)};
	}
	
}
