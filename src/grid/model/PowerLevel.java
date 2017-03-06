package grid.model;

public class PowerLevel 
{
	private int numbers;
	
	
	public String toString()
	{
		return "0 is the current power level";
	}
	
	public PowerLevel()
	{
		numbers = 0;
	}
	
	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
}