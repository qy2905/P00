
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int  b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public boolean boundary (int a, int b) {
		if((9999 > a) && (a < 0) && (9999 > b) && (b < 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean boundaryDivide (int a, int b) {
		if((9999 > a) && (a < 0) && (9999 > b) && (b < 0)) {
			return true;
		} else {
			return false;
		}
	}
}
