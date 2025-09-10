package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgh implements paq {
    public final nan a;
    public final out b;
    public final Object c = new Object();
    public Boolean d = false;
    public boolean e = true;
    public int f = 1;
    public final imi g;
    private final Timer h;

    public lgh(imi imiVar, out outVar, Context context, Timer timer) {
        this.g = imiVar;
        this.b = outVar;
        this.h = timer;
        nao naoVar = new nao();
        naoVar.e = context.getResources().getString(R.string.portrait_notification_tap_to_focus);
        naoVar.h = context;
        naoVar.a = true;
        naoVar.j = 5;
        this.a = naoVar.a();
    }

    public final void a() {
        if (this.f != 1) {
            this.f = 1;
            b();
        }
    }

    public final void b() {
        this.g.f(this.a);
    }

    public final void c(long j) {
        synchronized (this.c) {
            if (this.e) {
                this.h.schedule(new lgg(this), j);
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.h.cancel();
            this.e = false;
            a();
        }
    }
}
