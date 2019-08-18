package pl.com.pt4q.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
class Lemmanizer {

    private StanfordCoreNLP stanfordCoreNLP;

    public String lemmanize(String input) {
        StringBuilder sb = new StringBuilder();

        CoreDocument coreDocument = new CoreDocument(input);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabels = coreDocument.tokens();

        coreLabels.stream()
                .map(cl -> sb
                        .append(cl.originalText())
                        .append(" = ")
                        .append(cl.lemma())
                        .append('\n'))
                .collect(Collectors.joining());

        return sb.toString();
    }
}
