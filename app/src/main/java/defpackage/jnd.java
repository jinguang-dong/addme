package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.concurrent.DesugarTimeUnit;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jnd implements jsh {
    final /* synthetic */ kbx a;
    final /* synthetic */ jsh b;
    final /* synthetic */ jnl c;
    final /* synthetic */ qez d;
    final /* synthetic */ boolean e;
    final /* synthetic */ long f;
    final /* synthetic */ jnm g;
    final /* synthetic */ ree h;

    public jnd(jnm jnmVar, kbx kbxVar, jsh jshVar, ree reeVar, jnl jnlVar, qez qezVar, boolean z, long j) {
        this.a = kbxVar;
        this.b = jshVar;
        this.h = reeVar;
        this.c = jnlVar;
        this.d = qezVar;
        this.e = z;
        this.f = j;
        this.g = jnmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, jub] */
    @Override // defpackage.jsh
    public final void a(jry jryVar) {
        this.a.a();
        this.b.a(jryVar);
        this.d.c();
        this.h.d();
        jnl jnlVar = this.c;
        jnlVar.t = rwc.j(jryVar);
        boolean z = this.e;
        if (!z) {
            long jConvert = DesugarTimeUnit.convert(TimeUnit.MILLISECONDS, Duration.of(this.f, ChronoUnit.MICROS));
            Long lValueOf = Long.valueOf(jConvert);
            lValueOf.getClass();
            owq owqVar = this.g.r;
            if (jConvert >= ((Long) ((Pair) owqVar.dL()).first).longValue()) {
                owqVar.a(new Pair(lValueOf, true));
            }
        }
        sgv sgvVar = jnm.a;
        if (z) {
            if (jnlVar.q.h()) {
                jnm jnmVar = this.g;
                jnmVar.v.g(((pfl) jnlVar.q.c()).a);
            } else {
                ((sgt) jnm.a.c().M(2856)).s("Didn't take second shot since UI resources are missing");
            }
        }
        jnlVar.q = rvk.a;
    }

    @Override // defpackage.jsh
    public final void b(long j, jsl jslVar) {
        this.a.b(j);
        this.b.b(j, jslVar);
        this.h.d();
        rwc rwcVarJ = rwc.j(Long.valueOf(SystemClock.elapsedRealtime()));
        jnl jnlVar = this.c;
        jnlVar.r = rwcVarJ;
        if (jnlVar.p) {
            jnm jnmVar = this.g;
            rnt.L(true);
            jnw jnwVar = new jnw(jnmVar, jnlVar, 1);
            ltd ltdVar = jnlVar.a;
            Handler handler = jnmVar.l;
            handler.postDelayed(jnwVar, ltdVar, 15000L);
            jnm.f(jnlVar.g, ltdVar, handler);
        } else {
            jnlVar.q = rvk.a;
        }
        sgv sgvVar = jnm.a;
    }
}
