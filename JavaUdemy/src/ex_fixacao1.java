
public class ex_fixacao1 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Product:");
		System.out.printf("%s , which price is $ %.2f%n",product1,price1);
		System.out.printf("%s , which price is $ %.2f%n", product2,price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("%nMeasue with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (Three decimal places): %.3f%n", measure);
		System.out.printf("US decimal point:");
	}

}
