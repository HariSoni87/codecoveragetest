package cts.com.junittest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class CIDUtilsUnitTest {

    @Test
    public void cvvValidator() {
        assertThat(CIDUtils.isValidCVV("674"), is(true));
        assertThat(CIDUtils.isValidCVV("1232"), is(false));
        assertThat(CIDUtils.isValidCVV("asd"), is(false));
        assertThat(CIDUtils.isValidCVV("as3"), is(false));
        assertThat(CIDUtils.isValidCVV("948"), is(true));


    }

}