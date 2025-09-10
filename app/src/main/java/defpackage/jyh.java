package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jyh extends pog {
    final AtomicBoolean a;
    final /* synthetic */ long b;
    final /* synthetic */ poj c;
    final /* synthetic */ jyi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyh(jyi jyiVar, poj pojVar, long j, poj pojVar2) {
        super(pojVar);
        this.b = j;
        this.c = pojVar2;
        this.d = jyiVar;
        this.a = new AtomicBoolean(false);
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (!this.a.getAndSet(true)) {
            jyj jyjVar = this.d.c;
            jyjVar.b.b(new Object[0]);
            jyjVar.d.c(SystemClock.elapsedRealtime() - this.b, new Object[0]);
        }
        this.c.close();
    }
}
