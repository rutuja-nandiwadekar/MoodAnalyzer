package com.blz.mood.analyzer;

public class MoodAnalyzer {
	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

	public String analyseMood1(String message) {
		if (message.contains("Happy"))
			return "HAPPY";
		else
			return "SAD";
	}
}
