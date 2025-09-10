package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gur {
    public static final gur a;
    public static final gur b;
    public static final gur c;
    public static final gur d;
    public static final gur e;
    private static final /* synthetic */ gur[] f;

    static {
        gur gurVar = new gur("NONE", 0);
        a = gurVar;
        gur gurVar2 = new gur("ANALYZING_SCENE", 1);
        b = gurVar2;
        gur gurVar3 = new gur("CHOOSING_INTENT", 2);
        c = gurVar3;
        gur gurVar4 = new gur("FETCHING_GUIDANCE", 3);
        d = gurVar4;
        gur gurVar5 = new gur("SHOWING_GUIDANCE", 4);
        e = gurVar5;
        gur[] gurVarArr = {gurVar, gurVar2, gurVar3, gurVar4, gurVar5};
        f = gurVarArr;
        ske.aB(gurVarArr);
    }

    private gur(String str, int i) {
    }

    public static gur[] values() {
        return (gur[]) f.clone();
    }

    public final boolean a() {
        return this != a;
    }
}
