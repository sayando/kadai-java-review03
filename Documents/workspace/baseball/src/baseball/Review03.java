package baseball;

public class Review03 {
    public static void main(String[] args) {
        BaseBallTeam bbt01 = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        bbt01.report() ;

        BaseBallTeam bbt02 = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        bbt02.report();

        BaseBallTeam bbt03 = new BaseBallTeam("阪神タイガース",68,71,4);
        bbt03.report() ;

        BaseBallTeam bbt04 = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        bbt04.report() ;

        BaseBallTeam bbt05 = new BaseBallTeam("広島東洋カーブ",66,74,3);
        bbt05.report() ;

        BaseBallTeam bbt06 = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        bbt06.report() ;
}
    }