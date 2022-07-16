import java.util.*;

public class Assignment_2 {

    public static void main(String[] args) {
        
        // declaring test ArrayLists
        ArrayList<Integer> dup = new ArrayList<>(Arrays.asList(5, 3, 2, 3, 1, 1, 1, 4));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(0, 1, 3, 5, 7, 9, 11));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 8, 9, 14));
        

        // test methods
        System.out.println("Original duplicate ArrayList: " + dup);
        System.out.println("NoDup list: " + nodup(dup));

        System.out.println("\nList 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("merged and sorted list: " + mergeSort(list1, list2));

    }

    // duplicate removing method
    public static ArrayList<Integer> nodup(ArrayList<Integer> dup) {
        // initiates new arraylist
        ArrayList<Integer> nodup = new ArrayList<Integer>();
        // iterates through list, adds int if not in list
        for (Integer num : dup) {
            if (!nodup.contains(num))
                nodup.add(num);
        }
        // return nodup list
        return nodup;
    }

    // merge and sorting method
    /* Takes one int from list, compares it to items of other list, 
        if it is smaller than the next item in the list, it places it before item
        if it gets to the end and is larger than all values, it adds it to the end */

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // initiates new arraylist
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i : list1) {
            if (list3.size() == 0) {
                list3.add(i);
                continue;
            }

            for (int j = 0; j < list3.size(); j++) {
                if (list3.get(j) >= i) {
                    list3.add(j, i);
                    break;
                }

                if (i > list3.get(list3.size() - 1)) {
                    list3.add(i);
                    break;
                }
            }
        }
        
        for (int i : list2) {
            for (int j=0; j<list3.size(); j++){
                if (list3.get(j) >= i) {
                    list3.add(j, i);
                    break;
                }

                if (i > list3.get(list3.size() - 1)) {
                    list3.add(i);
                    break;
                } 
            }
        }
    
        // returns list3
        return list3;

    }


    /* alternate merge and sorting method using java.util methods

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // initiates new arraylist
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        // uses addAll to combine lists
        list3.addAll(list1);
        list3.addAll(list2);

        // uses Collections to sort list 
        Collections.sort(list3);
        // return list3
        return list3;

    }
    */
}
