package com.google.android.apps.camera.processing;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.accessibility.AccessibilityManager;
import com.google.ar.core.R;
import defpackage.cyo;
import defpackage.hhr;
import defpackage.ink;
import defpackage.iua;
import defpackage.jiu;
import defpackage.jiv;
import defpackage.jiw;
import defpackage.kee;
import defpackage.lgc;
import defpackage.lji;
import defpackage.llk;
import defpackage.lll;
import defpackage.llm;
import defpackage.llo;
import defpackage.llq;
import defpackage.llr;
import defpackage.nfm;
import defpackage.oui;
import defpackage.out;
import defpackage.par;
import defpackage.pbn;
import defpackage.sod;
import defpackage.sql;
import defpackage.szh;
import defpackage.tpc;
import j$.lang.Iterable$EL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProcessingService extends Service implements llq {
    public static final /* synthetic */ int u = 0;
    private static final long v = TimeUnit.SECONDS.toMillis(60);
    public Notification.Builder a;
    public llr c;
    public llo d;
    public boolean g;
    public boolean h;
    public boolean i;
    public NotificationManager j;
    public llm k;
    public PowerManager l;
    public cyo m;
    public pbn n;
    public out o;
    public Handler p;
    public jiv q;
    public AccessibilityManager r;
    public jiw s;
    public iua t;
    private Thread x;
    private boolean y;
    private final lll w = new lll(this);
    public final Object b = new Object();
    public volatile boolean e = false;
    public final Object f = new Object();

    private final void d() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((llk) ((ink) getApplication()).d(llk.class)).r(this);
        this.j.deleteNotificationChannel("camera");
        Iterator<NotificationChannel> it = this.j.getNotificationChannels().iterator();
        while (it.hasNext()) {
            if ("processing".equals(it.next().getId())) {
                return;
            }
        }
        NotificationChannel notificationChannel = new NotificationChannel("processing", getText(R.string.processing_notification_channel), 2);
        notificationChannel.setShowBadge(false);
        this.j.createNotificationChannel(notificationChannel);
    }

    @Override // defpackage.llq
    public final void a(par parVar) {
        synchronized (this.f) {
            this.a.setProgress(100, parVar.e, false);
        }
        c();
    }

    @Override // defpackage.llq
    public final void b(nfm nfmVar) {
        synchronized (this.f) {
            this.a.setContentText(nfmVar.a(getResources()));
        }
        c();
    }

    public final void c() {
        synchronized (this.f) {
            if (!this.g || this.i) {
                this.h = true;
            } else {
                this.j.notify(2, this.a.build());
                this.g = false;
                this.h = false;
                this.p.postDelayed(new lgc(this, 18), 1000L);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        d();
        super.onCreate();
        synchronized (this.f) {
            this.g = true;
            this.h = false;
            this.i = false;
        }
        this.n.f("ProcessingService#onCreate");
        this.n.f("WakeLock#new");
        llr llrVar = new llr(this.l, v);
        this.c = llrVar;
        llrVar.a("onCreate");
        this.t.b();
        this.n.g();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.PAUSE");
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.RESUME");
        this.m.b(this.w, intentFilter);
        synchronized (this.f) {
            this.a = new Notification.Builder(this, "processing").setSmallIcon(R.drawable.ic_notification).setColor(getResources().getColor(R.color.processing_notification)).setWhen(System.currentTimeMillis()).setOngoing(true).setContentTitle(this.r.isTouchExplorationEnabled() ? "" : getText(R.string.app_name));
        }
        this.n.g();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        szh szhVar;
        this.c.b();
        this.t.c();
        this.m.c(this.w);
        stopForeground(true);
        jiw jiwVar = this.s;
        tpc tpcVarM = sod.a.m();
        tpc tpcVarM2 = sql.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sql sqlVar = (sql) tpcVarM2.b;
        sqlVar.c = 2;
        sqlVar.b = 1 | sqlVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sql sqlVar2 = (sql) tpcVarM2.l();
        sqlVar2.getClass();
        sodVar.av = sqlVar2;
        sodVar.d |= 2097152;
        jiwVar.a((sod) tpcVarM.l());
        llm llmVar = this.k;
        synchronized (llmVar.a) {
            llmVar.f = 3;
            if (llmVar.c) {
                llmVar.c = false;
                llmVar.b();
                szhVar = null;
            } else {
                if (!llmVar.b.isEmpty()) {
                    throw new IllegalStateException("Service destroyed, not restarting but queue has items.");
                }
                szh szhVar2 = llmVar.e;
                llmVar.e = new szh();
                szhVar = szhVar2;
            }
        }
        if (szhVar != null) {
            szhVar.e(Object.class);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Notification notificationBuild;
        d();
        synchronized (this.f) {
            notificationBuild = this.a.build();
        }
        startForeground(2, notificationBuild, 1073741824);
        jiw jiwVar = this.s;
        tpc tpcVarM = sod.a.m();
        tpc tpcVarM2 = sql.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sql sqlVar = (sql) tpcVarM2.b;
        sqlVar.c = 1;
        sqlVar.b |= 1;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sql sqlVar2 = (sql) tpcVarM2.l();
        sqlVar2.getClass();
        sodVar.av = sqlVar2;
        sodVar.d |= 2097152;
        jiwVar.a((sod) tpcVarM.l());
        if (this.x == null) {
            oui ouiVar = new oui(9, new kee(this, new jiu(this.q), 15, null), "CameraProcessingThread");
            this.x = ouiVar;
            ouiVar.start();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        hhr hhrVar = new hhr("Short service timeout.");
        synchronized (this.b) {
            llo lloVar = this.d;
            if (lloVar != null) {
                lloVar.a().b(hhrVar);
            }
        }
        llm llmVar = this.k;
        synchronized (llmVar.a) {
            LinkedList linkedList = llmVar.b;
            Iterable$EL.forEach(linkedList, new lji(hhrVar, 9));
            linkedList.clear();
            llmVar.f = 2;
        }
        jiw jiwVar = this.s;
        tpc tpcVarM = sod.a.m();
        tpc tpcVarM2 = sql.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sql sqlVar = (sql) tpcVarM2.b;
        sqlVar.c = 3;
        sqlVar.b |= 1;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sql sqlVar2 = (sql) tpcVarM2.l();
        sqlVar2.getClass();
        sodVar.av = sqlVar2;
        sodVar.d |= 2097152;
        jiwVar.a((sod) tpcVarM.l());
        stopForeground(1);
        stopSelf();
    }
}
