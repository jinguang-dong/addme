package defpackage;

import android.os.Looper;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csv {
    private static final ThreadLocal i = new ThreadLocal();
    public csu f;
    public final ebn h;
    public final aaa a = new aaa();
    public final ArrayList b = new ArrayList();
    public final AmbientMode.AmbientController g = new AmbientMode.AmbientController(this);
    public final Runnable c = new mb(this, 11);
    public boolean d = false;
    public float e = 1.0f;

    public csv(ebn ebnVar) {
        this.h = ebnVar;
    }

    static csv a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new csv(new ebn((char[]) null)));
        }
        return (csv) threadLocal.get();
    }

    final boolean b() {
        return Thread.currentThread() == ((Looper) this.h.a).getThread();
    }
}
