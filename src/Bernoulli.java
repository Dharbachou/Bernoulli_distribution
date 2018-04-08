import java.util.Random;

public class Bernoulli {
	
	int maxRandValue = 200;
	
	double setup(double p) {
	     double boundary = (int) ((1 - p) * maxRandValue);
	     return boundary;
	}

	boolean GetValue(double boundary) {
	    Random rand = new Random();
		return rand.nextInt(maxRandValue) > boundary;
	}
	
	static double get(float x, double base)
	{
	    return  (Math.log(x) / Math.log(base));
	}
}