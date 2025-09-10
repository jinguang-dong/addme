package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ozi implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ozi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.b) {
            case 0:
                Iterator it = ((ozk) this.a).d.values().iterator();
                while (it.hasNext()) {
                    ((oyi) it.next()).l();
                }
                return null;
            case 1:
                ozk ozkVar = (ozk) this.a;
                oys oysVar = ozkVar.k;
                if (oysVar != null) {
                    oysVar.f();
                    ges gesVar = ozkVar.l;
                    if (gesVar != null) {
                        gesVar.b(ozkVar.h);
                    }
                }
                return null;
            case 2:
                Object obj = this.a;
                synchronized (((ozv) obj).a) {
                    int i = ((ozv) obj).c;
                    if (i != 2) {
                        Log.e("VidRecMedRec", "STARTED is expected but we get " + prh.P(i));
                    } else {
                        ((ozv) obj).b.c();
                        ((ozv) obj).c = 4;
                    }
                }
                return null;
            case 3:
                Object obj2 = this.a;
                synchronized (((ozv) obj2).a) {
                    int i2 = ((ozv) obj2).c;
                    if (i2 != 4) {
                        Log.e("VidRecMedRec", "PAUSED is expected but we get " + prh.P(i2));
                    } else {
                        ((ozv) obj2).c = 4;
                        ((ozv) obj2).b.g();
                    }
                }
                return null;
            case 4:
                return (pdo) ((swn) ((pgt) this.a).a).s();
            case 5:
                return (pdo) ((swn) this.a).s();
            case 6:
                return (pdo) ((swn) ((pgt) this.a).a).s();
            case 7:
                pwr pwrVar = (pwr) this.a;
                rwc rwcVar = pwrVar.c;
                if (rwcVar.h()) {
                    qat qatVar = (qat) rwcVar.c();
                    sbr sbrVar = new sbr();
                    puu puuVar = pwrVar.e;
                    sbrVar.f("MDD.CHARGING.PERIODIC.TASK", prh.x(puuVar.w()));
                    sbrVar.f("MDD.MAINTENANCE.PERIODIC.GCM.TASK", prh.x(puuVar.v()));
                    sbrVar.f("MDD.CELLULAR.CHARGING.PERIODIC.TASK", prh.x(puuVar.u()));
                    sbrVar.f("MDD.WIFI.CHARGING.PERIODIC.TASK", prh.x(puuVar.x()));
                    sbv sbvVarB = sbrVar.b();
                    qatVar.c("MDD.CHARGING.PERIODIC.TASK", puuVar.r(), 3, pwr.n(sbvVarB, yoGAhrpjU.dZobXeFHe));
                    qatVar.c("MDD.MAINTENANCE.PERIODIC.GCM.TASK", puuVar.s(), 3, pwr.n(sbvVarB, "MDD.MAINTENANCE.PERIODIC.GCM.TASK"));
                    qatVar.c("MDD.CELLULAR.CHARGING.PERIODIC.TASK", puuVar.q(), 1, pwr.n(sbvVarB, "MDD.CELLULAR.CHARGING.PERIODIC.TASK"));
                    qatVar.c("MDD.WIFI.CHARGING.PERIODIC.TASK", puuVar.t(), 2, pwr.n(sbvVarB, "MDD.WIFI.CHARGING.PERIODIC.TASK"));
                } else {
                    qbu.c("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                }
                return null;
            case 8:
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    pvk pvkVar = (pvk) ske.U((syu) it2.next());
                    if (pvkVar != pvk.NONE && pvkVar != pvk.SUBSCRIBED) {
                        return false;
                    }
                }
                return true;
            case 9:
                ptv.b(this.a, "Failed to add file groups", new Object[0]);
                return null;
            case 10:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            case 11:
                Object obj3 = this.a;
                int i3 = rbu.a;
                return clu.c((Context) obj3);
            case 12:
                int i4 = rbu.a;
                return ((Context) this.a).getExternalCacheDirs();
            case 13:
                rdf rdfVar = (rdf) this.a;
                return Long.valueOf(rdfVar.f.k(rdfVar.b));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                reh rehVar = (reh) this.a;
                Set<String> setKeySet = rehVar.e.getAll().keySet();
                SharedPreferences.Editor editorEdit = rehVar.e.edit();
                Iterator<String> it3 = setKeySet.iterator();
                while (it3.hasNext()) {
                    editorEdit.remove(it3.next());
                }
                if (editorEdit.commit()) {
                    return null;
                }
                throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(rehVar.c)));
            case 15:
                reh rehVar2 = (reh) this.a;
                rehVar2.e = rehVar2.a.getSharedPreferences(rehVar2.c, 0);
                return Boolean.valueOf(!rehVar2.e.getAll().isEmpty());
            default:
                Object obj4 = this.a;
                synchronized (((rem) obj4).b.c) {
                    ((rem) obj4).a = null;
                }
                return null;
        }
    }
}
