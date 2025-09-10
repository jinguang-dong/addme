package defpackage;

import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blm implements chq {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public long l;
    public blp m;
    public boolean n;
    public int o;
    public long p;
    public chq q;
    public cib r;
    public int s;
    public blh t;

    public blm() {
        long j = bla.a;
        this.h = j;
        this.i = j;
        this.k = 8.0f;
        this.l = blt.a;
        this.m = bll.a;
        this.o = 0;
        this.p = 9205357640488583168L;
        this.q = new chr(1.0f, 1.0f);
        this.r = cib.a;
        this.s = 3;
    }

    public final void A() {
        if (a.ao(null, null)) {
            return;
        }
        this.a |= 262144;
    }

    public final void B() {
        if (a.ao(null, null)) {
            return;
        }
        this.a |= 131072;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.q.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return this.q.b();
    }

    @Override // defpackage.chw
    public final /* synthetic */ float dg(long j) {
        return chp.J(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dh(float f) {
        return chp.L(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float di(int i) {
        return chp.M(this, i);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dj(long j) {
        return chp.N(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dk(float f) {
        return chp.O(this, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final /* synthetic */ int mo0do(float f) {
        return chp.P(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dp(long j) {
        return chp.Q(this, j);
    }

    @Override // defpackage.chw
    public final /* synthetic */ long dq(float f) {
        return chp.K(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dr(float f) {
        return chp.R(this, f);
    }

    public final void l(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void m(long j) {
        long j2 = this.h;
        long j3 = bkv.a;
        if (a.q(j2, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public final void n(int i) {
        if (a.p(this.s, i)) {
            return;
        }
        this.a |= ImageMetadata.LENS_APERTURE;
        this.s = i;
    }

    public final void o(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= 2048;
        this.k = f;
    }

    public final void p(boolean z) {
        if (this.n != z) {
            this.a |= 16384;
            this.n = z;
        }
    }

    public final void q(int i) {
        if (a.p(this.o, i)) {
            return;
        }
        this.a |= 32768;
        this.o = i;
    }

    public final void r(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 1024;
        this.j = f;
    }

    public final void s(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void t(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void u(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void v(blp blpVar) {
        if (a.ao(this.m, blpVar)) {
            return;
        }
        this.a |= 8192;
        this.m = blpVar;
    }

    public final void w(long j) {
        long j2 = this.i;
        long j3 = bkv.a;
        if (a.q(j2, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public final void x(long j) {
        long j2 = this.l;
        long j3 = blt.a;
        if (a.q(j2, j)) {
            return;
        }
        this.a |= 4096;
        this.l = j;
    }

    public final void y(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void z(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }
}
