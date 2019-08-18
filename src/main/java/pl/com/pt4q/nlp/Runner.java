package pl.com.pt4q.nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Runner {

    public static void main(String[] args) {
        String input = "President Xi Jinping of China," +
                " on his first state visit to the United States," +
                " showed off his familiarity with American history and pop culture on Tuesday night." +
                " He was surprised by the size of The Grand Canyon.";

        StanfordCoreNLP pipeline = Pipeline.getPipeline();
        ExecutionTimeMeasurer execution = ExecutionTimeMeasurer.getInstance();

//        Tokenizer tokenizer = new Tokenizer(pipeline);
//        System.out.println(tokenizer.tokenize(input));
//
//        Sentencer sentencer = new Sentencer(pipeline);
//        System.out.println(sentencer.splitSentences(input));

//        POSFinder finder = new POSFinder(pipeline);
//        System.out.println(finder.find(input));

//        Lemmanizer lemmanizer = new Lemmanizer(pipeline);
//        System.out.println(lemmanizer.lemmanize(input));

//        NERFinder nerFinder = new NERFinder(pipeline);
//        execution.start();
//        System.out.println(nerFinder.listToString(nerFinder.analyze(input)));
//        execution.stopToMillis();

        SentimentAnalyzer sentiment = new SentimentAnalyzer(pipeline);
        execution.start();
        System.out.println(sentiment.listToString(sentiment.analyze(input)));
        execution.stopToMillis();
    }
}
