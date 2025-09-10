package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qwl implements rvu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qwl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ qwl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, slj] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            qwa qwaVar = (qwa) obj;
            tpc tpcVar = (tpc) qwaVar.a(5, null);
            tpcVar.r(qwaVar);
            tpe tpeVar = (tpe) tpcVar;
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            Object obj2 = this.b;
            Object obj3 = this.a;
            qwa qwaVar2 = (qwa) tpeVar.b;
            qwa qwaVar3 = qwa.a;
            obj2.getClass();
            qwaVar2.c = (uzu) obj2;
            qwaVar2.b |= 1;
            qwa qwaVar4 = (qwa) tpeVar.l();
            qwm qwmVar = (qwm) obj3;
            String[] strArr = {qwmVar.e.getClass().getName()};
            Intent intent = new Intent();
            Context context = qwmVar.a;
            intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
            intent.setPackage(context.getPackageName());
            intent.putExtra(HHdu.afxnL, strArr);
            intent.putExtra("MetricSnapshot", qwaVar4.h());
            context.sendBroadcast(intent);
            return null;
        }
        if (i == 1) {
            int i2 = 0;
            uxk uxkVar = (uxk) ((sbp) this.b).get(0);
            while (true) {
                Object obj4 = this.a;
                if (((SharedPreferences) ((qsg) obj4).f.a()).edit().putString("lastExitProcessName", uxkVar.c).putLong("lastExitTimestamp", uxkVar.g).commit()) {
                    break;
                }
                i2++;
                if (i2 >= 3) {
                    ((sgt) qnj.a.c().M(5740)).s("Failed to persist most recent App Exit");
                    break;
                }
            }
            return null;
        }
        if (i == 2) {
            return (qzf) ((qzg) this.b).a.e.get(new rwd((String) obj, ((oca) this.a).g));
        }
        if (i != 3) {
            if (i == 4) {
                return qas.e((pxn) obj, (Uri) this.a, rwc.j(this.b));
            }
            String strValueOf = String.valueOf(String.valueOf(this.a));
            String strValueOf2 = String.valueOf((String) obj);
            return ((qas) this.b).b.b(strValueOf.concat(strValueOf2), StandardCharsets.UTF_8).toString();
        }
        qyt qytVar = (qyt) obj;
        int i3 = qzu.a;
        Object obj5 = this.a;
        qyr qyrVar = qyr.a;
        obj5.getClass();
        tqm tqmVar = qytVar.b;
        if (tqmVar.containsKey(obj5)) {
            qyrVar = (qyr) tqmVar.get(obj5);
        }
        Object obj6 = this.b;
        tpc tpcVar2 = (tpc) qyrVar.a(5, null);
        tpcVar2.r(qyrVar);
        if (!DesugarCollections.unmodifiableList(((qyr) tpcVar2.b).c).contains(obj6)) {
            tpcVar2.H((String) obj6);
        }
        tpc tpcVar3 = (tpc) qytVar.a(5, null);
        tpcVar3.r(qytVar);
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        qyr qyrVar2 = (qyr) tpcVar2.b;
        qyrVar2.b = 1 | qyrVar2.b;
        qyrVar2.d = (String) obj6;
        tpcVar3.I((String) obj5, (qyr) tpcVar2.l());
        return (qyt) tpcVar3.l();
    }

    public /* synthetic */ qwl(String str, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }
}
