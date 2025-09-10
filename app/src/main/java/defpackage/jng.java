package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.concurrent.DesugarTimeUnit;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jng implements jnz {
    public final jnm a;
    public final jnz b;
    final /* synthetic */ ltd c;
    final /* synthetic */ long d;
    final /* synthetic */ szh e;
    final /* synthetic */ lss f;
    final /* synthetic */ jnm g;

    public jng(jnm jnmVar, ltd ltdVar, long j, szh szhVar, lss lssVar) {
        this.c = ltdVar;
        this.d = j;
        this.e = szhVar;
        this.f = lssVar;
        this.g = jnmVar;
        this.a = jnmVar;
        this.b = new jnr(ltdVar, Long.valueOf(DesugarTimeUnit.convert(TimeUnit.MILLISECONDS, Duration.of(j, ChronoUnit.MICROS))), jnmVar.r);
    }

    @Override // defpackage.jnz
    public final syu a(final mfo mfoVar, final lsu lsuVar, final rwc rwcVar, final long j, final mdm mdmVar) {
        pwj pwjVar = new pwj(this, mfoVar, lsuVar, rwcVar, mdmVar, 1);
        final lss lssVar = this.f;
        return jnm.b(this.e, pwjVar, new sxi() { // from class: jne
            /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                RuntimeException runtimeException = (RuntimeException) obj;
                if (!(runtimeException instanceof CancellationException)) {
                    lss lssVar2 = lssVar;
                    ((sgt) ((sgt) jnm.a.b().i(runtimeException)).M((char) 2858)).s("Error during long shot.");
                    lssVar2.F(nfo.a, runtimeException);
                }
                mdm mdmVar2 = mdmVar;
                long j2 = j;
                rwc rwcVar2 = rwcVar;
                lsu lsuVar2 = lsuVar;
                return this.a.b.a(mfoVar, lsuVar2, rwcVar2, j2, mdmVar2);
            }
        });
    }

    @Override // defpackage.jnz
    public final syu b(mfo mfoVar, InputStream inputStream, lsu lsuVar, rwc rwcVar, long j, String str, mdm mdmVar) {
        return jnm.b(this.e, new pyi(this, mfoVar, inputStream, lsuVar, rwcVar, mdmVar, 1), new pzp(this, mfoVar, inputStream, lsuVar, rwcVar, j, str, mdmVar, 1));
    }

    @Override // defpackage.jnz
    public final void c() {
        ske.W(this.e, new jnf(this), sxo.a);
    }
}
