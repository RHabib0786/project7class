package Nested;



public class OuterClass {
	
	public String outerClassAVaricabl;
	public OuterClass() {}
	
	
	InnerclassA innerclassA =new InnerclassA ();

	
	public void outMethodA() {
		System.out.println("this is from Outer Method A");
		innerclassA.innerAMethods();
	}

	class InnerclassA{
		public String innerClassAVariable;
		public InnerclassA() {}
        public void innerAMethods() {
			System.out.println(" This is from Inner Method A");
		}
        
    	
   public void outMethodB() {
    		System.out.println("this is from Outer Method B");		
	}
   
	private class InnerclassB{
		public String innerClassBVariable;
		public InnerclassB() {}
		public void innerBMethods() {
			System.out.println(" This is from Inner Method B");
		}
	}
}
}