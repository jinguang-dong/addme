package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcy {
    public static final dcy a;
    public static final dcy b;
    public static final dcy c;
    private static final /* synthetic */ dcy[] d;

    static {
        dcy dcyVar = new dcy("DEFERRED", 0);
        a = dcyVar;
        dcy dcyVar2 = new dcy("IMMEDIATE", 1);
        b = dcyVar2;
        dcy dcyVar3 = new dcy("EXCLUSIVE", 2);
        c = dcyVar3;
        dcy[] dcyVarArr = {dcyVar, dcyVar2, dcyVar3};
        d = dcyVarArr;
        ske.aB(dcyVarArr);
    }

    private dcy(String str, int i) {
    }

    public static dcy[] values() {
        return (dcy[]) d.clone();
    }
}
