package tcs.java.practise;

public class MaximumRepeatedWord {
	
	String str;

	public MaximumRepeatedWord(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}

	public String maximumRepeated() {
		// TODO Auto-generated method stub
		int i=0,index=0;
		String parts[]=this.str.split(" ");
		int count[]=new int[parts.length];
		String words[]=new String[parts.length];
		for(int j=0;j<parts.length;j++){
			if(words[0]==null){
				words[i]=parts[j];
				count[i]=1;
				i++;
			}else{
				if(!isContains(parts[j],words,i)){
					words[i]=parts[j];
					count[i]=1;
					i++;
				}else{
					int index1=getIndexOfWord(parts[j],words);
					count[index1]++;
				}	
			}
		}
		
		int max=count[0];
		for(int j=0;j<count.length;j++){
			if(count[j]>max){
				max=count[j];
				index=j;
			}
		}
		return words[index];
	}

	private int getIndexOfWord(String string, String[] words) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<words.length;i++){
			if(string.equals(words[i])){
				index=i;
			}
		}
		return index;
	}

	private boolean isContains(String string, String[] words, int j) {
		// TODO Auto-ge01nerated method stub
		for(int i=0;i<j;i++){
			
			if(words[i].equals(string)){
				return true;
			}
		}
		return false;
	}
	
	

}
