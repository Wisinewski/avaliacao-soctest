package br.com.age.exceptions;

public class DatePassedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DatePassedException(String msg) {
		super(msg);
	}
}
