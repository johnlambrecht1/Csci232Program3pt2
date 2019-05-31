package Csci232Program3pt2;

import java.util.ArrayList;

public class testRun {
    public static void main(String[] args){
        ArrayList<Integer> change = new ArrayList<Integer>();
        change = makeChange.makeChange("10");
        System.out.println(change);
    }
}
