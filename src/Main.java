import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import job.Hero;

public class Main {
	public static void main(String[] args) throws Exception {
		// インスタンスの直列かと保存
		Hero hero1 = new Hero("ミナト");
		FileOutputStream fos = new FileOutputStream("rpgsave.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hero1);
		oos.flush();
		oos.close();

		// ファイルからインスタンスを復元
		FileInputStream fis = new FileInputStream("rpgsave.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Hero hero2 = (Hero) ois.readObject();
		ois.close();
	}
}
