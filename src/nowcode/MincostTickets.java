package nowcode;

public class MincostTickets {
    public static void main(String[] args) {
        MincostTickets mt = new MincostTickets();
        int[] costs = {2,7,15};
        int[] days = {1,4,6,7,8,20};
        int res = mt.mincostTickets(days, costs);
        System.out.println(res);
    }
    public int mincostTickets(int[] days, int[] costs) {
        int[] minCost = new int[366];
        if(days == null || days.length == 0 || costs == null || costs.length !=3) {
            return 0;
        }
        minCost[0] = 0;
        int i=1,j=0;
        for(; i<minCost.length && j<days.length; i++) {
            if(i != days[j]) {
                minCost[i] = minCost[i-1];
            } else {
                j += 1;
                int oneTicket = minCost[i-1] + costs[0];
                int threeTicket = i-7 < 0 ? minCost[0] + costs[1] : minCost[i-7] + costs[1];
                int sevenTicket = i-30 < 0 ? minCost[0] + costs[2] : minCost[i-30] + costs[2];
                minCost[i] = Math.min(oneTicket, Math.min(threeTicket, sevenTicket));
            }
        }
        return minCost[i-1];
    }
}
