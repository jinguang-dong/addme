package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqr {
    public static final sbv a;

    static {
        sbr sbrVar = new sbr();
        iqp iqpVar = iqp.IDLE;
        sxx sxxVar = new sxx(null, null);
        sxxVar.b(iqq.IDLE);
        sxxVar.c = Optional.empty();
        sxxVar.a = Optional.empty();
        sbrVar.f(iqpVar, sxxVar.a());
        iqp iqpVar2 = iqp.HINT;
        sxx sxxVar2 = new sxx(null, null);
        sxxVar2.b(iqq.HINT);
        sxxVar2.c = Optional.of(iqq.HINT_ENTER);
        sxxVar2.a = Optional.of(iqq.HINT_EXIT);
        sbrVar.f(iqpVar2, sxxVar2.a());
        iqp iqpVar3 = iqp.SURPRISE;
        sxx sxxVar3 = new sxx(null, null);
        sxxVar3.b(iqq.SURPRISE_LOOP);
        sxxVar3.c = Optional.of(iqq.SURPRISE_ENTER);
        sxxVar3.a = Optional.of(iqq.SURPRISE_EXIT);
        sbrVar.f(iqpVar3, sxxVar3.a());
        a = sbrVar.b();
    }
}
