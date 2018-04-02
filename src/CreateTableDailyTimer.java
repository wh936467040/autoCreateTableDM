
public class CreateTableDailyTimer extends TimerManager{

	public CreateTableDailyTimer(String time) {
		super(time);
		
	}
	
	public int task() {
		Executor e = new Executor();
		System.out.println("create next day table");
		e.createNextDayTable();
		return 0;
	}
	
}
