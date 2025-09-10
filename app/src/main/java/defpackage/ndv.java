package defpackage;

import com.google.ar.core.ImageMetadata;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndv {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    public rwc a;
    public rwc b;
    public rwc c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private rwc m;
    private int n;
    private OptionalInt o;
    private String p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private ncn x;
    private ltw y;
    private int z;

    public ndv() {
        throw null;
    }

    public final void A(int i) {
        this.z = i;
        this.F |= 131072;
    }

    public final void B(int i) {
        this.A = i;
        this.F |= 262144;
    }

    public final void C(int i) {
        this.B = i;
        this.F |= ImageMetadata.LENS_APERTURE;
    }

    public final void D(int i) {
        this.h = i;
        this.F |= 16;
    }

    public final void E(int i) {
        this.g = i;
        this.F |= 8;
    }

    public final int a() {
        if ((this.F & 512) != 0) {
            return this.n;
        }
        throw new IllegalStateException();
    }

    public final ndw b() {
        if (this.F != 16777215 || this.p == null || this.x == null || this.y == null) {
            throw new IllegalStateException();
        }
        return new ndw(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.a, this.b, this.c, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final void c(boolean z) {
        this.r = z;
        this.F |= 2048;
    }

    public final void d(String str) {
        str.getClass();
        this.p = str;
    }

    public final void e(int i) {
        this.n = i;
        this.F |= 512;
    }

    public final void f(int i) {
        this.o = OptionalInt.of(i);
    }

    public final void g() {
        this.F |= 4194304;
    }

    public final void h(int i) {
        this.E = i;
        this.F |= 8388608;
    }

    public final void i(int i) {
        this.D = i;
        this.F |= 2097152;
    }

    public final void j(int i) {
        this.j = i;
        this.F |= 64;
    }

    public final void k(ltw ltwVar) {
        ltwVar.getClass();
        this.y = ltwVar;
    }

    public final void l(rwc rwcVar) {
        rwcVar.getClass();
        this.m = rwcVar;
    }

    public final void m(int i) {
        this.q = i;
        this.F |= 1024;
    }

    public final void n(int i) {
        this.u = i;
        this.F |= 16384;
    }

    public final void o(ncn ncnVar) {
        ncnVar.getClass();
        this.x = ncnVar;
    }

    public final void p(int i) {
        this.w = i;
        this.F |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    }

    public final void q(int i) {
        this.e = i;
        this.F |= 2;
    }

    public final void r(int i) {
        this.f = i;
        this.F |= 4;
    }

    public final void s(int i) {
        this.d = i;
        this.F |= 1;
    }

    public final void t(int i) {
        this.k = i;
        this.F |= 128;
    }

    public final void u(int i) {
        this.l = i;
        this.F |= 256;
    }

    public final void v(int i) {
        this.s = i;
        this.F |= 4096;
    }

    public final void w(int i) {
        this.t = i;
        this.F |= 8192;
    }

    public final void x(int i) {
        this.v = i;
        this.F |= 32768;
    }

    public final void y(int i) {
        this.i = i;
        this.F |= 32;
    }

    public final void z(int i) {
        this.C = i;
        this.F |= ImageMetadata.SHADING_MODE;
    }

    public ndv(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.m = rvkVar;
        this.a = rvkVar;
        this.b = rvkVar;
        this.c = rvkVar;
        this.o = OptionalInt.empty();
    }

    public ndv(ndw ndwVar) {
        rvk rvkVar = rvk.a;
        this.m = rvkVar;
        this.a = rvkVar;
        this.b = rvkVar;
        this.c = rvkVar;
        this.o = OptionalInt.empty();
        this.d = ndwVar.e;
        this.e = ndwVar.f;
        this.f = ndwVar.g;
        this.g = ndwVar.h;
        this.h = ndwVar.i;
        this.i = ndwVar.j;
        this.j = ndwVar.k;
        this.k = ndwVar.l;
        this.l = ndwVar.m;
        this.m = ndwVar.n;
        this.a = ndwVar.o;
        this.b = ndwVar.p;
        this.c = ndwVar.q;
        this.n = ndwVar.r;
        this.o = ndwVar.s;
        this.p = ndwVar.t;
        this.q = ndwVar.u;
        this.r = ndwVar.v;
        this.s = ndwVar.w;
        this.t = ndwVar.x;
        this.u = ndwVar.y;
        this.v = ndwVar.z;
        this.w = ndwVar.A;
        this.x = ndwVar.B;
        this.y = ndwVar.C;
        this.z = ndwVar.D;
        this.A = ndwVar.E;
        this.B = ndwVar.F;
        this.C = ndwVar.G;
        this.D = ndwVar.H;
        this.E = ndwVar.I;
        this.F = 16777215;
    }
}
