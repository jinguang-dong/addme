package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class van {
    private static final vam a = new vam(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final vam a() {
        AtomicReference atomicReferenceC = c();
        vam vamVar = a;
        vam vamVar2 = (vam) atomicReferenceC.getAndSet(vamVar);
        if (vamVar2 == vamVar) {
            return new vam();
        }
        if (vamVar2 == null) {
            atomicReferenceC.set(null);
            return new vam();
        }
        atomicReferenceC.set(vamVar2.f);
        vamVar2.f = null;
        vamVar2.c = 0;
        return vamVar2;
    }

    public static final void b(vam vamVar) {
        if (vamVar.f != null || vamVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (vamVar.d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        vam vamVar2 = a;
        vam vamVar3 = (vam) atomicReferenceC.getAndSet(vamVar2);
        if (vamVar3 != vamVar2) {
            int i = vamVar3 != null ? vamVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(vamVar3);
                return;
            }
            vamVar.f = vamVar3;
            vamVar.b = 0;
            vamVar.c = i + 8192;
            atomicReferenceC.set(vamVar);
        }
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}
