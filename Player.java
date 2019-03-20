public class Player
{
	private String name;
	private int points;
	private int wins = 0;
	private int losses = 0;

	public Player(String playerName) {
		name = playerName;
	}

	public String getName() {
		return name;
	}

	public void setPoints(int playerRoll) {
		 points = playerRoll;
	}

	public int getPoints() {
		return points;
	}

	public int won() {
		wins++;
		return wins;
	}
	public int lost() {
		losses++;
		return losses;
	}

	public String toString() {
		String result = "";
		result += name + "\n\twins: " + wins + "\n\tloosses: " + losses;
		return result;
	}


}