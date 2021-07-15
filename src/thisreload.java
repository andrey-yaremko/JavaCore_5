public class thisreload {

    int a;
    int b;
    int c;

    public thisreload(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public thisreload(int a,int b, int c) {
        this(a,b);
        this.c = c;
    }
}
