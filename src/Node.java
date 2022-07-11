



public class Node {

    Answer[] answers;

    int numOfNode;

    public Node(Answer[] answers, int numOfNode) {
        this.answers = answers;

        this.numOfNode = numOfNode;
    }

    public Node switcher(Answer answer, Node[] nodes){
       return nodes[answer.getNum()];
    }
}
