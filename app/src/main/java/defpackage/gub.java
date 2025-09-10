package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gub {
    private static final sgv a = sgv.g("gub");
    private final Deque b = new ArrayDeque();

    final synchronized rwc a() {
        Deque deque = this.b;
        if (deque.isEmpty()) {
            return rvk.a;
        }
        return rwc.j((got) deque.getLast());
    }

    public final synchronized void b() {
        Deque deque = this.b;
        if (deque.isEmpty()) {
            ((sgt) a.c().M(1046)).s("onCameraEnd. Resource Q is empty!");
        } else {
            ((hpj) ((got) deque.removeFirst()).b).j("camera-coach-session");
            deque.size();
        }
    }

    final synchronized void c(got gotVar) {
        ((hpj) gotVar.b).i("camera-coach-session");
        Deque deque = this.b;
        deque.addLast(gotVar);
        deque.size();
    }
}
