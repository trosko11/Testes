package entities;

public class Students {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	//public double failed;

	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}

	public double missingpoints() {
		if (finalGrade() < 60.00) {
			double failed = 60.00 - finalGrade();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", failed);
			return failed;
		} else {
			System.out.println("PASS");
		}
		return 0;
	}
}
