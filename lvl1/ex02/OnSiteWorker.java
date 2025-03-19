package lvl1.ex02;

public class OnSiteWorker extends Worker {
	private static int gasoline = 200;
	public OnSiteWorker(String name, String lastName, int rate ) {
		super(name, lastName, rate);
	}

	@Override
	public int calculateSalary(int hours){
		return ((hours * this.getHourprice())  + OnSiteWorker.gasoline);
	}

	@Deprecated
	public void DeprecatedMethod(){
		System.out.println("This is an old and deprecated method from the onSiteWorker");
	}
}
