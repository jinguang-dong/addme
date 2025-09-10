package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class ato {
    public static final ato a;
    public static final ato b;
    public static final ato c;
    public static final ato d;
    public static final ato e;
    private static final /* synthetic */ ato[] f;

    static {
        ato atoVar = new ato("TopBar", 0);
        a = atoVar;
        ato atoVar2 = new ato("MainContent", 1);
        b = atoVar2;
        ato atoVar3 = new ato("Snackbar", 2);
        c = atoVar3;
        ato atoVar4 = new ato("Fab", 3);
        d = atoVar4;
        ato atoVar5 = new ato("BottomBar", 4);
        e = atoVar5;
        ato[] atoVarArr = {atoVar, atoVar2, atoVar3, atoVar4, atoVar5};
        f = atoVarArr;
        ske.aB(atoVarArr);
    }

    private ato(String str, int i) {
    }

    public static ato[] values() {
        return (ato[]) f.clone();
    }
}
