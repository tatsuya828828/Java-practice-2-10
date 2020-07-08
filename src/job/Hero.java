package job;

import java.io.Serializable;

public class Hero implements Serializable {
	private static final long serialVersionUTD = 0000;
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
