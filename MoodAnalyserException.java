public class MoodAnalyserException extends Exception {

                public MoodAnalyserException(String message) {
                        super(message);
                }
        }


	public class MoodAnalyser {
		String message;

                public MoodAnalyser(String message) {
                        this.message = message;
                }

                public static void main(String[] args) {
                        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
                        try {
                                System.out.println(moodAnalyser.analyseMood());
                        } catch (MoodAnalyserException e) {
                                e.printStackTrace();
                        }

                }

                public String analyseMood() throws MoodAnalyserException {

                        try {
                                if (message.contains("sad"))
                                        return "sad";
                                else

                                        return "Very Happy";
                        } catch (Exception e) {
                                throw new MoodAnalyser("Please provide valid input");
                        }
                }
}


