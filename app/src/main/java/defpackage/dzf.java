package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dzf implements Runnable {
    final /* synthetic */ dzj a;

    public dzf(dzj dzjVar) {
        this.a = dzjVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        dzj dzjVar;
        dzi dziVar;
        List<ejs> listA;
        dzj dzjVar2 = this.a;
        List list = dzjVar2.g;
        synchronized (list) {
            i = 0;
            dzjVar2.h = (Intent) list.get(0);
        }
        dzj dzjVar3 = this.a;
        Intent intent = dzjVar3.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = dzjVar3.h.getIntExtra(GAQqzWiWWcYOgy.Amhfbda, 0);
            dwj.b();
            Objects.toString(dzjVar3.h);
            PowerManager.WakeLock wakeLockA = edd.a(dzjVar3.b, action + " (" + intExtra + ")");
            try {
                dwj.b();
                Objects.toString(wakeLockA);
                wakeLockA.acquire();
                dza dzaVar = dzjVar3.f;
                Intent intent2 = dzjVar3.h;
                String action2 = intent2.getAction();
                int i2 = 1;
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    dwj.b();
                    Objects.toString(intent2);
                    int i3 = dzc.a;
                    Context context = dzaVar.b;
                    dyj dyjVar = dzjVar3.e;
                    ejs ejsVar = new ejs(dyjVar.j);
                    List<ebx> listC = dyjVar.d.B().c();
                    int i4 = dzb.a;
                    Iterator it = listC.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        dvv dvvVar = ((ebx) it.next()).j;
                        z |= dvvVar.e;
                        z2 |= dvvVar.c;
                        z3 |= dvvVar.f;
                        z4 |= dvvVar.j != 1;
                        if (z && z2 && z3 && z4) {
                            break;
                        }
                    }
                    int i5 = ConstraintProxyUpdateReceiver.a;
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
                    context.sendBroadcast(intent3);
                    ArrayList arrayList = new ArrayList(listC.size());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (ebx ebxVar : listC) {
                        if (jCurrentTimeMillis >= ebxVar.a() && (!ebxVar.b() || ejsVar.f(ebxVar))) {
                            arrayList.add(ebxVar);
                        }
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        ebx ebxVar2 = (ebx) arrayList.get(i);
                        String str = ebxVar2.b;
                        Intent intentC = dza.c(context, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar2));
                        dwj.b();
                        dzjVar3.k.c.execute(new dzg(dzjVar3, intentC, intExtra));
                        i++;
                    }
                } else if ("ACTION_RESCHEDULE".equals(action2)) {
                    dwj.b();
                    Objects.toString(intent2);
                    dzjVar3.e.c();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                        dwj.b();
                        Log.e(dza.a, "Invalid request for " + action2 + " , requires KEY_WORKSPEC_ID .");
                    } else if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                        ebm ebmVarE = dza.e(intent2);
                        dwj.b();
                        Objects.toString(ebmVarE);
                        ebmVarE.toString();
                        WorkDatabase workDatabase = dzjVar3.e.d;
                        workDatabase.l();
                        try {
                            ebx ebxVarA = workDatabase.B().a(ebmVarE.a);
                            if (ebxVarA == null) {
                                dwj.b();
                                Log.w(dza.a, a.bz(ebmVarE, "Skipping scheduling ", " because it's no longer in the DB"));
                            } else if (cpn.w(ebxVarA.x)) {
                                dwj.b();
                                Log.w(dza.a, a.bz(ebmVarE, "Skipping scheduling ", "because it is finished."));
                            } else {
                                long jA = ebxVarA.a();
                                if (ebxVarA.b()) {
                                    dwj.b();
                                    Objects.toString(ebmVarE);
                                    Context context2 = dzaVar.b;
                                    dyz.b(context2, workDatabase, ebmVarE, jA);
                                    dzjVar3.k.c.execute(new dzg(dzjVar3, dza.b(context2), intExtra));
                                } else {
                                    dwj.b();
                                    Objects.toString(ebmVarE);
                                    dyz.b(dzaVar.b, workDatabase, ebmVarE, jA);
                                }
                                workDatabase.p();
                            }
                            workDatabase.n();
                        } catch (Throwable th) {
                            workDatabase.n();
                            throw th;
                        }
                    } else {
                        int i6 = 2;
                        if ("ACTION_DELAY_MET".equals(action2)) {
                            synchronized (dzaVar.d) {
                                ebm ebmVarE2 = dza.e(intent2);
                                dwj.b();
                                Objects.toString(ebmVarE2);
                                Map map = dzaVar.c;
                                if (map.containsKey(ebmVarE2)) {
                                    dwj.b();
                                    Objects.toString(ebmVarE2);
                                } else {
                                    dze dzeVar = new dze(dzaVar.b, intExtra, dzjVar3, dzaVar.e.d(ebmVarE2));
                                    map.put(ebmVarE2, dzeVar);
                                    String str2 = dzeVar.c.a;
                                    dzeVar.h = edd.a(dzeVar.a, str2 + " (" + dzeVar.b + ")");
                                    dwj.b();
                                    Objects.toString(dzeVar.h);
                                    dzeVar.h.acquire();
                                    ebx ebxVarA2 = dzeVar.d.e.d.B().a(str2);
                                    if (ebxVarA2 == null) {
                                        dzeVar.f.execute(new dzd(dzeVar, i));
                                    } else {
                                        boolean zB = ebxVarA2.b();
                                        dzeVar.i = zB;
                                        if (zB) {
                                            dzeVar.k = dzx.a(dzeVar.l, ebxVarA2, dzeVar.j, dzeVar);
                                        } else {
                                            dwj.b();
                                            dzeVar.f.execute(new dzd(dzeVar, i6));
                                        }
                                    }
                                }
                            }
                        } else if ("ACTION_STOP_WORK".equals(action2)) {
                            Bundle extras2 = intent2.getExtras();
                            String string = extras2.getString("KEY_WORKSPEC_ID");
                            if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                                int i7 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                                listA = new ArrayList(1);
                                ejs ejsVarC = dzaVar.e.c(new ebm(string, i7));
                                if (ejsVarC != null) {
                                    listA.add(ejsVarC);
                                }
                            } else {
                                listA = dzaVar.e.a(string);
                            }
                            for (ejs ejsVar2 : listA) {
                                dwj.b();
                                cpo.p(dzjVar3.j, ejsVar2);
                                Context context3 = dzaVar.b;
                                WorkDatabase workDatabase2 = dzjVar3.e.d;
                                Object obj = ejsVar2.a;
                                int i8 = dyz.a;
                                ebh ebhVarY = workDatabase2.y();
                                ebg ebgVarC = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.C(ebhVarY, (ebm) obj);
                                if (ebgVarC != null) {
                                    dyz.a(context3, (ebm) obj, ebgVarC.c);
                                    dwj.b();
                                    Objects.toString(obj);
                                    String str3 = ((ebm) obj).a;
                                    int i9 = ((ebm) obj).b;
                                    dco dcoVar = ((ebl) ebhVarY).a;
                                    dcoVar.k();
                                    dcv dcvVar = ((ebl) ebhVarY).b;
                                    dfq dfqVarD = dcvVar.d();
                                    dfqVarD.g(i2, str3);
                                    dfqVarD.e(2, i9);
                                    try {
                                        dcoVar.l();
                                        try {
                                            dfqVarD.a();
                                            dcoVar.p();
                                            dcoVar.n();
                                            dcvVar.f(dfqVarD);
                                        } finally {
                                        }
                                    } catch (Throwable th2) {
                                        ((ebl) ebhVarY).b.f(dfqVarD);
                                        throw th2;
                                    }
                                }
                                dzjVar3.a((ebm) obj, false);
                                i2 = 1;
                            }
                        } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                            ebm ebmVarE3 = dza.e(intent2);
                            boolean z5 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                            dwj.b();
                            Objects.toString(intent2);
                            dzaVar.a(ebmVarE3, z5);
                        } else {
                            dwj.b();
                            String str4 = dza.a;
                            Objects.toString(intent2);
                            Log.w(str4, "Ignoring intent ".concat(String.valueOf(intent2)));
                        }
                    }
                }
                dwj.b();
                Objects.toString(wakeLockA);
                wakeLockA.release();
                dzjVar = this.a;
                dziVar = new dzi(dzjVar);
            } catch (Throwable th3) {
                try {
                    dwj.b();
                    Log.e(dzj.a, "Unexpected error in onHandleIntent", th3);
                    dwj.b();
                    Objects.toString(wakeLockA);
                    wakeLockA.release();
                    dzjVar = this.a;
                    dziVar = new dzi(dzjVar);
                } catch (Throwable th4) {
                    dwj.b();
                    Objects.toString(wakeLockA);
                    wakeLockA.release();
                    dzj dzjVar4 = this.a;
                    dzjVar4.k.c.execute(new dzi(dzjVar4));
                    throw th4;
                }
            }
            dzjVar.k.c.execute(dziVar);
        }
    }
}
