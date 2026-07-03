class MinStack {

// Main stack to store all elements
    private Deque<Integer> mainStack;
    // Auxiliary stack to keep track of minimum elements
    private Deque<Integer> minStack;

    /**
     * Constructor initializes both stacks.
     * Pushes MAX_VALUE to minStack as initial value to handle edge cases.
     */
    public MinStack() {
        mainStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        // Initialize minStack with MAX_VALUE to avoid null checks
        minStack.push(Integer.MAX_VALUE);
    }

    /**
     * Pushes an element onto the stack.
     * Also updates the minimum value tracker.
     * @param val the value to be pushed
     */
    public void push(int val) {
        // Push value to main stack
        mainStack.push(val);
        // Push the minimum between current value and previous minimum to minStack
        minStack.push(Math.min(val, minStack.peek()));
    }

    /**
     * Removes the top element from the stack.
     * Also removes the corresponding minimum tracker.
     */
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    /**
     * Gets the top element of the stack without removing it.
     * @return the top element
     */
    public int top() {
        return mainStack.peek();
    }

    /**
     * Retrieves the minimum element in the stack in O(1) time.
     * @return the minimum element in the current stack
     */
    public int getMin() {
        return minStack.peek();
    }
}
