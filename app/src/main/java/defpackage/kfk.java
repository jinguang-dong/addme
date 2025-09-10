package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfk {
    public byte[] a;
    public our b;
    public owq c;
    public rwc d;
    public int e;
    private kfm f;
    private int g;
    private pka h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private rwc n;
    private nul o;
    private byte p;

    public kfk() {
        throw null;
    }

    public final kfl a() {
        kfm kfmVar;
        pka pkaVar;
        byte[] bArr;
        our ourVar;
        owq owqVar;
        int i;
        nul nulVar;
        if (this.p != 63 || (kfmVar = this.f) == null || (pkaVar = this.h) == null || (bArr = this.a) == null || (ourVar = this.b) == null || (owqVar = this.c) == null || (i = this.e) == 0 || (nulVar = this.o) == null) {
            throw new IllegalStateException();
        }
        return new kfl(kfmVar, this.g, pkaVar, bArr, ourVar, owqVar, this.i, this.j, this.d, this.k, this.l, this.m, this.n, i, nulVar);
    }

    public final void b(kfm kfmVar) {
        kfmVar.getClass();
        this.f = kfmVar;
    }

    public final void c(pka pkaVar) {
        pkaVar.getClass();
        this.h = pkaVar;
    }

    public final void d(boolean z) {
        this.i = z;
        this.p = (byte) (this.p | 2);
    }

    public final void e(int i) {
        this.g = i;
        this.p = (byte) (this.p | 1);
    }

    public final void f(boolean z) {
        this.l = z;
        this.p = (byte) (this.p | 16);
    }

    public final void g(boolean z) {
        this.j = z;
        this.p = (byte) (this.p | 4);
    }

    public final void h(boolean z) {
        this.m = z;
        this.p = (byte) (this.p | 32);
    }

    public final void i(pas pasVar) {
        this.n = rwc.j(pasVar);
    }

    public final void j(boolean z) {
        this.k = z;
        this.p = (byte) (this.p | 8);
    }

    public final void k(nul nulVar) {
        nulVar.getClass();
        this.o = nulVar;
    }

    public kfk(kfl kflVar) {
        rvk rvkVar = rvk.a;
        this.d = rvkVar;
        this.n = rvkVar;
        this.f = kflVar.a;
        this.g = kflVar.b;
        this.h = kflVar.c;
        this.a = kflVar.d;
        this.b = kflVar.e;
        this.c = kflVar.f;
        this.i = kflVar.g;
        this.j = kflVar.h;
        this.d = kflVar.i;
        this.k = kflVar.j;
        this.l = kflVar.k;
        this.m = kflVar.l;
        this.n = kflVar.m;
        this.e = kflVar.o;
        this.o = kflVar.n;
        this.p = (byte) 63;
    }

    public kfk(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.d = rvkVar;
        this.n = rvkVar;
    }
}
