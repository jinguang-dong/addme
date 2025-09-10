package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccg {
    public static final ccg a;
    public static final ccg b;
    public static final ccg c;
    private static final /* synthetic */ ccg[] d;

    static {
        ccg ccgVar = new ccg("On", 0);
        a = ccgVar;
        ccg ccgVar2 = new ccg("Off", 1);
        b = ccgVar2;
        ccg ccgVar3 = new ccg("Indeterminate", 2);
        c = ccgVar3;
        ccg[] ccgVarArr = {ccgVar, ccgVar2, ccgVar3};
        d = ccgVarArr;
        ske.aB(ccgVarArr);
    }

    private ccg(String str, int i) {
    }

    public static ccg[] values() {
        return (ccg[]) d.clone();
    }
}
