package com.interview.abhijeet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operator {
	
	
    public static void main(String args[]) throws IOException
    {
        char c;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        do 
        {
            c = (char) obj.read();
        System.out.print(c);
        } while(c!='\'');

    }
//if input given is “abc’def/’egh”
//    a.	abcdef/’  >>> 
//    b.	abc’def/’egh 
//    c.	abcqfghq
//    d.	abc’

	}
