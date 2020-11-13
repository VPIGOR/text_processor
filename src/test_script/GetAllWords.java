package test_script;

import java.util.Arrays;

import businessLogic.TextProcessor;
import data.TextHolder;

public class GetAllWords {
	
      public static void main(String[] args) {
    	  
    	  TextProcessor textProcessor = new TextProcessor(TextHolder.TEXT);
	
    	  System.out.println(Arrays.toString(textProcessor.getAllWords()));
    	  
    	  String[] sortedWords = textProcessor.getSortedWords();
    	  System.out.println(Arrays.toString(sortedWords));
    	  
    	  String randomWord = textProcessor.genRendomWord();
    	  System.out.println(randomWord);
}
}
