package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxj {
    public static final gxj a;
    public static final gxj b;
    private static final /* synthetic */ gxj[] c;

    static {
        gxj gxjVar = new gxj("TOGGLES", 0);
        a = gxjVar;
        gxj gxjVar2 = new gxj("SLIDER", 1);
        b = gxjVar2;
        gxj[] gxjVarArr = {gxjVar, gxjVar2};
        c = gxjVarArr;
        ske.aB(gxjVarArr);
    }

    private gxj(String str, int i) {
    }

    public static gxj[] values() {
        return (gxj[]) c.clone();
    }
}
