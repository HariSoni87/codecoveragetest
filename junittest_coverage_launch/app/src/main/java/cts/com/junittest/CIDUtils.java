package cts.com.junittest;

/**
 * Created by 427669 on 6/5/2016.
 */
public class CIDUtils {
    /**
     * Check if valid cvv
     *
     * @param cvv
     * @return
     */
    public static boolean isValidCVV(String cvv) {
        return cvv != null && cvv.length() == 3 && cvv.matches("[0-9]+");
    }
}
