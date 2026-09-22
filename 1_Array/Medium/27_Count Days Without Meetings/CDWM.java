//https://leetcode.com/problems/count-days-without-meetings/description/

 import java.util.*;
public class CDWM {
/*
    public int countDays(int days, int[][] meeting) {

        Arrays.sort(meeting, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();

        int current[] = meeting[0];
        list.add(current);

        for (int i = 1; i < meeting.length; i++) {
            int currEnd = current[1];
            int nextSt = meeting[i][0];
            int nextEn = meeting[i][1];

            if (currEnd >= nextSt) {
                current[1] = Math.max(currEnd, nextEn);
            } else {
                current = meeting[i];
                list.add(current);
            }
        }
   
        // int gap = 0;
        // for (int i = 1; i < list.size(); i++) {
        //     gap += list.get(i)[0] - list.get(i - 1)[1] - 1;
        // }

        // gap = gap + list.get(0)[0] -1;
        // gap = gap + days - list.get(list.size() - 1)[1];

        // return gap;

          int freedays = 0;
        for (int i = 0; i < list.size(); i++) {
            freedays += list.get(i)[1] - list.get(i)[0] + 1;
        }
        freedays = days - freedays;
        return freedays;


    }
*/
      public int countDays(int days, int[][] meeting) {

        Arrays.sort(meeting, (a, b) -> Integer.compare(a[0], b[0]));

        int gap =0; 
        int maxEnd = meeting[0][1];

        for(int i=1; i< meeting.length; i++){
            if(meeting[i][0] > maxEnd){
                gap += meeting[i][0] - maxEnd -1;
            }

            maxEnd = Math.max(meeting[i][1] , maxEnd);
        }

        gap = gap + meeting[0][0] -1;  // stating se kitna gap hai;
        gap = gap + days - maxEnd;
        
        return gap;
    }

    public static void main(String args[]){

    }
}

