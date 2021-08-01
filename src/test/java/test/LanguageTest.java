package test;

import org.junit.Assert;
import org.junit.Test;
import page.LanguagePage;

public class LanguageTest extends BaseTest{
    LanguagePage languagePage;

    @Test
    public void testLanguage(){
        languagePage = new LanguagePage(driver);

        System.out.println("Language number " + languagePage.getLanguageNumber());
        Assert.assertEquals(languagePage.getLanguageNumber(),3);
    }
}
