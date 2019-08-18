package pl.com.pt4q.nlp;

import edu.stanford.nlp.coref.CorefDocumentProcessor;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;

import java.util.List;

public interface SentenceAnalyzerInterface<R> {

    List<R> analyze(String input);

    String listToString(List<R> coreLabels);
}
