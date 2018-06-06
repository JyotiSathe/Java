package tcs.java.practise;

public class FindCountOfWordInString {
	
	String str;
	String word;
	
	public FindCountOfWordInString(String str, String word) {
		// TODO Auto-generated constructor stub
		this.str=str;
		this.word=word;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		int count=0;
		String arr[]=this.str.split(" ");
		for(String s:arr){
			if(s.equals(this.word)){
				count++;
			}
		}
		return count;
	}
	
	public int getCountStr(){
		int count=0;
		String temp=this.str;
		while(true){
			if(temp.contains(this.word))
				count++;
			int index=temp.indexOf(this.word);
			if(index==-1)
				break;
			index+=this.word.length();
			temp=temp.substring(index);
		}
		return count;
	}

}
