import java.util.Scanner;

/**
 * Created by karim møller(karmo15), Sebastian Bjerre Jørgensen(sejoe13) and Mads Berggreen(madbe15) on 23-02-2017.
 */
public class TreeSort {
    public static void main(String[] args) {

        //create empty tree
        DictBinTree tree = new DictBinTree();

        int n = 0;
        int i;
        //scans for input
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            i = sc.nextInt();
            n++;
            // Inserts the input into the tree
            tree.insert(i);
        }
        int[] nodes = tree.orderedTraversal();
        
        //prints input
        for(int k =0; k < n; k++){
            System.out.println(nodes[k]);

        }
    }
}
