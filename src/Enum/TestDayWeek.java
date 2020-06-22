package Enum;

public class TestDayWeek {
	
	public static void main(String[]arges) {
	Week week = new Week();
	week.taskTodo(Day.Friday);
	System.out.println();
	
	Week week2 = new Week();
	week2.taskTodo(Day. Wednesday);
	System.out.println();
	
	Week week3 = new Week();
	week3.taskTodo(Day.Mar);
	System.out.println();
}
}