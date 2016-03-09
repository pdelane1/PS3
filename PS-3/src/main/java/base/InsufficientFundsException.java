package base;
import java.io.*;

public class InsufficientFundsException extends Exception{

	private double amountOverDrawn;
	
	/**
	 * @param amountOverDrawn
	 */
	public InsufficientFundsException(double amountOverDrawn) {
		super();
		this.amountOverDrawn = amountOverDrawn;
	}

	/**
	 * @return the amountOverDrawn
	 */
	public double getAmountOverDrawn() {
		return amountOverDrawn;
	}
	
}
