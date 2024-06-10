package example.spring.core;

public class CricketMatchResult implements GreetingService {
	private String winningTeam;
	private String loseingTeam;
	private int winningMargin;
	private String winningType;
	
	public CricketMatchResult() {
		System.out.println("calling constructor CricketMatchResult()");
	}
	@Override
	public String sayGreeting() {
	String msg=" heartist Congratulation To Team " + winningTeam + " for defeacting team " + loseingTeam + " by " + winningMargin + " " + winningType;	;// TODO Auto-generated method stub
		return msg;
	}
	public CricketMatchResult(String winningTeam, String loseingTeam, int winningMargin, String winningType) {
	System.out.println("calling parametrized costructor CricketMatchResult(String,String ,int ,String)");
		this.winningTeam = winningTeam;
		this.loseingTeam = loseingTeam;
		this.winningMargin = winningMargin;
		this.winningType = winningType;
	}
	public CricketMatchResult(int winningMargin, String winningTeam, String loseingTeam, String winningType) {
		System.out.println("calling parametrized costructor CricketMatchResult(String,String, int ,String)");
		this.winningMargin = winningMargin;
		this.winningTeam = winningTeam;
		this.loseingTeam = loseingTeam;
		this.winningType = winningType;
	}
	public String getWinningTeam() {
		return winningTeam;
	}
	public void setWinningTeam(String winningTeam) {
		this.winningTeam = winningTeam;
	}
	public String getLoseingTeam() {
		return loseingTeam;
	}
	public void setLoseingTeam(String loseingTeam) {
		this.loseingTeam = loseingTeam;
	}
	public int getWinningMargin() {
		return winningMargin;
	}
	public void setWinningMargin(int winningMargin) {
		this.winningMargin = winningMargin;
	}
	public String getWinningType() {
		return winningType;
	}
	public void setWinningType(String winningType) {
		this.winningType = winningType;
	}
	@Override
	public String toString() {
		return "CricketMatchResult [winningTeam=" + winningTeam + ", loseingTeam=" + loseingTeam + ", winningMargin="
				+ winningMargin + ", winningType=" + winningType + "]";
	}

}
