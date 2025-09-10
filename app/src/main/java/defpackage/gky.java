package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gky {
    public final Context a;
    public final moo b;
    public final rwc c;
    public final Uri d;
    public final String e;
    public final ScheduledExecutorService f;
    public final Runnable g;
    public ScheduledFuture h;
    public rwc i = rvk.a;
    public final mwq j;
    private final Executor k;
    private syu l;

    public gky(moo mooVar, rwc rwcVar, mwq mwqVar, Context context, Executor executor, Uri uri, String str, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        this.b = mooVar;
        this.c = rwcVar;
        this.j = mwqVar;
        this.a = context;
        this.k = executor;
        this.d = uri;
        this.e = str;
        this.f = scheduledExecutorService;
        this.g = runnable;
        mooVar.d(new gkx(this, mooVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            return;
        }
        this.h.cancel(false);
    }

    public final void b() {
        if (h() != 1) {
            this.j.k(this.d);
            c();
        }
    }

    public final void c() {
        syu syuVarJ = this.j.j(this.d);
        this.l = syuVarJ;
        ojl.ck(syuVarJ, new fqz(this, 3), this.k);
    }

    public final void d() {
        syu syuVar = this.l;
        if (syuVar != null && !syuVar.isDone()) {
            this.l.cancel(false);
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, moo] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, moo] */
    public final void e() {
        f();
        moo mooVar = this.b;
        mooVar.b();
        mooVar.a();
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            rwcVar.c().a();
            rwcVar.c().b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, moo] */
    public final void f() {
        this.b.o();
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            rwcVar.c().o();
        }
    }

    public final void g(gky gkyVar) {
        this.i = rwc.j(gkyVar);
    }

    public final int h() {
        return jsv.E(this.a);
    }
}
