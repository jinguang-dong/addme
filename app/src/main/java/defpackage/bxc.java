package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxc {
    public static final bxc a;
    public static final bxc b;
    public static final bxc c;
    private static final /* synthetic */ bxc[] d;

    static {
        bxc bxcVar = new bxc("ContinueTraversal", 0);
        a = bxcVar;
        bxc bxcVar2 = new bxc("SkipSubtreeAndContinueTraversal", 1);
        b = bxcVar2;
        bxc bxcVar3 = new bxc("CancelTraversal", 2);
        c = bxcVar3;
        bxc[] bxcVarArr = {bxcVar, bxcVar2, bxcVar3};
        d = bxcVarArr;
        ske.aB(bxcVarArr);
    }

    private bxc(String str, int i) {
    }

    public static bxc[] values() {
        return (bxc[]) d.clone();
    }
}
