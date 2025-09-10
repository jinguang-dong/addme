package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tci {
    public static final tci a;
    public static final tci b;
    public static final tci c;
    public static final tci d;
    public static final tci[] e;
    public final int f;
    private final String g;

    static {
        tci tciVar = new tci("kUnknown", -1);
        a = tciVar;
        tci tciVar2 = new tci("kFront", 0);
        b = tciVar2;
        tci tciVar3 = new tci("kBack", 1);
        c = tciVar3;
        tci tciVar4 = new tci("kExternal", 2);
        d = tciVar4;
        e = new tci[]{tciVar, tciVar2, tciVar3, tciVar4};
    }

    private tci(String str, int i) {
        this.g = str;
        this.f = i;
    }

    public final String toString() {
        return this.g;
    }
}
