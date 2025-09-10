package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import j$.time.Duration;
import j$.util.Collection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.ToDoubleFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lky {
    public static final Duration a = Duration.ofMillis(2500);
    private final Deque b = new ArrayDeque();

    public final double a() {
        return Collection.EL.stream(this.b).mapToDouble(new ToDoubleFunction() { // from class: lkx
            @Override // java.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                Duration duration = lky.a;
                return ((Double) ((Pair) obj).first).doubleValue();
            }
        }).average().orElse(Double.NaN);
    }

    public final void b(double d) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Pair pairCreate = Pair.create(Double.valueOf(d), Long.valueOf(jElapsedRealtimeNanos));
        Deque deque = this.b;
        deque.addFirst(pairCreate);
        ujp.aW(deque, new jmj(jElapsedRealtimeNanos, 3));
    }
}
