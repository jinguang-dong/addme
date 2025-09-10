package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.ar.core.R;
import j$.util.DesugarArrays;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gox {
    public final Object a;
    public final Object b;
    public final Object c;

    public gox() {
        throw null;
    }

    public static gpf b(pka pkaVar) {
        return pkaVar == pka.FRONT ? gpf.FRONT_ENUMERATION : gpf.BACK_ENUMERATION;
    }

    public static gpf c(pka pkaVar) {
        return pkaVar == pka.FRONT ? gpf.FRONT_UNOPENABLE : gpf.BACK_UNOPENABLE;
    }

    public final synchronized void A(int i, long j) {
        Object obj = this.a;
        List arrayList = (List) ((SparseArray) obj).get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((SparseArray) obj).put(i, arrayList);
        }
        arrayList.add(Long.valueOf(j));
    }

    public final NotificationChannel B() {
        NotificationManager notificationManager = (NotificationManager) this.c;
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("Sideline");
        if (notificationChannel != null) {
            return notificationChannel;
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("Sideline", ((Context) this.b).getString(R.string.notification_update_channel_name), 3);
        notificationChannel2.setSound(null, null);
        notificationManager.createNotificationChannel(notificationChannel2);
        return notificationChannel2;
    }

    public final void C() {
        String id = B().getId();
        Context context = (Context) this.b;
        Notification.Builder builder = new Notification.Builder(context, id);
        String string = context.getString(R.string.update_failed_notification_title);
        builder.setSmallIcon(R.drawable.ic_notification).setColor(context.getColor(R.color.update_notification_icon_color)).setContentTitle(string).setContentText(context.getString(R.string.update_failed_notification_text)).setContentIntent(PendingIntent.getActivity((Context) ((cxb) this.a).a, 0, new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").addFlags(268435456).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_ISSUE_TITLE", string).putExtra("EXTRA_COMPONENT_ID", 43059L).putExtra("EXTRA_HAPPENED_TIME", System.currentTimeMillis()).putExtra("EXTRA_REQUIRE_BUGREPORT", true), 1140850688)).setAutoCancel(true);
        ((NotificationManager) this.c).notify(70207, builder.build());
    }

    public final void a(gow gowVar) {
        dei.a((dco) this.a, false, true, new dql(this, gowVar, 8));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu d(gpf gpfVar) {
        return ske.Q(new fsu(this, gpfVar, 2), this.a);
    }

    public final void e(pka... pkaVarArr) {
        j((gpf[]) DesugarArrays.stream(pkaVarArr).map(new hci(1)).toArray(new IntFunction() { // from class: gpg
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new gpf[i];
            }
        }));
    }

    public final void f(pka pkaVar) {
        i(b(pkaVar));
    }

    public final void g(pka pkaVar) {
        j(c(pkaVar), gpf.UNOPENABLE);
    }

    public final void h(pka pkaVar) {
        i(c(pkaVar));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void i(gpf gpfVar) {
        this.a.execute(new gbh(this, gpfVar, 13, null));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void j(gpf... gpfVarArr) {
        this.a.execute(new cmc(this, gpfVarArr, 9, null));
    }

    public final Object k() {
        Object obj = this.a;
        obj.getClass();
        if (((AtomicBoolean) this.c).getAndSet(Boolean.TRUE.booleanValue())) {
            return ((qxt) obj).b();
        }
        try {
            Trace.beginSection("Phenotype:" + ((qxt) obj).d());
            return ((qxt) obj).b();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:? -> B:23:0x005b). Please report as a decompilation issue!!! */
    public final synchronized void l() throws Throwable {
        gox goxVar;
        try {
            ?? r1 = this.c;
            hlx.b("sensor", r1);
            for (hlw hlwVar : r1) {
                if (hlwVar.e()) {
                    for (Sensor sensor : hlwVar.f()) {
                        hlwVar.h(sensor);
                        jfb jfbVar = new jfb(hlwVar, 1);
                        ((SensorManager) this.b).registerListener(jfbVar, sensor, 3);
                        goxVar = this;
                        try {
                            this.a.add(new dwq(goxVar, hlwVar, sensor, jfbVar, 6));
                            this = goxVar;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            throw th2;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            goxVar = this;
            Throwable th22 = th;
            throw th22;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized void m() {
        ?? r0 = this.a;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        r0.clear();
    }

    public final float n() {
        return q().a(o());
    }

    public final float o() {
        return ((bbb) this.a).e();
    }

    public final float p() {
        niy niyVarQ = q();
        return niyVarQ.d(niyVarQ.a(o()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bbo, java.lang.Object] */
    public final niy q() {
        return (niy) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azr, java.lang.Object] */
    public final void r(niy niyVar) {
        this.b.b(niyVar);
    }

    public final void s(float f) {
        ((bbb) this.a).i(f);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uiv] */
    public final void t(float f, niz nizVar) {
        nizVar.getClass();
        s(ukc.m(f, 0.0f, 1.0f));
        this.c.a(Float.valueOf(f), true, nizVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, owf] */
    public final spo u() {
        return qpt.bq(((Activity) this.b).isInMultiWindowMode(), ((ktx) this.a).a().e, ((muj) this.c.dL()).b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, pbn] */
    public final mlx v(rwc rwcVar, rwc rwcVar2, owf owfVar, boolean z) {
        boolean zP;
        this.c.f("RoiTracker");
        try {
            if (z) {
                zP = ((hbj) this.b).p(has.e);
            } else {
                zP = ((hbj) this.b).p(has.d);
            }
            boolean z2 = zP;
            Object obj = this.b;
            return new mlo(rwcVar, rwcVar2, ((hbj) obj).p(has.f), ((hbj) obj).f(has.g), ((hbj) obj).f(has.h), z2, (Context) this.a, owfVar);
        } finally {
            this.c.g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    public final synchronized int w() {
        ?? r0 = this.c;
        if (r0.isEmpty()) {
            return 0;
        }
        return ((qec) r0.getLast()).b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    public final synchronized mdr x() {
        qec qecVar;
        long j;
        do {
            ?? r0 = this.c;
            if (r0.isEmpty()) {
                return null;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            qecVar = (qec) r0.removeFirst();
            j = jUptimeMillis - qecVar.a;
        } while (j > 60000);
        mdr mdrVar = new mdr();
        mdrVar.b = qecVar.b;
        mdrVar.a = j;
        return mdrVar;
    }

    public final synchronized List y(int i) {
        List arrayList;
        Object obj = this.a;
        arrayList = (List) ((SparseArray) obj).get(i);
        if (arrayList != null) {
            ((SparseArray) obj).remove(i);
        } else {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Deque] */
    public final synchronized void z(mdm mdmVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long jConvert = TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos, TimeUnit.NANOSECONDS);
        ?? r0 = this.c;
        r0.add(new qec(SystemClock.uptimeMillis(), r0.size()));
        ((mdy) this.b).a(ssc.HDR_PLUS, null, null, null, mdmVar.b());
        mdq mdqVar = ((mdo) mdmVar).o;
        if (mdqVar != null) {
            mdqVar.c = jElapsedRealtimeNanos;
        }
        ((mdo) mdmVar).b = jConvert;
    }

    public gox(Activity activity, ktx ktxVar, owf owfVar) {
        this.b = activity;
        this.a = ktxVar;
        this.c = owfVar;
    }

    public gox(Context context, pbn pbnVar, hbj hbjVar) {
        this.a = context;
        this.c = pbnVar;
        this.b = hbjVar;
    }

    public gox(SharedPreferences sharedPreferences, luj lujVar, owq owqVar) {
        this.c = sharedPreferences;
        this.b = lujVar;
        this.a = owqVar;
    }

    public gox(dco dcoVar) {
        this.a = dcoVar;
        this.b = new goy();
        this.c = new goz();
    }

    public gox(izm izmVar, izc izcVar, izh izhVar) {
        this.c = izmVar;
        this.a = izcVar;
        this.b = izhVar;
    }

    public gox(ogr ogrVar, rnu rnuVar, Runnable runnable) {
        this.b = ogrVar;
        this.c = rnuVar;
        this.a = runnable;
    }

    public gox(ogr ogrVar, rnu rnuVar, Runnable runnable, byte[] bArr) {
        this.b = ogrVar;
        this.c = rnuVar;
        this.a = runnable;
    }

    public gox(float f, niy niyVar, uiv uivVar) {
        niyVar.getClass();
        uivVar.getClass();
        this.c = uivVar;
        this.a = new azv(ukc.m(f, 0.0f, 1.0f));
        this.b = new azz(niyVar, bap.c);
    }

    public gox(Context context, cxb cxbVar) {
        this.b = context;
        this.c = (NotificationManager) context.getSystemService(NotificationManager.class);
        this.a = cxbVar;
    }

    public gox(got gotVar, CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, Executor executor) {
        this.b = gotVar;
        this.c = cameraFatalErrorTrackerDatabase;
        this.a = executor;
        gzi gziVar = gzo.a;
    }

    public gox(uem uemVar, uem uemVar2, uem uemVar3) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
    }

    public gox(mdy mdyVar) {
        this.c = new ArrayDeque();
        this.a = new SparseArray();
        this.b = mdyVar;
    }

    public gox(boolean z, qxt qxtVar) {
        this(Boolean.valueOf(z), qxtVar);
    }

    public gox(Object obj, qxt qxtVar) {
        this.c = new AtomicBoolean(false);
        this.b = obj;
        this.a = qxtVar;
    }

    public gox(byte[] bArr) {
        this.c = new ovx(false);
        this.b = new ovx(false);
        this.a = new ovx(false);
    }

    public /* synthetic */ gox(uiv uivVar, int i) {
        this(1 != (i & 1) ? 0.0f : 0.5f, (i & 2) != 0 ? new niy((byte[]) (0 == true ? 1 : 0)) : null, (i & 4) != 0 ? new uiv() { // from class: nix
            @Override // defpackage.uiv
            public final Object a(Object obj, Object obj2, Object obj3) {
                ((Float) obj).floatValue();
                ((Boolean) obj2).booleanValue();
                ((niz) obj3).getClass();
                return ufg.a;
            }
        } : uivVar);
    }

    public gox(SensorManager sensorManager, Set set) {
        this.a = new ArrayList();
        this.b = sensorManager;
        this.c = hlx.a(set);
    }

    public gox(ixt ixtVar, jgt jgtVar, ins insVar, fdq fdqVar) {
        ixtVar.getClass();
        jgtVar.getClass();
        insVar.getClass();
        fdqVar.getClass();
        this.c = ixtVar;
        this.a = jgtVar;
        this.b = fdqVar;
    }
}
