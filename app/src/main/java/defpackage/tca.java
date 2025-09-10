package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tca {
    public static final tca a;
    public static final tca b;
    public static final tca c;
    public static final tca[] d;
    public final int e;
    private final String f;

    static {
        tca tcaVar = new tca("kUnknown", -1);
        a = tcaVar;
        tca tcaVar2 = new tca("kAuto", 0);
        b = tcaVar2;
        tca tcaVar3 = new tca("kManual", 1);
        c = tcaVar3;
        d = new tca[]{tcaVar, tcaVar2, tcaVar3};
    }

    private tca(String str, int i) {
        this.f = str;
        this.e = i;
    }

    public final String toString() {
        return this.f;
    }
}
