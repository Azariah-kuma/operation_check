import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ifelse3kadai {

	public static void main(String[] args) throws IOException {
		System.out.println("年齢を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int age = Integer.parseInt(str);

		if(age <= 12) {
			System.out.println("子どもです。");
		}
		else if (age <= 19) {
			System.out.println("未成年です。");
		}
		else {
			System.out.println("大人です。");
		}

	}

}
