package lvl2.ex01;

public class Main {
	public static void main(String []argv){
		Worker worker = new Worker("pepe", "grillo", 10);
		try{
			JsonSerializer.serialize(worker);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
