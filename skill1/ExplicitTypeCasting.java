package Firstexample;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
        double decimalNumber = 9.78;
        int wholeNumber;
        wholeNumber = (int) decimalNumber;

        System.out.println("Double value: " + decimalNumber);
        System.out.println("Integer value after casting: " + wholeNumber);
    }


}
