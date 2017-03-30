/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Created by karim møller(karmo15) and Mads Berggreen(madbe15) on 23-02-2017.
 */
public interface Dict {
    /**
     * Brugt til at indsætte en knude i træet.
     *
     * @param key nøglen på knuden.
     */
    void insert(int key);

    /**
     * Brugt til at retunere hele træet som et sorteret array.
     *
     * @return integer array
     */
    int[] orderedTraversal();

    /**
     * returnere true hvis key er i træet
     *
     * @param key den int man vil søge efter.
     * @return
     */
    boolean search(int key);
}
