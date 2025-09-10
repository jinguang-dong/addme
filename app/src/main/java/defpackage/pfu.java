package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Printer;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfu implements paq {
    public final pfi a;
    public final pez b;
    public final pbc c;
    public final pgq d;
    public final pfr e;
    public final pfq f;
    public final pmv g;
    private final pgs h;
    private final pgn i;
    private final our j;
    private final long k;
    private final pfa l;
    private final Executor m;
    private Future n;
    private final qrh o;
    private final pit p;
    private final rcg q;
    private final qpf r;
    private final mwq s;

    public pfu(pfr pfrVar, pit pitVar, pfi pfiVar, rcg rcgVar, qrh qrhVar, pez pezVar, pgn pgnVar, pgs pgsVar, our ourVar, Executor executor, pci pciVar, pgq pgqVar, pmv pmvVar, mwq mwqVar, qpf qpfVar, pbc pbcVar, pfq pfqVar) {
        this.e = pfrVar;
        this.a = pfiVar;
        this.q = rcgVar;
        this.o = qrhVar;
        this.b = pezVar;
        this.i = pgnVar;
        this.h = pgsVar;
        this.j = ourVar;
        this.d = pgqVar;
        this.g = pmvVar;
        this.p = pitVar;
        this.f = pfqVar;
        this.r = qpfVar;
        this.s = mwqVar;
        szg szgVar = new szg(executor);
        this.m = szgVar;
        this.l = new pfa(pfqVar, szgVar, pbcVar);
        this.c = pbcVar.a("FrameServer");
        this.k = System.nanoTime();
        pitVar.e(pfrVar);
        ourVar.d(pciVar.b(pfrVar.toString()));
        ourVar.d(pfqVar);
        ourVar.d(pgqVar);
        ((phk) mwqVar.b).a.b(pfiVar.d().a);
    }

    public static final pdi v() {
        Integer num = pey.a;
        MeteringRectangle[] meteringRectangleArr = pey.b;
        return new pey(num, num, num, num, num, meteringRectangleArr, meteringRectangleArr, meteringRectangleArr);
    }

    public final paq a(pdv pdvVar) {
        t("attach(frameStream)");
        return this.o.c(pdvVar, 0);
    }

    public final pdk b(pdv pdvVar) {
        t("submit(frameStream)");
        return this.i.a(pdvVar);
    }

    public final pdn c(pdv pdvVar, int i) {
        t("attach(frameStream, capacity)");
        return this.o.c(pdvVar, i);
    }

    public final pdv d(peo peoVar) {
        this.s.G(this.a.d().a, 1, 0);
        t("create(stream)");
        return this.q.d(peoVar, sfd.a);
    }

    public final pdv f(peo peoVar, Set set) {
        this.s.G(this.a.d().a, 1, set.size());
        t("create(stream, parameters)");
        return this.q.d(peoVar, scn.F(set));
    }

    public final pdv g(Set set, Set set2) {
        this.s.G(this.a.d().a, set.size(), set2.size());
        t("create(streams, parameters)");
        return this.q.e(set, scn.F(set2));
    }

    public final void h(peo peoVar) {
        i(peoVar, true);
    }

    public final void i(peo peoVar, boolean z) {
        if (z) {
            this.r.l(peoVar);
        }
        if (peoVar instanceof phx) {
            this.c.f("Draining ".concat(String.valueOf(String.valueOf(peoVar))));
            Iterator it = ((phx) peoVar).a.d.iterator();
            while (it.hasNext()) {
                pif pifVar = (pif) it.next();
                synchronized (pifVar) {
                    if (!pifVar.i) {
                        pbc pbcVar = pifVar.e;
                        poo pooVar = pifVar.a;
                        pbcVar.f("Draining free buffers for " + pooVar.toString());
                        pooVar.h();
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    public final void j(Printer printer) {
        scn scnVarF;
        pfj pfjVar = new pfj(printer, 1);
        pfi pfiVar = this.a;
        String strValueOf = String.valueOf(pfiVar.a);
        pdt pdtVar = pfiVar.b;
        printer.println(strValueOf + " (Camera " + pdtVar.a.a + ")");
        pfi.e(pfjVar, "Facing", String.valueOf(String.valueOf(pfiVar.c().l())).concat((pfiVar.c().M() && pfiVar.c().D()) ? " (Logical)" : " (Physical)"));
        pfi.e(pfjVar, "Mode", pdtVar.b == pei.NORMAL ? "Normal" : "HighSpeed");
        pmj pmjVar = pfiVar.c;
        long j = pmjVar.b;
        int iMax = 20;
        pfi.e(pfjVar, "Memory", j <= 0 ? "-" : (pmjVar.f() / 1048576) + " / " + (j >> 20) + " (MiB)");
        printer.println("Streams: ");
        sgj sgjVarListIterator = ((scn) pfiVar.d.b).listIterator();
        while (sgjVarListIterator.hasNext()) {
            pil pilVar = (pil) sgjVarListIterator.next();
            String str = pilVar.g ? " (Camera-" + pilVar.f.a + ")" : "";
            String string = pilVar instanceof phx ? Long.toString(((phx) pilVar).d) : "inf";
            String str2 = pilVar.k() != -1 ? " (Usecase " + pilVar.k() + ")" : "";
            Locale locale = Locale.ROOT;
            String str3 = pilVar.b().a + "x" + pilVar.b().b;
            String strAy = qpt.ay(pilVar.a());
            int iOrdinal = pilVar.i().ordinal();
            pfjVar.println(String.format(locale, "%-10s %10s %-15s %-15s %6.2f MiB/image %4s images/stream%s%s", pilVar, str3, strAy, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "SURFACE_DEFERRED" : "SURFACE" : "SURFACE_VIEW" : "SURFACE_TEXTURE" : "IMAGE_READER", Double.valueOf(pilVar.g() / 1048576.0d), string, str, str2));
        }
        scn scnVar = pdtVar.h;
        if (!scnVar.isEmpty()) {
            printer.println("Session Parameters: ");
            sbr sbrVarJ = sbv.j(scnVar.size());
            sgj sgjVarListIterator2 = scnVar.listIterator();
            while (sgjVarListIterator2.hasNext()) {
                pej pejVar = (pej) sgjVarListIterator2.next();
                String strA = pejVar.a();
                iMax = Math.max(iMax, strA.length());
                sbrVarJ.f(strA, pejVar.b);
            }
            sbv sbvVarB = sbrVarJ.b();
            ArrayList arrayList = new ArrayList(sbvVarB.keySet());
            Collections.sort(arrayList);
            String strBE = a.bE(iMax, "%-", "s %s");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str4 = (String) arrayList.get(i);
                pfjVar.println(ojl.bI(strBE, str4, sbvVarB.get(str4)));
            }
        }
        qrh qrhVar = this.o;
        synchronized (qrhVar) {
            scnVarF = scn.F(qrhVar.c);
        }
        sct sctVar = new sct(new wp(10));
        sct sctVar2 = new sct(new wp(10));
        sgj sgjVarListIterator3 = scnVarF.listIterator();
        while (sgjVarListIterator3.hasNext()) {
            sgj sgjVarListIterator4 = ((pfd) sgjVarListIterator3.next()).i().c.listIterator();
            while (sgjVarListIterator4.hasNext()) {
                peo peoVar = (peo) sgjVarListIterator4.next();
                sctVar.m(peoVar.toString());
                sctVar2.m(peoVar.d().a);
            }
        }
        printer.println("Attached streams: ".concat(String.valueOf(String.valueOf(sctVar.g()))));
        printer.println("Attached camera ids: ".concat(String.valueOf(String.valueOf(sctVar2.g()))));
    }

    public final void k() {
        if (t("resume")) {
            return;
        }
        this.c.f("Resuming ".concat(toString()));
        this.p.d(this.e);
        this.h.a();
    }

    public final void l(pej pejVar) {
        this.b.d(pejVar);
    }

    public final void m(CaptureRequest.Key key, Object obj) {
        pez pezVar = this.b;
        if (((rcg) pezVar.c).c(key)) {
            return;
        }
        pezVar.d(new pej(key, obj));
    }

    public final void n(Set set) {
        this.b.e(set);
    }

    public final void o(pen penVar) {
        Future future = this.n;
        if (future != null) {
            future.cancel(true);
        }
        if (t("trigger3A")) {
            return;
        }
        try {
            this.n = ske.P(new pev(this, penVar, 2, null), this.m);
        } catch (RejectedExecutionException e) {
            this.c.h("Failed to submit trigger3A task. ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final void p(pdj pdjVar, pen penVar) {
        pfu pfuVar;
        Future future = this.n;
        if (future != null) {
            future.cancel(true);
        }
        if (t("trigger3A")) {
            return;
        }
        try {
            pfuVar = this;
            try {
                pfuVar.n = ske.P(new lqd((Object) pfuVar, (Object) pdjVar, (Object) penVar, 18, (byte[]) null), pfuVar.m);
            } catch (RejectedExecutionException e) {
                e = e;
                pfuVar.c.h("Failed to submit trigger3A task. ".concat(String.valueOf(e.getMessage())));
            }
        } catch (RejectedExecutionException e2) {
            e = e2;
            pfuVar = this;
        }
    }

    public final void q(final boolean z, final boolean z2, final boolean z3) {
        Future future = this.n;
        if (future != null) {
            future.cancel(true);
        }
        if (t("unlock3A")) {
            return;
        }
        try {
            this.m.execute(new Runnable() { // from class: pft
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z4 = z;
                    boolean z5 = z2;
                    pfu pfuVar = this.a;
                    boolean z6 = z3;
                    try {
                        pfq pfqVar = pfuVar.f;
                        try {
                            pgo pgoVarA = pfqVar.b.a();
                            try {
                                pgoVarA.e(z4, z5, z6, true);
                                pgoVarA.close();
                                synchronized (pfqVar) {
                                    phd phdVarB = phd.b(pfqVar.a);
                                    phe pheVar = pfqVar.a;
                                    phdVarB.f = pheVar.a;
                                    phdVarB.g = pheVar.b;
                                    phdVarB.h = pheVar.c;
                                    if (z4) {
                                        phdVarB.f = false;
                                    }
                                    if (z5) {
                                        phdVarB.g = false;
                                    }
                                    if (z6) {
                                        phdVarB.h = false;
                                    }
                                    pfqVar.c(phdVarB.c());
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (pfqVar) {
                                phd phdVarB2 = phd.b(pfqVar.a);
                                phe pheVar2 = pfqVar.a;
                                phdVarB2.f = pheVar2.a;
                                phdVarB2.g = pheVar2.b;
                                phdVarB2.h = pheVar2.c;
                                if (z4) {
                                    phdVarB2.f = false;
                                }
                                if (z5) {
                                    phdVarB2.g = false;
                                }
                                if (z6) {
                                    phdVarB2.h = false;
                                }
                                pfqVar.c(phdVarB2.c());
                                throw th;
                            }
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        pfuVar.c.c("Interrupted when calling unlock3A.", e);
                    } catch (pco e2) {
                        pfuVar.c.c("FrameServer was closed when calling unlock3A.", e2);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            this.c.h("Failed to submit unlock3A task. ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final void r(pdj pdjVar) {
        if (t("update3A")) {
            return;
        }
        this.l.a(pdjVar, false);
    }

    public final void s(pdj pdjVar) {
        if (t("update3A")) {
            return;
        }
        this.l.a(pdjVar, true);
    }

    public final boolean t(String str) {
        if (!this.j.b()) {
            return false;
        }
        this.c.h("Attempted to invoke " + str + " on " + toString() + " after close()");
        return true;
    }

    public final String toString() {
        return this.e.toString();
    }

    public final pfz u() throws pco {
        if (t("acquireExclusiveSession")) {
            throw new pco(a.bx(this, "Unable to acquire session. ", " is closed"));
        }
        return this.g.j(this.d.a());
    }

    public final void w() {
        Future future = this.n;
        if (future != null) {
            future.cancel(true);
        }
        if (t("trigger3A")) {
            return;
        }
        try {
            this.n = ske.P(new oze(this, 3), this.m);
        } catch (RejectedExecutionException e) {
            this.c.h("Failed to submit trigger3A task. ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        String strConcat = TOnSyMaYeslEl.UFPfu.concat(toString());
        pbc pbcVar = this.c;
        pbcVar.f(strConcat);
        this.p.f(this.e);
        this.j.close();
        ((phk) this.s.b).b.c(System.nanoTime() - this.k, this.a.d().a);
        pbcVar.b("Closed ".concat(toString()));
    }

    public final pdv e(Set set) {
        this.s.G(this.a.d().a, set.size(), 0);
        t(oUZhwRhE.KOMGfW);
        return this.q.e(set, sfd.a);
    }
}
