import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Bernoulli bernoulli = new Bernoulli();
		
		double p = 0.5;
		double boundary =  bernoulli.setup(p);
		
		ArrayList<Boolean> bernoulliTrueVals = new ArrayList<Boolean>();
		
		System.out.println("" + boundary);
		for(int i = 0; i < 2000; i++) {
			if (bernoulli.GetValue(boundary) == true)
				bernoulliTrueVals.add(true);
		}
		
		int size = bernoulliTrueVals.size();
		System.out.println("Size: " + size);
		float otnositTrue = (float) size/2000;
		float otnositFalse = 1 - otnositTrue;
		System.out.println("When true: " + otnositTrue);
		System.out.println("When false: " + otnositFalse);
		
		float h = (float) -(otnositTrue * bernoulli.get(otnositTrue, 2) + otnositFalse * bernoulli.get(otnositFalse, 2));
		System.out.println("Result: " + h);

		
		HyperGeometric hyperGeometric = new HyperGeometric();
		System.out.println(hyperGeometric.HyperGeometric(2000, 10, 20));
	}

}
