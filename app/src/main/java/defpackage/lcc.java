package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcc {
    public pjr a;
    public pko b;
    public Long f;
    public int c = -1;
    public boolean d = false;
    public boolean e = false;
    public boolean g = true;
    public boolean h = false;
    public long i = -1;
    public Optional j = Optional.empty();
    public rwc k = rvk.a;
    public peg l = peg.a;
    public final sbk m = new sbk();

    public final peq a() {
        pko pkoVar = this.b;
        rnt.w(pkoVar, "format", new Object[0]);
        pep pepVarA = peq.a();
        pjr pjrVar = this.a;
        rnt.w(pjrVar, "cameraId", new Object[0]);
        pepVarA.b(pjrVar);
        pepVarA.n(pkoVar.b);
        pepVarA.i(pkoVar.a);
        pepVarA.c(this.c);
        pepVarA.r(pet.IMAGE_READER);
        pepVarA.h(this.e);
        pepVarA.f(this.d);
        pepVarA.g(this.g);
        pepVarA.m(this.h ? 1 : 0);
        pepVarA.o(this.m.g());
        pepVarA.l(this.l);
        pepVarA.j(this.k);
        Long l = this.f;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (jLongValue != 0) {
            pepVarA.s(jLongValue);
        }
        long j = this.i;
        if (j != -1) {
            pepVarA.t(j);
        }
        this.j.ifPresent(new ktp(pepVarA, 4));
        return pepVarA.a();
    }
}
