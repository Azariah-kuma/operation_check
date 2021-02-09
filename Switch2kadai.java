import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Switch2kadai {

	public static void main(String[] args) throws IOException {
		System.out.println("成績を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int score = Integer.parseInt(str);

		switch(score/10){
        case 10:
        case 9:
        case 8:
        	System.out.println("評価A");
        break;
        case 7:
        case 6:
        	System.out.println("評価B");
        break;
        case 5:
        case 4:
        	System.out.println("評価C");
        break;
        default: System.out.println("追試");
        break;
		}
	}
}
