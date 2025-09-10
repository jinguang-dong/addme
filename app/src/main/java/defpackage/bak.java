package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bak {
    public static final bak a;
    public static final bak b;
    public static final bak c;
    public static final bak d;
    public static final bak e;
    public static final bak f;
    private static final /* synthetic */ bak[] g;

    static {
        bak bakVar = new bak("ShutDown", 0);
        a = bakVar;
        bak bakVar2 = new bak("ShuttingDown", 1);
        b = bakVar2;
        bak bakVar3 = new bak("Inactive", 2);
        c = bakVar3;
        bak bakVar4 = new bak("InactivePendingWork", 3);
        d = bakVar4;
        bak bakVar5 = new bak("Idle", 4);
        e = bakVar5;
        bak bakVar6 = new bak("PendingWork", 5);
        f = bakVar6;
        bak[] bakVarArr = {bakVar, bakVar2, bakVar3, bakVar4, bakVar5, bakVar6};
        g = bakVarArr;
        ske.aB(bakVarArr);
    }

    private bak(String str, int i) {
    }

    public static bak[] values() {
        return (bak[]) g.clone();
    }
}
