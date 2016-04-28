
public class Le_134_Gas_Station {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas == null || gas.length == 0 || cost == null || cost.length == 0){
            return -1;
        }
        
        int n = gas.length;
        int startIndex = 0, endIndex = 1;
        int totalProfit = gas[startIndex] - cost[startIndex];
        
        while(n > 1 && startIndex != endIndex){
            if(totalProfit >= 0){
                totalProfit += gas[endIndex] - cost[endIndex];
                endIndex = (endIndex + 1) % n;
            } else {
                startIndex = (startIndex == 0) ? n - 1 : startIndex - 1;
                totalProfit += gas[startIndex] - cost[startIndex];
            }
        }
        
        return totalProfit >= 0 ? startIndex : -1;
    }
}
