package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ilx {
    public static final sgv a = sgv.g("ilx");
    public final ilu b;
    public final ilr c;
    public final Looper d;
    public final ilw e;
    public boolean f = false;
    public final AtomicInteger g = new AtomicInteger(0);

    public ilx(ilu iluVar, ilr ilrVar) {
        this.b = iluVar;
        this.c = ilrVar;
        HandlerThread handlerThread = new HandlerThread("VideoRecorderThread");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.d = looper;
        this.e = new ilw(this, looper);
    }

    public final int a() {
        return this.g.get();
    }
}
