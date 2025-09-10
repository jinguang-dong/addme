package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twi implements twl {
    private final Runnable a;
    private final Runnable b;
    private final Handler c;

    public twi(Runnable runnable, Runnable runnable2, Handler handler) {
        this.a = runnable;
        this.b = runnable2;
        this.c = handler;
    }

    @Override // defpackage.twl
    public final void a() {
        Handler handler = this.c;
        handler.removeCallbacks(this.a);
        Runnable runnable = this.b;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.twl
    public final void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.twl
    public final void c() {
        this.c.post(this.a);
    }
}
