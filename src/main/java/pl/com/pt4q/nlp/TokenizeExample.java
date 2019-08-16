package pl.com.pt4q.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class TokenizeExample {

    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String input = "President Xi Jinping of China," +
                " on his first state visit to the United States," +
                " showed off his familiarity with American history and pop culture on Tuesday night." +
                "He was surprised by the size of the Grand Canyon";

        CoreDocument coreDocument = new CoreDocument(input);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> words = coreDocument.tokens();

        words.stream()
                .map(CoreLabel::originalText)
                .forEach(System.out::println);
    }
}
