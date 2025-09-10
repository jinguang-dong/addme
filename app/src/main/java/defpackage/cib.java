package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cib {
    public static final cib a;
    public static final cib b;
    private static final /* synthetic */ cib[] c;

    static {
        cib cibVar = new cib("Ltr", 0);
        a = cibVar;
        cib cibVar2 = new cib("Rtl", 1);
        b = cibVar2;
        cib[] cibVarArr = {cibVar, cibVar2};
        c = cibVarArr;
        ske.aB(cibVarArr);
    }

    private cib(String str, int i) {
    }

    public static cib[] values() {
        return (cib[]) c.clone();
    }
}
