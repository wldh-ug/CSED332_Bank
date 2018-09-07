package edu.postech.csed332.homework1;

class EmptyException extends Exception {
	public EmptyException() {
		super("No such account found.");
	}
}