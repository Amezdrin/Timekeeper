package is.handsome.timekeeper;

import android.app.Application;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.test.ApplicationTestCase;

import org.junit.Rule;
import org.junit.Test;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @Rule public final ActivityTestRule<Onboarding> main = new ActivityTestRule<Onboarding>(Onboarding.class);

    @Test
    public void checkPresentedElements() {

        Espresso.onView(ViewMatchers.withId(R.id.skipBtn)).check((ViewAssertion) ViewMatchers.isDisplayed());
    }

}