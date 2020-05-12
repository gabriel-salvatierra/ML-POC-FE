package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.Log;


public class Hook {

    TestContext testContext;

    public Hook(TestContext context) {
        testContext = context;
    }

    @Before
    public void beforeHookPlaceholder() {
        Log.info("Before hook - Placeholder");
    }

    @After
    public void afterHookPlaceholder() {
        testContext.getWebDriverManager().closeDriver();
        Log.info("After Hook - Closes driver");
    }
}
