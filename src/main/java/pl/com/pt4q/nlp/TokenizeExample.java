package pl.com.pt4q.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class TokenizeExample {

    public String tokenize(final String input) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        CoreDocument coreDocument = new CoreDocument(input);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> words = coreDocument.tokens();

        StringBuilder sb = new StringBuilder();
        words.stream()
                .map(CoreLabel::originalText)
                .forEach(s-> sb.append(s).append('\n'));

        return sb.toString();
    }
}
