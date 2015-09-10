/**
	Класс реализует калькулятор
*/
public class Calculator {
	/**
		Результат вычислений
	*/
	private int result;
	
	/**
		Суммируем аргументы
		@param params аргументы суммирования
	*/
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	
	/**
		Получить результат
	*/
	public int getResult() {
		return this.result;
	}
	
	/**
		Очистить результат вычисления
	*/
	public void cleanResult() {
		this.result = 0;
	}
}