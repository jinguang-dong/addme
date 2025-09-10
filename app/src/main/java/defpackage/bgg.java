package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgg extends bgf {
    private final bgf l;
    private boolean m;

    public bgg(long j, bgq bgqVar, uiq uiqVar, uiq uiqVar2, bgf bgfVar) {
        super(j, bgqVar, uiqVar, uiqVar2);
        this.l = bgfVar;
        bgfVar.f();
    }

    private final void F() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l.g();
    }

    @Override // defpackage.bgf
    public final bgn c() {
        bgg bggVar;
        bgf bgfVar = this.l;
        if (bgfVar.f || bgfVar.j) {
            return new bgl(this);
        }
        zw zwVar = this.g;
        long j = this.i;
        Map mapO = zwVar != null ? bgr.o(bgfVar.v(), this, bgfVar.x()) : null;
        Object obj = bgr.b;
        synchronized (obj) {
            bgr.w(this);
            if (zwVar == null || zwVar.d == 0) {
                bggVar = this;
                bggVar.y();
            } else {
                bggVar = this;
                bgn bgnVarT = bggVar.t(bgfVar.v(), zwVar, mapO, bgfVar.x());
                if (!a.ao(bgnVarT, bgm.a)) {
                    return bgnVarT;
                }
                zw zwVarS = bgfVar.s();
                if (zwVarS != null) {
                    zwVarS.f(zwVar);
                } else {
                    bgfVar.u(zwVar);
                    bggVar.g = null;
                }
            }
            if (ujp.b(bgfVar.v(), j) < 0) {
                bgfVar.l();
            }
            bgfVar.A(bgfVar.x().b(j).a(bggVar.d));
            bgfVar.o(j);
            int i = bggVar.k;
            bggVar.k = -1;
            if (i >= 0) {
                int[] iArr = bgfVar.e;
                iArr.getClass();
                int length = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                iArrCopyOf.getClass();
                bgfVar.e = iArrCopyOf;
            }
            bgq bgqVar = bggVar.d;
            synchronized (obj) {
                bgfVar.d = bgfVar.d.c(bgqVar);
                bgf bgfVar2 = bggVar.l;
                int[] iArr2 = bggVar.e;
                int length2 = iArr2.length;
                if (length2 != 0) {
                    int[] iArr3 = bgfVar2.e;
                    int length3 = iArr3.length;
                    if (length3 != 0) {
                        iArr3.getClass();
                        iArr2.getClass();
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length3 + length2);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length3, length2);
                        iArrCopyOf2.getClass();
                        iArr2 = iArrCopyOf2;
                    }
                    bgfVar2.e = iArr2;
                }
            }
            bggVar.f = true;
            bggVar.F();
            return bgm.a;
        }
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final void d() {
        if (this.j) {
            return;
        }
        super.d();
        F();
    }
}
