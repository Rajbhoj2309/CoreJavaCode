import java.util.Iterator;

public class StringToAscii {
	
	public static void main(String[] args) {
		String str="i@nC87do";
		
		char[] ch = str.toCharArray();
		int [] arr=new int [ch.length];
		int [] co=new int [ch.length];
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			arr[i]=(int)ch[i];
			if(arr[i]>=65) {
				if(arr[i]!=0)
				co[count++]=arr[i];
				else
					count++;
			}
		}
		char ccc='a';String sss="";
		for (int i = 0; i < co.length; i++) {
			if(co[i]!=0) {
				 ccc=(char)co[i];
				sss=sss+ccc;}
		 }
		System.out.println(sss.toUpperCase());
	}
}
 