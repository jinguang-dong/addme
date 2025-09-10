package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aii {
    public static final aii a;
    public static final aii b;
    private static final /* synthetic */ aii[] c;

    static {
        aii aiiVar = new aii("Vertical", 0);
        a = aiiVar;
        aii aiiVar2 = new aii("Horizontal", 1);
        b = aiiVar2;
        aii[] aiiVarArr = {aiiVar, aiiVar2};
        c = aiiVarArr;
        ske.aB(aiiVarArr);
    }

    private aii(String str, int i) {
    }

    public static aii[] values() {
        return (aii[]) c.clone();
    }
}
