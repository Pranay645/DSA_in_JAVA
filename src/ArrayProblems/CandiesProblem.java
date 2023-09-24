package ArrayProblems;


import java.util.ArrayList;
import java.util.List;

class CandiesProblem{
    static class OptimalApproach{
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> list = new ArrayList<>();
            int max = candies[0];
            int n = candies.length;
            for(int i=1; i<n; i++){
                if(candies[i]>max){
                    max = candies[i];
                }
            }
            for(int i=0; i<n; i++){
                list.add(candies[i]+extraCandies >=max);
            }
            return list;
        }
    }

    static class MyApproach {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int newCandies;
            boolean bool;
            ArrayList<Boolean> arr = new ArrayList<>();

            for(int i=0;i<candies.length;i++){
                newCandies=candies[i]+extraCandies;
                bool=true;
                for(int j=0;j<candies.length;j++){
                    if(newCandies<candies[j]){
                        bool=false;
                    }
                }
                if(bool){
                    arr.add(true);
                }
                else{
                    arr.add(false);
                }
            }
            return arr;
        }
    }

}
