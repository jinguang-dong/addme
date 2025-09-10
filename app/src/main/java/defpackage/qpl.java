package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qpl implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ qpl(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        String strB;
        String strB2;
        String strB3;
        switch (this.a) {
            case 0:
                return rwc.i(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 1:
                return new qth((FileDescriptor) obj);
            case 2:
                vaa vaaVar = (vaa) obj;
                tpc tpcVarM = uzx.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uzx uzxVar = (uzx) tpcVarM.b;
                vaaVar.getClass();
                uzxVar.d = vaaVar;
                uzxVar.c = 3;
                tpc tpcVarM2 = uzw.a.m();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                uzw.c((uzw) tpcVarM2.b);
                uzw uzwVar = (uzw) tpcVarM2.l();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uzx uzxVar2 = (uzx) tpcVarM.b;
                uzwVar.getClass();
                uzxVar2.e = uzwVar;
                uzxVar2.b |= 1;
                return (uzx) tpcVarM.l();
            case 3:
                uys uysVar = (uys) obj;
                tpc tpcVarM3 = uzx.a.m();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                uzx uzxVar3 = (uzx) tpcVarM3.b;
                uysVar.getClass();
                uzxVar3.d = uysVar;
                uzxVar3.c = 1;
                tpc tpcVarM4 = uzw.a.m();
                if (!tpcVarM4.b.C()) {
                    tpcVarM4.o();
                }
                uzw.c((uzw) tpcVarM4.b);
                uzw uzwVar2 = (uzw) tpcVarM4.l();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                uzx uzxVar4 = (uzx) tpcVarM3.b;
                uzwVar2.getClass();
                uzxVar4.e = uzwVar2;
                uzxVar4.b |= 1;
                return (uzx) tpcVarM3.l();
            case 4:
                return sbp.j((List) obj);
            case 5:
                ((sgt) ((sgt) qnj.a.c().i((RuntimeException) obj)).M(5754)).s("Metric extension provider failed.");
                return null;
            case 6:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 7:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 8:
                return taa.a((String) obj);
            case 9:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 10:
                qya qyaVar = (qya) obj;
                if (qyaVar.a != 29514) {
                    throw qyaVar;
                }
                tpc tpcVarM5 = qyp.a.m();
                tpc tpcVarM6 = qym.b.m();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!tpcVarM6.b.C()) {
                    tpcVarM6.o();
                }
                qym qymVar = (qym) tpcVarM6.b;
                qymVar.c |= 8;
                qymVar.g = jCurrentTimeMillis;
                if (!tpcVarM5.b.C()) {
                    tpcVarM5.o();
                }
                qyp qypVar = (qyp) tpcVarM5.b;
                qym qymVar2 = (qym) tpcVarM6.l();
                qymVar2.getClass();
                qypVar.c = qymVar2;
                qypVar.b |= 1;
                return (qyp) tpcVarM5.l();
            case 11:
                return (nzj) ((rwc) obj).d(new kus(7));
            case 12:
                int i = taq.b;
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj);
                return null;
            case 13:
                Context context = (Context) obj;
                String str = uar.b;
                if (str != null) {
                    return str;
                }
                synchronized (uar.class) {
                    strB = uar.b;
                    if (strB == null) {
                        strB = qxc.b(context, "com.google.android.gms.clearcut_client");
                        uar.b = strB;
                    }
                }
                return strB;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Context context2 = (Context) obj;
                String str2 = uay.b;
                if (str2 != null) {
                    return str2;
                }
                synchronized (uay.class) {
                    strB2 = uay.b;
                    if (strB2 == null) {
                        strB2 = qxc.b(context2, "com.google.android.libraries.consentverifier");
                        uay.b = strB2;
                    }
                }
                return strB2;
            default:
                Context context3 = (Context) obj;
                String str3 = uco.b;
                if (str3 != null) {
                    return str3;
                }
                synchronized (uco.class) {
                    strB3 = uco.b;
                    if (strB3 == null) {
                        strB3 = qxc.b(context3, "com.google.android.libraries.performance.primes");
                        uco.b = strB3;
                    }
                }
                return strB3;
        }
    }
}
