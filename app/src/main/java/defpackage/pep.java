package defpackage;

import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pep {
    public rwc a;
    public short b;
    public int c;
    private pet d;
    private rwc e;
    private rwc f;
    private pas g;
    private int h;
    private int i;
    private rwc j;
    private int k;
    private rwc l;
    private boolean m;
    private int n;
    private boolean o;
    private long p;
    private sbp q;
    private boolean r;
    private peg s;
    private long t;
    private int u;
    private int v;

    public pep() {
        throw null;
    }

    public final peq a() {
        pet petVar;
        pas pasVar;
        sbp sbpVar;
        peg pegVar;
        int i;
        if (this.b != 4095 || (petVar = this.d) == null || (pasVar = this.g) == null || (sbpVar = this.q) == null || (pegVar = this.s) == null || (i = this.c) == 0) {
            throw new IllegalStateException();
        }
        peq peqVar = new peq(petVar, this.e, this.f, pasVar, this.h, this.i, this.j, this.a, this.k, this.l, this.m, this.n, this.o, this.p, sbpVar, this.r, pegVar, this.t, i, this.u, this.v);
        int i2 = peqVar.f;
        rnt.M(i2 > 0 || i2 == -1, "Capacity should be positive or -1");
        pas pasVar2 = peqVar.d;
        rnt.M(pasVar2.b() > 0, "Size area must be positive");
        rnt.M(peqVar.e >= 0, "Format must be valid");
        rnt.M(peqVar.a != null, "StreamType cannot be null");
        rnt.M(pasVar2 != null, "Size cannot be null");
        return peqVar;
    }

    public final void b(pjr pjrVar) {
        this.e = rwc.j(pjrVar);
    }

    public final void c(int i) {
        this.i = i;
        this.b = (short) (this.b | 2);
    }

    public final void d(int i) {
        this.u = i;
        this.b = (short) (this.b | 512);
    }

    public final void e(long j) {
        this.p = j;
        this.b = (short) (this.b | 64);
    }

    public final void f(boolean z) {
        this.m = z;
        this.b = (short) (this.b | 8);
    }

    public final void g(boolean z) {
        this.r = z;
        this.b = (short) (this.b | 128);
    }

    public final void h(boolean z) {
        this.o = z;
        this.b = (short) (this.b | 32);
    }

    public final void i(int i) {
        this.h = i;
        this.b = (short) (this.b | 1);
    }

    public final void j(rwc rwcVar) {
        rwcVar.getClass();
        this.l = rwcVar;
    }

    public final void k(int i) {
        this.k = i;
        this.b = (short) (this.b | 4);
    }

    public final void l(peg pegVar) {
        pegVar.getClass();
        this.s = pegVar;
    }

    public final void m(int i) {
        this.n = i;
        this.b = (short) (this.b | 16);
    }

    public final void n(pas pasVar) {
        pasVar.getClass();
        this.g = pasVar;
    }

    public final void o(List list) {
        this.q = sbp.j(list);
    }

    public final void p(Surface surface) {
        this.f = rwc.j(surface);
    }

    public final void q(int i) {
        this.v = i;
        this.b = (short) (this.b | 1024);
    }

    public final void r(pet petVar) {
        petVar.getClass();
        this.d = petVar;
    }

    public final void s(long j) {
        this.j = rwc.j(Long.valueOf(j));
    }

    public final void t(long j) {
        this.t = j;
        this.b = (short) (this.b | 256);
    }

    public pep(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.e = rvkVar;
        this.f = rvkVar;
        this.j = rvkVar;
        this.a = rvkVar;
        this.l = rvkVar;
    }
}
