class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count = 0;
        Boolean[] seats;
        Map<Integer,Boolean[]> map=new HashMap<>();

        for(int i=0; i<reservedSeats.length; i++){
            int row = reservedSeats[i][0];
            int s=reservedSeats[i][1];
            if(s==1 || s==10){
                continue;
            }
            if (map.containsKey(row)){
                seats=map.get(row);
            }else{
                seats = new Boolean[3];
                seats[0]=true;
                seats[1]=true;
                seats[2]=true;
            }
            if(s==2 || s==3){
                seats[0]=false;
            }else if(s==8 || s==9){
                seats[2]=false;
            }else if(s==4 || s==5){
                seats[0]=false;
                seats[1]=false;
            }else if(s==6 || s==7){
                seats[1]=false;
                seats[2]=false;
            }
            map.put(row,seats);
        }
        for(Map.Entry<Integer,Boolean[]> entry : map.entrySet()){
            Boolean[] seatsAvlble=entry.getValue();
            if((seatsAvlble[0] && seatsAvlble[1] && seatsAvlble[2]) || seatsAvlble[0] && seatsAvlble[2]){
                count+=2;
            }else if((seatsAvlble[0] && seatsAvlble[2]) || seatsAvlble[0] || seatsAvlble[1]){
                count++;
            }else if((seatsAvlble[1] && seatsAvlble[2]) || seatsAvlble[1] || seatsAvlble[2]){
                count++;
            }
        }
        count=count+ (n-map.size()) *2;
        return count;
    }
}