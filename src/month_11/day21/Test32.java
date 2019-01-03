package month_11.day21;

public class Test32 {
}


// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }



class Solution02 {
    public ListNode sortList(ListNode head) {
        ListNode tmp = head;
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        int[] nums = new int[count];
        int index = 0;
        while(tmp != null) {
            nums[index++] = tmp.val;
            tmp = tmp.next;
        }

        int[] sorted = sort(nums, 0, nums.length-1);

        ListNode res = new ListNode(0);
        ListNode resNode = res;
        for(int i : sorted) {
            ListNode cur = new ListNode(i);
            res.next = cur;
            res = res.next;
        }

        return resNode.next;
    }


    public static int[] sort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            sort(a,low,mid);
            sort(a,mid+1,high);
            //左右归并
            merge(a,low,mid,high);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }
}