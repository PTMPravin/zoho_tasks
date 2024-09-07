package Tasks.CodingBat.APOne;

public class ScoreUp {
    public static void main(String[] args) {
        String questions[] = {"a", "a", "b", "b"};
        String answers[] = {"?", "c", "?", "?"};
        System.out.println(marks(questions, answers));
    }
    public static int marks(String questions[], String answers[]){
        int mark = 0;
        for(int i=0;i<answers.length;i++){
            if (questions[i].equals(answers[i])) {
                mark+=4;
            }else if(answers[i].equals("?")){
                mark+=0;
            }else{
                mark-=1;
            }
        }
        return mark;
    }
}
