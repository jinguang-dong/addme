package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrn {
    public static final nrn a;
    public static final nrn b;
    private static final /* synthetic */ nrn[] c;

    static {
        nrn nrnVar = new nrn("TITLE", 0);
        a = nrnVar;
        nrn nrnVar2 = new nrn("ITEM", 1);
        b = nrnVar2;
        nrn[] nrnVarArr = {nrnVar, nrnVar2};
        c = nrnVarArr;
        ske.aB(nrnVarArr);
    }

    private nrn(String str, int i) {
    }

    public static nrn[] values() {
        return (nrn[]) c.clone();
    }
}
