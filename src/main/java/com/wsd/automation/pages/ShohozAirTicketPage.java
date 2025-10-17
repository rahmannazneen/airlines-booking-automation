package com.wsd.automation.pages;

import com.wsd.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ShohozAirTicketPage extends BasePage {


    private By fromFieldContainer = By.cssSelector(".form_select.from_icon_add");
    private By fromSearchInput = By.cssSelector(".web_airport_search_form input.search-air");
    private By fromTopSuggestion = By.xpath("(//div[@class='web_airport_search_form' and contains(@style,'display: block')]//div[@class='item'])[1]");

    private By toFieldContainer = By.xpath("(//div[@class='form_select'])[1]");
    private By toSearchInput = By.xpath("//*[@id=\"one-tab-pane\"]/div/div[2]/div/div[2]/input");
    private By toTopSuggestion = By.xpath("(//div[@class='web_airport_search_form' and contains(@style,'display: block')]//div[@class='item'])[1]");

    private By datePicker = By.xpath("//div[contains(@class,'col-md-6')]//div[contains(@class,'react-datepicker-wrapper')]");


    public ShohozAirTicketPage(WebDriver driver) {
        super(driver);
    }

    public void selectFrom(String city) throws InterruptedException {
        click(fromFieldContainer);
        type(fromSearchInput, city);
        Thread.sleep(2000);
        click(fromTopSuggestion);
    }

    public void selectTo(String city) throws InterruptedException {
        click(toFieldContainer);
        type(toSearchInput, city);
        Thread.sleep(2000);
        click(toTopSuggestion);
    }


    public void selectDate(String date) {
        click(datePicker);
        click(By.xpath("//div[contains(@class,'react-datepicker-popper')]//div//div[contains(@aria-label,'Choose Thursday, October 23rd, 2025')][normalize-space()='23']"));
    }

}



