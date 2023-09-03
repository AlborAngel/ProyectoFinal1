@file:Suppress("DEPRECATION")

package com.curso.android.app.proyectofinal.uno

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityUITest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testCompareTexts() {

        onView(withId(R.id.editText1)).perform(typeText("Hello"))

        onView(withId(R.id.editText2)).perform(typeText("World"))

        onView(withId(R.id.compareButton)).perform(click())

        onView(withId(R.id.resultTextView)).check(matches(withText("Los textos son diferentes.")))
    }
}
