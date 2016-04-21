import java.util.HashMap;
import java.util.Map;

public class MeanMedianMode {

	public static double getMean(double[] numberList) {
		double total = 0;

		for (double d : numberList) {
			total += d;
		}
		return total / (numberList.length);
	}

	public static double getMedian(double[] numberList) {
		int factor = numberList.length - 1;
		double[] first = new double[(int) ((double) factor / 2)];
		double[] last = new double[first.length];
		double[] middleNumbers = new double[1];

		for (int i = 0; i < first.length; i++) {
			first[i] = numberList[i];
		}
		for (int i = numberList.length; i > last.length; i--) {
			last[i] = numberList[i];
		}
		for (int i = 0; i <= numberList.length; i++) {
			if (numberList[i] != first[i] || numberList[i] != last[i])
				middleNumbers[i] = numberList[i];
		}
		if (numberList.length % 2 == 0) {
			double total = middleNumbers[0] + middleNumbers[1];
			return total / 2;
		}
		else {
			return middleNumbers[0];
		}
	}

	public static double getMode(double[] numberList) {
		HashMap<Double, Double> freqs = new HashMap<Double, Double>();

		for (double d : numberList) {
			Double freq = freqs.get(d);
			freqs.put(d, (freq == null ? 1 : freq + 1));
		}
		double mode = 0;
		double maxFreq = 0;

		for (Map.Entry<Double, Double> entry : freqs.entrySet()) {
			double freq = entry.getValue();
			if (freq > maxFreq) {
				maxFreq = freq;
				mode = entry.getKey();
			}
		}
		return mode;
	}

}
