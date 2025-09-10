package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzk {
    public static final gzk a;
    public static final gzk b;
    public static final /* synthetic */ uhu c;
    private static final /* synthetic */ gzk[] d;

    static {
        gzk gzkVar = new gzk("PROD", 0);
        a = gzkVar;
        gzk gzkVar2 = new gzk("AUTOPUSH", 1);
        b = gzkVar2;
        gzk[] gzkVarArr = {gzkVar, gzkVar2};
        d = gzkVarArr;
        c = ske.aB(gzkVarArr);
    }

    private gzk(String str, int i) {
    }

    public static gzk[] values() {
        return (gzk[]) d.clone();
    }
}
