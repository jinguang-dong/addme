package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbl implements rbf {
    private final uem a;

    public rbl(uem uemVar) {
        this.a = uemVar;
    }

    @Override // defpackage.rbf
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: rbk
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.a.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) ((tzu) this.a).a;
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((rbj) it.next()).a());
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                syu[] syuVarArr = (syu[]) arrayList2.toArray(new syu[0]);
                syl sylVar = new syl(syuVarArr);
                sbk sbkVarE = sbp.e(syuVarArr.length);
                for (int i = 0; i < syuVarArr.length; i++) {
                    sbkVarE.h(new syk(sylVar));
                }
                sbp sbpVarG = sbkVarE.g();
                for (int i2 = 0; i2 < syuVarArr.length; i2++) {
                    syuVarArr[i2].c(new ng(sylVar, sbpVarG, i2, 20), sxo.a);
                }
                sgk it2 = sbpVarG.iterator();
                while (it2.hasNext()) {
                    syu syuVar = (syu) it2.next();
                    try {
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(4000 - (SystemClock.elapsedRealtime() - jElapsedRealtime));
                        long jNanoTime = System.nanoTime() + nanos;
                        z = false;
                        while (true) {
                            try {
                                try {
                                    syuVar.get(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    z = true;
                                    nanos = jNanoTime - System.nanoTime();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Throwable) it3.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
