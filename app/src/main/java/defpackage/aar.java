package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aar {
    public static final aar a;
    public static final aar b;
    public static final aar c;
    private static final /* synthetic */ aar[] d;

    static {
        aar aarVar = new aar("PreEnter", 0);
        a = aarVar;
        aar aarVar2 = new aar("Visible", 1);
        b = aarVar2;
        aar aarVar3 = new aar("PostExit", 2);
        c = aarVar3;
        aar[] aarVarArr = {aarVar, aarVar2, aarVar3};
        d = aarVarArr;
        ske.aB(aarVarArr);
    }

    private aar(String str, int i) {
    }

    public static aar[] values() {
        return (aar[]) d.clone();
    }
}
