package com.example.heitorcolangelo.espressotests.TesteComIdle;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

public class TesteComIdle {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Test
    public void SetimoTeste()throws InterruptedException {
        onView(withId(R.id.login_username)).perform(typeText("herbert_799@hotmail.com"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.login_password)).perform(typeText("teste1234"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.login_button)).perform(click());
        Thread.sleep(5000);
    }


}
