package student.util;

public class PlayBoolean {
    private static PlayBoolean instance;

    private boolean play = true;
    private boolean tPlay = true;
    private boolean sPlay = true;

    private PlayBoolean() {
    }

    public static PlayBoolean getInstance() {
        // instance 가 null 일 때만 생성
        if (instance == null) {
            instance = new PlayBoolean();
        }
        return instance;
    }


    public boolean getPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public boolean gettPlay() {
        return tPlay;
    }

    public void settPlay(boolean tPlay) {
        this.tPlay = tPlay;
    }

    public boolean getsPlay() {
        return sPlay;
    }

    public void setsPlay(boolean sPlay) {
        this.sPlay = sPlay;
    }
}