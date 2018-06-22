package com.tcs.tricky.question;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String args [ ]) {

		usingSDF("32/08/2014","dd/MM/yyyy","yyyy-MM-dd");

	}

	static void usingSDF(String dt, String inFormat, String outFormat)

	{

		SimpleDateFormat sdfIn=new SimpleDateFormat(inFormat);
		SimpleDateFormat sdfOut=new SimpleDateFormat(outFormat);

		Date dtTemp=null;
		String output="";
		try {
			dtTemp = sdfIn.parse(dt);

			output=sdfOut.format(dtTemp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("output : "+ output);

	}

}
