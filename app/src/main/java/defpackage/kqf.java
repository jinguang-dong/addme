package defpackage;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqf implements kqh {
    final /* synthetic */ kqg a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public kqf(kqg kqgVar) {
        this.a = kqgVar;
    }

    @Override // defpackage.kqh, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        kqg kqgVar = this.a;
        synchronized (kqgVar.b) {
            kqgVar.e++;
            kqgVar.d.a = Integer.valueOf(kqgVar.a());
        }
        ows owsVar = kqgVar.d;
        owsVar.a();
        synchronized (kqgVar.b) {
            LinkedList linkedList = kqgVar.c;
            scf scfVar = (scf) linkedList.peekFirst();
            if (scfVar == null) {
                return;
            }
            if (!kqgVar.f) {
                throw null;
            }
            scfVar.a = new kqk("FiniteTicketPool is closed.");
            linkedList.removeFirst();
            owsVar.a = Integer.valueOf(kqgVar.a());
            owsVar.a();
            throw null;
        }
    }
}
