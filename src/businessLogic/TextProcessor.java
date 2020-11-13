package businessLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TextProcessor {
	private String text;

	public TextProcessor(String text) {
         this.text = text;
         prepareText();
	}

	private void prepareText() {
		text = text.toLowerCase();	
//		text = text.replace("\n","");
//		text = text.replace("(","");
//		text = text.replace(")","");
//		text = text.replace(",","");
//		text = text.replace(".","");
//		text = text.replace("!","");
//		text = text.replace("?","");
		String [] array = {"\n","(",")",",",".","!","?"};
		for (int i = 0; i < array.length; i++) {
			text = text.replace(array[i],"");
		}
	}

	public int getTextLength() {
		int res = text.length();
		return res;
	}

	public int getTextCount() {
		String[] worldsArray = text.split(" ");
		int res = worldsArray.length;
		return res;
	}
	
	public String[] getAllWords(){
		String[] worldsArray = text.split(" ");
		return worldsArray;
	}
    public ArrayList<String> getWorlds(){
    	String[] arr = getAllWords();
    	ArrayList<String> str = new ArrayList<>();
    	for (int i = 0; i < arr.length; i++) {
			str.add(arr[i]);
			
		}
    	return str;
    }
	public String[] getSortedWords() {
		String[] ar = getAllWords();
		
		Arrays.sort(ar);
		
		return ar;
	}

	public String genRendomWord() {
		String[] arr = getAllWords();
		Random gen = new Random();
		int index = gen.nextInt(arr.length);
		
		return arr[index];
	}

	public HashSet<String> getUniqueWords() {
		ArrayList<String> str = getWorlds();
		HashSet<String> set = new HashSet<>(str);
		
		return set;
	}

	public TreeSet<String> getSortedUniqueWords() {
		TreeSet<String> sort = new TreeSet<>(getUniqueWords());
		return sort;
	}
}
