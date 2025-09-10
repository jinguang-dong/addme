package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdj implements rdv {
    public final rdi a;
    private final rdh b;
    private final long c;
    private long d;

    public rdj(rdi rdiVar, rdh rdhVar, long j, TimeUnit timeUnit) {
        this.a = rdiVar;
        this.b = rdhVar;
        this.c = timeUnit.toMillis(j);
        this.d = rdhVar.a();
    }

    @Override // defpackage.rdv
    public final void a(int i) {
        rdi rdiVar = this.a;
        rdiVar.a(i);
        rdh rdhVar = this.b;
        if (rdhVar.a() - this.d >= this.c) {
            rdiVar.b();
            this.d = rdhVar.a();
        }
    }

    @Override // defpackage.rdv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
