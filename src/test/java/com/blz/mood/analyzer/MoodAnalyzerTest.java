package com.blz.mood.analyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_SadMood_ShouldReturnsSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In Sad Mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_HappyMood_ShouldReturnsHappy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
