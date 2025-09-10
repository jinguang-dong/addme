package com.google.android.apps.camera.legacy.app.app;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Trace;
import android.widget.Toast;
import com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent;
import com.google.ar.core.R;
import defpackage.cxb;
import defpackage.dvr;
import defpackage.dvs;
import defpackage.ezh;
import defpackage.fqi;
import defpackage.fql;
import defpackage.fqn;
import defpackage.fqs;
import defpackage.frp;
import defpackage.frt;
import defpackage.fsr;
import defpackage.fvq;
import defpackage.gno;
import defpackage.gsn;
import defpackage.gtm;
import defpackage.gzi;
import defpackage.gzo;
import defpackage.hbj;
import defpackage.hbl;
import defpackage.hbp;
import defpackage.hco;
import defpackage.ink;
import defpackage.inm;
import defpackage.ins;
import defpackage.ioo;
import defpackage.iso;
import defpackage.iyd;
import defpackage.izb;
import defpackage.izm;
import defpackage.izn;
import defpackage.jaj;
import defpackage.jak;
import defpackage.jea;
import defpackage.jhm;
import defpackage.jod;
import defpackage.jui;
import defpackage.kud;
import defpackage.kue;
import defpackage.mcw;
import defpackage.mel;
import defpackage.mhv;
import defpackage.ocq;
import defpackage.ojl;
import defpackage.out;
import defpackage.pav;
import defpackage.paw;
import defpackage.paz;
import defpackage.pba;
import defpackage.pbb;
import defpackage.pbc;
import defpackage.pbe;
import defpackage.pfl;
import defpackage.qnc;
import defpackage.qpt;
import defpackage.qqe;
import defpackage.qqx;
import defpackage.qui;
import defpackage.qxe;
import defpackage.qxf;
import defpackage.rbg;
import defpackage.rcf;
import defpackage.rnt;
import defpackage.rnu;
import defpackage.rwc;
import defpackage.sbp;
import defpackage.sbv;
import defpackage.scf;
import defpackage.sex;
import defpackage.sfc;
import defpackage.sgk;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.syu;
import defpackage.syx;
import defpackage.tat;
import defpackage.tzk;
import defpackage.tzn;
import defpackage.tzo;
import defpackage.tzu;
import defpackage.tzx;
import defpackage.uem;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraApp extends jhm implements HasCameraContentProviderComponent, tzo, jak, mhv, ink, fqs, fsr, qxe, dvr {
    private static final sgv n;
    private static final AtomicBoolean o;
    NotificationManager a;
    uem b;
    uem c;
    qnc d;
    rbg e;
    public syx f;
    jui g;
    fql h;
    public hbj i;
    gtm j;
    cxb k;
    private final izb p = new izb();
    private volatile izm q;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        qui quiVar = qui.a;
        if (quiVar.b == null) {
            quiVar.b = qqx.a();
        }
        mel.e(l);
        sbp sbpVar = ioo.a;
        synchronized (paw.a) {
            sgk it = sbpVar.iterator();
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                String str = (String) paw.c.put(cls, "gcastartup");
                if (str != null && !str.equals("gcastartup")) {
                    throw new UnsatisfiedLinkError("Could not register " + String.valueOf(cls) + ". It was previously registered with: " + str);
                }
                pav pavVar = (pav) paw.b.get("gcastartup");
                if (pavVar == null) {
                    paw.b.put("gcastartup", new pav("gcastartup"));
                } else if (pavVar.a()) {
                    throw new UnsatisfiedLinkError(String.format(null, "Registering \"%s\" after \"%s\" was loaded is racy.", cls.getSimpleName(), "gcastartup"));
                }
            }
        }
        n = sgv.g("com.google.android.apps.camera.legacy.app.app.CameraApp");
        o = new AtomicBoolean(false);
    }

    private final tat i() {
        Context applicationContext = getApplicationContext();
        iyd iydVar = new iyd(new rnu(this, null), 7);
        applicationContext.getClass();
        return new tat(applicationContext, iydVar, 1);
    }

    @Override // defpackage.dvr
    public final dvs a() {
        scf scfVar = new scf();
        jui juiVar = this.g;
        juiVar.getClass();
        scfVar.a = juiVar;
        return new dvs(scfVar);
    }

    @Override // defpackage.fqs
    public final gno b() throws IOException {
        try {
            String[] list = getApplicationContext().getAssets().list("camera_vkp");
            if (list == null || list.length == 0) {
                Toast.makeText(this, R.string.invalid_apk_version, 0).show();
                ((sgt) n.b().M(2566)).s("Cannot start the Google Camera App since only the base APK split was detected");
                System.exit(0);
            }
        } catch (IOException unused) {
            System.exit(0);
        }
        this.p.b(this);
        return g().b();
    }

    @Override // defpackage.fsr
    public final syu c() {
        return this.p.a();
    }

    @Override // com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent
    public final hbl cameraContentProviderComponent(hbp hbpVar) {
        rnt.w(this.q, "initAppComponent needs to be called on main thread¬", new Object[0]);
        izm izmVar = this.q;
        hbpVar.getClass();
        return new izn(izmVar.a, hbpVar);
    }

    @Override // defpackage.ink
    public final inm d(Class cls) {
        return (inm) cls.cast(g());
    }

    @Override // defpackage.qxe
    public final rwc e() {
        Context context = qxf.a;
        rcf rcfVar = new rcf();
        rcfVar.f = this;
        rcfVar.a = new fvq(this, 4);
        return rwc.j(rcfVar.a());
    }

    @Override // defpackage.tzo
    public final tzk f() {
        return new tzn(sfc.a, sbv.n("com.google.android.libraries.mdi.download.foreground.dagger.ForegroundDownloadService", g().jk));
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, uem] */
    @Override // defpackage.jak
    public final izm g() {
        if (this.q == null) {
            synchronized (this) {
                if (this.q == null) {
                    Trace.beginSection("GCA_App#component");
                    Trace.beginSection("GCA_App#buildComponent");
                    tzx tzxVar = jaj.a;
                    iso isoVar = new iso((Application) this, getApplicationContext());
                    byte[] bArr = null;
                    this.q = new izm(new ezh((byte[]) null), new jea(), new ins(), new pfl(this.m), isoVar, new qpt(bArr), new gsn(), new gsn(), new frp(), new cxb((boolean[]) null), new ins(), new qpt(bArr), new ocq((int[]) null), new ojl(), new qpt(bArr), new gsn(), new ojl());
                    Trace.endSection();
                    Trace.beginSection("GCA_App#initialize");
                    izm izmVar = this.q;
                    Trace.beginSection("GCA_App#inject");
                    hbj hbjVar = (hbj) izmVar.o.a();
                    gsn gsnVar = izmVar.za;
                    pbb pbbVarC = hco.c(pba.c(rwc.j((pbc) izmVar.U.a())));
                    this.k = new cxb(hbjVar, pbbVarC);
                    this.a = izmVar.g();
                    this.j = new gtm((hbj) izmVar.o.a(), izmVar.Y, izmVar.ab, izmVar.ad, izmVar.ae, izmVar.ah);
                    this.b = izmVar.ai;
                    this.c = izmVar.O;
                    this.d = (qnc) izmVar.eL.a();
                    this.i = (hbj) izmVar.o.a();
                    this.e = (rbg) izmVar.eW.a();
                    this.f = frt.c((ScheduledExecutorService) izmVar.j.a());
                    this.g = new jui((qqe) ((tzu) izmVar.eX).a);
                    this.h = (fql) izmVar.aa.a();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#PrimesInitialize");
                    this.d.a.a();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#PrimesMemoryMonitor");
                    this.d.a.c();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#strictMode");
                    Object obj = this.k.a;
                    gzi gziVar = gzo.a;
                    Trace.endSection();
                    Trace.beginSection("GCA_App#startAsync");
                    gtm gtmVar = this.j;
                    Trace.beginSection("appStartup.start");
                    sbp sbpVarN = sbp.n(gtmVar.d, gtmVar.a, gtmVar.c);
                    int i = ((sex) sbpVarN).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((mcw) ((uem) sbpVarN.get(i2)).a()).run();
                    }
                    Object obj2 = gtmVar.e;
                    ((kud) gtmVar.b.a()).run();
                    ((kue) gtmVar.f.a()).run();
                    Trace.endSection();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#cancelNotifications");
                    this.a.cancelAll();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                    this.h.a(new fqn(this.c, this.b));
                    Thread.setDefaultUncaughtExceptionHandler(new fqi(this.h, Thread.getDefaultUncaughtExceptionHandler()));
                    this.d.a.b();
                    Logger logger = paz.b;
                    pbe pbeVar = pbe.a;
                    logger.addHandler(pbeVar);
                    paz.a.addHandler(pbeVar);
                    paz.c.addHandler(pbeVar);
                    paz.d.addHandler(pbeVar);
                    Trace.endSection();
                    Trace.endSection();
                    Trace.endSection();
                }
            }
        }
        return this.q;
    }

    @Override // defpackage.mhv
    public final jod h(jea jeaVar) {
        return g().h(jeaVar);
    }

    @Override // com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent
    public final void initAppComponent() {
        out.a();
        g();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // defpackage.jhm, android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.legacy.app.app.CameraApp.onCreate():void");
    }
}
