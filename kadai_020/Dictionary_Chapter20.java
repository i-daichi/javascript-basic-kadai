package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	public static void main(String[] args) {

        // HashMapを作成し、単語と意味を追加
        HashMap<String,String> dictionary = new HashMap<String,String>();

        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
        
        // 単語を参照し、意味を出力
        System.out.println("appleの意味は" + dictionary.get("apple"));
        System.out.println("bananaの意味は" + dictionary.get("banana"));
        System.out.println("grapeの意味は" + dictionary.get("grape"));
	     
	   }

}