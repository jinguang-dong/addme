package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ckh implements cjx {
    public int c;
    public cjn d;
    protected int j;
    cpq l;
    public final cka e = new cka(this);
    public int f = 0;
    public boolean g = false;
    public final cjz h = new cjz(this);
    public final cjz i = new cjz(this);
    protected int k = 1;

    public ckh(cjn cjnVar) {
        this.d = cjnVar;
    }

    protected static final void j(cjz cjzVar, cjz cjzVar2, int i) {
        cjzVar.k.add(cjzVar2);
        cjzVar.e = i;
        cjzVar2.j.add(cjzVar);
    }

    protected static final cjz k(cjm cjmVar) {
        cjm cjmVar2 = cjmVar.e;
        if (cjmVar2 == null) {
            return null;
        }
        int i = cjmVar2.i;
        cjn cjnVar = cjmVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return cjnVar.h.h;
        }
        if (i2 == 2) {
            return cjnVar.i.h;
        }
        if (i2 == 3) {
            return cjnVar.h.i;
        }
        if (i2 == 4) {
            return cjnVar.i.i;
        }
        if (i2 != 5) {
            return null;
        }
        return cjnVar.i.a;
    }

    protected static final cjz l(cjm cjmVar, int i) {
        cjm cjmVar2 = cjmVar.e;
        if (cjmVar2 == null) {
            return null;
        }
        cjn cjnVar = cjmVar2.d;
        ckh ckhVar = i == 0 ? cjnVar.h : cjnVar.i;
        int i2 = cjmVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return ckhVar.h;
        }
        if (i2 == 3 || i2 == 4) {
            return ckhVar.i;
        }
        return null;
    }

    public long a() {
        if (this.e.i) {
            return r2.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.cjx
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        if (i2 == 0) {
            cjn cjnVar = this.d;
            int i3 = cjnVar.w;
            int iMax = Math.max(cjnVar.v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            cjn cjnVar2 = this.d;
            int i4 = cjnVar2.z;
            int iMax2 = Math.max(cjnVar2.y, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected final void i(cjz cjzVar, cjz cjzVar2, int i, cka ckaVar) {
        List list = cjzVar.k;
        list.add(cjzVar2);
        list.add(this.e);
        cjzVar.g = i;
        cjzVar.h = ckaVar;
        cjzVar2.j.add(cjzVar);
        ckaVar.j.add(cjzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[PHI: r9
      0x00a4: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:44:0x008c, B:32:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m(defpackage.cjm r13, defpackage.cjm r14, int r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckh.m(cjm, cjm, int):void");
    }
}
