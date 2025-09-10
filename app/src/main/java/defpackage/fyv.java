package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyv {
    public static final fyv a;
    public static final fyv b;
    public static final fyv c;
    public static final fyv d;
    public static final fyv e;
    public static final fyv f;
    public static final fyv g;
    private static final /* synthetic */ fyv[] h;

    static {
        fyv fyvVar = new fyv("UNINITIALIZED", 0);
        a = fyvVar;
        fyv fyvVar2 = new fyv("INIT", 1);
        b = fyvVar2;
        fyv fyvVar3 = new fyv("READY", 2);
        c = fyvVar3;
        fyv fyvVar4 = new fyv("STARTING_RECORDING", 3);
        d = fyvVar4;
        fyv fyvVar5 = new fyv("RECORDING", 4);
        e = fyvVar5;
        fyv fyvVar6 = new fyv("STOPPING_RECORDING", 5);
        f = fyvVar6;
        fyv fyvVar7 = new fyv("CLOSED", 6);
        g = fyvVar7;
        fyv[] fyvVarArr = {fyvVar, fyvVar2, fyvVar3, fyvVar4, fyvVar5, fyvVar6, fyvVar7};
        h = fyvVarArr;
        ske.aB(fyvVarArr);
    }

    private fyv(String str, int i) {
    }

    public static fyv[] values() {
        return (fyv[]) h.clone();
    }
}
