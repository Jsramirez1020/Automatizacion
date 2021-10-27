package pages;

public class GooglePage extends Basepage {

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }
    
}
