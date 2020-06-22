package Singleton;

public class TestDataBase {

	public static void main(String[] args) {
		DatabaseInstance databaseInstance = DatabaseInstance.getInstance(); 
		databaseInstance.connectDatabase();
		
	}

}
