package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class UiTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkJokeTextView_isDisplayed_and_notEmpty() throws Exception {
        // perform a click on the button
        onView(withId(R.id.tell_joke_button)).perform(click());

        // passes if the textView does not match the empty string
        onView(withId(R.id.joke_lib_text_view)).check(matches(not(withText(""))));

    }
}
