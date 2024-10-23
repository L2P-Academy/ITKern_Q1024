package exercise;

public class Exercise_CG {

	public void calcSomething() {
		System.out.println();
		calcAndPrint_Rectangel();
		//     return (int) ((Math.random() * (max - min)) + min);
		for(int i=0; i<10; i++) {
			System.out.println();
			calcAndPrint_Rectangel(
					(short)((Math.random() * (1000 - 1)) + 1),
					(short)((Math.random() * (1000 - 1)) + 1)
			);
		}
	}
	private void calcAndPrint_Rectangel() {
		short seite_a = 50;
		short seite_b = 75;
		calcAndPrint_Rectangel(seite_a, seite_b);
	}
	private void calcAndPrint_Rectangel(short seite_a, short seite_b) {
		System.out.println("Die Berechnung eines Rechteckes mit den folgenden Werten:");
		System.out.println("Seite_a = '" + seite_a + "'");
		System.out.println("Seite_b = '" + seite_b + "'");
		System.out.println("Die Formel für den Umfang: (Seite_a + Seite_b) * 2.");
		System.out.println("Ergebnis: '" + calcRectangel(seite_a, seite_b) + "'");
	}
	private int calcRectangel(short a, short b) {
		int sum = a + b;
		return Math.multiplyExact(sum, 2);
	}
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
