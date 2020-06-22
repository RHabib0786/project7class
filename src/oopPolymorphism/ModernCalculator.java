package oopPolymorphism;

public class ModernCalculator extends LandCalculator{
	
@Override
	public int areaOfland(int a,int b,int c,int d ) {
		int total = a + b + c + d - 1;
		return total;
}

}
	