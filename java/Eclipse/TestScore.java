import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestScore {

	public static void main(String[] args) throws IOException {
		System.out.println("5人のテストの点数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] test = new int[5];

		for(int i=0; i<test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}

		int intMax = test[0];
		//int max = 0;

        for (int i = 0; i < test.length; i++ ) {
            if(intMax < test[i]) {
            	//if (test[i] > max);
                intMax = test[i];
                //max = test[i];
			}}
         for (int i = 0; i < test.length; i++ ) {
            System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
         }
			System.out.println("最高点は" + intMax + "です。");
        }}

