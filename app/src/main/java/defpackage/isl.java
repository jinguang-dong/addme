package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isl implements jhh, jhf, jhe, jhg, jgz {
    public final WeakReference a;
    public Runnable b;
    private final Handler c;
    private final long d;

    public isl(Activity activity, Handler handler, long j) {
        this.a = new WeakReference(activity);
        this.c = handler;
        this.d = j;
    }

    private final void b() {
        out.a();
        Runnable runnable = this.b;
        if (runnable == null) {
            return;
        }
        this.c.removeCallbacks(runnable);
        this.b = null;
    }

    @Override // defpackage.jhe
    public final void eb() {
        b();
    }

    @Override // defpackage.jhf
    public final void ej() {
        b();
    }

    @Override // defpackage.jgz
    public final void et() {
        b();
    }

    @Override // defpackage.jhg
    public final void eu() {
        out.a();
        rnt.s(this.b == null);
        long j = this.d;
        if (j == 0) {
            return;
        }
        ild ildVar = new ild(this, 17);
        this.b = ildVar;
        this.c.postDelayed(ildVar, j);
    }
}
