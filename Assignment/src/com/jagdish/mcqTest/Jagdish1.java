package com.jagdish.mcqTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
class Result{
	public static String FormatAsCustomerString(Date date , int number) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
		String dt=simpleDateFormat.format(date);
		String num=String.valueOf(number);
		return LeptPad(num,5,'0')+"-"+dt;
	}
	public static String LeptPad(String originalString, int length, char padCharacter) {
		StringBuilder sb=new StringBuilder();
		while (sb.length()+originalString.length()<originalString.length()) {
			sb.append(padCharacter);
		}
		sb.append(originalString);
		String paddedString=sb.toString();
		return paddedString;
	}
}
public class Jagdish1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr=new PrintWriter(System.out);
		String sDate="";
		try {
			sDate=br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			String pattern="yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
		Date date=simpleDateFormat.parse(sDate);
		int number=Integer.parseInt(br.readLine().trim());
		String out=Result.FormatAsCustomerString(date, number);
		System.out.println(out);
		wr.close();
		br.close();
	}
}
