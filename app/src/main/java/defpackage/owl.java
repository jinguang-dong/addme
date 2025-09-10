package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owl {
    public static final paq a = new pan(0);

    @SafeVarargs
    public static owf a(owf... owfVarArr) {
        ArrayList arrayList = new ArrayList();
        for (owf owfVar : owfVarArr) {
            arrayList.add(owfVar);
        }
        return new owe(arrayList);
    }

    public static owf b(Collection collection) {
        return h(new owe(collection), new leb(19));
    }

    @SafeVarargs
    public static owf c(owf... owfVarArr) {
        return b(Arrays.asList(owfVarArr));
    }

    public static owf d(owf owfVar, Comparable comparable) {
        return h(owfVar, new kve(comparable, 12));
    }

    public static owf e(Collection collection) {
        a.I(!collection.isEmpty());
        return h(new owe(collection), new mdv(8));
    }

    public static owf f(Collection collection) {
        a.I(!collection.isEmpty());
        return h(new owe(collection), new mdv(7));
    }

    @SafeVarargs
    public static owf g(owf... owfVarArr) {
        return f(Arrays.asList(owfVarArr));
    }

    public static owf h(owf owfVar, rvu rvuVar) {
        return owb.a(new owh(owfVar, rvuVar, owfVar));
    }

    public static paq i(owf owfVar, Runnable runnable, Executor executor) {
        owfVar.getClass();
        executor.getClass();
        return owfVar.dK(new nta(runnable, 11), executor);
    }

    public static paq j(owf owfVar, pau pauVar, Executor executor) {
        owfVar.getClass();
        executor.getClass();
        return owfVar.dK(new owk(pauVar), executor);
    }

    public static paq k(owf owfVar, pau pauVar) {
        return owfVar.dK(pauVar, new sxp());
    }

    public static syu l(owf owfVar, our ourVar) {
        final szh szhVar = new szh();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        our ourVarC = ourVar.c();
        ourVarC.d(owfVar.dK(new ktd(atomicBoolean, ourVarC, 16), sxo.a));
        ourVarC.d(new paq() { // from class: owg
            @Override // defpackage.paq, java.lang.AutoCloseable
            public final void close() {
                szhVar.e(Boolean.valueOf(atomicBoolean.get()));
            }
        });
        return szhVar;
    }
}
