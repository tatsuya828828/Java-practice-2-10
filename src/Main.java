import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("rpgsave.xml");
		// 文書全体を取得
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
		// 一番外側のheroタグ(Element)を取得
		Element hero = doc.getDocumentElement();
		// その中のweaponタグ(Element)を取得
		Element weapon = findChildByTag(hero, "weapon");
		// その中のpowerタグ(Element)を取得
		Element power = findChildByTag(weapon, "power");
		// その中の文字列情報(text)を取得
		String value = power.getTextContent();
	}

	static Element findChildByTag (Element self, String name) throws Exception {
		NodeList children = self.getChildNodes();
		for(int i = 0; i < children.getLength(); i++) {
			if(children.item(i) instanceof Element) {
				Element e = (Element) children.item(i);

				if(e.getTagName().equals(name)) {
					return e;
				}
			}
		}
		return null;
	}
}
