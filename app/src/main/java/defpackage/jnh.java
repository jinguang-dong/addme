package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jnh implements syf {
    final /* synthetic */ long a;
    final /* synthetic */ jnm b;

    public jnh(jnm jnmVar, long j) {
        this.a = j;
        this.b = jnmVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        ((sgt) jnm.a.c().M(2859)).s("Cannot get final shutter timestamp from microvideo as it failed to start!");
    }

    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.b.execute(new hcv((jnl) obj, TimeUnit.MICROSECONDS.convert(this.a, TimeUnit.NANOSECONDS), 6));
    }
}
