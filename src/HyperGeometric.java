public class HyperGeometric extends Bernoulli {

	double HyperGeometric(int N, int n, int K) {
		double sum = 0, p = (double) (K) / N;
		for (int i = 0; i < n; i++)
		{
			if (super.GetValue(p) && ++sum == K)
				return sum;
			p = (K - sum) / (N - i);
		}
		return sum;
	}
}
