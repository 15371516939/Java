package annotation;

/**
 * @author :duyunjian
 * @description :
 * @create :2021-11-10 20:57:00
 */
public class SafeVarargsAnnotation<S> {
    private S[] args;
    public SafeVarargsAnnotation(S... args){
        this.args = args;
    }
    public void loopPrintArgs(S... args){
        for (S arg : args){
            System.out.println(arg);
        }
    }
    public final void printSelfArgs(S... args){
        for (S arg : this.args) {
            System.out.println(arg);
        }
    }
    public static <T> void loopPrintInfo(T... infos){
        for(T info:infos){
            System.out.println(info);
        }
    }
    public static void main(String[] args) {
        SafeVarargsAnnotation.loopPrintInfo("A","B","C");
    }
}