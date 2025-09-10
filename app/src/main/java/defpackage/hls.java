package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hls {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;

    public hls(btu btuVar) {
        this.e = btuVar;
        this.d = new bro(this, 5);
        this.b = new bro(this, 3);
        this.a = new bro(this, 4);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [hlf, java.lang.Object] */
    public final hlw a() {
        hlq hlqVar = new hlq(this, 0);
        hll hllVar = new hll(this, 0);
        hlr hlrVar = new hlr(this);
        return new hlw((hms) this.e, this.c, hllVar, hlqVar, hlrVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(hlc hlcVar) {
        this.b.add(hlcVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void c(hld hldVar) {
        this.a.add(hldVar);
    }

    public final void d(hlv hlvVar) {
        b(new hll(hlvVar, 1));
    }

    public final bsn e() {
        Object obj = this.c;
        if (obj != null) {
            return (bsn) obj;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final btr f(Object obj, uiu uiuVar) {
        return e().a(obj, uiuVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owf] */
    public final synchronized paq g() {
        shl shlVar = shx.a;
        this.c = owb.a(this.b).dK(new fbo(this, 13), sxo.a);
        return new ffy(this, 2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, paq] */
    public final synchronized void h() {
        shl shlVar = shx.a;
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.close();
        }
        i(false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fhe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fhe, java.lang.Object] */
    public final void i(boolean z) {
        shl shlVar = shx.a;
        ((fhj) this.e).c();
        ((fgk) this.a).c();
        if (z) {
            this.d.f();
        } else {
            this.d.d();
        }
    }

    public hls() {
        this(bsv.a);
    }

    public hls(fhe fheVar, fgk fgkVar, fft fftVar, fhj fhjVar, kzo kzoVar, sbv sbvVar) {
        this.d = fheVar;
        this.a = fgkVar;
        this.b = fftVar;
        this.e = fhjVar;
        fftVar.e(owl.h(kzoVar, new fdz(sbvVar, 2)));
    }

    public hls(hms hmsVar) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new hli(2);
        this.d = new ArrayList();
        this.e = hmsVar;
    }
}
