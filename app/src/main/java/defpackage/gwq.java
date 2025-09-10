package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwq {
    public static final gwq a;
    public static final gwq b;
    public static final gwq c;
    private static final /* synthetic */ gwq[] d;

    static {
        gwq gwqVar = new gwq("NONE", 0);
        a = gwqVar;
        gwq gwqVar2 = new gwq("ANIMATE_WITHOUT_DELAY", 1);
        b = gwqVar2;
        gwq gwqVar3 = new gwq("ANIMATE_WITH_DELAY", 2);
        c = gwqVar3;
        gwq[] gwqVarArr = {gwqVar, gwqVar2, gwqVar3};
        d = gwqVarArr;
        ske.aB(gwqVarArr);
    }

    private gwq(String str, int i) {
    }

    public static gwq[] values() {
        return (gwq[]) d.clone();
    }
}
