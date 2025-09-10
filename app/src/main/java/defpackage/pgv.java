package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgv implements paq {
    private final pgw b;
    private final boolean f;
    private final pbc g;
    private final pgj h;
    private final pmg i;
    private final qqq j;
    private syu c = new szh();
    private final syu d = new szh();
    private syu e = new szh();
    public final ExecutorService a = ojl.bZ("Sess3AEx");

    public pgv(qqq qqqVar, pjo pjoVar, pbc pbcVar, pdt pdtVar, pgw pgwVar, pmg pmgVar) {
        this.i = pmgVar;
        this.b = pgwVar;
        this.j = qqqVar;
        this.f = pjoVar.G();
        this.g = pbcVar.a("SessCtrl3A");
        this.h = new pgj(pdtVar.k, pdtVar.l);
    }

    private static final boolean i(Integer num) {
        return num.intValue() == 4 || num.intValue() == 3;
    }

    private static final boolean j(phe pheVar, pdj pdjVar) {
        return !pheVar.b().equals(pdjVar.b());
    }

    final synchronized phd a() {
        return this.i.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:46:0x00af, B:47:0x00b8, B:49:0x00cd, B:51:0x00d1, B:53:0x00db, B:55:0x013f, B:58:0x0153, B:60:0x0161, B:61:0x017d, B:75:0x01ec, B:81:0x01fa, B:87:0x0208, B:92:0x0218, B:68:0x01b8, B:70:0x01be, B:72:0x01cb, B:73:0x01d6, B:65:0x019b, B:44:0x00a2), top: B:113:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8 A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:46:0x00af, B:47:0x00b8, B:49:0x00cd, B:51:0x00d1, B:53:0x00db, B:55:0x013f, B:58:0x0153, B:60:0x0161, B:61:0x017d, B:75:0x01ec, B:81:0x01fa, B:87:0x0208, B:92:0x0218, B:68:0x01b8, B:70:0x01be, B:72:0x01cb, B:73:0x01d6, B:65:0x019b, B:44:0x00a2), top: B:113:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:46:0x00af, B:47:0x00b8, B:49:0x00cd, B:51:0x00d1, B:53:0x00db, B:55:0x013f, B:58:0x0153, B:60:0x0161, B:61:0x017d, B:75:0x01ec, B:81:0x01fa, B:87:0x0208, B:92:0x0218, B:68:0x01b8, B:70:0x01be, B:72:0x01cb, B:73:0x01d6, B:65:0x019b, B:44:0x00a2), top: B:113:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:46:0x00af, B:47:0x00b8, B:49:0x00cd, B:51:0x00d1, B:53:0x00db, B:55:0x013f, B:58:0x0153, B:60:0x0161, B:61:0x017d, B:75:0x01ec, B:81:0x01fa, B:87:0x0208, B:92:0x0218, B:68:0x01b8, B:70:0x01be, B:72:0x01cb, B:73:0x01d6, B:65:0x019b, B:44:0x00a2), top: B:113:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized defpackage.syu b(defpackage.pen r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgv.b(pen, boolean):syu");
    }

    final synchronized syu c(boolean z, boolean z2, boolean z3, boolean z4) {
        syu syuVar;
        pmg pmgVar = this.i;
        paq paqVarH = pmgVar.h();
        try {
            boolean z5 = true;
            this.e.cancel(true);
            if (!z || !this.f) {
                z5 = false;
            }
            phd phdVarB = phd.b(pmgVar.i().c());
            if (z2) {
                phdVarB.g = false;
            }
            if (z3) {
                phdVarB.h = false;
            }
            if (z5) {
                phdVarB.f = false;
            }
            phe pheVarC = phdVarB.c();
            pgw pgwVar = this.b;
            pfg pfgVarA = pfg.a(pgwVar.b());
            pmg.n(pfgVarA, pheVarC);
            pgt pgtVarB = this.h.b(pheVarC, z5, z2, z3);
            pfgVarA.g(new pdq(pgtVarB, pgtVarB));
            if (z5) {
                pfg pfgVarA2 = pfg.a(pfgVarA);
                pfgVarA2.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                pgwVar.i(pfgVarA2.b());
            }
            pgwVar.g(pfgVarA.b());
            pmgVar.l(pheVarC.a.booleanValue(), pheVarC.b.booleanValue(), pheVarC.c.booleanValue(), z4);
            syuVar = pgtVarB.a;
            this.e = syuVar;
            paqVarH.close();
        } finally {
        }
        return syuVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.cancel(true);
        this.d.cancel(true);
        this.e.cancel(true);
    }

    final synchronized syu d(pdj pdjVar, boolean z) {
        syu syuVar;
        pmg pmgVar = this.i;
        paq paqVarH = pmgVar.h();
        try {
            this.c.cancel(true);
            pdj pdjVarD = this.j.d(pdjVar, pmgVar.j());
            phe pheVarC = pmgVar.i().c();
            boolean zE = qqq.e(pheVarC, pdjVarD);
            boolean zF = qqq.f(pheVarC, pdjVarD);
            boolean zJ = j(pheVarC, pdjVarD);
            phd phdVarA = phd.a(pdjVarD);
            boolean z2 = false;
            if (pheVarC.a.booleanValue() && !zJ) {
                z2 = true;
            }
            phdVarA.f = Boolean.valueOf(z2);
            phdVarA.g = Boolean.valueOf(zE);
            phdVarA.h = Boolean.valueOf(zF);
            phe pheVarC2 = phdVarA.c();
            pgw pgwVar = this.b;
            pfg pfgVarA = pfg.a(pgwVar.b());
            pmg.n(pfgVarA, pheVarC2);
            pgt pgtVarB = this.h.b(pheVarC2, zJ, !zE, true ^ zF);
            pfgVarA.g(new pdq(pgtVarB, pgtVarB));
            pgwVar.g(pfgVarA.b());
            if (zJ) {
                pfgVarA.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                pmg.n(pfgVarA, pheVarC2);
                pgwVar.i(pfgVarA.b());
            }
            pmgVar.k(pheVarC2, z);
            syuVar = pgtVarB.a;
            this.c = syuVar;
            paqVarH.close();
        } finally {
        }
        return syuVar;
    }

    final synchronized syu e(pdj pdjVar) {
        syu syuVar;
        pmg pmgVar = this.i;
        paq paqVarH = pmgVar.h();
        try {
            boolean z = this.f;
            pdj pdjVarD = this.j.d(pdjVar, pmgVar.j());
            phe pheVarC = pmgVar.i().c();
            boolean z2 = z || (pheVarC.a.booleanValue() && !j(pheVarC, pdjVarD));
            boolean zE = qqq.e(pheVarC, pdjVarD);
            boolean zF = qqq.f(pheVarC, pdjVarD);
            phd phdVarA = phd.a(pdjVarD);
            phdVarA.f = Boolean.valueOf(z2);
            phdVarA.g = Boolean.valueOf(zE);
            phdVarA.h = Boolean.valueOf(zF);
            phe pheVarC2 = phdVarA.c();
            pgw pgwVar = this.b;
            pfg pfgVarA = pfg.a(pgwVar.b());
            pgt pgtVarD = this.h.d(pdjVarD, z, false, false);
            pfgVarA.g(new pdq(pgtVarD, pgtVarD));
            pmg.n(pfgVarA, pheVarC2);
            if (z) {
                pfg pfgVarA2 = pfg.a(pfgVarA);
                pfgVarA2.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                pgwVar.i(pfgVarA2.b());
            }
            pgwVar.g(pfgVarA.b());
            pmgVar.k(pheVarC2, false);
            syuVar = pgtVarD.a;
            paqVarH.close();
        } finally {
        }
        return syuVar;
    }

    final synchronized void f(pdj pdjVar) {
        h(pdjVar);
    }

    final synchronized void g(pdj pdjVar) {
        pmg pmgVar = this.i;
        paq paqVarH = pmgVar.h();
        try {
            pdj pdjVarD = this.j.d(pdjVar, pmgVar.j());
            phe pheVarJ = pmgVar.j();
            phd phdVarA = phd.a(pdjVarD);
            phdVarA.f = pheVarJ.a;
            phdVarA.g = pheVarJ.b;
            phdVarA.h = pheVarJ.c;
            phe pheVarC = phdVarA.c();
            pgw pgwVar = this.b;
            pfg pfgVarA = pfg.a(pgwVar.b());
            pmg.n(pfgVarA, pheVarC);
            pgt pgtVarB = this.h.b(pheVarC, false, false, false);
            pfgVarA.g(new pdq(pgtVarB, pgtVarB));
            pgwVar.i(pfgVarA.b());
            paqVarH.close();
        } finally {
        }
    }

    final synchronized void h(pdj pdjVar) {
        pmg pmgVar = this.i;
        paq paqVarH = pmgVar.h();
        try {
            this.c.cancel(true);
            pdj pdjVarD = this.j.d(pdjVar, pmgVar.j());
            phe pheVarC = pmgVar.i().c();
            phd phdVarA = phd.a(pdjVarD);
            Boolean bool = pheVarC.a;
            phdVarA.f = bool;
            Boolean bool2 = pheVarC.b;
            phdVarA.g = bool2;
            Boolean bool3 = pheVarC.c;
            phdVarA.h = bool3;
            phe pheVarC2 = phdVarA.c();
            pgw pgwVar = this.b;
            pfg pfgVarA = pfg.a(pgwVar.b());
            pmg.n(pfgVarA, pheVarC2);
            boolean zBooleanValue = pheVarC2.a.booleanValue();
            int i = 0;
            if (bool.booleanValue() && pdjVarD.b().equals(pheVarC.b())) {
                zBooleanValue = false;
            }
            if (zBooleanValue && i(pheVarC2.b())) {
                i = 1;
            }
            pfgVarA.e(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(i));
            pgj pgjVar = this.h;
            boolean zBooleanValue2 = bool.booleanValue();
            boolean zBooleanValue3 = bool2.booleanValue();
            boolean zBooleanValue4 = bool3.booleanValue();
            HashSet hashSet = new HashSet();
            hashSet.add(pgjVar.a(CaptureResult.CONTROL_AF_MODE, new sfm(pheVarC2.b())));
            hashSet.add(pgjVar.a(CaptureResult.CONTROL_AE_MODE, new sfm(pheVarC2.a())));
            hashSet.add(pgjVar.a(CaptureResult.CONTROL_AWB_MODE, new sfm(pheVarC2.c())));
            hashSet.addAll(pgjVar.e(pheVarC2, zBooleanValue2, zBooleanValue3, zBooleanValue4));
            pgt pgtVar = new pgt(scn.F(hashSet));
            pdq pdqVar = new pdq(pgtVar, pgtVar);
            pfgVarA.g(pdqVar);
            pgt pgtVar2 = new pgt(scn.H(pgjVar.a(CaptureResult.CONTROL_AF_MODE, new sfm(pheVarC2.b())), pgjVar.a(CaptureResult.CONTROL_AF_TRIGGER, new sfm(1))));
            if (i != 0) {
                pfgVarA.g(new pdq(pgtVar2, pgtVar2));
            }
            pgwVar.g(pfgVarA.b());
            if (i != 0) {
                try {
                    this.a.submit(new ozi(pgtVar2, 4)).get();
                    if (zBooleanValue && !i(pdjVarD.b())) {
                        pfg pfgVarA2 = pfg.a(pfgVarA);
                        pfgVarA2.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        pfgVarA2.g(pdqVar);
                        this.b.i(pfgVarA2.b());
                    }
                    this.i.k(pheVarC2, true);
                } catch (InterruptedException | ExecutionException | RejectedExecutionException e) {
                    ske.L(e);
                }
            } else {
                if (zBooleanValue) {
                    pfg pfgVarA22 = pfg.a(pfgVarA);
                    pfgVarA22.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    pfgVarA22.g(pdqVar);
                    this.b.i(pfgVarA22.b());
                }
                this.i.k(pheVarC2, true);
            }
            paqVarH.close();
        } finally {
        }
    }
}
