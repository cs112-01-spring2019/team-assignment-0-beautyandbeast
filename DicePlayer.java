public class DicePlayer
{
	private static String name;
	private static int points;
	private static int wins = 0;
	private static int losses = 0;

	public DicePlayer(String playerName) {
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
		result += "\n\twins: " + wins + "\n\tloosses: " + losses;
		return result;
	}


}