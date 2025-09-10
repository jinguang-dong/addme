package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aav {
    public static final acy a = byi.bf(0.0f, 400.0f, null, 5);
    public static final acy b;

    static {
        Map map = aef.a;
        b = byi.bf(0.0f, 400.0f, new cia(4294967297L), 1);
    }

    public static final aaz a(azr azrVar) {
        return (aaz) azrVar.a();
    }

    public static final aba b(azr azrVar) {
        return (aba) azrVar.a();
    }

    public static final void c(azr azrVar, aaz aazVar) {
        azrVar.b(aazVar);
    }

    public static final void d(azr azrVar, aba abaVar) {
        azrVar.b(abaVar);
    }

    public static /* synthetic */ aaz e(acn acnVar, int i) {
        Map map = null;
        if ((i & 1) != 0) {
            acnVar = byi.bf(0.0f, 400.0f, null, 5);
        }
        return new aaz(new abo(new abb(acnVar), false, map, 62));
    }

    public static /* synthetic */ aba f(acn acnVar, int i) {
        Map map = null;
        if ((i & 1) != 0) {
            acnVar = byi.bf(0.0f, 400.0f, null, 5);
        }
        return new aba(new abo(new abb(acnVar), false, map, 62));
    }
}
