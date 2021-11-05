package interface_demo;

public class NoteBook {

  private String hand;
  private Integer size;

    public NoteBook(String hand) {
        this.hand = hand;
    }
    public NoteBook(Integer size){
        this.size= size;
    }


    public void start(){
       System.out.println("笔记本开机");
   }
   public void shutDown(){
       System.out.println("笔记本关机");
    }
    //依赖关系
    public void useUSB(USB usb){
       usb.open();
       usb.close();


    //   public void useUSB(){
    //   USB usb = new Mouse();
    //   usb.close();
    //   usb.open();
    //   //容器给你什么，你只能被动的使用什么

    }
}
