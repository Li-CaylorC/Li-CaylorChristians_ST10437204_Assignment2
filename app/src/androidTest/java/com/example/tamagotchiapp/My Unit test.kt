package com.example.tamagotchiapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

// Import TestUtils here
import com.example.tamagotchiapp.TestUtils
import com.example.tamagotchiapp.TestUtils.Companion.withProgressBarProgress

@RunWith(AndroidJUnit4::class)
@LargeTest
class DogcareActivityTest {

    private lateinit var scenario: ActivityScenario<DogcareActivity>

    @Before
    fun setUp() {
        scenario = ActivityScenario.launch(DogcareActivity::class.java)
    }

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test
    fun testFeedButton() {
        onView(withId(R.id.feedbtn1)).perform(click())
        onView(withId(R.id.imageView2)).check(matches(isDisplayed()))
        onView(withId(R.id.progressBar1)).check(matches(withProgressBarProgress(10)))
    }

    @Test
    fun testCleanButton() {
        onView(withId(R.id.cleanbtn2)).perform(click())
        onView(withId(R.id.imageView2)).check(matches(isDisplayed()))
        onView(withId(R.id.progressBar2)).check(matches(withProgressBarProgress(10)))
    }

    @Test
    fun testPlayButton() {
        onView(withId(R.id.playbtn3)).perform(click())
        onView(withId(R.id.imageView2)).check(matches(isDisplayed()))
        onView(withId(R.id.progressBar3)).check(matches(withProgressBarProgress(10)))
    }
}
