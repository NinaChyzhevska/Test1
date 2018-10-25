package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

/**
 * Created by Nina_Chyzhevska on 10/25/2018.
 */
public class CheckBoxText extends BaseTest {

    @Test
    public void singleCheckBox(){
        String outputMessage = new CheckBoxPage(driver).singleCheckBox();

        Assertions.assertThat(outputMessage).isEqualTo("Success - Check box is checked");
    }
}
