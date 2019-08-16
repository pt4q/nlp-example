package pl.com.pt4q.nlp;

public class Runner {

    public static void main(String[] args) {
        String input = "President Xi Jinping of China," +
                " on his first state visit to the United States," +
                " showed off his familiarity with American history and pop culture on Tuesday night." +
                "He was surprised by the size of the Grand Canyon.";

        TokenizeExample tokenizer = new TokenizeExample();
        System.out.println(tokenizer.tokenize(input));

    }
}