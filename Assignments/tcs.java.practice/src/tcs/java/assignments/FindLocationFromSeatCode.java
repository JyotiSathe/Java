package tcs.java.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindLocationFromSeatCode {

	public static String findLocation(String seatCode){
		String seatCode1="INDMUMEDG003365";
		String seatCode2="INDKOHMYG007112";
		String seatCode3="INDCHNSGN002082";
		String seatCode4="INDBLRWFD012215";
		String seatCode5="USANYKMMD052314";
		String seatCode6="INDMUMPOW007365";
		String location = "";
		if(seatCode.length()>15){
			location="Incorrect data";
		}
		else if(!seatCode.equals(seatCode1)&&!seatCode.equals(seatCode2)&&!seatCode.equals(seatCode3)
				&&!seatCode.equals(seatCode4)&&!seatCode.equals(seatCode5)&&!seatCode.equals(seatCode6)){
			location="Seat code does not exist";
		}
		else{
			String loc = seatCode.substring(3,6);
			switch(loc){
			case "MUM":location="Mumbai";
			break;
			case "KOH":location="Kochi";
			break;
			case "CHN":location="Chennai";
			break;
			case "BLR":location="Banglore";
			break;
			case "NYK":location="Newyork";
			break;
			}

		}
		return location;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter seat code");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String seatCode=br.readLine();
		System.out.println(findLocation(seatCode));
	}

}
