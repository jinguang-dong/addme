package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sjp {
    public final Object a;
    public final Object b;

    public sjp(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public static final uyx b(boolean z, qpn qpnVar) {
        rwc rwcVarB;
        RandomAccessFile randomAccessFile;
        tpc tpcVarM = uyx.a.m();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        uyx uyxVar = (uyx) tphVar;
        uyxVar.b |= 1;
        uyxVar.c = elapsedCpuTime;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        uyx uyxVar2 = (uyx) tpcVarM.b;
        uyxVar2.b |= 2;
        uyxVar2.d = z;
        int iActiveCount = Thread.activeCount();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uyx uyxVar3 = (uyx) tpcVarM.b;
        uyxVar3.b |= 4;
        uyxVar3.e = iActiveCount;
        final int iMyPid = Process.myPid();
        String str = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(iMyPid));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, "r");
            } catch (IOException unused) {
                rwcVarB = rvk.a;
            }
            try {
                rwcVarB = rwc.i(randomAccessFile.readLine()).b(new qpl(6));
                randomAccessFile.close();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (rwcVarB.h()) {
                    int iIntValue = ((Integer) rwcVarB.c()).intValue();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uyx uyxVar4 = (uyx) tpcVarM.b;
                    uyxVar4.b |= 16;
                    uyxVar4.g = iIntValue;
                }
                rwc rwcVar = !qpnVar.a ? rvk.a : (rwc) ujp.aO(qpnVar.a(), new rwe() { // from class: qpk
                    @Override // defpackage.rwe
                    public final boolean a(Object obj) {
                        return ((ActivityManager.RunningAppProcessInfo) obj).pid == iMyPid;
                    }
                }).b(new qpl(0)).e(rvk.a);
                if (rwcVar.h()) {
                    String strFlattenToString = ((ComponentName) rwcVar.c()).flattenToString();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uyx uyxVar5 = (uyx) tpcVarM.b;
                    strFlattenToString.getClass();
                    uyxVar5.b |= 32;
                    uyxVar5.h = strFlattenToString;
                }
                return (uyx) tpcVarM.l();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    public final boolean a() {
        if (!qpt.ad()) {
            return false;
        }
        Object obj = this.b;
        String strAe = qpt.ae();
        if (strAe == null) {
            return true;
        }
        ?? r4 = this.a;
        int size = r4.size();
        if (size == 0) {
            return strAe.equals(((Context) obj).getPackageName());
        }
        if (size != 1) {
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        String strA = ((rbc) ujp.aS(r4)).a();
        rnt.F(strA.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", strA);
        return strAe.equals(String.valueOf(((Context) obj).getPackageName()).concat(String.valueOf(strA)));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uem] */
    public final void c() {
        if (((AtomicBoolean) this.b).getAndSet(true)) {
            return;
        }
        ((qtq) ((rwg) this.a).a.a()).a();
    }

    public sjp(sif sifVar, sid sidVar) {
        this.a = sifVar;
        this.b = sidVar;
    }

    public sjp(Context context) {
        this.a = new qpw();
        this.b = context;
    }

    public sjp(rwc rwcVar) {
        this.b = new AtomicBoolean(false);
        this.a = rwcVar;
    }

    public sjp(Context context, Map map) {
        this.b = context;
        this.a = map.keySet();
    }
}
