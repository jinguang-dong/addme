package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class feb {
    private static final sgv a = sgv.g("feb");
    private final WeakReference b;
    private final out c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public feb(WeakReference weakReference, out outVar) {
        this.b = weakReference;
        this.c = outVar;
    }

    public final void a(String str) {
        out.a();
        a.I(!rnt.V(str));
        Activity activity = (Activity) this.b.get();
        if (activity == null || this.d.getAndSet(true)) {
            return;
        }
        ((sgt) a.c().M(58)).v("WARNING: Activity was artificially finished: %s", str);
        this.c.execute(new dzd(activity, 20));
    }
}
