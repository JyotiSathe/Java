package tcs.java.practise;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrTest {

	static Student arr[];
	static Scanner scanner;
	
	public StudentArrTest() {
		// TODO Auto-generated constructor stub
		StudentArrTest.scanner=new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentArrTest obj=new StudentArrTest();
		arr=obj.createArray();
		for(int i=0;i<arr.length;i++){
			arr[i]=obj.getData();
		}
		obj.printData();
		//obj.Topper();
		obj.allToppers();
	}
	
	private void allToppers(){
		ArrayList<Student> array=new ArrayList<Student>();
		float maxMarks=arr[0].per;
		for(int i=1;i<arr.length;i++){
			if(maxMarks<=arr[i].per)
				maxMarks=arr[i].per;
		}
		
		for(Student s:arr){
			if(maxMarks==s.per)
				array.add(s);
		}
		//System.out.println(array);
		for(int i=0;i<array.size();i++){
			System.out.println("Topper is:"+array.get(i).name);
			System.out.println("Percentage is:"+array.get(i).per);
		}
	}
	
	/*private void Topper() {
		// TODO Auto-generated method stub
		float maxMarks=arr[0].per;
		int index =0;
		for(int i=1;i<arr.length;i++){
			if(maxMarks<arr[i].per){
				maxMarks=arr[i].per;
				index=i;
			}
		}
		System.out.println("Topper is: "+arr[index].name);
		System.out.println("Percentage is:"+arr[index].per);
	}*/

	public Student[] createArray(){
		System.out.println("Enter numbers of students:");
		int n=scanner.nextInt();
		StudentArrTest.arr=new Student[n];
		return arr;
	}
	
	public Student getData(){
		Student s = null;
		System.out.println("Enter roll number, name, percentage with spaces:");
		int rno=scanner.nextInt();
		String name=scanner.next();
		float per=scanner.nextFloat();
		s=new Student(rno,name,per);
		return s;
	}
	
	public void printData(){
		for(Student s:arr){
			System.out.println(s);
		}
	}
}
