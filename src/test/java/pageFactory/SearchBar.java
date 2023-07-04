package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class SearchBar {

    public SearchBar() {
        PageFactory.initElements(Driver.getDriver(), this);

        //Milad222
    }

    /*
     * Declare the "FindBy elements here" for your page: For example:
     * 
     * @FindBy(LocatorForElementLikeXpath="element") public WebElement
     * nameYourFindByAnnotationElementHere;
     * 
     * Like this one below:
     * 
     * @FindBy(xpath="//h6[text()='Dashboard']") public WebElement dashboardText;
     * 
     */

    @FindBy(id = "boost-pfs-search-box-0")
    public WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div[3]/div/div[2]/form/button")
    public WebElement searchButton;
    
    @FindBy(xpath="//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[3]/div[2]/div/div/div[2]/div[1]/div[3]/div")
    public WebElement increaseSliderAttribute;
    
//    @FindBy(xpath="//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[3]/div[2]/div/div/div[2]/div[1]/div[3]/div/div")
//    public WebElement moveSlider;
    @FindBy(xpath="//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[3]/div[2]/div/div/div[2]/div[1]/div[3]/div/div")
    public WebElement moveSlider;
    

}