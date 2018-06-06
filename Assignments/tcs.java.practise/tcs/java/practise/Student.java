package tcs.java.practise;

public class Student {
	
	int rno;
	String name;
	Float per;
	
	public Student(int rno2, String name2, float per2) {
		// TODO Auto-generated constructor stub
		this.rno=rno2;
		this.name=name2;
		this.per=per2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Roll No:="+this.rno+",Name="+this.name+",Percentage="+this.per+"]";

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj){
			System.out.println("in if 1");
			return true;
		}
		
		if(obj instanceof Student){
			System.out.println("in if 2");
			Student s1=this;
			Student s2=(Student)obj;

			System.out.println(s1.per==s2.per);
			if(s1.rno==s2.rno&&s1.name.equals(s2.name)&&s1.per==s2.per){
				System.out.println("here");
				return true;
			}
		}
		
		return false;
	}
	
	
}
