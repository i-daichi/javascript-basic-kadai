package kadai_020;
import java.util.HashMap;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
    	
    	// 
        HashMap<String,String> dictionary = new HashMap<String,String>();
        
        // 単語と意味を追加
        dictionary.put("apple", "りんご");
        dictionary.put("banana", "バナナ");
        dictionary.put("grape", "ぶどう");
        
        // 単語を参照し、意味を出力
        System.out.println("appleの意味は" + dictionary.get("apple"));
        System.out.println("bananaの意味は" + dictionary.get("banana"));
        System.out.println("grapeの意味は" + dictionary.get("grape"));
        
    	 // 存在しないキーの場合の処理
        String orangeMeaning = dictionary.get("orange");
        if (orangeMeaning == null) {
            System.out.println("orangeは辞書に存在しません");
        } else {
            System.out.println("orangeの意味は" + orangeMeaning);
        }
    }
}