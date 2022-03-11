package com.blz.mood.analyzer;

public class MoodAnalyzer {
	public String analyseMood(String message) {
		if (message.contains("Any"))
			return "HAPPY";
		else
			return "SAD";
	}
}
