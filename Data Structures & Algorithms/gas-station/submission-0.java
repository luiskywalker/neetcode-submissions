class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int start = -1;   // -1 means no active candidate
        int tank = 0;     // running gas balance for the current candidate
        int location = 0; // current station being visited (unwrapped)

        // Simulate up to two full laps: one to find a candidate, one to confirm it
        while (location < n * 2) {
            if (start == -1) {
                start = location;
            }

            tank += gas[location % n] - cost[location % n];

            // This candidate can't make it past this station - discard it
            if (tank < 0) {
                start = -1;
                tank = 0;
            }

            location++;

            // The current candidate has survived a full lap - it's the answer
            if (start != -1 && location - start == n) {
                return start % n;
            }
        }

        return -1;
    }
}
