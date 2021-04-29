package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Categories extends PageObject {
    @FindBy(id="menu-categories")
    private WebElement menuCategories;

    @FindBy(id= "new-category-btn")
    private WebElement newCategory;

    public Categories(WebDriver driver) {
        super(driver);
    }
    public ReceiptPage accessMenuCategories(){
        menuCategories.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessNewCategory(){
        newCategory.click();
        return new ReceiptPage(driver);
    }
}
