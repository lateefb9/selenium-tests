package com.wikia.webdriver.testcases.widgettests;

import com.wikia.webdriver.common.contentpatterns.MercuryMessages;
import com.wikia.webdriver.common.core.Assertion;
import com.wikia.webdriver.common.core.annotations.Execute;
import com.wikia.webdriver.common.templates.NewTestTemplate;
import com.wikia.webdriver.pageobjectsfactory.pageobject.widget.TwitterWidgetPageObject;

import org.testng.annotations.Test;

/**
 * @ownership: Content X-Wing
 */
public class TwitterTests extends NewTestTemplate {

  @Test
  @Execute(onWikia = "mercuryautomationtesting")
  public void TwitterWidgetTest_001_isLoaded() {
    TwitterWidgetPageObject twitterWidgetPageObject = new TwitterWidgetPageObject(driver);

    twitterWidgetPageObject.createAndNavigate(wikiURL);
    Assertion.assertTrue(
        twitterWidgetPageObject.isLoadedOnOasis(),
        MercuryMessages.INVISIBLE_MSG
    );
  }
}