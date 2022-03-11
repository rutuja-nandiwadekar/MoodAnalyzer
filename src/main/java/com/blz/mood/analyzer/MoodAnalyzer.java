package com.blz.mood.analyzer;

public class MoodAnalyzer {
	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
