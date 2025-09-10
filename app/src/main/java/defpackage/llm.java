package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.os.SystemClock;
import j$.time.Duration;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class llm implements llp {
    public static final /* synthetic */ int g = 0;
    private static final sgv h = sgv.g("llm");
    private static final Duration i = Duration.ofSeconds(5);
    public boolean c;
    private final Runnable j;
    private final pbn k;
    private volatile long l;
    public final Object a = new Object();
    public final LinkedList b = new LinkedList();
    public int f = 3;
    public boolean d = false;
    public szh e = new szh();

    public llm(Runnable runnable, pbn pbnVar) {
        this.j = runnable;
        this.k = pbnVar;
    }

    @Override // defpackage.llp
    public final void a(llo lloVar) {
        synchronized (this.a) {
            LinkedList linkedList = this.b;
            if (linkedList.contains(lloVar)) {
                throw new IllegalArgumentException("Task already enqueued");
            }
            linkedList.add(lloVar);
            linkedList.size();
            if (!this.d) {
                b();
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            int i2 = this.f;
            if (i2 == 3) {
                try {
                    pbm pbmVar = new pbm(this.k, "ProcessingServiceManager#startingService");
                    try {
                        this.j.run();
                        pbmVar.close();
                        this.l = SystemClock.elapsedRealtimeNanos();
                        this.f = 1;
                    } catch (Throwable th) {
                        try {
                            pbmVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ForegroundServiceStartNotAllowedException e) {
                    ((sgt) ((sgt) h.b().i(e)).M(4206)).s("Unable to start processing service!");
                }
            } else if (i2 == 2) {
                this.c = true;
            } else if (i2 == 1) {
                if (SystemClock.elapsedRealtimeNanos() - this.l > i.toNanos()) {
                    try {
                        pbm pbmVar2 = new pbm(this.k, "ProcessingServiceManager#re-startingService");
                        try {
                            this.j.run();
                            pbmVar2.close();
                            this.l = SystemClock.elapsedRealtimeNanos();
                        } catch (Throwable th3) {
                            try {
                                pbmVar2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (ForegroundServiceStartNotAllowedException e2) {
                        ((sgt) ((sgt) h.b().i(e2)).M(4203)).s("Unable to re-start processing service!");
                    }
                } else {
                    TimeUnit.SECONDS.getClass();
                }
            }
        }
    }

    public final synchronized void c() {
        synchronized (this.a) {
            LinkedList linkedList = this.b;
            linkedList.size();
            if (this.d) {
                this.d = false;
                if (!linkedList.isEmpty()) {
                    b();
                }
            }
        }
    }
}
