package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private int totalAdded = 0;

    @Override
    public boolean add(int num) {
        // Call the superclass's add method to maintain sorting
        boolean result = super.add(num);
        if(result){totalAdded++;}
        return result;
    }

    @Override
    public boolean addAll(IntegerList list) {
        // Call the superclass's addAll method to maintain sorting
        return super.addAll(list);
    }

    /**
     * Returns the total number of attempted element insertions.
     * 
     * @return the total number of attempted element insertions
     */
    public int getTotalAdded() {
        return totalAdded;
    }

}