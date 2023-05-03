import java.sql.PreparedStatement;

public class Solution {
    public int superPow(int a, int[] b) {
        a = a %1337;

        //make an int out of b elements
        int k = 0;
        for (int j : b) {
            k = k * 10 + j;
        }


        if (a == 0)return 0;
        if (a == 1)return 1;


        int result = 1;
        for (int i = 0; i < k; i++) {
            result = result * a;
            if (result>1337)
                result = result%1337;
        }

        return result;
    }

}
