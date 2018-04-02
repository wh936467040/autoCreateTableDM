

public class ThreadCreateTableDaily  extends Thread{
	CreateTableDailyTimer timer;
	public ThreadCreateTableDaily(){
		this.timer = new CreateTableDailyTimer(Parameter.time);
	}
	public void run(){
		this.init();
		System.out.println("init daily table success");
		timer.setTask();
	}
	public int init(){
		Executor e = new Executor();
		e.createCurDayTable();
		System.out.println("*******************");
		return 0;
	}
}

