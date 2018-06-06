package tcs.java.practise;

public class FindCommonFromTwoArray {

	int arr1[],arr2[],comm[];
	
	public FindCommonFromTwoArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated constructor stub
		this.arr1=arr1;
		this.arr2=arr2;
	}

	public int findCommonElements() {
		// TODO Auto-generated method stub
		comm=new int[arr1.length<arr2.length?arr1.length:arr2.length];
		int outer[] = null,inner[] = null;
		int count=0;
		if(arr1.length!=arr2.length){
			outer=arr1.length<arr2.length?arr2:arr1;
			inner=arr1.length<arr2.length?arr1:arr2;
		}
		/*for(int i=0;i<outer.length;i++){
			for(int j=0;j<inner.length;j++){
				if(outer[i]==inner[j]){
					if(!isContains(outer[i],comm)){
						comm[count]=outer[i];
						count++;
					}
					break;
				}
			}
		}*/
		for(int i=0;i<outer.length;i++){
			if(isContains(outer[i], inner)){
				if(!isContains(outer[i], comm)){
					comm[count]=outer[i];
					count++;
				}
			}
		}
		return count;
	}

	private boolean isContains(int element, int[] comm2) {
		// TODO Auto-generated method stub
		for(int i=0;i<comm2.length;i++){
			if(comm2[i]==element){
				return true;
			}
		}
		return false;
	}

	public void printArray(int[] arr, int count) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++){
			System.out.print(arr[i]+",");
		}
	}

}
