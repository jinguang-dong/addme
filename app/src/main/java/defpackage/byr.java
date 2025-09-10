package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byr extends una {
    public static final ues a = new uez(bnk.k);
    public static final ThreadLocal b = new byp();
    public final Choreographer c;
    public final Handler d;
    public boolean h;
    public final azo j;
    private boolean n;
    public final Object e = new Object();
    private final ufu m = new ufu();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public final byq i = new byq(this);

    public byr(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new byt(choreographer, this, 0);
    }

    private final Runnable e() {
        Runnable runnable;
        synchronized (this.e) {
            runnable = (Runnable) this.m.f();
        }
        return runnable;
    }

    @Override // defpackage.una
    public final void a(uhf uhfVar, Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                Handler handler = this.d;
                byq byqVar = this.i;
                handler.post(byqVar);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(byqVar);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable runnableE = e();
            while (runnableE != null) {
                runnableE.run();
                runnableE = e();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
