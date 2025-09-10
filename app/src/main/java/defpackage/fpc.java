package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpc implements syf {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public fpc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    private final void c() {
        Object obj = this.a;
        synchronized (((fxm) obj).e) {
            ((fxm) obj).w = null;
            ((fxm) obj).b();
            fxl fxlVar = ((fxm) obj).y;
            if (fxlVar == fxl.CLOSED) {
                return;
            }
            rnt.L(fxlVar == fxl.STOPPING_RECORDING);
            ((fxm) obj).m(fxl.NO_RECORDING);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        sbp sbpVarJ;
        switch (this.c) {
            case 0:
                ((sgt) ((sgt) fpd.a.b().i(th)).M((char) 301)).s("Missing notification chip layout.");
                return;
            case 1:
                ((sgt) ((sgt) fkg.a.b().i(th)).M((char) 242)).s("Missing notification chip layout.");
                return;
            case 2:
                this.a.run();
                return;
            case 3:
                ((sgt) ((sgt) fxm.a.b().i(th)).M((char) 498)).s("Failed to stop recording.");
                c();
                return;
            case 4:
                String strValueOf = String.valueOf(th.getMessage());
                Object obj = this.a;
                fxy fxyVar = (fxy) obj;
                fxyVar.k("Failed to start recorder: ".concat(strValueOf));
                synchronized (fxyVar.e) {
                    if (((fxy) obj).D == fxx.STOPPED) {
                        hem hemVar = ((fxy) obj).t;
                        lte lteVar = ((fxy) obj).A;
                        lteVar.getClass();
                        hemVar.i(lteVar.b);
                    } else {
                        hem hemVar2 = ((fxy) obj).t;
                        lte lteVar2 = ((fxy) obj).A;
                        lteVar2.getClass();
                        hemVar2.k(lteVar2.b);
                    }
                }
                ((fxy) this.a).close();
                return;
            case 5:
                ((sgt) fxy.a.b().M(526)).v("CamcorderSnapshot is not available: %s", th);
                fxy fxyVar2 = (fxy) this.a;
                fxm fxmVar = fxyVar2.H;
                fxmVar.o.execute(new fjw(fxmVar, th, 11));
                Object obj2 = this.b;
                fxyVar2.t.i(((lte) obj2).b);
                fxyVar2.z.remove(obj2);
                fxyVar2.c.j(true);
                return;
            case 6:
                th.getClass();
                this.b.a();
                ((sgt) hti.a.b().i(th).M(1501)).s("Error starting camera");
                return;
            case 7:
                return;
            case 8:
                ((iwb) this.a).l(false, (gga) this.b);
                return;
            case 9:
                sgv sgvVar = kai.a;
                th.getStackTrace();
                kae kaeVar = (kae) this.a;
                if (kaeVar.d.l()) {
                    long jConvert = TimeUnit.MILLISECONDS.convert(((Long) kaeVar.d.i()).longValue(), TimeUnit.NANOSECONDS);
                    owq owqVar = ((kai) this.b).o;
                    if (jConvert >= ((Long) ((Pair) owqVar.dL()).first).longValue()) {
                        owqVar.a(new Pair(Long.valueOf(jConvert), false));
                        return;
                    } else {
                        Object obj3 = ((Pair) owqVar.dL()).first;
                        return;
                    }
                }
                return;
            case 10:
                this.b.a();
                throw new rxd(th, null);
            case 11:
                this.b.run();
                return;
            case 12:
                if (th instanceof TimeoutException) {
                    ((nzv) this.b).c((nzt) this.a);
                    return;
                } else {
                    if (th instanceof CancellationException) {
                        ((nzv) this.b).b();
                        return;
                    }
                    Object obj4 = this.b;
                    nzv nzvVar = (nzv) obj4;
                    nzvVar.i.a(th, "Error observing connectivity changes", new Object[0]);
                    synchronized (nzvVar.f) {
                        List list = ((nzv) obj4).d;
                        sbpVarJ = sbp.j(list);
                        list.clear();
                    }
                    ske.I(sbpVarJ).cancel(true);
                    return;
                }
            case 13:
                int i = qbu.a;
                try {
                    Object obj5 = this.b;
                    qsp.au(((pzb) obj5).a, ((pzb) obj5).h, (pvc) this.a, ((pzb) obj5).m);
                    return;
                } catch (IOException unused) {
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                qbu.g(th, "%s: Failed to add file group %s with account: %s, variant: %s", "ManifestConfigHelper", this.b, String.valueOf(((rwc) this.a).f()), "null");
                return;
            default:
                Log.e("ClientLoggingBackend", "Error while logging.", th);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, tqr] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, oyn] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v50, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, oyn] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, oyn] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, oyn] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        int i = 5;
        boolean z = true;
        boolean z2 = true;
        int i2 = 0;
        switch (this.c) {
            case 0:
                ?? r0 = this.a;
                ((fpl) r0).a((View) obj);
                ((jgt) this.b).k(r0);
                return;
            case 1:
                ?? r02 = this.a;
                ((fks) r02).a((View) obj);
                ((jgt) this.b).k(r02);
                return;
            case 2:
                this.b.run();
                return;
            case 3:
                kbk kbkVar = (kbk) obj;
                fxm fxmVar = (fxm) this.a;
                fxmVar.l.j(mfa.RECORD_STOPPED);
                lru lruVar = fxmVar.u;
                lruVar.getClass();
                fxmVar.j.e = rwc.j(lruVar);
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((fyt) it.next()).q(kbkVar);
                }
                if (!kbkVar.d.isEmpty()) {
                    fyd fydVar = fxmVar.d;
                    moc mocVar = fydVar.a;
                    mocVar.l(6);
                    mocVar.i(fydVar.b);
                }
                c();
                return;
            case 4:
                Object obj2 = this.a;
                synchronized (((fxy) obj2).e) {
                    if (((fxy) obj2).D == fxx.STOPPED) {
                        return;
                    }
                    Object obj3 = this.a;
                    fxy fxyVar = (fxy) obj3;
                    fxyVar.k("Recording started.");
                    fxs fxsVar = new fxs(obj3, z2 ? 1 : 0);
                    Duration duration = hei.a;
                    fxyVar.B = fxyVar.u.scheduleAtFixedRate(fxsVar, duration.toSeconds(), duration.toSeconds(), TimeUnit.SECONDS);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(fxyVar.n);
                    gaw gawVar = fxyVar.j;
                    if (gawVar.E) {
                        hbj hbjVar = fxyVar.L;
                        if (hbjVar.p(gym.O)) {
                            arrayList.add(new gcs(this.b));
                        }
                        if (gawVar.c == oxh.FPS_AUTO) {
                            arrayList.add(new gcu(this.b));
                            rwc rwcVar = fxyVar.q;
                            if (rwcVar.h()) {
                                arrayList.add(rwcVar.c());
                            }
                        }
                        rwc rwcVarF = hqp.f(gawVar.C, hbjVar);
                        if (rwcVarF.h()) {
                            this.b.o(((hqp) rwcVarF.c()).e());
                        }
                    }
                    Stream streamFilter = Collection.EL.stream(fxyVar.w).filter(new fme(this, 4));
                    ?? r12 = this.b;
                    streamFilter.forEach(new fxu(r12, arrayList, i2));
                    gce gceVar = fxyVar.J.b;
                    gceVar.getClass();
                    synchronized (((gcm) gceVar).c) {
                        if (((gcm) gceVar).N) {
                            ((sgt) gcm.a.c().M(716)).s("Already closed.");
                        } else {
                            gal galVar = ((gcm) gceVar).B;
                            galVar.getClass();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((gcm) gceVar).X.w(gdo.RECORDING_SESSION).d(galVar.d((ojl) it2.next()));
                            }
                            if (((gcm) gceVar).x != null) {
                                ((sgt) gcm.a.c().M(715)).s("Recording stream already attached.");
                            } else {
                                pfu pfuVar = ((gcm) gceVar).R;
                                pfuVar.getClass();
                                pdv pdvVar = ((gcm) gceVar).u;
                                pdvVar.getClass();
                                ((gcm) gceVar).x = pfuVar.c(pdvVar, 0);
                                pdv pdvVar2 = ((gcm) gceVar).v;
                                if (pdvVar2 != null) {
                                    ((gcm) gceVar).y = pfuVar.c(pdvVar2, 0);
                                }
                                fcr fcrVar = ((gcm) gceVar).E;
                                fcrVar.getClass();
                                fcrVar.b(5);
                            }
                        }
                    }
                    ske.M(null);
                    gbp gbpVar = fxyVar.i;
                    synchronized (gbpVar.f) {
                        gbpVar.a = r12;
                        gbpVar.c = SystemClock.elapsedRealtimeNanos() - TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis());
                        gbpVar.b = true;
                        pdn pdnVar = gbpVar.d;
                        if (pdnVar != null) {
                            pdnVar.l(gbpVar);
                        }
                    }
                    return;
                }
            case 5:
                sgv sgvVar = fxy.a;
                fxy fxyVar2 = (fxy) this.a;
                fxyVar2.d.add((gbv) obj);
                fxyVar2.c.j(true);
                return;
            case 6:
                jth jthVar = (jth) obj;
                jthVar.getClass();
                our ourVar = new our();
                ourVar.d(jthVar);
                Object obj4 = this.a;
                hti htiVar = (hti) obj4;
                htiVar.x = ourVar;
                htiVar.O = jthVar;
                ourVar.d(new gge(obj4, 19));
                ?? r4 = jthVar.i().c;
                fqz fqzVar = new fqz(obj4, i);
                out outVar = htiVar.g;
                ojl.ck(r4, fqzVar, outVar);
                int i3 = 14;
                outVar.execute(new hdk(obj4, jthVar, i3));
                gzi gziVar = gzp.a;
                htiVar.P.g();
                ourVar.d(jthVar.b().dK(new hdg(obj4, i3), outVar));
                this.b.a();
                return;
            case 7:
                return;
            case 8:
                ((iwb) this.a).l(((Boolean) obj).booleanValue(), (gga) this.b);
                return;
            case 9:
                rwc rwcVar2 = (rwc) obj;
                kae kaeVar = (kae) this.a;
                if (!kaeVar.d.l()) {
                    sgv sgvVar2 = kai.a;
                    return;
                }
                long jConvert = TimeUnit.MILLISECONDS.convert(((Long) kaeVar.d.i()).longValue(), TimeUnit.NANOSECONDS);
                owq owqVar = ((kai) this.b).o;
                if (jConvert < ((Long) ((Pair) owqVar.dL()).first).longValue()) {
                    Object obj5 = ((Pair) owqVar.dL()).first;
                    return;
                }
                kbw kbwVar = kaeVar.c;
                Long lValueOf = Long.valueOf(jConvert);
                if (kbwVar.a && rwcVar2.h()) {
                    for (tsz tszVar : ((tta) rwcVar2.c()).c) {
                        if ((tszVar.b & 2) == 0 || tszVar.d < 0.6f) {
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                owqVar.a(new Pair(lValueOf, Boolean.valueOf(z)));
                return;
            case 10:
                this.b.a();
                mca.k(new man(this, 7), ((mca) this.a).e);
                return;
            case 11:
                ngn ngnVar = (ngn) obj;
                mje mjeVar = (mje) this.a;
                if (mjeVar.O.h()) {
                    ((npq) mjeVar.O.c()).l(ngnVar);
                } else {
                    peo peoVar = mjeVar.P;
                    peoVar.getClass();
                    peoVar.e(ngnVar.a);
                }
                this.b.run();
                return;
            case 12:
                ((nzv) this.b).c((nzt) this.a);
                return;
            case 13:
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (((Boolean) obj).booleanValue()) {
                    String.valueOf(((rwc) this.a).f());
                    int i4 = qbu.a;
                    return;
                } else {
                    String.valueOf(((rwc) this.a).f());
                    int i5 = qbu.a;
                    return;
                }
            default:
                ?? r03 = this.b;
                String str = (String) obj;
                suo suoVar = ((tba) r03).g;
                if (suoVar == null) {
                    suoVar = suo.a;
                }
                Object obj6 = this.a;
                String str2 = suoVar.j;
                Charset charset = tam.a;
                int i6 = slm.a;
                int iA = slt.a.b(str2, tam.a).a();
                oco ocoVar = oco.a;
                Context context = ((taq) ((lso) obj6).b).a;
                oca ocaVarF = new occ(context, "CLIENT_LOGGING_PROD", str, ocoVar, new ocw(context), new odf(context), null).f(r03, pro.a(context, new uab()));
                ocaVarF.d(iA);
                syu syuVarAv = qpt.av(ocaVarF.b());
                rvv rvvVar = new rvv();
                sxo sxoVar = sxo.a;
                syu syuVarI = swz.i(syuVarAv, rvvVar, sxoVar);
                syuVarI.c(new smv(syuVarI, 3), sxoVar);
                swf.i(syuVarI, Exception.class, rsx.a(new qpl(12)), sxoVar);
                return;
        }
    }

    public fpc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public fpc(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public fpc(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
