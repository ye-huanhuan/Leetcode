package review;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 1094. 拼车
 */
public class Test29 {
    public static void main(String[] args) {
        Test29 t29 = new Test29();
        int[][] test = {{3,2,8},{4,4,6},{10,8,9}};
        boolean res = t29.carPooling(test, 11);
        System.out.println(res);
    }

    public boolean carPooling(int[][] trips, int capacity) {
        if(trips.length == 0) return true;
        List<Trip> tripList = new ArrayList<>();
        for(int i=0; i<trips.length; i++) {
            tripList.add(new Trip(trips[i][0], trips[i][1], trips[i][2]));
        }
        tripList.sort((o1, o2) -> o1.getStart_location() - o2.getStart_location());
        PriorityQueue<Trip> tripPriorityQueue = new PriorityQueue<>((o1, o2) -> o1.getEnd_location() - o2.getEnd_location());
        tripPriorityQueue.add(tripList.get(0));
        int tmpNum = tripList.get(0).getNum_passengers();
        if(tmpNum > capacity) return false;
        for(int i=1; i<tripList.size(); i++) {
            while(tripPriorityQueue.size() > 0 && tripPriorityQueue.peek().getEnd_location() <= tripList.get(i).getStart_location()) {
                tmpNum -= tripPriorityQueue.poll().getNum_passengers();
            }

            tmpNum += tripList.get(i).getNum_passengers();
            tripPriorityQueue.add(tripList.get(i));
            if(tmpNum > capacity) return false;
        }
        return true;
    }
}

class Trip {
    int num_passengers;
    int start_location;
    int end_location;

    public Trip(int num_passengers, int start_location, int end_location) {
        this.num_passengers = num_passengers;
        this.start_location = start_location;
        this.end_location = end_location;
    }

    public int getNum_passengers() {
        return num_passengers;
    }

    public void setNum_passengers(int num_passengers) {
        this.num_passengers = num_passengers;
    }

    public int getStart_location() {
        return start_location;
    }

    public void setStart_location(int start_location) {
        this.start_location = start_location;
    }

    public int getEnd_location() {
        return end_location;
    }

    public void setEnd_location(int end_location) {
        this.end_location = end_location;
    }
}
