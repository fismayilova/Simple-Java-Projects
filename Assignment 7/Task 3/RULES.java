package task3;

/**
 * Constants and method to format cents as dollars and cents
 * 
 * @author Emil Neo - Date: 22 Apr 2018
 */

import java.text.DecimalFormat;

public interface RULES {
	float TAX_RATE = 6.5f;		// 6.5%
	String NAME = "Books & Bytes";
	int ITEM_NAME_MAX_SIZE = 23;
	int PRINT_WIDTH = 30;

	DecimalFormat currencyFormat = new DecimalFormat("#.00");

	static String cents2dollars(int cent) {
		return currencyFormat.format(1.0 * cent / 100);
	}
}
