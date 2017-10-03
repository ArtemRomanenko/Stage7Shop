package Action;

import DriverSettings.DriverSettings;
import PageObjects.FirstStep;
import org.junit.Before;
import org.junit.Test;


public class Action extends DriverSettings {

    FirstStep page;

    @Before
    public void Start() {
        page = new FirstStep(driver);

    }

    @Test //Add to basket
    public void stage7Shop() {
        page.start();
        page.searcLine();
        page.resultPage();
        page.basket();
        page.intoBasket();
        page.checkItemName();

    }


}







