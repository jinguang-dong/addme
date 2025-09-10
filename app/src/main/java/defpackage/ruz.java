package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ruz extends Thread {
    public static final sgv a = sgv.g(mPfBwqXsnpXI.gDnHWoteIqONE);
    public final rux b;
    public final ruy c;
    public final ruy d;
    public Instant f;
    public Instant g;
    public final int i;
    public final ruv j;
    public final rtl k;
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicReference h = new AtomicReference();

    public ruz(rux ruxVar, rtl rtlVar, ruv ruvVar) {
        new ConcurrentLinkedQueue();
        this.i = 1;
        this.b = ruxVar;
        this.c = new ruy(ruxVar.c);
        this.d = new ruy(ruxVar.c);
        this.k = rtlVar;
        this.j = ruvVar;
        this.f = Instant.EPOCH;
        this.g = Instant.EPOCH;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.e.set(true);
        Duration durationOfNanos = Duration.ofNanos(1000000000 / this.b.a);
        ruv ruvVar = this.j;
        ruvVar.d = this;
        ruvVar.a = durationOfNanos;
        ruvVar.c.set(false);
        Looper.prepare();
        Choreographer.getInstance().postFrameCallback(ruvVar);
        Looper.loop();
    }
}
