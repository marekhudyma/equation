package mh.equation;

import org.junit.Test;

import java.io.OutputStreamWriter;

public class TreeTest {

    @Test
    public void testConstruction() throws Exception {

        Node node1 = new Node(Node.END, Node.END);
        Node node2 = new Node(Node.END, Node.END);

        Node node = new Node(node1, node2);

        OutputStreamWriter log = new OutputStreamWriter(System.out);
        node.printTree(log);
        System.out.println(log.toString());

        log.flush();
    }
}
