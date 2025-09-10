package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsk {
    public static final nsk a;
    public static final nsk b;
    public static final nsk c;
    public static final nsk d;
    public static final nsk e;
    private static final /* synthetic */ nsk[] f;

    static {
        nsk nskVar = new nsk("CATEGORY", 0);
        a = nskVar;
        nsk nskVar2 = new nsk("MODES", 1);
        b = nskVar2;
        nsk nskVar3 = new nsk("FACING", 2);
        c = nskVar3;
        nsk nskVar4 = new nsk("TIMER", 3);
        d = nskVar4;
        nsk nskVar5 = new nsk("DEFAULT", 4);
        e = nskVar5;
        nsk[] nskVarArr = {nskVar, nskVar2, nskVar3, nskVar4, nskVar5};
        f = nskVarArr;
        ske.aB(nskVarArr);
    }

    private nsk(String str, int i) {
    }

    public static nsk[] values() {
        return (nsk[]) f.clone();
    }
}
