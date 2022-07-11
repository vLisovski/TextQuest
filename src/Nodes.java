
public class Nodes {

    private final static Answer[][] answers = Answer.getAnswers();

    //region Node0
    private final static Answer[] answers0 = answers[0];
    private final static Node node0 = new Node(answers0, 0);
//endregion

    //region Node1
    private final static Answer[] answers1 = answers[1];
    private final static Node node1 = new Node(answers1, 1);
//endregion

    //region Node2
    private final static Answer[] answers2 = answers[2];
    private final static Node node2 = new Node(answers2, 2);
//endregion

    static Node[] nodes = new Node[]{node0, node1, node2};


}
