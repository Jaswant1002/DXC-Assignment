package cricketScore;

	abstract class Cricket
	{
		

		private int maxOvers;
		private int targetScore;
		private int currentOver;
		private int currentScore;
		public int getCurrentOver() {
			return currentOver;
		}
		public void setCurrentOver(int currentOver) {
			this.currentOver = currentOver;
		}
		public int getCurrentScore() {
			return currentScore;
		}
		public void setCurrentScore(int currentScore) {
			this.currentScore = currentScore;
		}
		public int getMaxOvers() {
			return maxOvers;
		}
		
		
		 public int getTargetScore() {
			return targetScore;
		}
		public void setTargetScore(int targetScore) {
			this.targetScore = targetScore;
		}
		public abstract double calcCurrentdRunrate();

		
		public abstract double calcReqdRunrate();
		

	public Cricket(){
		maxOvers=50;
		
		}
		}
