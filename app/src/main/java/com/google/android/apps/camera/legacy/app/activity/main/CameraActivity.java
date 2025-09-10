package com.google.android.apps.camera.legacy.app.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.ar.core.R;
import defpackage.dx;
import defpackage.fdi;
import defpackage.fdo;
import defpackage.fnf;
import defpackage.fqg;
import defpackage.gox;
import defpackage.gzi;
import defpackage.gzo;
import defpackage.hbj;
import defpackage.hfq;
import defpackage.imo;
import defpackage.inl;
import defpackage.inm;
import defpackage.iso;
import defpackage.ixt;
import defpackage.iyc;
import defpackage.iyf;
import defpackage.izc;
import defpackage.izh;
import defpackage.izm;
import defpackage.jgo;
import defpackage.luj;
import defpackage.mdz;
import defpackage.mec;
import defpackage.med;
import defpackage.mej;
import defpackage.mel;
import defpackage.ngw;
import defpackage.nnx;
import defpackage.ocq;
import defpackage.out;
import defpackage.pbn;
import defpackage.pci;
import defpackage.pnq;
import defpackage.pql;
import defpackage.qpt;
import defpackage.qqx;
import defpackage.que;
import defpackage.qui;
import defpackage.rcc;
import defpackage.rnn;
import defpackage.tzx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraActivity extends ixt implements inl, fdi {
    private izc A;
    private izh B;
    public hfq s;
    public med t;
    public luj u;
    public hbj v;
    public rnn w;
    private CameraActivityTiming z;

    static {
        qui quiVar = qui.a;
        que queVar = quiVar.n;
        qqx qqxVarA = qqx.a();
        qqx qqxVar = queVar.b;
        if (!rcc.e() || quiVar.b == null) {
            return;
        }
        long j = qqxVarA.a;
        if (j <= SystemClock.elapsedRealtime()) {
            if ((qqxVar == null || j <= qqxVar.a) && quiVar.g == null) {
                quiVar.g = qqxVarA;
            }
        }
    }

    @Override // defpackage.fdi
    public final luj a() {
        return this.u;
    }

    @Override // defpackage.fdi
    public final hbj b() {
        return this.v;
    }

    @Override // defpackage.inl
    public final inm c(Class cls) {
        return (inm) cls.cast(this.A);
    }

    @Override // defpackage.inl
    public final inm d(Class cls) {
        return (inm) cls.cast(this.B);
    }

    @Override // defpackage.ixt, defpackage.jhl, defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        q().f("CameraActivity#onCreate");
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        super.onCreate(bundle);
        izm izmVarG = ((CameraApp) getApplicationContext()).g();
        ((ixt) this).o = (pbn) izmVarG.k.a();
        ((ixt) this).r = (fqg) izmVarG.gT.a();
        ((ixt) this).p = jgo.c(izmVarG.zf);
        ((ixt) this).q = (pnq) izmVarG.b.a();
        this.t = (med) izmVarG.gX.a();
        this.v = (hbj) izmVarG.o.a();
        this.u = (luj) izmVarG.eZ.a();
        this.w = (rnn) izmVarG.am.a();
        tzx tzxVar = izmVarG.db;
        pci pciVar = (pci) izmVarG.gZ.a();
        iso isoVar = izmVarG.yV;
        this.s = new hfq(pciVar, iso.b());
        med medVar = this.t;
        mdz mdzVar = medVar.a;
        Instrumentation instrumentation = medVar.d;
        pql pqlVar = medVar.b;
        pbn pbnVar = medVar.c;
        int i = mdzVar.a;
        mdzVar.a = i + 1;
        mec mecVar = new mec(i, mdzVar.b);
        CameraActivityTiming cameraActivityTiming = new CameraActivityTiming((mecVar.b || mecVar.a != 0) ? jElapsedRealtimeNanos : mel.d().m, pqlVar, mecVar, pbnVar);
        instrumentation.f(cameraActivityTiming);
        this.z = cameraActivityTiming;
        cameraActivityTiming.recordActivityOnCreateStart(jElapsedRealtimeNanos);
        hfq hfqVar = this.s;
        String string = toString();
        out.a();
        if (hfqVar.c == null) {
            hfqVar.c = hfqVar.a.b("CameraActivity onCreate: ".concat(String.valueOf(string)));
        }
        hfqVar.b.postDelayed(new fnf(hfqVar, 20), 3000L);
        gzi gziVar = gzo.a;
        CameraActivityTiming cameraActivityTiming2 = this.z;
        q().f("setupDefaultActivity#init");
        gox goxVarS = s();
        iso isoVarR = r();
        ocq ocqVar = new ocq(cameraActivityTiming2);
        goxVarS.getClass();
        isoVarR.getClass();
        this.A = new izc(izmVarG.a, goxVarS, isoVarR, ocqVar);
        q().h("activityInitializer#get");
        iyc iycVar = (iyc) this.A.bE.a();
        q().h("activityInitializer#start");
        iycVar.b();
        q().h("cameraUiModule#inflate");
        izc izcVar = this.A;
        iso isoVar2 = izcVar.eu;
        dx dxVarC = isoVar2.c();
        nnx nnxVar = new nnx(isoVar2.b, 1);
        Window windowC = imo.c(isoVar2);
        pbn pbnVar2 = (pbn) izcVar.a.k.a();
        LayoutInflater layoutInflater = dxVarC.getLayoutInflater();
        out.a();
        WindowManager.LayoutParams attributes = windowC.getAttributes();
        attributes.rotationAnimation = 3;
        attributes.layoutInDisplayCutoutMode = 3;
        windowC.setAttributes(attributes);
        windowC.addFlags(Integer.MIN_VALUE);
        windowC.setBackgroundDrawable(null);
        windowC.getDecorView().setPadding(0, 0, 0, 0);
        ((Activity) nnxVar.a).setContentView(R.layout.activity_main);
        ngw ngwVar = new ngw(new ocq(nnxVar), pbnVar2);
        ((ViewStub) ngwVar.a).inflate();
        ((ViewStub) ngwVar.b).inflate();
        ocq ocqVar2 = new ocq(layoutInflater, ngwVar);
        q().h("activityUiInitializer#get");
        izc izcVar2 = this.A;
        izh izhVar = new izh(izcVar2.a, izcVar2.b, ocqVar2);
        this.B = izhVar;
        iyf iyfVar = (iyf) izhVar.ny.a();
        q().h("activityUiInitializer#start");
        iyfVar.b();
        q().g();
        if (!t() && !isVoiceInteractionRoot()) {
            fdo.e(getIntent());
        }
        setRecentsScreenshotEnabled(false);
        this.z.l(mej.ACTIVITY_ONCREATE_END, CameraActivityTiming.b);
        q().g();
    }

    @Override // defpackage.ixt, defpackage.jhl, defpackage.dx, defpackage.bp, android.app.Activity
    protected final void onDestroy() {
        hfq hfqVar = this.s;
        out.a();
        hfqVar.b();
        super.onDestroy();
    }

    @Override // defpackage.ixt, defpackage.jhl, defpackage.nh, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        if (!t() || !isVoiceInteractionRoot()) {
            fdo.e(intent);
        }
        super.onNewIntent(intent);
    }

    @Override // defpackage.ixt, defpackage.jhl, defpackage.bp, android.app.Activity
    protected void onPause() {
        if (this.v.p(gzo.bH)) {
            this.s.c();
        }
        super.onPause();
    }

    @Override // defpackage.ixt, defpackage.jhl, defpackage.bp, android.app.Activity
    protected final void onResume() {
        this.z.l(mej.ACTIVITY_ONRESUME_START, CameraActivityTiming.a);
        if (this.v.p(gzo.bH)) {
            this.s.a(toString());
        }
        super.onResume();
        this.z.l(mej.j, CameraActivityTiming.b);
        qpt.cs(this.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    @Override // defpackage.ixt, defpackage.jhl, defpackage.dx, defpackage.bp, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onStart() {
        /*
            r8 = this;
            com.google.android.apps.camera.stats.timing.CameraActivityTiming r0 = r8.z
            pqm r1 = r0.l
            long r1 = r1.a()
            mec r3 = r0.c
            int r4 = r3.c
            r5 = 1
            int r4 = r4 + r5
            r3.c = r4
            int r3 = r3.a()
            r4 = 4
            if (r3 != r4) goto L4a
            r0.c()
            pbn r3 = r0.d
            java.lang.String r4 = "FirstPreviewFrame"
            pbp r4 = r3.a(r4)
            r0.e = r4
            java.lang.String r4 = "FirstFrameReceived"
            pbp r4 = r3.a(r4)
            r0.f = r4
            java.lang.String r4 = "ShutterButtonEnabled"
            pbp r3 = r3.a(r4)
            r0.g = r3
            mej[] r3 = defpackage.mej.values()
            int r4 = r3.length
            r5 = 0
        L3a:
            if (r5 >= r4) goto L4c
            r6 = r3[r5]
            boolean r7 = r6.w
            if (r7 == 0) goto L47
            mew r7 = com.google.android.apps.camera.stats.timing.CameraActivityTiming.k
            r0.m(r6, r1, r7)
        L47:
            int r5 = r5 + 1
            goto L3a
        L4a:
            if (r3 == r5) goto L4e
        L4c:
            qpt r3 = r0.p
        L4e:
            mej r3 = defpackage.mej.ACTIVITY_ONSTART_START
            mew r4 = com.google.android.apps.camera.stats.timing.CameraActivityTiming.a
            r0.m(r3, r1, r4)
            rnn r0 = r8.w
            paq r0 = r0.c()
            hbj r1 = r8.v
            gzg r2 = defpackage.gzo.bH
            boolean r1 = r1.p(r2)
            if (r1 != 0) goto L6e
            hfq r1 = r8.s
            java.lang.String r2 = r8.toString()
            r1.a(r2)
        L6e:
            super.onStart()
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.legacy.app.activity.main.CameraActivity.onStart():void");
    }

    @Override // defpackage.ixt, defpackage.jhl, defpackage.dx, defpackage.bp, android.app.Activity
    protected final void onStop() {
        if (!this.v.p(gzo.bH)) {
            this.s.c();
        }
        super.onStop();
    }

    protected boolean t() {
        return false;
    }
}
