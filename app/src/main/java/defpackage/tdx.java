package defpackage;

import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tdx implements paq {
    public static final sgv a = sgv.g("tdx");
    public final tei b;
    public tcd d;
    private tej i;
    private tej j;
    private tdw k;
    private final rtl l;
    public int g = 2;
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public final tpc h = szz.a.m();
    public final String c = UUID.randomUUID().toString();

    public tdx(tei teiVar, rtl rtlVar) {
        this.b = teiVar;
        this.l = rtlVar;
    }

    public final tdw a() {
        tdw tdwVar = this.k;
        if (tdwVar != null) {
            return tdwVar;
        }
        ((sgt) a.c().M(5829)).s("MergeData is null");
        szr szrVar = szr.a;
        return new tdw(szrVar, szrVar);
    }

    public final synchronized Optional b() {
        return Optional.ofNullable(this.i);
    }

    public final synchronized Optional c() {
        return this.e;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        b().ifPresent(new tch(6));
        d().ifPresent(new tch(6));
        this.e.ifPresent(new tch(7));
    }

    public final synchronized Optional d() {
        return Optional.ofNullable(this.j);
    }

    public final synchronized void e() {
        int i = 15;
        Optional map = b().map(new qoi(i));
        szr szrVar = szr.a;
        this.k = new tdw((szr) map.orElse(szrVar), (szr) d().map(new qoi(i)).orElse(szrVar));
        f();
        b().ifPresent(new tch(6));
        d().ifPresent(new tch(6));
        this.i = null;
        this.j = null;
        this.e.ifPresent(new tch(7));
        this.e = Optional.empty();
    }

    public final void f() {
        this.b.f();
    }

    public final void g(tcd tcdVar) {
        tcd tcdVar2 = this.d;
        if (tcdVar2 == null) {
            this.d = tcdVar;
        } else if (tcdVar != tcdVar2) {
            throw new tew(String.format("Image rotation %s doesn't match the current rotation %s", tcdVar, tcdVar2));
        }
    }

    public final synchronized void h(sbp sbpVar, Optional optional, tfv tfvVar) {
        optional.ifPresent(new mdw(this, 17));
        tej tejVar = this.i;
        tejVar.c = sbpVar;
        tejVar.b = tfvVar;
    }

    public final synchronized void i() {
        this.b.f();
    }

    public final synchronized void j() {
        this.b.f();
    }

    public final synchronized void k(tdv tdvVar, Optional optional) {
        this.e = optional;
        this.i = this.l.k(tdvVar, this.d);
        this.b.f();
    }

    public final synchronized void l(tdv tdvVar) {
        this.j = this.l.k(tdvVar, this.d);
        this.b.f();
    }
}
