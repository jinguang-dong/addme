package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcj {
    public static final tcj a;
    public static final tcj b;
    public static final tcj c;
    public static final tcj[] d;
    public final int e;
    private final String f;

    static {
        tcj tcjVar = new tcj("kUnknown", -1);
        a = tcjVar;
        tcj tcjVar2 = new tcj("kOff", 0);
        b = tcjVar2;
        tcj tcjVar3 = new tcj("kOn", 1);
        c = tcjVar3;
        d = new tcj[]{tcjVar, tcjVar2, tcjVar3};
    }

    private tcj(String str, int i) {
        this.f = str;
        this.e = i;
    }

    public final String toString() {
        return this.f;
    }
}
