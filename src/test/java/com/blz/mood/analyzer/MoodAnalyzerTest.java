package com.blz.mood.analyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	public void givenMessage_SadMood_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_AnyMood_Should_Return_HAPPY() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
}
