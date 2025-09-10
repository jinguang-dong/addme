package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import android.view.Window;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nca implements jhh, jgw, jhf, jhc, jhe, paq, jfv {
    private static final sgv b = sgv.g("nca");
    private final Window c;
    private final ovi d;
    private final Runnable e;
    private final Intent f;
    private final PowerManager g;
    private final itl h;
    private final paq i;
    private final ocq m;
    private boolean j = false;
    private boolean k = true;
    private int l = 1;
    public int a = 1;

    public nca(final out outVar, Window window, itl itlVar, ocq ocqVar, ScheduledExecutorService scheduledExecutorService, fql fqlVar, Intent intent, PowerManager powerManager) {
        this.c = window;
        this.f = intent;
        this.g = powerManager;
        this.h = itlVar;
        this.m = ocqVar;
        this.d = new ovi(scheduledExecutorService, 120000L, TimeUnit.MILLISECONDS);
        this.i = fqlVar.a(new fqk() { // from class: nbz
            @Override // defpackage.fqk
            public final void a(Throwable th) {
                outVar.execute(new mub(this.a, 19));
            }
        });
        this.e = new lor(outVar, (Runnable) new mvn(this, 4, null), 12);
    }

    private final void j(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("extra_turn_screen_on", false)) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = this.g.newWakeLock(268435466, "camera_screen_on");
        wakeLockNewWakeLock.acquire();
        wakeLockNewWakeLock.release();
    }

    private final void k() {
        if (this.k) {
            return;
        }
        i();
    }

    public final synchronized void a() {
        if (this.j) {
            ((sgt) b.c().M(5300)).s("session closed. will NOT mute ringtone.");
        } else {
            ((mwq) this.m.a).M(3);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.j = true;
        this.i.close();
    }

    public final void e() {
        if (this.l != 3) {
            h();
        }
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.k = true;
        this.a = 1;
        f();
        i();
        ((mwq) this.m.a).M(1);
    }

    @Override // defpackage.jhe
    public final void eb() {
        this.k = false;
        i();
        ((mwq) this.m.a).M(2);
    }

    @Override // defpackage.jhf
    public final void ej() {
        h();
    }

    public final synchronized void f() {
        if (this.j) {
            ((sgt) b.c().M(5301)).s("session closed. will NOT restore ringtone.");
        } else {
            ((mwq) this.m.a).M(2);
        }
    }

    public final void g() {
        this.a = 3;
        k();
    }

    public final void h() {
        this.a = 2;
        k();
    }

    public final void i() {
        out.a();
        if (this.a == 1 && this.l != 1) {
            this.c.clearFlags(128);
        }
        if (this.a != 1 && this.l == 1) {
            this.c.addFlags(128);
        }
        ovi oviVar = this.d;
        oviVar.b();
        if (this.a == 2) {
            oviVar.execute(this.e);
        }
        this.l = this.a;
    }

    @Override // defpackage.jfv
    public final void m(Intent intent) {
        j(intent);
    }

    @Override // defpackage.jgw
    public final void w() {
        h();
        j(this.f);
        rnu rnuVar = new rnu(this, null);
        itl itlVar = this.h;
        synchronized (itlVar.f) {
            itlVar.e.add(rnuVar);
        }
    }
}
