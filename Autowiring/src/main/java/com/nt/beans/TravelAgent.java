package com.nt.beans;

public class TravelAgent {
	private TourPlan plan;
	
	
		
	
		public TravelAgent() {
		
	}

		public void setPlan(TourPlan plan) {
		this.plan = plan;
	}

		public TravelAgent(TourPlan plan) {
			System.out.println("TravelAgent:: 1-param constructor");
			this.plan = plan;
		}

		@Override
		public String toString() {
			return "TravelAgent [plan=" + plan + "]";
		}
		
		

}
