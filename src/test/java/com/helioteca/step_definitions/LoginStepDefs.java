package com.helioteca.step_definitions;

import com.helioteca.pages.LoginPage;
import com.helioteca.utilities.ConfigurationReader;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("user should see {string} in title")
    public void userShouldSeeInTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
}
