package tests;

import com.wsd.automation.pages.ShohozAirTicketPage;

import org.testng.annotations.Test;

public class ShohozFlightSearchTest extends BaseTest {

    @Test(priority = 1)
    public void testFlightSearch() throws InterruptedException {
        ShohozAirTicketPage shohozAirTicketPage = new ShohozAirTicketPage(webDriver);
        shohozAirTicketPage.selectFrom("Chattogram");
        shohozAirTicketPage.selectTo("Dhaka");
        shohozAirTicketPage.selectDate("Oct 23, 2025");

        Thread.sleep(5000);

    }
}
