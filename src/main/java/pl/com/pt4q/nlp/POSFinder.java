package pl.com.pt4q.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
class POSFinder {

    private StanfordCoreNLP stanfordCoreNLP;

    public String find(String input) {
        StringBuilder sb = new StringBuilder();

        CoreDocument coreDocument = new CoreDocument(input);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> tokens = coreDocument.tokens();

        tokens.stream()
                .forEach(s -> sb.append(s.originalText())
                        .append(" <== ")
                        .append(s.get(CoreAnnotations.PartOfSpeechAnnotation.class))
                        .append('\n'));

        return sb.toString();
    }

}
