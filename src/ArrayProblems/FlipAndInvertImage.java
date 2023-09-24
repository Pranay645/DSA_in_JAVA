package ArrayProblems;

public class FlipAndInvertImage {
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            // int[][] flipped=new int[image.length][];
            for(int i=0;i<image.length;i++){
                int l=image[i].length-1;
                int r=0;
                while(l>r){
                    int s=image[i][l];
                    image[i][l]=image[i][r];
                    image[i][r]=s;

                    l--;
                    r++;
                }
            }
            for(int i=0;i<image.length;i++){
                for(int j=0;j<image[i].length;j++){
                    if(image[i][j]==1){ image[i][j]--;  }
                    else{image[i][j]++;}
                }
            }
            return image;
        }
    }
}
