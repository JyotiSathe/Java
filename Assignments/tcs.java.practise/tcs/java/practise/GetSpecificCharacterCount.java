package tcs.java.practise;

public class GetSpecificCharacterCount {

	String str;
	char ch;
	 GetSpecificCharacterCount(String str, char ch) {
		// TODO Auto-generated constructor stub
		 this.str=str;
		 this.ch=ch;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<this.str.length();i++){
			if(this.str.charAt(i)==this.ch){
				count++;
			}
		}
		return count;
	}

}
