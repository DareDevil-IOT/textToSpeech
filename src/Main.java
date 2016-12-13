public class Main {
    public static void main(String[] args) {
        MyTextToSpeech myTextToSpeech = new MyTextToSpeech();
        myTextToSpeech.start();
        myTextToSpeech.text_to_speech("hello");
    }
}
