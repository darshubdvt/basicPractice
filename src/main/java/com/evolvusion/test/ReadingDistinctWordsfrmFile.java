package com.evolvusion.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.util.StringUtils;

public class ReadingDistinctWordsfrmFile {

	public static void main(String[] args) {
		getDistinctCount("/home/user/Desktop/rederfile");
	}

	public static void getDistinctCount(String filepath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String s;
			while (br.read() != -1) {
				s = br.readLine();
				String[] lines = s.split(" ");
				for (int i = 0; i < lines.length; i++) {
					int occrence = StringUtils.countOccurrencesOf(s, lines[i]);
					if (occrence == 1) {
						System.out.println(lines[i] + " " + occrence);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
