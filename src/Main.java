import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < Nodes.nodes[0].answers.length; i++) {
            System.out.println(Nodes.nodes[0].answers[i].getDesc());
        }
        //first node has that parameters:
        int numOfThisNode = 2;
        int numOfAnswers = 3;

        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Choose your answer:");
            int answer = sc.nextInt();
            Node activeNode = Nodes.nodes[numOfThisNode * numOfAnswers + answer];

            for (int j = 0; j < activeNode.answers.length; j++) {
                System.out.println(activeNode.answers[j].getDesc());
            }


            numOfAnswers = activeNode.answers.length;
            numOfThisNode = activeNode.numOfNode * numOfAnswers + answer;

        }
    }

}
