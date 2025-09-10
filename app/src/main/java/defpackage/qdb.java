package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdb implements rdi {
    public final puo a;
    public final AtomicLong b = new AtomicLong();
    final /* synthetic */ qdc c;
    private final String d;

    public qdb(qdc qdcVar, String str, puo puoVar) {
        this.c = qdcVar;
        this.d = str;
        this.a = puoVar;
    }

    @Override // defpackage.rdi
    public final void a(long j) {
        AtomicLong atomicLong = this.b;
        atomicLong.getAndAdd(j);
        atomicLong.get();
        int i = qbu.a;
    }

    @Override // defpackage.rdi
    public final void b() {
        synchronized (qdc.class) {
            qdc qdcVar = this.c;
            if (qdcVar.d.containsKey(this.d)) {
                qdcVar.a.execute(new oze(this, 7));
            }
        }
    }
}
