class Solution {
  private static final int MODULE = (int) Math.pow(10, 9) + 7;
  
  public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
    PriorityQueue<Integer> mostEfficientEngineers =
        new PriorityQueue<>(n, Comparator.comparingInt((Integer engineer) -> efficiency[engineer])
                              .reversed().thenComparing((Integer engineer) -> engineer));
    
    for (int engineer = 0; engineer < n; engineer++) {
      mostEfficientEngineers.offer(engineer);
    }
    
    long speedSum = 0;
    long performance = 0;
    PriorityQueue<Integer> topSpeeds = new PriorityQueue<>(k);
    while (!mostEfficientEngineers.isEmpty()) {
      int currentEngineer = mostEfficientEngineers.poll();
      if (topSpeeds.size() > k - 1) {
        speedSum -= topSpeeds.remove();
      }

      int currentSpeed = speed[currentEngineer];
      topSpeeds.offer(currentSpeed);
      speedSum += currentSpeed;
      
      int currentEfficiency = efficiency[currentEngineer];
      performance = Math.max(performance, speedSum * currentEfficiency);
    }
    
    return (int)(performance % MODULE);
  }
}