package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzm {
    public static final gzm a;
    public static final gzm b;
    public static final /* synthetic */ uhu c;
    private static final /* synthetic */ gzm[] d;

    static {
        gzm gzmVar = new gzm("FAST_PATH", 0);
        a = gzmVar;
        gzm gzmVar2 = new gzm("INSPIRATION_PATH", 1);
        b = gzmVar2;
        gzm[] gzmVarArr = {gzmVar, gzmVar2};
        d = gzmVarArr;
        c = ske.aB(gzmVarArr);
    }

    private gzm(String str, int i) {
    }

    public static gzm[] values() {
        return (gzm[]) d.clone();
    }
}
