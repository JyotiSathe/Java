package tcs.java.practise;

public class StudentEqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"jyoti",73);
		Student s2=new Student(1,"jyoti",73);
		if(s1.equals(s2)){
			System.out.println("s1 equals s2");
		}
		else{
			System.out.println("s1 not equals s2");
		}
	}

}
