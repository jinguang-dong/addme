package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouq implements paq {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public ouq(paq paqVar, int i, int i2) {
        this.a = i2;
        a.I(i > 0);
        this.b = paqVar;
        this.c = new AtomicInteger(i);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, paq] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.a != 0) {
            if (((AtomicInteger) this.c).decrementAndGet() == 0) {
                this.b.close();
            }
        } else {
            if (((AtomicBoolean) this.c).getAndSet(true)) {
                return;
            }
            Object obj = this.b;
            Looper looper = ((HandlerThread) obj).getLooper();
            if (looper != null) {
                new Handler(looper).postDelayed(new ooc(obj, 5), 5000L);
            }
        }
    }

    public ouq(HandlerThread handlerThread, int i) {
        this.a = i;
        this.b = handlerThread;
        this.c = new AtomicBoolean(false);
    }
}
