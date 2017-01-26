package mh.equation;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Node {

    private Node left;
    private Node right;


    public static Node END = new Node(null, null);

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;

    }


    public void printTree(OutputStreamWriter out) throws IOException {
        if (right != null) {
            right.printTree(out, true, "");
        }
        printNodeValue(out);
        if (left != null) {
            left.printTree(out, false, "");
        }
    }
    private void printNodeValue(OutputStreamWriter out) throws IOException {
//        if (value == 0) {
//            out.write("*");
//        } else {
//            out.write(String.valueOf(value));
//        }
        out.write("*");
        out.write('\n');
    }
    // use string and not stringbuffer on purpose as we need to change the indent at each recursion
    private void printTree(OutputStreamWriter out, boolean isRight, String indent) throws IOException {
        if (right != null) {
            right.printTree(out, true, indent + (isRight ? "        " : " |      "));
        }
        out.write(indent);
        if (isRight) {
            out.write(" /");
        } else {
            out.write(" \\");
        }
        out.write("----- ");
        printNodeValue(out);
        if (left != null) {
            left.printTree(out, false, indent + (isRight ? " |      " : "        "));
        }
    }

}
