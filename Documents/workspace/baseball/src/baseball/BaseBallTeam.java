package baseball;
public class BaseBallTeam {
    //フィールド
    private String name;
    protected int win;
    protected int lose;
    protected int draw;
    //引数ありコンストラクタ
    public BaseBallTeam(String name,int win,int lose,int draw) {
    this.name = name;
    this.win = win;
    this.lose = lose;
    this.draw = draw;
}
    //勝率
    public double getRate(){
        return (double) this.win/(this.win+this.lose);
}
    //表示する
    public void report(){
System.out.println(this.name+"の2022年の成績は"+this.win+"勝"+this.lose+"敗"+this.draw+"分、勝率は"+this.getRate()+"です。");
}
}
