package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prn {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(pre preVar, scf scfVar) {
        final ExecutorService threadPoolExecutor;
        Context context = preVar.a;
        final onm onmVar = new onm(context);
        String strValueOf = String.valueOf(context.getPackageName());
        if (scfVar.a == null) {
            try {
                scfVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                scfVar.a = -1;
            }
        }
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        final int iIntValue = ((Integer) scfVar.a).intValue();
        final String[] strArr = c;
        ogw ogwVar = new ogw();
        ogwVar.a = new ogt() { // from class: onk
            @Override // defpackage.ogt
            public final void a(Object obj, Object obj2) {
                int i = onm.a;
                onp onpVar = new onp((pfl) obj2);
                onq onqVar = (onq) ((onr) obj).t();
                Parcel parcelA = onqVar.a();
                fbj.d(parcelA, onpVar);
                parcelA.writeString(strConcat);
                parcelA.writeInt(iIntValue);
                parcelA.writeStringArray(strArr);
                parcelA.writeByteArray(null);
                onqVar.A(1, parcelA);
            }
        };
        oor oorVarF = onmVar.f(ogwVar.a());
        if (prh.a(preVar.a)) {
            ojl ojlVar = olr.a;
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            threadPoolExecutor = Executors.unconfigurableExecutorService(threadPoolExecutor2);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = prq.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            rup.u(0);
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, new szi(Executors.defaultThreadFactory(), new AtomicLong(0L), 0), prq.a);
        }
        try {
            oorVarF.l(threadPoolExecutor, new ooo() { // from class: prm
                @Override // defpackage.ooo
                public final void d(Object obj) {
                    boolean z = prn.a;
                    onm onmVar2 = onmVar;
                    String str = strConcat;
                    onmVar2.b(str).k(threadPoolExecutor, new ntc(str, 5));
                }
            });
            oorVarF.k(threadPoolExecutor, new ntc(strConcat, 4));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
