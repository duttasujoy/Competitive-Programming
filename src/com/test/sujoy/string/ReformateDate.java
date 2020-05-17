package com.test.sujoy.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReformateDate {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1st Mar 1984","2nd Mar 1984");
		List<String> output = reformatDate(list);
		System.out.println(output);
	}

	private static List<String> reformatDate(List<String> list) {
		return list.stream().map(date -> reformateDate(date)).collect(Collectors.toList());
	}

	private static String reformateDate(String date) {
		String dateString1 = date.replaceFirst("[a-zA-Z]{2}", "");
		SimpleDateFormat inputDateFormat = new SimpleDateFormat("d MMMM yyyy", Locale.ENGLISH);
		Date rightNow =null;
		try {
			rightNow = inputDateFormat.parse(dateString1);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		  String formattedDate = dateFormat.format(rightNow);
		return formattedDate;
	}

}
