package text;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        StringProcessor stringProcessor = new StringProcessor();
        try {
            String text = stringProcessor.readInputText();
            stringProcessor.readFragments();
            String ProcessedText =  stringProcessor.processText(text);
            stringProcessor.showResult(ProcessedText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
