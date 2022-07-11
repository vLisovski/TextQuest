


public class Answer {

    private String desc;
    private int num;

    //there should be 2d massive :) That's just experiment
    //region Node0
    private final static Answer answer01 = new Answer("start answer 1", 1);
    private final static Answer answer02 = new Answer("start answer 2", 2);
    private final static Answer answer03 = new Answer("start answer 3", 3);
    private final static Answer[] answers0 = new Answer[]{answer01, answer02, answer03};

    //endregion


    //region Node1
    private final static Answer answer11 = new Answer("first answer", 1);
    private final static Answer answer12 = new Answer("second answer", 2);
    private final static Answer answer13 = new Answer("third answer", 3);
    private final static Answer[] answers1 = new Answer[]{answer11, answer12, answer13};
    //endregion

    //region Node2
    private final static Answer answer21 = new Answer("first answer", 1);
    private final static Answer answer22 = new Answer("second answer", 2);
    private final static Answer answer23 = new Answer("third answer", 3);
    private final static Answer[] answers2 = new Answer[]{answer21, answer22, answer23};
    //endregion

    private final static Answer[][] answers = new Answer[][]{answers0, answers1, answers2};

    public Answer(String desc, int num) {
        this.desc = desc;
        this.num = num;
    }

    public String getDesc() {
        return desc;
    }

    public int getNum() {
        return num;
    }

    public static Answer[][] getAnswers() {
        return answers;
    }

}
