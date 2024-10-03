package kadai_011;

public class Prime_Chapter11 {
 public static void main(String[]args) {
	boolean[] score =new boolean[101];
	
	for (int i = 0 ; i <  score.length; i++)
        score[i] = true;
	
	for(int i=2; i<100; i++){
       if(!score[i]){
            continue;
        }
        
        for(int j=2; i*j <= 100; j++){
            score[i*j] = false;
        }
    }
    
    for(int i=2; i<score.length; i++){
        if(score[i]){
            System.out.println(i);
        };
	
    }
 }
}
 