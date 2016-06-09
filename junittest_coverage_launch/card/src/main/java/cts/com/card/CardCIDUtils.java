package cts.com.card;

/**
 * Created by 427669 on 6/5/2016.
 */
public class CardCIDUtils {
    /**
     * Check if valid expiration date
     *
     * @param expDate Expiration Date
     * @return If the string is in "MM/YY" Format
     */
    public static boolean isValidExpDate(String expDate) {
        return expDate != null && expDate.length() == 4 && expDate.substring(0, 2).matches("0[0-9]|1[0-2]")
                && expDate.substring(2, 3).matches("[0-9]") && expDate.substring(3, 4).matches("[0-9]");
    }
}
