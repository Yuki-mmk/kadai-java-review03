package baseball;

public class Review03 {

	public static void main(String[] args) {
		BaseBallTeam yakult = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
		yakult.report();

		BaseBallTeam baystar = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
		baystar.report();

		BaseBallTeam  tigars= new BaseBallTeam("阪神タイガース", 68, 71, 4);
		tigars.report();

		BaseBallTeam  giant= new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
		giant.report();

		BaseBallTeam carp= new BaseBallTeam("広島東洋カープ", 66, 74, 3);
		carp.report();

		BaseBallTeam dragons= new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
		dragons.report();

	}

}
