package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bka {
    public static final bka a;
    public static final bka b;
    public static final bka c;
    public static final bka d;
    private static final /* synthetic */ bka[] e;

    static {
        bka bkaVar = new bka("Active", 0);
        a = bkaVar;
        bka bkaVar2 = new bka("ActiveParent", 1);
        b = bkaVar2;
        bka bkaVar3 = new bka("Captured", 2);
        c = bkaVar3;
        bka bkaVar4 = new bka("Inactive", 3);
        d = bkaVar4;
        bka[] bkaVarArr = {bkaVar, bkaVar2, bkaVar3, bkaVar4};
        e = bkaVarArr;
        ske.aB(bkaVarArr);
    }

    private bka(String str, int i) {
    }

    public static bka[] values() {
        return (bka[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new uet();
            }
        }
        return true;
    }
}
