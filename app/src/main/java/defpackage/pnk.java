package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnk {
    public final OrientationEventListener d;
    public final Executor e;
    public final pbc f;
    public int h;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Object c = new Object();
    public final AtomicReference g = new AtomicReference(pao.CLOCKWISE_0);

    public pnk(Context context, Executor executor, pbc pbcVar) {
        this.e = executor;
        this.d = new pnj(this, context);
        this.f = pbcVar.a("DeviceOrientation");
    }

    public final pao a() {
        return (pao) this.g.get();
    }

    public final synchronized void b(png pngVar) {
        synchronized (this.c) {
            List list = this.a;
            if (list.contains(pngVar)) {
                return;
            }
            list.add(pngVar);
        }
    }

    public final void c(png pngVar) {
        synchronized (this.c) {
            if (!this.a.remove(pngVar)) {
                this.f.g("Removing non-existing listener.");
            }
        }
    }
}
