package lvl1.ex01;

public class OnSiteWorker extends Worker {
	private static int gasoline = 200;
	public OnSiteWorker(String name, String lastName, int rate ) {
		super(name, lastName, rate);
	}

	@Override
	public int calculateSalary(int hours){
		return ((hours * this.getHourprice())  + OnSiteWorker.gasoline);
	}
}
