public class DicePlayer
{
	private static String name;
	private static int points;
	private static int wins = 0;
	private static int losses = 0;

	public DicePlayer(playerName) {
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

	public won() {
		wins++;
		return wins;
	}
	public lost() {
		losses++;
		return losses;
	}

	public String toString() {
		result = "";
		result += "\n\twins: " + wins + "\n\tloosses: " + losses;
		return result;
	}


}