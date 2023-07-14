package com.helioteca.step_definitions;

import com.helioteca.pages.DeckPage;
import io.cucumber.java.en.And;

public class DeckStepDefs {

    DeckPage deckPage = new DeckPage();

    @And("user navigates to {string} module page")
    public void userNavigatesToModulePage(String moduleName) {
        deckPage.navigateToModule(moduleName);
    }
}
