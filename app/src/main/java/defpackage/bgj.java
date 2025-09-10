package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bgj {
    public bgq h;
    public long i;
    public boolean j;
    public int k;

    public bgj(long j, bgq bgqVar) {
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        this.h = bgqVar;
        this.i = j;
        uiq uiqVar = bgr.a;
        if (j != 0) {
            bgq bgqVarX = x();
            long[] jArr = bgqVarX.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = bgqVarX.c;
                if (j3 != 0) {
                    j2 = bgqVarX.d;
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = bgqVarX.b;
                    if (j4 != 0) {
                        j2 = bgqVarX.d + 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + iNumberOfTrailingZeros;
            }
            synchronized (bgr.b) {
                bgo bgoVar = bgr.e;
                int i2 = bgoVar.a + 1;
                long[] jArr2 = bgoVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length + length;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    rnt.ax(jArr2, jArr3, 0, 0, jArr2.length);
                    rnt.aB(bgoVar.c, iArr, 0, 0, 14);
                    bgoVar.b = jArr3;
                    bgoVar.c = iArr;
                }
                int i4 = bgoVar.a;
                bgoVar.a = i4 + 1;
                int length2 = bgoVar.d.length;
                if (bgoVar.e >= length2) {
                    int i5 = length2 + length2;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    rnt.aB(bgoVar.d, iArr2, 0, 0, 14);
                    bgoVar.d = iArr2;
                }
                i = bgoVar.e;
                int[] iArr3 = bgoVar.d;
                bgoVar.e = iArr3[i];
                bgoVar.b[i4] = j;
                bgoVar.c[i4] = i;
                iArr3[i] = i4;
                bgoVar.b(i4);
            }
        } else {
            i = -1;
        }
        this.k = i;
    }

    public static final void E(bgj bgjVar) {
        bgr.i.r(bgjVar);
    }

    public void A(bgq bgqVar) {
        this.h = bgqVar;
    }

    public void B(long j) {
        this.i = j;
    }

    public final void D() {
        this.j = true;
    }

    public abstract bgj b(uiq uiqVar);

    public void d() {
        this.j = true;
        synchronized (bgr.b) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract uiq i();

    public abstract uiq k();

    public void m() {
        bgr.c = bgr.c.b(v());
    }

    public abstract void n(bhl bhlVar);

    public void p() {
        z();
    }

    public void q(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean r();

    public long v() {
        return this.i;
    }

    public final bgj w() {
        pmg pmgVar = bgr.i;
        bgj bgjVar = (bgj) pmgVar.q();
        pmgVar.r(this);
        return bgjVar;
    }

    public bgq x() {
        return this.h;
    }

    public final void y() {
        synchronized (bgr.b) {
            m();
            p();
        }
    }

    public final void z() {
        int i = this.k;
        if (i >= 0) {
            bgr.v(i);
            this.k = -1;
        }
    }

    public final void C() {
        if (this.j) {
            bad.a(IQwwK.GFfe);
        }
    }
}
