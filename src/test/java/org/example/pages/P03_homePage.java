package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {
  public P03_homePage(){
      PageFactory.initElements(Hooks.driver,this);
  }
  @FindBy(id ="customerCurrency")
  public WebElement currencydd;
 @FindBy(id = "small-searchterms")
    public WebElement search;
 @FindBy(css = "button[type=\"submit\"]")
    public  WebElement searchBtn;
@FindBy(className = "sublist-toggle")
    public List<WebElement> computerMainCategories;
@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]")
    public  WebElement subCategory;
@FindBy(className = "page-title")
    public WebElement pageTitle;
@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/a[2]")
    public WebElement slider;
@FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement facebookbtn;
@FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twitterbtn;
    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"")
    public WebElement youtubebtn;
    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public WebElement rssbtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement hartBtn;
    @FindBy(css = "p[class =\"content\"]")
    public WebElement wishListbanner;
    @FindBy(css = "span[class = \"wishlist-qty\"]")
    public WebElement wishListBtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input")
    public WebElement qty;
    @FindBy(className = "price")
    public List<WebElement> products;
    @FindBy(className = "product-item")
    public List<WebElement> results;
    @FindBy(className = "sublist")
    public List<WebElement>subcategories;
    @FindBy(xpath ="/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
    public  WebElement sub;
}

