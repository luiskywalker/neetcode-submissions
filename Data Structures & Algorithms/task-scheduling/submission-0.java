class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskFrequencies = new int[26];
        int maxFreq = 0 ;

        //count freq of each task
        for(char task:tasks){
            int index = task - 'A';
            taskFrequencies[index]++;
            maxFreq = Math.max(maxFreq, taskFrequencies[index]);
        }
       

       //count how many tasks have max freq
       int taskWithMaxFreq = 0;
       for(int freq: taskFrequencies){
            if(freq == maxFreq){
                taskWithMaxFreq++;
            }
       }

       //calc min intervals needed slots needed= (maxFreq -1) * (cooling period +1) + tasks with max freq
       int slotsForMaxFreqTasks = (maxFreq -1) * (n+1) + taskWithMaxFreq  ;
       return Math.max(tasks.length, slotsForMaxFreqTasks);
    }
}
