package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TAB_SIZE = 12;
	private int[] numbers = new int[TAB_SIZE];

	public static int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}
		
	public boolean isFull() {
		return total == 11;
	}
		
	protected int getNumber() {
		if (callCheck())
			return -1;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
