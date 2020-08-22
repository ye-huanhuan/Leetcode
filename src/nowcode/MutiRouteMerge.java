package nowcode;

import java.util.*;

public class MutiRouteMerge {

    public static void main(String[] args) {
        MutiRouteMerge mrm = new MutiRouteMerge();
        List list = mrm.mutiRouteMerge(new int[]{5, 8, 10}, new int[]{2, 5, 7}, new int[]{1, 6, 9});
        System.out.println(list);
    }

    public List mutiRouteMerge(int[]... nums) {
        int length = nums.length;
        List<Integer> res = new ArrayList<>();
        MyEntry[] tmp = new MyEntry[length];
        int[] numsIndex = new int[length];
        for(int index=0,j=0; index<length; index++) {
            tmp[j] = new MyEntry(nums[index][0], index);
            numsIndex[j] = 1;
            j++;
        }

        Arrays.sort(tmp, new MyEntryComparator());
        int flag = 0;
        while(true) {
            int index = tmp[flag].getIndex();
            int value = tmp[flag].getValue();
            res.add(value);
            int numIndex = numsIndex[index];
            if(numIndex >= nums[index].length) {
                tmp[flag] = new MyEntry(0, index);
                flag++;
            } else {
                tmp[flag] = new MyEntry(nums[index][numIndex], index);
                numsIndex[index] = numsIndex[index] + 1;
                Arrays.sort(tmp, new MyEntryComparator());
            }
            if(flag >= tmp.length) {
                break;
            }
        }
        return res;
    }
}

class MyEntry {
    int value;
    int index;

    public MyEntry(int value, int index) {
        this.value = value;
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

class MyEntryComparator implements Comparator<MyEntry> {


    @Override
    public int compare(MyEntry o1, MyEntry o2) {
        return o1.getValue() - o2.getValue();
    }
}