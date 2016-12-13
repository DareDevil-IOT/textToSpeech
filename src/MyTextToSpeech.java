/**
 * Created by sagarmaurya on 12/12/16.
 */

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class MyTextToSpeech {
    private static final String VOICENAME_kevin = "kevin";
    private Voice voice;
    public void start() {
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice(VOICENAME_kevin);
        Voice[] voices = voiceManager.getVoices();
        for (Voice voice1 : voices) {
            System.out.println(voice1.getName());
        }
        voice.allocate();
    }

    public void text_to_speech(String text){
        voice.speak(text);
    }


}
