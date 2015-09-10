import java.util.scaner;
/**
	Класс для запуска калькулятора
*/
public class InteractRunner {

	public static void main(String[] arg) {
		Scaner reader = new Scaner(System.in);
		try {
			Calculator calc = new Calculator;
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result : " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit yes/no : ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}

}