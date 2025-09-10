package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class etd {
    private final Queue a;

    public etd() {
        char[] cArr = fax.a;
        this.a = new ArrayDeque(20);
    }

    public abstract eto a();

    final eto b() {
        eto etoVar = (eto) this.a.poll();
        return etoVar == null ? a() : etoVar;
    }

    public final void c(eto etoVar) {
        Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(etoVar);
        }
    }
}
