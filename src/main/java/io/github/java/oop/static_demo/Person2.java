package static_demo;

public class Person2 {
    private boolean live = true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    class Herat{
        public void jump(){
            if(live){
                System.out.println("跳动");
            }else {
                System.out.println("停止跳动");
            }
        }
    }
}
