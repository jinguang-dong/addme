package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.apps.camera.portrait.preview.NativePortraitPreviewProcessor;
import com.google.android.apps.camera.sideline.SidelineInstallerService;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Stream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxw implements syf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fxw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r7v2, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((sgt) ((sgt) fxy.a.c().i(th)).M((char) 525)).s("Failed to capture video cover image.");
                return;
            case 1:
                Object obj = this.a;
                synchronized (((fxm) obj).e) {
                    ((sgt) ((sgt) fxm.a.b().i(th)).M(509)).s("Failed to startRecording: ");
                    ((fxm) obj).x = null;
                    ((fxm) obj).c.execute(new foh(obj, 20));
                    if (((fxm) obj).y != fxl.CLOSED) {
                        ((fxm) obj).m(fxl.NO_RECORDING);
                    }
                }
                return;
            case 2:
                throw new hgx("Failed to open any of the available camera", pbw.CAMERA_ERROR_CODE_UNKNOWN, pka.BACK, pka.FRONT);
            case 3:
                throw new pjw();
            case 4:
                if (th instanceof CancellationException) {
                    return;
                }
                if (((hne) this.a).l.b(hbc.DOGFOOD)) {
                    throw new IllegalStateException("Error during photos launch", th);
                }
                return;
            case 5:
            case 6:
            case 7:
                return;
            case 8:
                ((sgt) ((sgt) ((sgt) lgw.a.b().h(shx.a, "MilkPipeline")).i(th)).M(4140)).s("Failed to close processor.");
                return;
            case 9:
                ?? B = lrl.a.b();
                lrl lrlVar = ((lrj) this.a).a;
                ltd ltdVar = lrlVar.f.a;
                ((sgt) ((sgt) B.i(th)).M((char) 4333)).v("Unable to mark shot %s as persisted", ltdVar);
                lrlVar.O();
                lrlVar.s.e(ltdVar);
                return;
            case 10:
                sgv sgvVar = lwf.a;
                lwf lwfVar = (lwf) this.a;
                lwfVar.m.a(4);
                lwfVar.o.b(-1, 9);
                return;
            case 11:
                ((sgt) mjl.a.b().M(4853)).v("CamcorderSnapshot is not available: %s", th);
                mjl mjlVar = (mjl) this.a;
                mjlVar.D.d();
                mjlVar.W.g(th, mjlVar.j.a());
                return;
            case 12:
                throw new IllegalStateException();
            case 13:
                Iterator it = DesugarCollections.unmodifiableCollection(((oxd) this.a).c).iterator();
                while (it.hasNext()) {
                    ((owy) it.next()).a(new IllegalStateException("Fail to start", th));
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Iterator it2 = DesugarCollections.unmodifiableCollection(((oxd) this.a).c).iterator();
                while (it2.hasNext()) {
                    ((owy) it2.next()).a(new IllegalStateException("Fail to stop", th));
                }
                return;
            case 15:
                Log.w("Failed to get MediaLimit. Stick with the default.", th);
                return;
            case 16:
                final pwo pwoVar = (pwo) this.a;
                final pxu pxuVar = pwoVar.a;
                final int i = pwoVar.g;
                final clr clrVar = pwoVar.f;
                final clm clmVar = pwoVar.d;
                final pun punVar = pwoVar.c;
                qsz.l(new sxh() { // from class: pwn
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, puo] */
                    @Override // defpackage.sxh
                    public final syu a() {
                        pun punVar2 = punVar;
                        int i2 = punVar2.k;
                        pwo pwoVar2 = pwoVar;
                        if (i2 == 2) {
                            int i3 = i;
                            clr clrVar2 = clrVar;
                            clm clmVar2 = clmVar;
                            clmVar2.b.clear();
                            clmVar2.n = "status";
                            clmVar2.e(prh.t(pwoVar2.i.a));
                            clmVar2.g(false);
                            clmVar2.i(R.drawable.stat_sys_warning);
                            clmVar2.h(0, 0, false);
                            clrVar2.a(i3, clmVar2.a());
                        }
                        rwc rwcVar = punVar2.h;
                        if (rwcVar.h()) {
                            rwcVar.c().d();
                        }
                        pxu pxuVar2 = pxuVar;
                        pwr pwrVar = pwoVar2.i;
                        ((qdc) pwrVar.g.c()).e(punVar2.a);
                        return pwrVar.j.f(pxuVar2.a);
                    }
                }, pwoVar.i.f);
                return;
            default:
                pvl pvlVar = ((qde) this.a).a.c;
                if (pvlVar == null) {
                    pvlVar = pvl.a;
                }
                qbu.g(th, "%s: Unable to increment LoggingStateStore network usage for %s", "NetworkUsageMonitor", pvlVar.c);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.lang.Object, nls] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, pbc] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
        byte[] bArr = null;
        int i = 8;
        int i2 = 10;
        int i3 = 9;
        switch (this.b) {
            case 0:
                ((fxy) this.a).l.set((Bitmap) obj);
                return;
            case 1:
                Object obj2 = this.a;
                synchronized (((fxm) obj2).e) {
                    if (((fxm) obj2).y == fxl.CLOSED) {
                        return;
                    }
                    ((fxm) obj2).l.j(mfa.RECORD_STARTED);
                    gds gdsVar = ((fxm) obj2).k;
                    mhp mhpVarA = gdsVar.a();
                    Stream streamFilter = Collection.EL.stream(gdsVar.k).filter(new fla(i));
                    int i4 = sbp.d;
                    sbp sbpVar = (sbp) streamFilter.collect(ryv.a);
                    if (mhpVarA.a(mhp.HEAT_SEVERE)) {
                        Collection.EL.stream(sbpVar).filter(new fla(i3)).forEach(new fkj(11));
                    }
                    if (mhpVarA.a(mhp.HEAT_CRITICAL)) {
                        Collection.EL.stream(sbpVar).filter(new fla(i2)).forEach(new fkj(12));
                    }
                    lru lruVar = ((fxm) obj2).u;
                    lruVar.getClass();
                    lruVar.j(9, 9);
                    ((fxm) obj2).m(fxl.RECORDING);
                    if (((fxm) obj2).n()) {
                        ((fxm) obj2).e();
                    }
                    return;
                }
            case 2:
                qrh qrhVar = (qrh) this.a;
                cxb cxbVar = (cxb) qrhVar.a;
                qrhVar.j((gpa) obj, cxbVar.s(), cxbVar.r(), 3);
                return;
            case 3:
                qrh qrhVar2 = (qrh) this.a;
                cxb cxbVar2 = (cxb) qrhVar2.a;
                qrhVar2.j((gpa) obj, cxbVar2.q(), cxbVar2.p(), 2);
                return;
            case 4:
                return;
            case 5:
                jth jthVar = (jth) obj;
                jthVar.getClass();
                Object obj3 = this.a;
                jcm jcmVar = (jcm) obj3;
                jcmVar.p = jthVar;
                jcmVar.l.d(jthVar);
                out.a();
                jcc jccVar = jcmVar.k;
                jccVar.g.g();
                ?? r2 = jthVar.i().c;
                fqz fqzVar = new fqz(this, i2);
                out outVar = jcmVar.d;
                ojl.ck(r2, fqzVar, outVar);
                owf owfVarB = jthVar.b();
                jccVar.getClass();
                paq paqVarDK = owfVarB.dK(new jbp(jccVar, 7), outVar);
                our ourVar = jthVar.a;
                ourVar.d(paqVarDK);
                ourVar.d(new hye(this, 18));
                ?? r14 = jthVar.i().i;
                owi owiVar = new owi(false);
                fbq fbqVar = jcmVar.f;
                rwc rwcVar = jcmVar.i;
                kgw kgwVar = jthVar.c;
                ourVar.d(fbqVar.a(jthVar, kgwVar, r14, owiVar, false, rwcVar.h(), 1));
                outVar.execute(new jbh(obj3, 20));
                kgwVar.l();
                nkw nkwVar = nkw.UNINITIALIZED;
                jcmVar.s.h();
                return;
            case 6:
                lag lagVar = (lag) obj;
                float f = lagVar.a;
                float f2 = lagVar.b;
                Object obj4 = this.a;
                ((jkd) obj4).l = f2;
                nhz nhzVar = ((jjx) obj4).a;
                nhzVar.getClass();
                nhzVar.g(jkd.i(f), false, niz.a);
                return;
            case 7:
                kko kkoVar = (kko) obj;
                kkoVar.getClass();
                for (gga ggaVar : ((kks) this.a).a) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ggaVar.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            kkz kkzVarA = ((kkn) it.next()).a(kkoVar);
                            arrayList.add(kkzVarA);
                            if (kkzVarA.b.isEmpty()) {
                                ggaVar.c.f("Valid image created:".concat(kkzVarA.a));
                            }
                        } else {
                            ?? r3 = ggaVar.c;
                            r3.d("ImageSaverTrace does not match any valid strategy: ".concat(arrayList.toString()));
                            r3.d("Trace = ".concat(kkoVar.toString()));
                            if (ggaVar.d != hbc.RELEASE) {
                                IllegalStateException illegalStateException = new IllegalStateException("Image Saver Trace did not match any valid ImageSaverStrategy: ".concat(kkoVar.toString()));
                                ((out) ggaVar.a).execute(new kdx(illegalStateException, 6, null));
                            }
                        }
                    }
                }
                return;
            case 8:
                NativePortraitPreviewProcessor nativePortraitPreviewProcessor = (NativePortraitPreviewProcessor) obj;
                synchronized (((lgw) this.a).b) {
                    nativePortraitPreviewProcessor.a();
                }
                shl shlVar = shx.a;
                return;
            case 9:
                lrl lrlVar = ((lrj) this.a).a;
                lrlVar.O();
                lrlVar.s.e(lrlVar.f.a);
                return;
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    sgv sgvVar = lwf.a;
                    Context context = ((lwf) this.a).d;
                    Intent intent = new Intent(context, (Class<?>) SidelineInstallerService.class);
                    intent.setAction("com.google.android.apps.camera.sideline.START_UPDATE");
                    context.startForegroundService(intent);
                    return;
                }
                ((sgt) lwf.a.c().M(4464)).u("Not all cameras are available after waiting for %dms. Scheduling update later.", 60000L);
                lwf lwfVar = (lwf) this.a;
                lwfVar.m.a(4);
                lwfVar.o.b(0, 9);
                lwfVar.c();
                return;
            case 11:
                gbv gbvVar = (gbv) obj;
                File file = gbvVar.b;
                mjl mjlVar = (mjl) this.a;
                gfn gfnVar = mjlVar.i;
                gfnVar.c.execute(new gbh(gfnVar, gbvVar, i, bArr));
                mjlVar.D.d();
                mjlVar.W.h(gbvVar, mjlVar.j.a());
                return;
            case 12:
                this.a.a(rwc.j((Boolean) obj));
                return;
            case 13:
                Iterator it2 = DesugarCollections.unmodifiableCollection(((oxd) this.a).c).iterator();
                while (it2.hasNext()) {
                    ((owy) it2.next()).b();
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Iterator it3 = DesugarCollections.unmodifiableCollection(((oxd) this.a).c).iterator();
                while (it3.hasNext()) {
                    ((owy) it3.next()).c();
                }
                return;
            case 15:
                ((oza) this.a).a((oye) obj);
                return;
            case 16:
                final pts ptsVar = (pts) obj;
                try {
                    Object obj5 = this.a;
                    final pun punVar = ((pwo) obj5).c;
                    final clm clmVar = ((pwo) obj5).d;
                    final clr clrVar = ((pwo) obj5).f;
                    final int i5 = ((pwo) obj5).g;
                    final pxu pxuVar = ((pwo) obj5).a;
                    final pwo pwoVar = (pwo) obj5;
                    qsz.l(new sxh() { // from class: pwm
                        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, puo] */
                        @Override // defpackage.sxh
                        public final syu a() {
                            boolean z;
                            pts ptsVar2 = ptsVar;
                            pun punVar2 = punVar;
                            rwc rwcVar2 = punVar2.h;
                            if (rwcVar2.h()) {
                                try {
                                    rwcVar2.c().a(ptsVar2);
                                    z = false;
                                } catch (Exception e) {
                                    qbu.j(e, "%s: Delegate onComplete failed for group %s, showing failure notification.", "DownloadListener", ptsVar2.c);
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            pwo pwoVar2 = pwoVar;
                            if (punVar2.k == 2) {
                                clm clmVar2 = clmVar;
                                clmVar2.b.clear();
                                if (z) {
                                    int i6 = i5;
                                    clr clrVar2 = clrVar;
                                    clmVar2.n = "status";
                                    clmVar2.e(prh.t(pwoVar2.i.a));
                                    clmVar2.g(false);
                                    clmVar2.i(R.drawable.stat_sys_warning);
                                    clmVar2.h(0, 0, false);
                                    clrVar2.a(i6, clmVar2.a());
                                } else {
                                    new clr(pwoVar2.i.a).d.cancel(null, punVar2.a.hashCode());
                                }
                            }
                            pxu pxuVar2 = pxuVar;
                            pwr pwrVar = pwoVar2.i;
                            ((qdc) pwrVar.g.c()).e(punVar2.a);
                            return pwrVar.j.f(pxuVar2.a);
                        }
                    }, ((pwo) obj5).i.f);
                    return;
                } catch (Exception e) {
                    qbu.j(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", ptsVar.c);
                    return;
                }
            default:
                pvl pvlVar = ((qde) this.a).a.c;
                if (pvlVar == null) {
                    pvlVar = pvl.a;
                }
                String str = pvlVar.c;
                int i6 = qbu.a;
                return;
        }
    }
}
