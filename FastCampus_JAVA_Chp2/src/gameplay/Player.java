package gameplay;

public class Player{
	private int level;
	public PlayerLevel p1;
	
	public Player() {
		this.level = 1;
		this.p1 = new BeginnerLevel();
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void upgradeLevel(PlayerLevel p) {
		p1 = (PlayerLevel) p;
		this.level++;
	}
	
	public final void play(int count) { 
		p1.go(count);

	}
	
	
}
