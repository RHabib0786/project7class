package oopPolymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {
		
		LandCalculator Cal1 =new LandCalculator();
		int line = Cal1.areaOfland(78, 35);
		System.out.println("Line:" + line);
		
		int triangle = Cal1.areaOfland(800, 105, 500);
		System.out.println("Land size :" + triangle);
		
        int rectangle = Cal1.areaOfland(56, 21, 5, 9);
        System.out.println("Rectangle size of landcalculator :" + rectangle);
	
	ModernCalculator newcal = new ModernCalculator();
	int rectangleofModernCalculator = newcal.areaOfland(56, 21, 5, 9);
    System.out.println("Rectangle size of ModernCalculator :" + rectangleofModernCalculator);
	
}
}
