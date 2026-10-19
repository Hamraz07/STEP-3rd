
public class Q4 {
    static abstract class Question { double points;Question(double points){this.points=points;}abstract double grade(String answer); }
    static class ChoiceQuestion extends Question { String correct;ChoiceQuestion(String c,double p){super(p);correct=c;}double grade(String a){return correct.equals(a)?points:0;} }
    static class TrueFalseQuestion extends Question { String correct;TrueFalseQuestion(String c,double p){super(p);correct=c;}double grade(String a){return correct.equalsIgnoreCase(a)?points:0;} }
    static class EssayQuestion extends Question {
        String[] keywords;EssayQuestion(String keys,double p){super(p);keywords=keys.split(",");}
        double grade(String answer){int found=0;for(String key:keywords)if(answer.toLowerCase().contains(key.trim().toLowerCase()))found++;
            if(found>=2)return points*0.75;if(found==1)return points*0.5;return 0;}
    }
    public static void main(String[] args) {
        Question[] questions={new ChoiceQuestion("Paris",10),new TrueFalseQuestion("False",5),
            new EssayQuestion("Inheritance, Polymorphism, Encapsulation",20),new EssayQuestion("Abstraction, Composition",15)};
        String[] answers={"Paris","True","Polymorphism is one.","I talked about abstraction."};
        String[] labels={"MCQ","TF","ESSAY","ESSAY"};double total=0;
        for(int i=0;i<questions.length;i++){double score=questions[i].grade(answers[i]);total+=score;System.out.printf("%s: %.2f%n",labels[i],score);}
        System.out.printf("Total Score: %.2f%n",total);
    }
}
