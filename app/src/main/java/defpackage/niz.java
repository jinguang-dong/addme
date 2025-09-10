package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class niz {
    public static final niz a;
    public static final niz b;
    public static final niz c;
    public static final niz d;
    public static final niz e;
    public static final niz f;
    private static final /* synthetic */ niz[] g;

    static {
        niz nizVar = new niz("UNKNOWN", 0);
        a = nizVar;
        niz nizVar2 = new niz("HORIZONTAL_DRAG", 1);
        b = nizVar2;
        niz nizVar3 = new niz("DRAG_END", 2);
        c = nizVar3;
        niz nizVar4 = new niz("TAP_GESTURE", 3);
        d = nizVar4;
        niz nizVar5 = new niz("ICON_CLICK", 4);
        e = nizVar5;
        niz nizVar6 = new niz("GESTURE", 5);
        f = nizVar6;
        niz[] nizVarArr = {nizVar, nizVar2, nizVar3, nizVar4, nizVar5, nizVar6};
        g = nizVarArr;
        ske.aB(nizVarArr);
    }

    private niz(String str, int i) {
    }

    public static niz[] values() {
        return (niz[]) g.clone();
    }
}
