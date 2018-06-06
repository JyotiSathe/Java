package tcs.java.practise;

public class AlternateCaseChange {
	
	String str;

	public AlternateCaseChange(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public void changeCase() {
		// TODO Auto-generated method stub
		this.str=this.str.toUpperCase();
		for(int i=0;i<this.str.length();i+=2){
			/*System.out.print((""+this.str.charAt(i)).toLowerCase());
			System.out.print(this.str.charAt(i+1));*/
			if(i%2==0){
				System.out.print(Character.toLowerCase(this.str.charAt(i)));
			}
			System.out.print(this.str.charAt(i+1));
		}
	}

}
