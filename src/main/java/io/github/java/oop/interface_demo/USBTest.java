package interface_demo;

public class USBTest {
    public static void main(String[] args) {
        NoteBook noteBook  = new NoteBook("DELL");
        noteBook.start();
        noteBook.useUSB(new Mouse());
        noteBook.useUSB( new Keyborad());
        noteBook.shutDown();
    }
}
