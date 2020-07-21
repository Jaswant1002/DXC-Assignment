package cricketScore;

	class OneDayCricket extends Cricket
	{
		
		public double calcCurrentdRunrate() 
		{
			return super.getCurrentScore()/super.getCurrentOver();
			
		}
		public double calcReqdRunrate() {
			return (getTargetScore()-getCurrentScore())/(getMaxOvers() -getCurrentOver());
		}	
		
	}


