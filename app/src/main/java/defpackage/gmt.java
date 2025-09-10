package defpackage;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmt implements paq {
    public final Context a;
    public nan c;
    public nan d;
    public nan e;
    public final mny j;
    public AmbientModeSupport.AmbientController k;
    private nan l;
    private final imi m;
    private final ktx n;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public gho f = gho.DEFAULT;
    final pnh g = new gms(this);
    public int h = -1;
    public final Object i = new Object();

    public gmt(imi imiVar, Context context, ktx ktxVar, mny mnyVar) {
        this.m = imiVar;
        this.a = context;
        this.n = ktxVar;
        this.j = mnyVar;
    }

    public final void a() {
        synchronized (this.i) {
            nan nanVar = this.l;
            if (nanVar != null) {
                this.m.f(nanVar);
                this.l = null;
            }
        }
    }

    public final void b(gho ghoVar) {
        synchronized (this.i) {
            this.f = ghoVar;
            if (ghoVar.equals(gho.LOCKED)) {
                this.n.f(this.g);
            } else {
                this.n.i(this.g);
                this.h = -1;
            }
        }
    }

    public final void c() {
        synchronized (this.i) {
            this.h = -1;
        }
        this.n.i(this.g);
        this.f = gho.DEFAULT;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    public final void d(nan nanVar) {
        synchronized (this.i) {
            a();
            this.l = nanVar;
            imi imiVar = this.m;
            nanVar.getClass();
            imiVar.a(nanVar);
        }
    }

    public final void e() {
        synchronized (this.i) {
            if (this.f.equals(gho.LOCKED) && !this.b.get()) {
                d(this.c);
            }
        }
    }
}
