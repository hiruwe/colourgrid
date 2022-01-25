package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hiii");
	Node n = new Node();
    }
    public void search (Node[] array){
        List<Node> colourList = new ArrayList<>();
        List<Node> currentColourList = new ArrayList<>();
        String previousColour="";
        String currentColour="";
        Integer length =null;
        for(int x=0;x<array.length;x++){
            currentColour = array[x].getColour();

            if(array[x].getRight()==null || !currentColour.equals(previousColour)){
                if(length==null){
                    length = x;
                }
                colourList = currentColourList;
            }
            previousColour = currentColour;
            currentColourList.add(array[x]);
        }
        currentColour="";
        previousColour="";
        for(int x = 0;x<length;x++){

            currentColour = array[x+length].getColour();
        }
    }
}
