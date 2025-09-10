package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rrz extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        rcc.e();
        rsn rsnVar = new rsn();
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = rsa.a;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, rsnVar);
        }
        return rsnVar;
    }
}
