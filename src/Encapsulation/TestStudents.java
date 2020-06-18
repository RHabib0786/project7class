package Encapsulation;

public class TestStudents {

	public static void main(String[] args) {
		
		Students stu1 = new Students();
		stu1.setName("Sam");
		stu1.setDOB ("07-02-1986");
		stu1.setStuID(101);
		System.out.println(stu1.getName()+ " "+stu1.getDOB()+ " " + stu1.getStuID());
		
		Students stu2 =new Students("Ana", 103, "05-10-1992");
		System.out.println(stu2.getName()+ " "+stu2.getDOB()+ " " + stu2.getStuID());
		
		Students stu3 =new Students("Jill", 105);
		System.out.println(stu3.getName()+ " "+ stu3.getStuID()+" "+stu3.getDOB());

	}

}
