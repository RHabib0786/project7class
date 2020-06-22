package Enum;

public class Week {

	public Day day;
	public Week( ) {}
	
	public Week(Day day) {
		this.day = day;
	}

	public void taskTodo (Day day) {
		this.day=day;
		switch (day) {
		
		case Monday:
			System.out.println ("Math");
			break;
		case Tuesday:
			System.out.println ("English");
			break;
		case Wednesday:
			System.out.println ("Gym");
			break;
		case Thurday:
			System.out.println ("dance");
			break;
			
	    default:
			System.out.println ("study");
			break;
		}
	
		
	}
	}
	