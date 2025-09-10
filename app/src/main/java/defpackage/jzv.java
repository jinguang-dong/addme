package defpackage;

import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.PostviewParams;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzv implements kbr {
    private static final AtomicInteger g = new AtomicInteger(0);
    public final hzs a;
    public final pjo b;
    public final jzx c;
    public final lat d;
    public final hbj e;
    public final iso f;
    private final pbc h;
    private final Executor i;

    public jzv(hzs hzsVar, pjo pjoVar, pbc pbcVar, hbj hbjVar, jzx jzxVar, Executor executor, iso isoVar, lat latVar) {
        this.a = hzsVar;
        this.b = pjoVar;
        this.h = pbcVar.a("MomentsHdrPLaunch");
        this.e = hbjVar;
        this.c = jzxVar;
        this.i = executor;
        this.f = isoVar;
        this.d = latVar;
    }

    @Override // defpackage.kbr
    public final int a() {
        return 1;
    }

    @Override // defpackage.kbr
    public final void b(final pdk pdkVar, final kfl kflVar, int i, final kbz kbzVar, final kbq kbqVar) {
        final pbg pbgVar = new pbg(this.h, "launcher shot " + g.getAndIncrement() + " ");
        pbgVar.b("launcher got a HDR+ burst");
        pdo pdoVarB = pdkVar.b();
        pdoVarB.getClass();
        pbgVar.b("    with frame: " + pdoVarB.b);
        this.i.execute(new Runnable() { // from class: jzr
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v28 */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Throwable th;
                pkf pkfVar;
                Object obj;
                Throwable th2;
                jzs jzsVar;
                Object jztVar;
                ltd ltdVarA;
                ibz ibzVarF;
                hbj hbjVar;
                pkf pkfVar2;
                kbz kbzVar2 = kbzVar;
                kfl kflVar2 = kflVar;
                pdk pdkVar2 = pdkVar;
                kbq kbqVar2 = kbqVar;
                pbc pbcVar = pbgVar;
                try {
                    poe poeVar = (poe) ((swn) MomentsUtils.a(pdkVar2)).s();
                    jzv jzvVar = this.a;
                    pdo pdoVarB2 = pdkVar2.b();
                    pdoVarB2.getClass();
                    lau lauVarA = jzvVar.d.a(pdkVar2);
                    pkf pkfVarP = lauVarA.p();
                    poj pojVarO = lauVarA.o();
                    long j = pdoVarB2.b;
                    if (pojVarO == null) {
                        pojVarO = new pke(j);
                    }
                    poj pojVar = pojVarO;
                    if (pkfVarP == 0) {
                        kbqVar2.b(new RuntimeException("Could not get a raw image from input frame"));
                        return;
                    }
                    pkf pkfVar3 = new pkf(pkfVarP, 1);
                    try {
                        try {
                            pkf pkfVar4 = new pkf(pojVar, 1);
                            try {
                                jzsVar = new jzs(jzvVar, kbzVar2, j, poeVar, pkfVar4, pdkVar2, kbqVar2);
                                try {
                                    jztVar = new jzt(jzvVar, kbzVar2, j, poeVar, pojVar, pkfVar4, pdkVar2, kbqVar2);
                                    pkfVar4 = pkfVar4;
                                    ltdVarA = ltd.a();
                                    pbcVar.f(ltdVarA.toString() + " + used internally by Moments. Not a shutter initiated shot");
                                    ibzVarF = jzvVar.f.f(ltdVarA);
                                    hbjVar = jzvVar.e;
                                    gzi gziVar = haa.a;
                                    pkfVar = pkfVar4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    pkfVar = pkfVar4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                pkfVar = pkfVar4;
                            }
                            try {
                                PostviewParams postviewParams = new PostviewParams();
                                pas pasVar = tgq.j(jzvVar.b, false).b;
                                int i2 = pasVar.a;
                                int i3 = pasVar.b;
                                if (i2 > i3) {
                                    try {
                                        postviewParams.d(i2 / 2);
                                        postviewParams.c(0);
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        pkfVarP = pkfVar3;
                                        try {
                                            pkfVar.l();
                                            throw th2;
                                        } catch (Throwable th6) {
                                            th2.addSuppressed(th6);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    postviewParams.d(0);
                                    postviewParams.c(i3 / 2);
                                }
                                if (!hbjVar.p(haa.H) || kbzVar2.a) {
                                    postviewParams.b(tcq.b);
                                    if (ibzVarF.j == null) {
                                        ibzVarF.j = new scl();
                                    }
                                    ibzVarF.j.d(jztVar);
                                    obj = jztVar;
                                } else {
                                    postviewParams.b(tcq.f);
                                    if (ibzVarF.l == null) {
                                        ibzVarF.l = new scl();
                                    }
                                    scl sclVar = ibzVarF.l;
                                    sclVar.d(jzsVar);
                                    obj = sclVar;
                                }
                                try {
                                    gga ggaVar = new gga(kflVar2, (Object) null, new kmj(), new kmx());
                                    pjr pjrVarD = lauVarA.l().d();
                                    try {
                                        pkfVar2 = pkfVar3;
                                    } catch (InterruptedException | ExecutionException | pco e) {
                                        e = e;
                                        pkfVar2 = pkfVar3;
                                    }
                                    try {
                                        iby ibyVarE = jzvVar.a.E(pjrVarD, ltdVarA, ggaVar, postviewParams, kox.OFF, poeVar);
                                        pbcVar.b("launched HDR+ shot");
                                        if (ibyVarE == null) {
                                            pbcVar.h("Failed to initiate HDR plus shot capture.");
                                            kbqVar2.b(new jzu(new RuntimeException("Failed to initiate HDR plus shot capture.")));
                                            pkfVar.l();
                                            pkfVar2.l();
                                            return;
                                        }
                                        hzs hzsVar = jzvVar.a;
                                        hzsVar.q(ibyVarE);
                                        pbcVar.b(mn.h(j, "Submitting payload frame "));
                                        try {
                                            hzsVar.C(ibyVarE, pjrVarD, 0, poeVar, tbq.c, pkfVar2);
                                            tcq tcqVar = hxy.a;
                                            if (!hzsVar.x(ibyVarE, new BurstSpec())) {
                                                pbcVar.d("Couldn't end burst payload, aborting shot.");
                                                hzsVar.l(ibyVarE);
                                                kbqVar2.b(new jzu(new RuntimeException("Couldn't end burst payload")));
                                                pkfVar.l();
                                                pkfVar2.l();
                                                return;
                                            }
                                            if (!hzsVar.y(ibyVarE)) {
                                                pbcVar.d("Couldn't end capture, aborting shot.");
                                                hzsVar.l(ibyVarE);
                                                kbqVar2.b(new jzu(new RuntimeException("Couldn't end capture")));
                                            }
                                            pkfVar2.k();
                                            pkfVar.k();
                                            pkfVar.l();
                                            pkfVar2.l();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            obj = pkfVar2;
                                            th2 = th;
                                            pkfVarP = obj;
                                            pkfVar.l();
                                            throw th2;
                                        }
                                    } catch (InterruptedException | ExecutionException | pco e2) {
                                        e = e2;
                                        pbcVar.e("Couldn't start ZSL capture", e);
                                        kbqVar2.b(e);
                                        pkfVar.l();
                                        pkfVar2.l();
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                obj = pkfVar3;
                                th2 = th;
                                pkfVarP = obj;
                                pkfVar.l();
                                throw th2;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            pkfVarP = pkfVar3;
                            th = th;
                            try {
                                pkfVarP.l();
                                throw th;
                            } catch (Throwable th11) {
                                th.addSuppressed(th11);
                                throw th;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        th = th;
                        pkfVarP.l();
                        throw th;
                    }
                } catch (InterruptedException e3) {
                    pbcVar.d("metadata get interrupted");
                    kbqVar2.b(e3);
                } catch (ExecutionException e4) {
                    pbcVar.d("Failed to acquire metadata from the first frame.");
                    kbqVar2.b(e4);
                }
            }
        });
    }

    @Override // defpackage.kbr
    public final boolean c(pdk pdkVar, lat latVar) {
        return true;
    }
}
