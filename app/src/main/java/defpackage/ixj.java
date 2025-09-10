package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ixj {
    public static final sgv a = sgv.g("ixj");
    public final pbn b;
    public final owf c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final ixm h;
    public final gnt i;
    public final luj j;

    public ixj(pbn pbnVar, owf owfVar, juv juvVar, ixm ixmVar, gnt gntVar, luj lujVar) {
        this.b = pbnVar;
        this.c = owfVar;
        this.d = juvVar.b;
        this.e = juvVar.c;
        this.f = juvVar.a;
        this.g = juvVar.f;
        this.h = ixmVar;
        this.i = gntVar;
        this.j = lujVar;
    }

    public final boolean a() {
        return !((ixq) ((owq) this.c.dL()).dL()).equals(ixq.INACTIVE);
    }
}
