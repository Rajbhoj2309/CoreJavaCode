package com.string;

public class NumberToString {
	private static final String [] belowTen=new String [] {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	private static final String [] belowTwenty=new String [] {"TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
	private static final String [] belowHundred=new String [] {"","TEN","TEWNTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
	public static String numberToWords(int num) {
		if(num==0)
			return"zero";
		return helper(num);
	}
	public static String helper(int num) {
		String out=new String();
		if(num<10)	out=belowTen[num];
		else if(num < 20) out=belowTwenty[num-10];
		else if(num < 100) out=belowHundred[num/10]+" "+helper(num%10);
		else if(num < 1000) out=helper(num/100)+" HUNDRED "+helper(num%100);
		else if(num < 1000000) out=helper(num/1000)+" THOUSAND "+helper(num%1000);
		else if(num < 1000000000) out=helper(num/1000000)+" MILLION "+helper(num%1000000);
		else out = helper(num/1000000000) + " billion "+helper(num%1000000000);
		return out.trim();
	}
	public static void main(String[] args) {
		System.out.println("INR "+numberToWords(16579742));
	}
}
//else if (num<1000000000) out = helper(num/1000000) + " million "+ helper(num%1000000);
//else out = helper(num/1000000000) + " billion "+helper(num%1000000000);
//return out.trim();