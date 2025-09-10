package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfq implements paq {
    public phe a;
    public final pgq b;
    public final qqq c;

    public pfq(qqq qqqVar, pjo pjoVar, pgq pgqVar, pbc pbcVar) {
        this.b = pgqVar;
        List listQ = pjoVar.q();
        a.I(!listQ.isEmpty());
        int iIntValue = ((Integer) listQ.get(0)).intValue();
        if (listQ.contains(4)) {
            iIntValue = 4;
        } else if (listQ.contains(1)) {
            iIntValue = 1;
        }
        List listP = pjoVar.p();
        a.I(!listP.isEmpty());
        int iIntValue2 = true == listP.contains(1) ? 1 : ((Integer) listP.get(0)).intValue();
        List listR = pjoVar.r();
        a.I(!listR.isEmpty());
        int iIntValue3 = true != listR.contains(1) ? ((Integer) listP.get(0)).intValue() : 1;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        Integer numValueOf3 = Integer.valueOf(iIntValue3);
        MeteringRectangle[] meteringRectangleArr = phf.a;
        this.a = new phd(1, numValueOf, numValueOf2, numValueOf3, 0, meteringRectangleArr, meteringRectangleArr, meteringRectangleArr, false, false, false).c();
        pbcVar.a("fscrtl3A");
        this.c = qqqVar;
    }

    public final synchronized phd a() {
        return phd.b(this.a);
    }

    public final void b(pen penVar) {
        boolean zD = penVar.d();
        boolean zB = penVar.b();
        boolean zC = penVar.c();
        try {
            pgo pgoVarA = this.b.a();
            try {
                pgoVarA.d(penVar, true);
                pgoVarA.close();
                synchronized (this) {
                    phd phdVarA = phd.a(this.a);
                    phdVarA.f = Boolean.valueOf(zD || this.a.a.booleanValue());
                    phdVarA.g = Boolean.valueOf(zB || this.a.b.booleanValue());
                    phdVarA.h = Boolean.valueOf(zC || this.a.c.booleanValue());
                    c(phdVarA.c());
                }
            } finally {
            }
        } catch (Throwable th) {
            synchronized (this) {
                phd phdVarA2 = phd.a(this.a);
                phdVarA2.f = Boolean.valueOf(zD || this.a.a.booleanValue());
                phdVarA2.g = Boolean.valueOf(zB || this.a.b.booleanValue());
                phdVarA2.h = Boolean.valueOf(zC || this.a.c.booleanValue());
                c(phdVarA2.c());
                throw th;
            }
        }
    }

    public final synchronized void c(phe pheVar) {
        this.a = pheVar;
    }

    public final synchronized boolean d(phe pheVar, pdj pdjVar) {
        return qqq.e(pheVar, pdjVar);
    }

    public final synchronized boolean e(phe pheVar, pdj pdjVar) {
        if (!pheVar.a.booleanValue()) {
            return false;
        }
        if (pheVar.b().equals(pdjVar.b())) {
            if (Arrays.equals(pheVar.d, ((phe) pdjVar).d)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean f(phe pheVar, pdj pdjVar) {
        return qqq.f(pheVar, pdjVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
