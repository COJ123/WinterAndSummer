import java.util.Arrays;

public class Solution {
    public int solution(int[] T){
        int marker = 0;
        boolean found;
        for (int i = 1; i < T.length; i++) {
            marker = i;
            found = true;

            int[] winter = Arrays.copyOfRange(T, 0, i);
            int[] summer = Arrays.copyOfRange(T, i, (T.length));

            outerloop:
            for (int tempWinter: winter) {
                for (int tempSummer: summer) {
                    if (tempWinter>tempSummer) {
                        found = false;
                        break outerloop;
                    }
                }
            }
            if (found)
                break;
        }
        return marker;
    }
}
