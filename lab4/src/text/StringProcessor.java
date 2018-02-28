package text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String" + "\n");
        return br.readLine();

    }
    private ArrayList<String> fragments = new ArrayList<>();

    public ArrayList<String> getFragments() {
        return fragments;
    }

    public ArrayList<String> readFragments() throws IOException {
        System.out.print("Enter amount of fragments:" + "\n");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i < number; i++){
            System.out.print("Enter a fragment" + "\n");
            Scanner scanfr = new Scanner(System.in);
            String frag = scanfr.nextLine();
            fragments.add(frag);
        }
        return fragments;
    }

    public String processText(String inputText) {
        String pattern = "(" + fragments.get(0) + "|" + fragments.get(1) + "|" + ")";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inputText);


        String resultString = inputText.replaceAll(pattern,"");

        return resultString;
    }

    public void showResult(String resultText) {
        System.out.print("result: " + resultText);
    }
}


