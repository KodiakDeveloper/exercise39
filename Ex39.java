package loops;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex39 {

	public static void main(String[] args) {

		int userQuantity, userInput, count = 0, a = 0, b = 0;

		Double evenValue = 0.0;
		int oddValue = 0;

		int[] numbers = new int[0];

		userQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Input array length: "));

		if (userQuantity <= 0) {

			JOptionPane.showMessageDialog(null, "Array length must be greater than zero!");

			return;

		}

		else {

			JOptionPane.showMessageDialog(null, "Array Length: " + userQuantity);

			numbers = new int[userQuantity];
		}

		for (int i = 0; i < numbers.length; i++) {

			count++;

			userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input " + count + " value"));

			numbers[i] = userInput;

		}

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");
		}

		if (numbers.length % 2 == 1) {

			oddValue = (numbers.length + 1) / 2;

			oddValue -= 1;

		}

		else if (numbers.length % 2 == 0) {

			a = numbers.length / 2;

			a -= 1;

			b = (numbers.length / 2) + 1;

			b -= 1;

			evenValue = (double) ((numbers[a] + numbers[b]) / 2.0);

		}

		if (numbers.length % 2 == 1) {

			JOptionPane.showMessageDialog(null, "Median for Odd: " + numbers[oddValue]);

		}

		else {

			JOptionPane.showMessageDialog(null, "Median for Even : " + evenValue);

		}

	}

}
