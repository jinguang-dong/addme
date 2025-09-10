package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyn extends ujq implements uif {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyn(NetworkRequest networkRequest, ConnectivityManager connectivityManager, dzt dztVar, int i) {
        super(0);
        this.d = i;
        this.a = networkRequest;
        this.c = connectivityManager;
        this.b = dztVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.uif
    public final /* synthetic */ Object a() throws Throwable {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.c;
                ecw.a(new dxv((dyj) this.a, (String) this.b, ske.bj(obj)));
                return ufg.a;
            }
            Object obj2 = this.b;
            Object obj3 = this.c;
            Object obj4 = this.a;
            synchronized (dzt.b) {
                Map map = dzt.c;
                map.remove(obj4);
                if (map.isEmpty()) {
                    dwj.b();
                    int i2 = dzx.a;
                    ((ConnectivityManager) obj3).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj2);
                }
            }
            return ufg.a;
        }
        Object obj5 = this.b;
        Object obj6 = this.a;
        tdy tdyVar = (tdy) this.c;
        dyj dyjVar = (dyj) obj6;
        String str = (String) obj5;
        dyn dynVar = new dyn(tdyVar, dyjVar, str, 1);
        eby ebyVarB = dyjVar.d.B();
        List listD = ebyVarB.d(str);
        if (listD.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        ebw ebwVar = (ebw) ske.bD(listD);
        if (ebwVar == null) {
            dynVar.a();
        } else {
            String str2 = ebwVar.a;
            ebx ebxVarA = ebyVarB.a(str2);
            if (ebxVarA == null) {
                throw new IllegalStateException(a.by(str, str2, "WorkSpec with ", ", that matches a name \"", "\", wasn't found"));
            }
            if (!ebxVarA.d()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (ebwVar.b == 6) {
                ebyVarB.e(str2);
                dynVar.a();
            } else {
                final ebx ebxVarE = ebx.e((ebx) tdyVar.a, str2, 0, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                dxj dxjVar = dyjVar.f;
                dxjVar.getClass();
                final WorkDatabase workDatabase = dyjVar.d;
                workDatabase.getClass();
                dvs dvsVar = dyjVar.c;
                dvsVar.getClass();
                final List list = dyjVar.e;
                list.getClass();
                final ?? r0 = tdyVar.c;
                final String str3 = ebxVarE.b;
                final ebx ebxVarA2 = workDatabase.B().a(str3);
                if (ebxVarA2 == null) {
                    throw new IllegalArgumentException(a.bw(str3, "Worker with ", " doesn't exist"));
                }
                if (!cpn.w(ebxVarA2.x)) {
                    if (ebxVarA2.d() ^ ebxVarE.d()) {
                        aap aapVar = aap.r;
                        throw new UnsupportedOperationException("Can't update " + ((String) aapVar.a(ebxVarA2)) + " Worker to " + ((String) aapVar.a(ebxVarE)) + " Worker. Update operation must preserve worker's type.");
                    }
                    final boolean zC = dxjVar.c(str3);
                    if (!zC) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((dxl) it.next()).b(str3);
                        }
                    }
                    workDatabase.o(new Runnable() { // from class: dym
                        /* JADX WARN: Finally extract failed */
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            ebx ebxVar = ebxVarE;
                            ebx ebxVar2 = ebxVarA2;
                            int i3 = ebxVar2.r;
                            WorkDatabase workDatabase2 = workDatabase;
                            eby ebyVarB2 = workDatabase2.B();
                            ecs ecsVarC = workDatabase2.C();
                            ebx ebxVarE2 = ebx.e(ebxVar, null, ebxVar2.x, null, null, ebxVar2.k, ebxVar2.m, ebxVar2.q, i3 + 1, ebxVar2.s, ebxVar2.t, 29613053);
                            if (ebxVar.t == 1) {
                                ebxVarE2.s = ebxVar.s;
                                ebxVarE2.t++;
                            }
                            ebx ebxVarL = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.l(list, ebxVarE2);
                            ecr ecrVar = (ecr) ebyVarB2;
                            dco dcoVar = ecrVar.a;
                            dcoVar.k();
                            dcoVar.l();
                            try {
                                dca dcaVar = ((ecr) ebyVarB2).c;
                                dfq dfqVarD = dcaVar.d();
                                try {
                                    String str4 = ebxVarL.b;
                                    dfqVarD.g(1, str4);
                                    dfqVarD.e(2, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.u(ebxVarL.x));
                                    dfqVarD.g(3, ebxVarL.c);
                                    dfqVarD.g(4, ebxVarL.d);
                                    dvx dvxVar = ebxVarL.e;
                                    dvx dvxVar2 = dvx.a;
                                    dfqVarD.c(5, cij.r(dvxVar));
                                    dfqVarD.c(6, cij.r(ebxVarL.f));
                                    dfqVarD.e(7, ebxVarL.g);
                                    dfqVarD.e(8, ebxVarL.h);
                                    dfqVarD.e(9, ebxVarL.i);
                                    dfqVarD.e(10, ebxVarL.k);
                                    dfqVarD.e(11, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.r(ebxVarL.y));
                                    dfqVarD.e(12, ebxVarL.l);
                                    dfqVarD.e(13, ebxVarL.m);
                                    dfqVarD.e(14, ebxVarL.n);
                                    dfqVarD.e(15, ebxVarL.o);
                                    dfqVarD.e(16, ebxVarL.p ? 1L : 0L);
                                    dfqVarD.e(17, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.t(ebxVarL.z));
                                    dfqVarD.e(18, ebxVarL.q);
                                    dfqVarD.e(19, ebxVarL.r);
                                    dfqVarD.e(20, ebxVarL.s);
                                    dfqVarD.e(21, ebxVarL.t);
                                    dfqVarD.e(22, ebxVarL.u);
                                    String str5 = ebxVarL.v;
                                    if (str5 == null) {
                                        dfqVarD.f(23);
                                    } else {
                                        dfqVarD.g(23, str5);
                                    }
                                    Boolean bool = ebxVarL.w;
                                    if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                                        dfqVarD.f(24);
                                    } else {
                                        dfqVarD.e(24, r6.intValue());
                                    }
                                    dvv dvvVar = ebxVarL.j;
                                    dfqVarD.e(25, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.s(dvvVar.j));
                                    dfqVarD.c(26, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.p(dvvVar.b));
                                    dfqVarD.e(27, dvvVar.c ? 1L : 0L);
                                    dfqVarD.e(28, dvvVar.d ? 1L : 0L);
                                    dfqVarD.e(29, dvvVar.e ? 1L : 0L);
                                    dfqVarD.e(30, dvvVar.f ? 1L : 0L);
                                    dfqVarD.e(31, dvvVar.g);
                                    dfqVarD.e(32, dvvVar.h);
                                    dfqVarD.c(33, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.q(dvvVar.i));
                                    dfqVarD.g(34, str4);
                                    dfqVarD.a();
                                    dcaVar.f(dfqVarD);
                                    ((ecr) ebyVarB2).a.p();
                                    String str6 = str3;
                                    ecrVar.a.n();
                                    ecv ecvVar = (ecv) ecsVarC;
                                    dco dcoVar2 = ecvVar.a;
                                    dcoVar2.k();
                                    dfq dfqVarD2 = ecvVar.c.d();
                                    dfqVarD2.g(1, str6);
                                    try {
                                        dcoVar2.l();
                                        try {
                                            dfqVarD2.a();
                                            dcoVar2.p();
                                            ((ecv) ecsVarC).a.n();
                                            boolean z = zC;
                                            Set set = r0;
                                            ecvVar.c.f(dfqVarD2);
                                            AmbientLifecycleObserver.AmbientLifecycleCallback.CC.z(ecsVarC, str6, set);
                                            if (z) {
                                                return;
                                            }
                                            ebyVarB2.k(str6, -1L);
                                            workDatabase2.A().a(str6);
                                        } catch (Throwable th) {
                                            ((ecv) ecsVarC).a.n();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        ecvVar.c.f(dfqVarD2);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    dcaVar.f(dfqVarD);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                ecrVar.a.n();
                                throw th4;
                            }
                        }
                    });
                    if (!zC) {
                        dxn.a(dvsVar, workDatabase, list);
                    }
                }
            }
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyn(dyj dyjVar, String str, tdy tdyVar, int i) {
        super(0);
        this.d = i;
        this.a = dyjVar;
        this.b = str;
        this.c = tdyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyn(tdy tdyVar, dyj dyjVar, String str, int i) {
        super(0);
        this.d = i;
        this.c = tdyVar;
        this.a = dyjVar;
        this.b = str;
    }
}
