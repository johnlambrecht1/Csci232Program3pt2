package Csci232Program3pt2;

import java.util.ArrayList;

public class makeChange {
    int input = 0;
    private static int[] coins = {1,5,10,25};
    makeChange(int input){
        this.input = input;
    }
    public static ArrayList<Integer> makeChange(int input){
        ArrayList<Integer> change = new ArrayList<Integer>();
        while (input>0){
            if (input>=coins[3]){
                change.add(coins[3]);
                input -= coins[3];
            }else if (input>=coins[2]){
                change.add(coins[2]);
                input -= coins[2];
            }else if (input>=coins[1]){
                change.add(coins[1]);
                input -= coins[1];
            }else{
                change.add(coins[0]);
                input -= coins[0];
            }
        }
        return change;
    }
}
