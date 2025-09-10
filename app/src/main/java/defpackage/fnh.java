package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fnh implements paq {
    private final Queue a = new PriorityQueue(10, Comparator$CC.comparingLong(new jyd(1)));
    private boolean b = false;

    public final synchronized Optional a(long j) {
        Queue queue = this.a;
        Optional optionalMin = Collection.EL.stream(queue).min(Comparator$CC.comparingLong(new ldm(j, 1)));
        if (optionalMin.isPresent()) {
            queue.remove(optionalMin.get());
            return optionalMin;
        }
        return Optional.empty();
    }

    public final synchronized void b(fmg fmgVar) {
        if (this.b) {
            return;
        }
        while (true) {
            Queue queue = this.a;
            if (queue.size() < 10) {
                queue.add(fmgVar);
                return;
            }
            ((fmg) queue.remove()).close();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b = true;
        fkj fkjVar = new fkj(3);
        Queue queue = this.a;
        Iterable$EL.forEach(queue, fkjVar);
        queue.clear();
    }
}
