package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import com.google.android.apps.camera.sideline.SidelineJobService;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lwf {
    public static final sgv a = sgv.g("lwf");
    public static final Duration b = Duration.ofSeconds(70);
    public static final Duration c = Duration.ofMinutes(1);
    private final long A;
    public final Context d;
    public final hbc e;
    public final String f;
    public final String g;
    public final Executor h;
    public final Executor i;
    public final ScheduledExecutorService j;
    public final out k;
    public final PackageInstaller l;
    public final lwm m;
    public final hfw n;
    public final lwl o;
    public final uem p;
    public final uem q;
    public final pbn r;
    public Future u;
    public pbp w;
    public final luj x;
    public final luj y;
    public final gox z;
    public final AtomicBoolean s = new AtomicBoolean();
    public final AtomicBoolean t = new AtomicBoolean();
    public long v = -1;

    static {
        try {
            System.loadLibrary("brotli");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public lwf(Context context, hbc hbcVar, String str, String str2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, out outVar, gox goxVar, lwm lwmVar, hfw hfwVar, lwl lwlVar, luj lujVar, luj lujVar2, uem uemVar, uem uemVar2, PackageInfo packageInfo, pbn pbnVar) {
        this.d = context;
        this.e = hbcVar;
        this.f = str;
        this.g = str2;
        this.h = executor;
        this.i = executor2;
        this.j = scheduledExecutorService;
        this.k = outVar;
        this.z = goxVar;
        this.m = lwmVar;
        this.n = hfwVar;
        this.o = lwlVar;
        this.x = lujVar;
        this.y = lujVar2;
        this.p = uemVar;
        this.q = uemVar2;
        this.r = pbnVar;
        this.A = packageInfo.getLongVersionCode();
        this.l = context.getPackageManager().getPackageInstaller();
    }

    public final void a() {
        if (this.t.compareAndSet(false, true)) {
            this.s.set(false);
            this.k.c(new lmw(this, 10));
            Future future = this.u;
            if (future != null) {
                future.cancel(false);
            }
            this.u = null;
        }
    }

    public final void b(int i, Optional optional) {
        int i2;
        ((sgt) a.b().M(4476)).y("Install failed! Status (%d): %s", i, optional.orElse(null));
        if (this.e.b(hbc.DOGFOOD)) {
            this.z.C();
        }
        d();
        a();
        int i3 = 1;
        if (i != 1) {
            i3 = i;
            i2 = 2;
        } else if (optional.isPresent() && Pattern.matches("INSTALL_FAILED_INTERNAL_ERROR.*signature.*not compatible.*", (CharSequence) optional.get())) {
            i2 = 12;
        } else {
            i = 1;
            i3 = i;
            i2 = 2;
        }
        this.o.b(i3, i2);
    }

    public final void c() {
        if (((ind) this.q).a().schedule(new JobInfo.Builder(58451, new ComponentName(this.d, (Class<?>) SidelineJobService.class)).setPersisted(true).setRequiresDeviceIdle(true).build()) == 1) {
            return;
        }
        ((sgt) a.c().M(4483)).s("Failed to schedule retry!");
    }

    public final void d() {
        this.y.d(luf.aD, Long.valueOf(this.A));
    }
}
