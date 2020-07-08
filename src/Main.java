import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		// プロパティファイルへ書き込むコード
		Writer fw = new FileWriter("rpgdata.properties");
		Properties wp = new Properties();
		wp.setProperty("heroName", "アサカ");
		wp.setProperty("heroHp", "100");
		wp.setProperty("heroMp", "50");
		wp.store(fw, "勇者のステータス");
		fw.close();

		// プロパティファイルを読み込むコード
		Reader fr = new FileReader("rpgdata.properties");
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		String strMp = p.getProperty("heroMp");
		int mp = Integer.parseInt(strMp);
		System.out.println("勇者の名前:" + name);
		System.out.println("HP:" + hp);
		System.out.println("MP:" + mp);
	}
}
