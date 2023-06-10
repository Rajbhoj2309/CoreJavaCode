package com.string;

public class DuplicateRemover {
	public static void main(String[] args) {
		String stringWithDuplicates = "afsjeadrffafvgdefeverhfgberAAad";
		char[] characters = stringWithDuplicates.toCharArray();
		boolean[] found = new boolean[256];
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates : " + stringWithDuplicates);
		for (char c : characters) {
			if (!found[c]) {
				found[c] = true;
				sb.append(c);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());
	}

}
