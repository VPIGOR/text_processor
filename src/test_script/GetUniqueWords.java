package test_script;

import java.util.HashSet;
import java.util.TreeSet;

import businessLogic.TextProcessor;
import data.TextHolder;

public class GetUniqueWords {

	public static void main(String[] args) {
		TextProcessor textProcessor = new TextProcessor(TextHolder.TEXT);
		
		HashSet<String> res = textProcessor.getUniqueWords();
		System.out.println(res);
		
		TreeSet<String> sorted = textProcessor.getSortedUniqueWords();
		
		System.out.println(sorted);
		
		
		
		TreeSet<String> resL =(TreeSet<String>)sorted.subSet("в", "о");
		System.out.println(resL);
	}

}
