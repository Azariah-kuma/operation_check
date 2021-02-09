import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ifelse4kadai {

	public static void main(String[] args) throws IOException {
		System.out.println("年を入力してください。");
		boolean check = false;


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int year = Integer.parseInt(str);

		if(year %4 == 0) {
			if ((year % 400) == 0) {
                check = true;
            }
        } else {
            check = true;
		}
		System.out.println(check ? "うるう年です。" : "うるう年ではありません。");
	}
}
