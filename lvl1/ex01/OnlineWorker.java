package lvl1.ex01;

public class OnlineWorker extends Worker {
	private final int internetRate = 30;
	public OnlineWorker(String name, String lastName, int hourlyPrice){
		super(name, lastName, hourlyPrice);
	}
	@Override
	public int calculateSalary(int hours){
		return ((hours * this.getHourprice()) + internetRate );
	}
}
