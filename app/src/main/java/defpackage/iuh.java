package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuh {
    public static final iuh a;
    public static final iuh b;
    public static final iuh c;
    public static final iuh d;
    public static final /* synthetic */ uhu e;
    private static final /* synthetic */ iuh[] g;
    public final int f;

    static {
        iuh iuhVar = new iuh("ACTIVITY_START", 0, 2);
        a = iuhVar;
        iuh iuhVar2 = new iuh("SHUTTER", 1, 3);
        b = iuhVar2;
        iuh iuhVar3 = new iuh("MODE_SWITCH", 2, 4);
        c = iuhVar3;
        iuh iuhVar4 = new iuh("SESSION", 3, 5);
        d = iuhVar4;
        iuh[] iuhVarArr = {iuhVar, iuhVar2, iuhVar3, iuhVar4};
        g = iuhVarArr;
        e = ske.aB(iuhVarArr);
    }

    private iuh(String str, int i, int i2) {
        this.f = i2;
    }

    public static iuh[] values() {
        return (iuh[]) g.clone();
    }
}
