package tcs.java.practise.two;

class P{
	//static int x=10;
	int x=10;
}

class Q extends P{
	int x=20;
	//static int x=20;
	int getPx(){
		return super.x;
	}
}

class R extends Q{
	int x=30;
	//static int x=30;
	int getXFromQ(){
		return super.x;
	}
	int getxFromP(){
		return super.getPx();
	}
}

public class SuperVariablePuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R obj=new R();
		int res=obj.x+obj.getXFromQ()+obj.getxFromP();
		//int res=P.x+Q.x+R.x;
		System.out.println(res);
	}

}
