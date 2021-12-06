package core.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    private List<Integer> myList;

    public IteratorExample(List<Integer> myList) {
        this.myList = myList;
    }

    public void addToArrayListLockedExample(int num){
        for (int number : myList){
            myList.remove(num);
        }
    }


    public void addToArrayListWithIterator(int num){
        Iterator<Integer> myListIterator = myList.iterator();

        while (myListIterator.hasNext()){
            Integer itrNum = myListIterator.next();
            System.out.println(itrNum);
            if (itrNum > 3){
                myListIterator.remove();
            }
        }

        System.out.println(myList);

    }


    public static void main(String[] args) {

        IteratorExample iteratorExample = new IteratorExample(new ArrayList<>(Arrays.asList(1,2,3,4)));
        iteratorExample.addToArrayListLockedExample(2);


    }

}
