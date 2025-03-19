package lvl1.ex01;
class Worker{
	protected String name;
	protected String lastName;
	protected int hourlyPrice;
	public Worker(String name, String lastName, int rate){
		this.name = name;
		this.lastName = lastName;
		this.hourlyPrice = rate; 
	}

	public int calculateSalary(int hours){
		return hourlyPrice * hours;
	}

	public int getHourprice(){
		return this.hourlyPrice;
	}
}