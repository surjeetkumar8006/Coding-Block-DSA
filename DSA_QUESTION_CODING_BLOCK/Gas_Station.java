package DSA_QUESTION_CODING_BLOCK;

public class Gas_Station {
    public static void main(String[] args) {

        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        System.out.println(solution(gas, cost));
    }

    public static int solution(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int cg = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            cg += (gas[i] - cost[i]);
            if (cg < 0) {
                start = i + 1;
                cg = 0;
            }
        }
        return totalGas < totalCost ? -1 : start;
    }

}
