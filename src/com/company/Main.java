package com.company;

import java.util.LinkedList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList<String> placeToVisit = new LinkedList<>();
        placeToVisit.add("Sydney");
        placeToVisit.add("melbourne");
        placeToVisit.add("Addis");
        placeToVisit.add("Nathrate");

        printList(placeToVisit);
        placeToVisit.add(1, "adama");
        printList(placeToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visit "+ i.next());

        }
        System.out.println("==================================");

    }
}
