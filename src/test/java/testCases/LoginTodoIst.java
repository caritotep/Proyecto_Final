package testCases;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import org.junit.jupiter.api.*;
import pages.MainPage;
import pages.loginModal;
import singletonSession.Session;

public class LoginTodoIst {
    MainPage mainPage= new MainPage();
    loginModal loginModal = new loginModal();

    // @BeforeEach junit5 -- junitjupiter
    @BeforeEach
    public void before(){
        Session.getSession().getDriver().get("https://todoist.com/");
    }
    // @AfterEach  junit5 -- junitjupiter
    @AfterEach
    public void after(){
        Session.getSession().closeSession();
    }

    @Test
    @DisplayName("Verify the login using correct user and pasword")
    @Description("This test case si to verify the login functionality when we are using an user and pwd ....")
    @Link("www.jira.com/TC999999")
    @Issue("BUG888888")
    public void verifyTheLogin() throws InterruptedException {
        mainPage.loginButton.click();
        loginModal.emailTxt.fillText("caritotep@hotmail.com");
        loginModal.passwordTxt.fillText("Unica.2021");
        loginModal.loginButon.click();
        Thread.sleep(1000);
        // verificacion
        Assertions.assertFalse(loginModal.loginButon.isControlDisplayed(),"ERROR");

        //Assert.assertFalse("ERROR no ingreso al sistema",loginModal.loginButon.isControlDisplayed());
    }
}
