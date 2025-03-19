package lvl1.ex02;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] argv ){
		Worker worker1 = new Worker("Carlos", "Sosa", 10);
		OnlineWorker worker2 = new OnlineWorker("raul", "garcia", 10);
		OnSiteWorker worker3 = new OnSiteWorker("Jose", "Guzman", 10);

		System.out.println("Salary of worker one at a 10$/hour, 40 hours a week is : " + worker1.calculateSalary(160));
		System.out.println("Salary of worker two (online worker) at a 10$/hour, 40 hours a week is : " + worker2.calculateSalary(160));
		System.out.println("Salary of worker three (on site worker) at a 10$/hour, 40 hours a week is : " + worker3.calculateSalary(160));
	
		worker2.DeprecatedMethod();
		worker3.DeprecatedMethod();
	} 
}
