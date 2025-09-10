package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qat {
    public final Object a;
    public final Object b;

    public qat() {
        throw null;
    }

    public static final boolean b(long j, long j2) {
        return j % j2 == 0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, puu] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, qbv] */
    public final syu a(final long j, rwc rwcVar) {
        if (j == 0) {
            return ske.M(rvk.a);
        }
        if (j < 0) {
            qbu.c("Bad sample interval (negative number): %d", Long.valueOf(j));
            return ske.M(rvk.a);
        }
        if (this.b.J() && rwcVar.h()) {
            return qdp.e(rwcVar.c().d()).f(new rvu() { // from class: qbs
                @Override // defpackage.rvu
                public final Object apply(Object obj) {
                    long j2 = j;
                    pvq pvqVar = (pvq) obj;
                    boolean z = 100 % j2 != 0;
                    if (z) {
                        qbu.c("Bad sample interval (1 percent cohort will not log): %d", Long.valueOf(j2));
                    }
                    if (!qat.b(pvqVar.c, j2)) {
                        return rvk.a;
                    }
                    tpc tpcVarM = svo.a.m();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    svo svoVar = (svo) tpcVarM.b;
                    svoVar.b |= 1;
                    svoVar.c = true;
                    trn trnVar = pvqVar.d;
                    if (trnVar == null) {
                        trnVar = trn.a;
                    }
                    long jA = tsi.a(trnVar);
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    svo svoVar2 = (svo) tpcVarM.b;
                    svoVar2.b |= 2;
                    svoVar2.d = jA;
                    boolean zB = qat.b(pvqVar.c, 100L);
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    svo svoVar3 = (svo) tphVar;
                    svoVar3.b |= 4;
                    svoVar3.e = zB;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    svo svoVar4 = (svo) tpcVarM.b;
                    svoVar4.b |= 8;
                    svoVar4.f = z;
                    return rwc.j((svo) tpcVarM.l());
                }
            }, sxo.a);
        }
        if (j == 0 || !b(((Random) this.a).nextLong(), j)) {
            return ske.M(rvk.a);
        }
        tpc tpcVarM = svo.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        svo svoVar = (svo) tpcVarM.b;
        svoVar.b |= 1;
        svoVar.c = false;
        return ske.M(rwc.j((svo) tpcVarM.l()));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu d(Uri uri) {
        return ske.Q(rsx.f(new fsu(this, uri, 10)), this.a);
    }

    public qat(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void c(String str, long j, int i, rwc rwcVar) {
        int i2;
        int i3 = qbu.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cij.u("MDD_TASK_TAG_KEY", str, linkedHashMap);
        cij.u("MDD_TASK_PERIOD_HOURS_KEY", Long.valueOf(j / 3600), linkedHashMap);
        cij.u("MDD_TASK_NETWORK_STATE_KEY", prh.f(i), linkedHashMap);
        cij.v("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY", ((Boolean) rwcVar.b(new pzw(14)).e(false)).booleanValue(), linkedHashMap);
        cij.v(INRGuObcrHjSQz.rixu, ((Boolean) rwcVar.b(new pzw(15)).e(true)).booleanValue(), linkedHashMap);
        cij.v("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY", ((Boolean) rwcVar.b(new pzw(16)).e(true)).booleanValue(), linkedHashMap);
        dvx dvxVarS = cij.s(linkedHashMap);
        dwr dwrVar = new dwr(PeriodicWorker.class, j, TimeUnit.SECONDS);
        dwrVar.b(str);
        String str2 = ecy.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = rwcVar.h() ? ((pwv) rwcVar.c()).a : true;
        boolean z2 = rwcVar.h() ? ((pwv) rwcVar.c()).b : true;
        boolean z3 = rwcVar.h() ? ((pwv) rwcVar.c()).c : false;
        int i4 = i - 1;
        if (i4 != 0) {
            i2 = i4 != 2 ? 3 : 1;
        } else {
            i2 = 2;
        }
        dwrVar.c(cij.w(z2, z, new ecy((byte[]) null), z3, linkedHashSet, i2));
        ebx ebxVar = dwrVar.b;
        ebxVar.e = dvxVarS;
        ebxVar.v = str;
        tdy tdyVarD = dwrVar.d();
        dyj dyjVar = (dyj) cpn.u((Context) this.b);
        cij cijVar = dyjVar.c.h;
        String strConcat = "enqueueUniquePeriodic_".concat(str);
        ?? r0 = dyjVar.k.b;
        r0.getClass();
        cpn.y(cijVar, strConcat, r0, new dyn(dyjVar, str, tdyVarD, 0));
        ((ren) this.a).b(new pzw(13), sxo.a);
    }

    public qat(Executor executor, Executor executor2) {
        this.a = executor;
        this.b = executor2;
    }

    public qat(Context context, ren renVar) {
        this.b = context.getApplicationContext();
        this.a = renVar;
    }

    public qat(byte[] bArr) {
        this.a = new Rect();
        this.b = new Rect();
    }

    public qat(rug rugVar, rug rugVar2) {
        rug rugVar3 = new rug();
        this.b = rugVar3;
        rug rugVar4 = new rug();
        this.a = rugVar4;
        rugVar3.e(rugVar);
        rugVar4.e(rugVar2.c());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    public qat(Set set) {
        this.b = set;
        this.a = new boolean[256];
        for (int i = 0; i < 256; i++) {
            ((boolean[]) this.a)[i] = this.b.contains(Integer.valueOf(i));
        }
    }

    public qat(uem uemVar, uem uemVar2) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
    }
}
