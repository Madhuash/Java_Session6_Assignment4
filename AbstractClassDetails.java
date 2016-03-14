import java.util.Scanner;
public abstract class AbstractClassDetails {
	int rollNo;
	String name;
	int regNum;
	public abstract void enterDetails();
	
}

 class Class1Details extends AbstractClassDetails{
	 Scanner scc = new Scanner(System.in);
	 public void enterDetails()
	 {
		 System.out.println("Enter Student Name");
    	 String StuName = scc.next();
    	 this.name= StuName;
    	 System.out.println("Enter Student Roll Number");
    	 int StuRoll = scc.nextInt();
    	 this.rollNo = StuRoll;
    	 System.out.println("Enter Student Reg Num");
    	 int StuReg = scc.nextInt();
    	 this.regNum = StuReg;
	 }
	public static void main(String[] args) {
		AbstractClassDetails yr1 = new Class1Details();
		yr1.enterDetails();
		System.out.println("Student Name: " + yr1.name );
		System.out.println("Student Roll Number: " +yr1.rollNo );
		System.out.println("Student Reg Num : " + yr1.regNum );
		
	}
	
	
}


