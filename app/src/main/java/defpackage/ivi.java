package defpackage;

import android.content.res.AssetFileDescriptor;
import android.widget.CheckBox;
import com.google.ar.core.R;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivi implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, may] */
    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r1v4, types: [sgt, shi] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                try {
                    hbp hbpVar = ((ivo) obj).s;
                    AssetFileDescriptor assetFileDescriptorS = hbpVar.s((String) hbpVar.c);
                    try {
                        assetFileDescriptorS = hbpVar.s((String) hbpVar.b);
                        try {
                            pbn pbnVar = ((ivo) obj).i;
                            pbnVar.f("MotionBlur#initialize");
                            pjp pjpVar = ((ivo) obj).f;
                            List listG = pjpVar.g();
                            pas pasVar = new pas(0, 0);
                            Iterator it = listG.iterator();
                            while (it.hasNext()) {
                                pjo pjoVarA = pjpVar.a((pjr) it.next());
                                pasVar = ivo.i(pasVar, pjoVarA);
                                if (pjoVarA.M() && pjoVarA.D()) {
                                    Iterator it2 = ((pjn) pjoVarA).b.iterator();
                                    while (it2.hasNext()) {
                                        pasVar = ivo.i(pasVar, pjpVar.a((pjr) it2.next()));
                                    }
                                }
                            }
                            lge lgeVar = ((ivo) obj).p;
                            if (lgeVar.a() == 0) {
                                pbnVar.f("PortraitSegmenter#init");
                                lgeVar.b();
                                pbnVar.g();
                            }
                            boolean zP = ((ivo) obj).r.p(hab.h);
                            int fd = assetFileDescriptorS.getParcelFileDescriptor().getFd();
                            long startOffset = assetFileDescriptorS.getStartOffset();
                            long length = assetFileDescriptorS.getLength();
                            int fd2 = assetFileDescriptorS.getParcelFileDescriptor().getFd();
                            long startOffset2 = assetFileDescriptorS.getStartOffset();
                            long length2 = assetFileDescriptorS.getLength();
                            ivt ivtVar = ((ivo) obj).c;
                            int i = pasVar.a;
                            int i2 = pasVar.b;
                            tbu tbuVar = ((ivo) obj).g;
                            rwc rwcVar = ((ivo) obj).j;
                            ivtVar.d(i, i2, tbuVar, rwcVar.h() ? ((File) rwcVar.c()).getAbsolutePath() : "", lgeVar.a(), ((ivo) obj).d, ((ivo) obj).o, zP, fd, startOffset, length, fd2, startOffset2, length2);
                            pbnVar.g();
                            ivtVar.e();
                            ((ivo) obj).e.a(true);
                            if (assetFileDescriptorS != null) {
                                assetFileDescriptorS.close();
                            }
                            if (assetFileDescriptorS != null) {
                                assetFileDescriptorS.close();
                                return;
                            }
                            return;
                        } finally {
                            if (assetFileDescriptorS == null) {
                                throw th;
                            }
                            try {
                                assetFileDescriptorS.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } catch (Throwable th2) {
                        if (assetFileDescriptorS != null) {
                            try {
                                assetFileDescriptorS.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    }
                } catch (IOException e) {
                    ((sgt) ((sgt) ivo.a.b().i(e)).M((char) 2361)).s("Unable to get model asset file");
                    return;
                } catch (IllegalStateException e2) {
                    ((sgt) ((sgt) ivo.a.b().i(e2)).M((char) 2362)).s("Error initializing processor.");
                    return;
                }
            case 1:
                Object obj2 = this.a;
                synchronized (obj2) {
                    ((ivb) obj2).g = null;
                }
                return;
            case 2:
                ((ivo) this.a).e.a(true);
                return;
            case 3:
                this.a.run();
                return;
            case 4:
                ((ivw) this.a).c(true);
                return;
            case 5:
                Object obj3 = this.a;
                try {
                    szh szhVar = ((ivw) obj3).c;
                    if (szhVar.isDone() || ((ivw) obj3).f) {
                        ((sgt) ivx.a.c().M(2414)).t("Cannot execute, already done %s", ((ivw) obj3).d);
                        return;
                    }
                    ((ivw) obj3).e = ((ivw) obj3).g.e.a("MotionBlur#task-" + ((ivw) obj3).d);
                    ((ivw) obj3).b.run();
                    szhVar.e(true);
                    return;
                } catch (Throwable th4) {
                    ivw ivwVar = (ivw) obj3;
                    ivwVar.e();
                    ((sgt) ivx.a.c().M(2415)).t("Error executing task: %s", ivwVar.d);
                    ivwVar.c.a(th4);
                    ivwVar.a.a(th4);
                    return;
                }
            case 6:
                ((ivw) this.a).f = true;
                return;
            case 7:
                ((sgt) ivz.a.c().M(2434)).v("onPslDone: %s not executed", this.a);
                return;
            case 8:
                ((ivq) this.a).d();
                return;
            case 9:
                ((iwj) this.a).a.b(nkw.ACTION_PAN);
                return;
            case 10:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.close();
                    return;
                }
                return;
            case 11:
                ((nqp) ((iyu) this.a).E.a()).o();
                return;
            case 12:
                ((nqp) ((iyu) this.a).E.a()).p();
                return;
            case 13:
                ?? r02 = this.a;
                ((mac) ((iyq) r02).a.m.c()).g(r02);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((nkm) ((jam) this.a).a.a()).a();
                return;
            case 15:
                Object obj4 = this.a;
                gnt gntVar = ((jbc) obj4).i;
                gntVar.h(new img(obj4, gntVar.a(), 7));
                return;
            case 16:
                jbc jbcVar = (jbc) this.a;
                jbcVar.R.d(jbcVar.aq, jbcVar.O);
                return;
            case 17:
                ((jaw) this.a).c.k(true);
                return;
            case 18:
                ((jax) this.a).a.k(true);
                return;
            case 19:
                jbc jbcVar2 = ((jbb) this.a).a;
                jbcVar2.H();
                if (((jms) jbcVar2.o.a()).k) {
                    return;
                }
                jbcVar2.ao.c(R.raw.camera_shutter);
                return;
            default:
                jbe jbeVar = (jbe) this.a;
                jbc jbcVar3 = (jbc) jbeVar.a.a();
                jbcVar3.S.a(false);
                hie hieVar = jbcVar3.al;
                if (hieVar != null) {
                    CheckBox checkBox = hieVar.p;
                    rnt.w(checkBox, "EvCompViewController must be first initialized", new Object[0]);
                    checkBox.setEnabled(true);
                }
                jbcVar3.v.c();
                rwc rwcVar2 = jbcVar3.q;
                if (rwcVar2.h()) {
                    rwc rwcVar3 = ((fty) rwcVar2.c()).b;
                    if (rwcVar3.h()) {
                        ((ftv) rwcVar3.c()).k();
                        ((ftv) rwcVar3.c()).g();
                    }
                    ((fty) rwcVar2.c()).k();
                }
                rwc rwcVar4 = jbcVar3.p;
                if (rwcVar4.h()) {
                    ((mhe) rwcVar4.c()).o(false);
                    ((mhe) rwcVar4.c()).s();
                    ((mhe) rwcVar4.c()).m(rvk.a);
                }
                if (jbcVar3.aA.p(gzo.bJ)) {
                    jbcVar3.au.h(jbcVar3);
                }
                if (((Boolean) jbcVar3.U.b.dL()).booleanValue()) {
                    jbcVar3.f.j();
                }
                jbcVar3.h.d(true);
                jbcVar3.l.m(true);
                jbcVar3.an.K.f();
                jbcVar3.as.i();
                jbcVar3.at.h(imk.FIRST_RUN_TOAST);
                jbcVar3.ac.d(true);
                jbcVar3.y.m();
                rwc rwcVar5 = jbcVar3.ag;
                if (rwcVar5.h()) {
                    ((hko) rwcVar5.c()).g();
                }
                jbeVar.c = true;
                jbeVar.b.a();
                return;
        }
    }
}
