package test_script;


import businessLogic.TextProcessor;
import data.TextHolder;

public class TextLengthAndWo {

	public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor(TextHolder.TEXT);
        
        int length = textProcessor.getTextLength();
        System.out.println("length - "+length);
        
        int wordsCount = textProcessor.getTextCount();
        System.out.println("count - "+wordsCount);
        
        
        
//		System.out.println("text length - " + TextHolder.TEXT.length());
//		String[] worldsArray = TextHolder.TEXT.split(" ");
//		System.out.println("worlds count - " + worldsArray.length);
//		System.out.println(Arrays.toString(worldsArray));

	}

}
