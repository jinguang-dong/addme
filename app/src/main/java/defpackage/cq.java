package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cq {
    int e;
    int f;
    int g;
    int h;
    int i;
    public boolean j;
    public String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    ArrayList t;
    final ArrayList d = new ArrayList();
    public boolean k = true;
    boolean s = false;

    public abstract void c();

    public void d(int i, bm bmVar, String str, int i2) {
        throw null;
    }

    public abstract void h();

    public abstract void i();

    public void k(bm bmVar) {
        throw null;
    }

    final void l(cp cpVar) {
        this.d.add(cpVar);
        cpVar.d = this.e;
        cpVar.e = this.f;
        cpVar.f = this.g;
        cpVar.g = this.h;
    }

    public final void m(int i, bm bmVar) {
        d(i, bmVar, null, 1);
    }

    public final void n(bm bmVar, String str) {
        d(0, bmVar, str, 1);
    }

    public final void o() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void p() {
        this.s = true;
    }

    public final void q(int i, bm bmVar) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        d(i, bmVar, null, 2);
    }
}
