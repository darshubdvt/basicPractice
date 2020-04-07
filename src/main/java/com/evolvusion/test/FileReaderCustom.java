package com.evolvusion.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileReaderCustom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// BufferedReader br= null;

		List<String> s1 = new ArrayList<>();
		int i = 0;
		/*
		 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); Date date =
		 * new Date("18-Apr-2015"); try {
		 * System.out.println(dateFormat.parse("18-Apr-2015")); } catch (ParseException
		 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 */
		try (BufferedReader br = new BufferedReader(new FileReader("/home/user/Desktop/MYHWinnerData.txt"));) {
			String line;
			while ((line=br.readLine()) != null) {
				String[] arr = line.split(",");
				String q1 = "INSERT INTO dbo.MYH_MDE_WINNER\n"
						+ "(ACCOUNT_NUMBER, ACCOUNT_STATUS, ACCOUNT_TYPE, CONTACT_INFO1, CONTACT_INFO2, CONTACT_INFO3, CONTACT_INFO4, CUSTOMER_NAME, DRAW_DATE, DRAW_FREQ, DRAW_SCHM_NAME, DRAW_TYPE, EMAIL, ENTITY_ID, GROUP_SCHM_NAME, ID_NUMBER, ID_TYPE, NATIONALITY, OPEN_DATE, PRIZE_DESC, PRIZE_NAME, PRIZE_TYPE, PRODUCT, PRODUCT_TYPE, SEGMENT, TICKET_NUMBER)\n"
						+ "VALUES('" + arr[2]
						+ "', 'Active', 'SAVING', '000000000000', '000000000000', '000000000000', '99808355Z', '"
						+ arr[1] + "', '" + arr[0]
						+ "', 'Daily', 'daily_Piliot', 'Regular Draw', 'null', 'AUBK', 'Grp_Pilot', '251051600344', 'NID', 'null', 'null', '"
						+ arr[0] + "', 'GRAND', 'CASH', 'Ahli United Bank B.S.C(Kuwait)', 'MYH', 'null', '"
						+ (1004786044 + i) + "');\n" + "";
				i++;
				System.out.println(q1);
				s1.add(q1);
			}

			// System.out.println(s1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
