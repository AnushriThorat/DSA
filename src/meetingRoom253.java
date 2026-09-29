public class meetingRoom253 {

    static int minMeetingRooms(int[][] interval){
        int maxRooms=0;

        for(int i=0;i<interval.length;i++){
            int
                    count=0;

            for(int j=0;j< interval.length;j++){

                if(interval[j][0]<=interval[i][0] && interval[i][0]<=interval[j][1]){
                    count++;
                }
            }
            maxRooms=Math.max(maxRooms,count);
        }
        return maxRooms;
    }

    public static void main(String[] args){
        int[][] arr={{0,10},{5,15},{12,20},{18,25}};
        int count=minMeetingRooms(arr);
        System.out.println("Required meeting rooms are:"+count);
    }
}
