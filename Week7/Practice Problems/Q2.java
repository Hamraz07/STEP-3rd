
public class Q2 {
    static class Scorecard {
        private final boolean[] results;private int recorded;
        Scorecard(int questionCount){results=new boolean[questionCount];}
        void recordAnswer(boolean correct){if(recorded<results.length)results[recorded++]=correct;else System.out.println("All answers have already been recorded");}
        int getScore(){int score=0;for(int i=0;i<recorded;i++)if(results[i])score++;return score;}
    }
    public static void main(String[] args) {
        Scorecard card=new Scorecard(4);card.recordAnswer(true);card.recordAnswer(true);card.recordAnswer(false);card.recordAnswer(true);
        System.out.println("Score: "+card.getScore());
    }
}
