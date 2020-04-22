package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PRIME {
public static void main(String[] args) {
	String numba = JOptionPane.showInputDialog("Pick a number?");
	int net = Integer.parseInt(numba);
	boolean  number = false;
	for (int i = 2; i < net; i++) {
		if(net % i == 0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime.");
			number = true;
		}
		
	}
	if(number == false) {
		JOptionPane.showMessageDialog(null, "Your number is prime.");
	}
}
	}

