class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        List<Integer> res = new ArrayList<Integer>(Collections.nCopies(temperatures.length, 0));
        // stores indices of previous colder days
        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < temperatures.length; i++) {
            // while the stack is not empty and current day is warmer than the day referred by the top of the stack
            while (!stack.isEmpty() && temperatures[stack.get(stack.size() - 1)] < temperatures[i]) {
                // pop the index of the colder previous day
                int prevDayIndex = stack.remove(stack.size() - 1);
                // set the popped index in the res array to (current index - the popped index)
                res.set(prevDayIndex, i - prevDayIndex);
            }
            // push the current index to stack
            stack.add(i);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
