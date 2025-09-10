package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
final class psa {
    private final Deque a = new ArrayDeque();
    private double b;
    private double c;
    private double d;
    private double e;
    private prz f;
    private prz g;

    final synchronized void a(double d) {
        prz przVar = this.f;
        if (przVar != null && d > this.d) {
            przVar.a(d);
        }
        Deque deque = this.a;
        Double d2 = (Double) deque.peekLast();
        if (d2 != null) {
            double dAbs = Math.abs(d - d2.doubleValue()) / d2.doubleValue();
            prz przVar2 = this.g;
            if (przVar2 != null && dAbs > this.e) {
                przVar2.a(dAbs);
            }
        }
        if (deque.size() > 120) {
            double dDoubleValue = ((Double) deque.remove()).doubleValue();
            this.b -= dDoubleValue;
            this.c -= dDoubleValue * dDoubleValue;
        }
        this.b += d;
        this.c += d * d;
        deque.add(Double.valueOf(d));
    }

    final synchronized void b(double d, prz przVar) {
        this.d = d;
        this.f = przVar;
    }

    final synchronized void c(prz przVar) {
        this.e = 0.25d;
        this.g = przVar;
    }
}
