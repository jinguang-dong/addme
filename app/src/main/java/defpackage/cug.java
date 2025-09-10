package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cug {
    public static final cug a;
    public static final cug b;
    public static final cug c;
    public static final cug d;
    public static final cug e;
    public static final cug f;
    public static final cug g;
    public static final cug h;
    public static final cug i;
    private static final /* synthetic */ cug[] j;

    static {
        cug cugVar = new cug("PENALTY_LOG", 0);
        a = cugVar;
        cug cugVar2 = new cug("PENALTY_DEATH", 1);
        b = cugVar2;
        cug cugVar3 = new cug("DETECT_FRAGMENT_REUSE", 2);
        c = cugVar3;
        cug cugVar4 = new cug("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = cugVar4;
        cug cugVar5 = new cug("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = cugVar5;
        cug cugVar6 = new cug("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = cugVar6;
        cug cugVar7 = new cug("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = cugVar7;
        cug cugVar8 = new cug("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = cugVar8;
        cug cugVar9 = new cug("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = cugVar9;
        cug[] cugVarArr = {cugVar, cugVar2, cugVar3, cugVar4, cugVar5, cugVar6, cugVar7, cugVar8, cugVar9};
        j = cugVarArr;
        ske.aB(cugVarArr);
    }

    private cug(String str, int i2) {
    }

    public static cug[] values() {
        return (cug[]) j.clone();
    }
}
