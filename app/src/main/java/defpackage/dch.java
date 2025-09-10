package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dch {
    public static final dch a;
    public static final dch b;
    public static final dch c;
    private static final /* synthetic */ dch[] d;

    static {
        dch dchVar = new dch("NO_OP", 0);
        a = dchVar;
        dch dchVar2 = new dch("ADD", 1);
        b = dchVar2;
        dch dchVar3 = new dch("REMOVE", 2);
        c = dchVar3;
        dch[] dchVarArr = {dchVar, dchVar2, dchVar3};
        d = dchVarArr;
        ske.aB(dchVarArr);
    }

    private dch(String str, int i) {
    }

    public static dch[] values() {
        return (dch[]) d.clone();
    }
}
