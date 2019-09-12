public class Hourglasses {

    static int findMaxofHourglasses(int [][] collection){
        //Max could not be lesser than -63
        int max = -64;
        //loop over rows
        for(int i = 0; i < 6; i ++){
            //if I can access to middle and bottom values
            if(i + 2 < 6){
                //loop over columns
                for(int j = 0; j < 6; j++){
                    //if I can access to middle and right values 
                    if(j + 2 < 6){
                        int up = collection[i][j] + collection[i][j+1] + collection[i][j+2];
                        int middle = collection[i+1][j+1];
                        int down = collection[i+2][j] + collection[i+2][j+1] + collection[i+2][j+2];
                        int sum = up + middle + down;
                        System.out.println("");
                        System.out.println(collection[i][j] + "" + collection[i][j+1] + "" + collection[i][j+2]);
                        System.out.println(" " + collection[i+1][j+1] );
                        System.out.println(collection[i+2][j]+ "" + collection[i+2][j+1] + "" + collection[i+2][j+2]);
                        System.out.println("Suma: "+sum);
                        //set new max
                        if(max == -64 || sum > max){
                            max = sum;
                        }
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][]testOne = {
                        {1,1,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,1,1,0,0,0},
                        {0,0,2,4,4,0},
                        {0,0,0,2,0,0},
                        {0,0,1,2,4,0}
                    };

        System.out.println("The hourglass with the maximum sum is: "+findMaxofHourglasses(testOne));

        int [][]testTwo = {
            {-9,-9,-9,1,1,1},
            {0,-9,0,4,3,2},
            {-9,-9,-9,1,2,3},
            {0,0,8,6,6,0},
            {0,0,0,-2,0,0},
            {0,0,1,2,4,0}
        };
        System.out.println("The hourglass with the maximum sum is: "+findMaxofHourglasses(testTwo));
    }
}