package tcs.java.practise;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java is platform indepedent";
		String s2="jyoti";
		System.out.println(s2.toUpperCase());
		//s2=s2.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println((s1.charAt(0)+"").toUpperCase());
		System.out.println(s1.indexOf('m'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.contains("is"));
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.endsWith("nt"));
		String s3=new String("jyoti");
		System.out.println(s3.equals(s2));
		String s4=s2;
		String s5="jyoti";
		System.out.println(s4.equals(s2));
		System.out.println("s5 equals s2:"+s5.equals(s2));
		System.out.println(s2.equalsIgnoreCase("Jyoti"));
		System.out.println("old is gold".replace("old", "new"));
		System.out.println(s2.replaceFirst("j", "J"));
		System.out.println(s1.substring(8, 16));
		System.out.println(s2.toUpperCase());
		System.out.println("JAVA".toLowerCase());
		System.out.println("        Java is My     love     ".trim());
		String arr[]=s1.split(" ");
		for(String s:arr){
			System.out.println(s);
		}
	}

}
