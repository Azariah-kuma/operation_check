lass Bankkadai {
	private int account; //預金額

	//コンストラクタ
	public Bank(int money) {
		if (money > 0) {
			account = money;
		}
		System.out.println("新規口座を作成しました。");
		show();
	}

	//メソッド
	//預金額を出力するメソッド
	public void show() {
		System.out.println("預金額:" + account + "円");
	}

	//口座に入金するメソッド
	public void in(int money) {
		if (money > 0) {
			account += money;
			System.out.println(money + "円入金しました。");
		}
		else {
			System.out.println("入金額が不正です。");
		}
		show();
	}

	//口座から出金するメソッド
	public void out(int money) {
		if (account >= money) {
			account -= money;
			System.out.println(money + "円出金しました。");
		}
		else {
			System.out.println("出金額が不正です。");
		}
		show();
	}
}
