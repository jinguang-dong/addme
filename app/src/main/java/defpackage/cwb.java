package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwb {
    public static final cwb a;
    public static final cwb b;
    public static final cwb c;
    public static final cwb d;
    public static final cwb e;
    private static final /* synthetic */ cwb[] f;

    static {
        cwb cwbVar = new cwb("DESTROYED", 0);
        a = cwbVar;
        cwb cwbVar2 = new cwb("INITIALIZED", 1);
        b = cwbVar2;
        cwb cwbVar3 = new cwb("CREATED", 2);
        c = cwbVar3;
        cwb cwbVar4 = new cwb("STARTED", 3);
        d = cwbVar4;
        cwb cwbVar5 = new cwb("RESUMED", 4);
        e = cwbVar5;
        cwb[] cwbVarArr = {cwbVar, cwbVar2, cwbVar3, cwbVar4, cwbVar5};
        f = cwbVarArr;
        ske.aB(cwbVarArr);
    }

    private cwb(String str, int i) {
    }

    public static cwb[] values() {
        return (cwb[]) f.clone();
    }

    public final boolean a(cwb cwbVar) {
        cwbVar.getClass();
        return compareTo(cwbVar) >= 0;
    }
}
