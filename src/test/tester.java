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
		String text1 = " On a brighter note, a community-led initiative has successfully raised funds to support local schools, providing resources and opportunities for students. The collaborative effort has fostered a sense of unity and optimism within the community, demonstrating the positive impact of collective action.";
		int sentiment1 = testnlp1.analyzeSentiment(text1);
		System.out.println(text1 + "\nSentiment: " + sentiment1);
		
		Sentiment testnlp0 = new Sentiment();
		String text0 = " The latest scientific research on climate change indicates a gradual increase in global temperatures, prompting ongoing discussions on sustainable practices and environmental conservation. Researchers are working collaboratively to better understand the complexities of climate dynamics and explore potential solutions to mitigate the long-term impacts.";
		int sentiment0 = testnlp0.analyzeSentiment(text0);
		System.out.println(text0 + "\nSentiment: " + sentiment0);
		
		Sentiment testnlpneg1 = new Sentiment();
		String textneg1 = "Unfortunately, the recent economic downturn has led to job losses in various sectors, impacting the livelihoods of many individuals. The uncertainty surrounding the future has created a sense of anxiety and financial strain for those affected.";
		int sentimentneg1 = testnlpneg1.analyzeSentiment(textneg1);
		System.out.println(textneg1 + "\nSentiment: " + sentimentneg1);
	}
}
