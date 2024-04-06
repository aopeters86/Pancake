package test;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import machine.PowerOnPancakeMaker;

public class tester {

	public static void main(String[] args) throws FileNotFoundException {
		//add a power on switch then pass the bool
		//scanner etc
		//going to put a switch in for dad on is complete
		
		
		PowerOnPancakeMaker  newPCM1 = new PowerOnPancakeMaker();
		newPCM1.on();//on switch
	
	Properties props = new Properties();
	props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, sentiment");
	StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
	String text = "I love this product! It's amazing.";
	Annotation document = new Annotation(text);
	pipeline.annotate(document);
	List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);
	for (CoreMap sentence : sentences) {
	    String sentiment = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
	    System.out.println("Sentiment of the sentence: " + sentiment);
	}

	}

	

	
	
}


