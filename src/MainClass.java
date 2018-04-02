

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		//String path = System.getenv("D5000_HOME");
		//path = path + "/conf/auto_monitor.conf";
	
		//String path = "C:\\Users\\WH\\Desktop\\auto_monitor.conf";
		String path = "../conf/auto_monitor.conf";
		Parameter para = new Parameter(path);
		para.readConf();
		System.out.println(Parameter.sqlFileDaily);
		System.out.println(Parameter.sqlFileMonthly);
		System.out.println(Parameter.time);
		
		ThreadCreateTableDaily t1 = new ThreadCreateTableDaily();
		ThreadCreateTableMonthly t2 = new ThreadCreateTableMonthly();
		@SuppressWarnings("unused")
		ThreadDropTable t3 = new ThreadDropTable();
		ThreadCreateIndexDaily t4 = new ThreadCreateIndexDaily();
		ThreadCreateIndexMonthly t5 = new ThreadCreateIndexMonthly();

		t1.start();
		
		Thread.sleep(10*1000);
		
		t2.start();
		Thread.sleep(10*1000);
		t4.start();
		Thread.sleep(10*1000);
		t5.start();
		
		while(true){
			try {
				System.out.println("----");
				Thread.sleep(3*1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}