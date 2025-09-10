package defpackage;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksh {
    public owq a;
    public Predicate b;
    public Predicate c;
    public BiPredicate d;
    public Consumer e;
    public BiConsumer f;
    public rbb g;
    public ksd h;
    private final sbk i;
    private final sbk j;
    private final sbk k;
    private final sbk l;
    private krs m;
    private sbp n;
    private int o;
    private int p;
    private sbp q;
    private sbp r;
    private sbp s;
    private ksb t;
    private rwc u;
    private byte v;

    public ksh(byte[] bArr) {
        this.i = new sbk();
        this.j = new sbk();
        this.k = new sbk();
        this.l = new sbk();
        this.u = rvk.a;
    }

    public final ksi a() {
        krs krsVar;
        sbp sbpVar;
        owq owqVar;
        sbp sbpVar2;
        sbp sbpVar3;
        sbp sbpVar4;
        Predicate predicate;
        Predicate predicate2;
        BiPredicate biPredicate;
        Consumer consumer;
        ksb ksbVar;
        BiConsumer biConsumer;
        sbp sbpVar5 = this.n;
        if (!(sbpVar5 == null ? rvk.a : rwc.j(sbpVar5)).h()) {
            l(this.i.g());
            f(this.j.g());
            i(this.k.g());
            d(this.l.g());
        }
        if (this.v != 3 || (krsVar = this.m) == null || (sbpVar = this.n) == null || (owqVar = this.a) == null || (sbpVar2 = this.q) == null || (sbpVar3 = this.r) == null || (sbpVar4 = this.s) == null || (predicate = this.b) == null || (predicate2 = this.c) == null || (biPredicate = this.d) == null || (consumer = this.e) == null || (ksbVar = this.t) == null || (biConsumer = this.f) == null) {
            throw new IllegalStateException();
        }
        return new ksi(krsVar, sbpVar, this.o, this.p, owqVar, sbpVar2, sbpVar3, sbpVar4, predicate, predicate2, biPredicate, consumer, ksbVar, biConsumer, this.u, this.g, this.h);
    }

    public final void b(ksa ksaVar, int i, int i2, int i3) {
        this.i.h(ksaVar);
        this.j.h(Integer.valueOf(i));
        this.k.h(Integer.valueOf(i2));
        this.l.h(Integer.valueOf(i3));
    }

    public final void c(int i) {
        this.p = i;
        this.v = (byte) (this.v | 2);
    }

    public final void d(sbp sbpVar) {
        sbpVar.getClass();
        this.r = sbpVar;
    }

    public final void e(Integer... numArr) {
        d(sbp.k(numArr));
    }

    public final void f(sbp sbpVar) {
        sbpVar.getClass();
        this.s = sbpVar;
    }

    public final void g(Integer... numArr) {
        f(sbp.k(numArr));
    }

    public final void h(int i) {
        this.o = i;
        this.v = (byte) (this.v | 1);
    }

    public final void i(sbp sbpVar) {
        sbpVar.getClass();
        this.q = sbpVar;
    }

    public final void j(Integer... numArr) {
        i(sbp.k(numArr));
    }

    public final void k(ksb ksbVar) {
        ksbVar.getClass();
        this.t = ksbVar;
    }

    public final void l(sbp sbpVar) {
        sbpVar.getClass();
        this.n = sbpVar;
    }

    public final void m(ksa... ksaVarArr) {
        l(sbp.k(ksaVarArr));
    }

    public final void n(krs krsVar) {
        krsVar.getClass();
        this.m = krsVar;
    }

    public final void o(kry kryVar) {
        this.u = rwc.j(kryVar);
    }

    public final void p(nkw nkwVar) {
        this.b = new glx(nkwVar, 12);
    }

    public ksh() {
        this.i = new sbk();
        this.j = new sbk();
        this.k = new sbk();
        this.l = new sbk();
    }
}
