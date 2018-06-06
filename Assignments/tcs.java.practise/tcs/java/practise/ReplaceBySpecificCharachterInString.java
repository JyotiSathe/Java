package tcs.java.practise;

public class ReplaceBySpecificCharachterInString {
	
	String str;

	public ReplaceBySpecificCharachterInString(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public String replaceLetter() {
		// TODO Auto-generated method stub
		String temp="";
		for(int i=0;i<this.str.length();i++){
			char ch=this.str.charAt(i);
			switch(ch){
				case 'i': temp+=1;
					break;
				case 's':temp+=5;
					break;
				case 'a':temp+='@';
					break;
				case 'o':temp+=0;
					break;
				case 'l':temp+=1;
					break;
				case 'z':temp+=2;
					break;
				default:temp+=ch;
					break;
			}
		}
		return temp;
	}

}
