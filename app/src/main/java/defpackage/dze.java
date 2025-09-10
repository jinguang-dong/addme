package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dze implements dzs, edi {
    public final Context a;
    public final int b;
    public final ebm c;
    public final dzj d;
    public int e;
    public final Executor f;
    public final Executor g;
    public PowerManager.WakeLock h;
    public boolean i;
    public final una j;
    public volatile uol k;
    public final ejs l;
    public final ejs m;
    private final Object n;

    static {
        dwj.a("DelayMetCommandHandler");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public dze(Context context, int i, dzj dzjVar, ejs ejsVar) {
        this.a = context;
        this.b = i;
        this.d = dzjVar;
        this.c = (ebm) ejsVar.a;
        this.m = ejsVar;
        hkk hkkVar = dzjVar.e.j;
        gga ggaVar = dzjVar.k;
        this.f = ggaVar.b;
        this.g = ggaVar.c;
        this.j = (una) ggaVar.d;
        this.l = new ejs(hkkVar);
        this.i = false;
        this.e = 0;
        this.n = new Object();
    }

    public final void a() {
        synchronized (this.n) {
            if (this.k != null) {
                this.k.s(null);
            }
            edj edjVar = this.d.c;
            ebm ebmVar = this.c;
            edjVar.a(ebmVar);
            PowerManager.WakeLock wakeLock = this.h;
            if (wakeLock != null && wakeLock.isHeld()) {
                dwj.b();
                Objects.toString(this.h);
                Objects.toString(ebmVar);
                this.h.release();
            }
        }
    }

    @Override // defpackage.edi
    public final void b(ebm ebmVar) {
        dwj.b();
        Objects.toString(ebmVar);
        ebmVar.toString();
        this.f.execute(new dzd(this, 0));
    }

    @Override // defpackage.dzs
    public final void e(ebx ebxVar, cpo cpoVar) {
        if (cpoVar instanceof dzn) {
            this.f.execute(new dzd(this, 2));
        } else {
            this.f.execute(new dzd(this, 0));
        }
    }
}
