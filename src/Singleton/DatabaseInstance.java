package Singleton;

public class DatabaseInstance {

	private DatabaseInstance() {}

    public static DatabaseInstance getInstance()  {
	return new DatabaseInstance();
}
	
    public void connectDatabase() {
    	System.out.println("Database is connect and ready to use");	
    }
}

    
    
