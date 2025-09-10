package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hxu {
    final /* synthetic */ ltr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ kox k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    final /* synthetic */ boolean p;
    final /* synthetic */ boolean q;
    final /* synthetic */ hxv r;

    public hxu(hxv hxvVar, ltr ltrVar, boolean z, float f, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, kox koxVar, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = ltrVar;
        this.b = z;
        this.c = f;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = koxVar;
        this.l = z9;
        this.m = z10;
        this.n = z11;
        this.o = z12;
        this.p = z13;
        this.q = z14;
        this.r = hxvVar;
    }

    public final ltr a() {
        return this.b ? this.a : ltr.OFF;
    }

    public final boolean b() {
        return this.r.a;
    }

    public final boolean c() {
        if (!this.r.a || this.q) {
            return false;
        }
        int i = this.k.e;
        if (i != 0) {
            return i == 1;
        }
        throw null;
    }
}
