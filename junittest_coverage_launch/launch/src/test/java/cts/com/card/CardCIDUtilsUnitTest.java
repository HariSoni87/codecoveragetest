package cts.com.card;

import org.junit.Test;

import cts.com.card.CardCIDUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CardCIDUtilsUnitTest {

    @Test
    public void expDateValidator() {
        assertThat(CardCIDUtils.isValidExpDate("01/10"), is(false));
        assertThat(CardCIDUtils.isValidExpDate("07/2019"), is(false));
        assertThat(CardCIDUtils.isValidExpDate("01/07/1919"), is(false));
        assertThat(CardCIDUtils.isValidExpDate("as3"), is(false));
    }

}