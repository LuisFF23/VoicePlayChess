package Service;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

public class VoiceService {

    public static void main(String[] args){
        try {
            Reconhece();
        } catch (Exception ex) {
            System.out.println("Exceção no reconhecedor");
            System.err.println(ex);
        }
    }
    
    public static String Reconhece() throws Exception {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        config.setGrammarPath("resource:/grammars");
        config.setGrammarName("grammar");
        config.setUseGrammar(true);
        LiveSpeechRecognizer reconhecedor = new LiveSpeechRecognizer(config);
        reconhecedor.startRecognition(true);
	SpeechResult result;
        while ((result = reconhecedor.getResult()) != null) {
            System.out.println("Você disse : "+result.getHypothesis()+" ?");
	}
	reconhecedor.stopRecognition();
        return result.toString();
    }
}