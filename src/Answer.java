



public class Answer {

    private String desc;
    private int num;

    //there should be 2d massive :) That's just experiment
    //region Node0
    private final static Answer answer11 = new Answer("start answer 1",1);
    private final static Answer answer12 = new Answer("start answer 2",2);
    private final static Answer answer13 = new Answer("start answer 3",3);


    private final static Answer[] answers1 = new Answer[]{answer11,answer12,answer13};

    //endregion


    //region Node1
    private final static Answer answer21 = new Answer("first answer",1);
    private final static Answer answer22 = new Answer("second answer",2);

    private final static Answer[] answers2 = new Answer[]{answer21,answer22};
    //endregion

    //region Node2
    private final static Answer answer31 = new Answer("first answer",1);
    private final static Answer answer32 = new Answer("second answer",2);
    private final static Answer answer33 = new Answer("third answer",3);
    private final static Answer answer34 = new Answer("fourth answer",4);


    private final static Answer[] answers3 = new Answer[]{answer31,answer32,answer33,answer34};
    //endregion

    private final static Answer[][] answers = new Answer[][]{answers1,answers2,answers3};

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
