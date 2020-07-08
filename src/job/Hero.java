package job;

public class Hero {
	private int hp;
	private int mp;
	private String name;

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
	}

	public Hero() {
		this("たかし");
	}
}
