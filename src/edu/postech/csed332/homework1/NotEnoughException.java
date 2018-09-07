package edu.postech.csed332.homework1;

class NotEnoughException extends Exception {
	public NotEnoughException() {
		super("Insufficient account balance.");
	}
}