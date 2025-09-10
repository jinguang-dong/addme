package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bok {
    public static final List a = ufw.a;

    static {
        long j = bkv.a;
    }

    public static final boolean a(bkw bkwVar) {
        if (!(bkwVar instanceof bkq)) {
            return bkwVar == null;
        }
        int i = ((bkq) bkwVar).a;
        return a.p(i, 5) || a.p(i, 3);
    }
}
