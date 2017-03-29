/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Created by karim møller(karmo15) and Mads Berggreen(madbe15) on 23-02-2017.
 */
public class DictBinTree implements Dict {

    private Node root;
    private int size = 0;
    private int counter = 0;


    public DictBinTree() {
        root = null;
    }

    /**
     * Inserts the nodes in the tree.
     * @param key 
     */
    @Override
    public void insert(int key) {
        size++;
        Node newNode = new Node(key);
        Node y = null;
        Node x = root;
        while (x != null) {
            y = x;
            if (newNode.getKey() < x.getKey()) {
                x = x.getLeftChild();

            } else {
                x = x.getRightChild();

            }
        }
        if (y == null) {
            root = newNode;
        } else if (newNode.getKey() < y.getKey()) {
            y.setLeftChild(newNode);
        } else {
            y.setRightChild(newNode);
        }
    }

    @Override
    public int[] orderedTraversal() {
        int[] nodes = new int[size];
        counter = 0;
        return  inorderTreeWalk(root, nodes);
    }

    private int[] inorderTreeWalk(Node x, int[] a) {

        if(x != null){
            inorderTreeWalk(x.getLeftChild(), a);
            a[counter] = x.getKey();
            counter++;
            inorderTreeWalk(x.getRightChild(), a);
        }
        return a;
    }

    @Override
    public boolean search(int key) {
    if (treeSearch(root, key) == null){
        return false;
    } else {
        return true;
    }
    }

    private Node treeSearch(Node x, int key) {

        if (x == null || key == x.getKey()) {
            return x;
        }
        if (key < x.getKey()) {

            return treeSearch(x.getLeftChild(), key);
        } else {
            return treeSearch(x.getRightChild(), key);

        }
    }

}
