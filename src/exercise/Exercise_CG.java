package exercise;

/**
 * @author Christian Glass
 */
public class Exercise_CG {

	/**
	 * calc of circumference of a some rectangles
	 * calls other method with 11 fix elements
	 */
	public void calcSomething() {
		System.out.println();
		calcAndPrint_Rectangel();
		System.out.println();
		calcSomething(10);
	}
	/**
	 * calc of circumference of a some rectangles
	 * @param count <br>
	 * count of loop steps
	 */
	public void calcSomething(int count) {
		//     return (int) ((Math.random() * (max - min)) + min);
		for(int i=0; i<count; i++) {
			System.out.println();
			calcAndPrint_Rectangel(
					(short)((Math.random() * (1000 - 1)) + 1),
					(short)((Math.random() * (1000 - 1)) + 1)
					);
		}
	}
	/**
	 * calc of circumference of a some rectangles with fix values (inside method)
	 */
	private void calcAndPrint_Rectangel() {
		short seite_a = 50;
		short seite_b = 75;
		calcAndPrint_Rectangel(seite_a, seite_b);
	}
	/**
	 * print values for calculation of circumference of a rectangle
	 * @param seite_a <br>
	 * value for first side length
	 * @param seite_b <br>
	 * value for second side length
	 */
	private void calcAndPrint_Rectangel(short seite_a, short seite_b) {
		System.out.println("Die Berechnung eines Rechteckes mit den folgenden Werten:");
		System.out.println("Seite_a = '" + seite_a + "'");
		System.out.println("Seite_b = '" + seite_b + "'");
		System.out.println("Die Formel für den Umfang: (Seite_a + Seite_b) * 2.");
		System.out.println("Ergebnis: '" + calcRectangel(seite_a, seite_b) + "'");
	}
	/**
	 * calculation of circumference of a rectangle 
	 * @param a <br>
	 * value for first side length
	 * @param b <br>
	 * value for second side length
	 * @return result of calculation
	 */
	private int calcRectangel(short a, short b) {
		int sum = a + b;
		return Math.multiplyExact(sum, 2);
	}
	/**
	 * print a pyramid to console
	 * @param n <br>
	 * count of lines
	 */
	public void printPyramid(int n) {
        // number of rows
        for (int i=0; i<n; i++){
            for (int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
