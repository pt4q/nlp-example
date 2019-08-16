package pl.com.pt4q.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Tokenizer {

    private StanfordCoreNLP stanfordCoreNLP;

    public String tokenize(final String input) {

        StringBuilder sb = new StringBuilder();

        CoreDocument coreDocument = new CoreDocument(input);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> words = coreDocument.tokens();

        words.stream()
                .map(CoreLabel::originalText)
                .forEach(s-> sb.append(s).append('\n'));

        return sb.toString();
    }
}
