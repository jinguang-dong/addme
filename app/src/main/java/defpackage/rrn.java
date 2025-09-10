package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rrn extends swn {
    private rrp a;
    private final int b;

    public rrn(rrp rrpVar, int i) {
        this.a = rrpVar;
        this.b = i;
    }

    @Override // defpackage.swn
    protected final void d() {
        AtomicLong atomicLong;
        long j;
        int i;
        int iA;
        boolean z;
        AtomicReference atomicReference;
        rro rroVar;
        rrp rrpVar = this.a;
        this.a = null;
        if (rrpVar == null) {
            return;
        }
        do {
            atomicLong = rrpVar.a;
            j = atomicLong.get();
            i = (int) j;
            iA = rrp.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(mn.h(j, "Refcount is: "));
            }
            z = i == -2147483647;
            if (z) {
                iA++;
            }
        } while (!atomicLong.compareAndSet(j, rrp.b(iA, i - 1)));
        if (z) {
            do {
                atomicReference = rrpVar.b;
                rroVar = (rro) atomicReference.get();
                if (rroVar == null) {
                    return;
                }
                if (rroVar.a > this.b) {
                    return;
                } else {
                    rroVar.cancel(true);
                }
            } while (!a.w(atomicReference, rroVar));
        }
    }

    @Override // defpackage.swn
    protected final String ez() {
        Object obj;
        rrp rrpVar = this.a;
        if (rrpVar == null || (obj = rrpVar.d.a) == null) {
            return null;
        }
        String strBx = a.bx(obj, "callable=[", "]");
        rro rroVar = (rro) this.a.b.get();
        if (rroVar == null) {
            return strBx;
        }
        return strBx + ", trial=[" + rroVar.toString() + "]";
    }

    @Override // defpackage.swn
    public final boolean f(syu syuVar) {
        return super.f(syuVar);
    }
}
