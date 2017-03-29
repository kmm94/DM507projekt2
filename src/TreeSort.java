import java.util.Scanner;

/**
 * Created by karim møller(karmo15) and Mads Berggreen(madbe15) on 23-02-2017.
 */
public class TreeSort {
    public static void main(String[] args) {

        DictBinTree tree = new DictBinTree();

        int n = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            i = sc.nextInt();
            n++;
            tree.insert(i);
        }
        int[] nodes = tree.orderedTraversal();

        for(int k =0; k < n; k++){
            System.out.println(nodes[k]);

        }
    }
}
