package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class loginModal {

    public TextBox emailTxt= new TextBox(By.id("email"));
    public TextBox passwordTxt= new TextBox(By.id("password"));
    public Button loginButon= new Button(By.xpath("//*[@id='login_form']/button"));

}
