package Recursion.Subsequence;

import java.util.ArrayList;

public class DiceRolls {
    static void printPossibleRolls(String s,int target){
        if(target==0){
            System.out.println(s);
            return;
        }
        for (int i=1;i<=6 && i<=target;i++){
            printPossibleRolls(s+i,target-i);
        }
    }

    static ArrayList<String> retPossibleRolls(String s, int target){
        if(target==0){
//            System.out.println(s);
            ArrayList<String> ls=new ArrayList<>();
            ls.add(s);
            return ls;
        }
        ArrayList<String> arr=new ArrayList<>();
        for (int i=1;i<=6 && i<=target;i++){
            arr.addAll(retPossibleRolls(s+i,target-i));
        }
        return arr;
    }

    //TODO FOR N FACED DICE
    static void printPossibleRolls(String s,int target,int faces){
        if(target==0){
            System.out.println(s);
            return;
        }
        for (int i=1;i<=faces && i<=target;i++){
            printPossibleRolls(s+i,target-i);
        }
    }

    public static void main(String[] args) {
        printPossibleRolls("",4);
        System.out.println(retPossibleRolls("",4));
    }
}
