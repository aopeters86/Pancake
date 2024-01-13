package nlp;

import java.util.Properties;//used for configuration

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;

public class Sentiment {

	private StanfordCoreNLP pipeline;

	public Sentiment() {// below all needs to be in this constructor
		Properties props = new Properties();
		props.setProperty("annotators", "tokenize, ssplit, pos, parse, sentiment");
		this.pipeline = new StanfordCoreNLP(props);
	}
	
	public int analyzeSentiment(String selection) {
		//annotation object with input text
		Annotation annotation = new Annotation(selection);
		
		//run the analysis
		pipeline.annotate(annotation);
		
		//sentiment core for each sentence
		for(CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
			String sentiment = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
			
			switch(sentiment) {
			case "Very Negative":
			case "Negative":
				return -1;
			case "Neutral":
				return 0;
			case "Positive":
			case "Very Positive":
				return 1;
			}
			
		}
		
		//default 
		return 0;
	}
	
}
