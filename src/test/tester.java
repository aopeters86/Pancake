package test;

import java.io.FileNotFoundException;

import nlp.Sentiment;

public class tester {

	public static void main(String[] args) throws FileNotFoundException {
		// add a power on switch then pass the bool
		// scanner etc
		// going to put a switch in for dad
//		PowerOnPancakeMaker newPCM1 = new PowerOnPancakeMaker(true);

		Sentiment testnlp1 = new Sentiment();
		String text1 = "I thought the pancake maker worked great";
		int sentiment1 = testnlp1.analyzeSentiment(text1);
		System.out.println(text1 + "\nSentiment: " + sentiment1);
		
		Sentiment testnlp0 = new Sentiment();
		String text0 = "I thought the pancake maker worked ok";
		int sentiment0 = testnlp0.analyzeSentiment(text0);
		System.out.println(text0 + "\nSentiment: " + sentiment0);
		
		Sentiment testnlpneg1 = new Sentiment();
		String textneg1 = "I thought the pancake maker was the worst";
		int sentimentneg1 = testnlpneg1.analyzeSentiment(textneg1);
		System.out.println(textneg1 + "\nSentiment: " + sentimentneg1);
	}
}
