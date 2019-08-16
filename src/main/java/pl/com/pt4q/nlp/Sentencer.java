package pl.com.pt4q.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class Sentencer {

    private StanfordCoreNLP stanfordCoreNLP;

    public String splitSentences(String input) {
        StringBuilder sb = new StringBuilder();

        CoreDocument coreDocument = new CoreDocument(input);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        sentences.stream()
                .map(CoreSentence::toString)
                .forEach(s -> sb.append(s).append('\n'));

        return sb.toString();
    }

}
