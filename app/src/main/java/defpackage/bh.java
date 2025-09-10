package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bh extends bk {
    final /* synthetic */ pa a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ ok c;
    final /* synthetic */ ob d;
    final /* synthetic */ bm e;

    public bh(bm bmVar, pa paVar, AtomicReference atomicReference, ok okVar, ob obVar) {
        this.e = bmVar;
        this.a = paVar;
        this.b = atomicReference;
        this.c = okVar;
        this.d = obVar;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.bk
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        bm bmVar = this.e;
        sb.append(bmVar.k);
        sb.append("_rq#");
        sb.append(bmVar.ac.getAndIncrement());
        final String string = sb.toString();
        final ok okVar = this.c;
        Object objA = this.a.a();
        okVar.getClass();
        final ob obVar = this.d;
        obVar.getClass();
        cwc lifecycle = bmVar.getLifecycle();
        if (lifecycle.a.a(cwb.d)) {
            throw new IllegalStateException("LifecycleOwner " + bmVar + " is attempting to register while current state is " + lifecycle.a + ". LifecycleOwners must call register before they are STARTED.");
        }
        final og ogVar = (og) objA;
        ogVar.d(string);
        Map map = ogVar.c;
        ebn ebnVar = (ebn) map.get(string);
        if (ebnVar == null) {
            ebnVar = new ebn(lifecycle);
        }
        AtomicReference atomicReference = this.b;
        cwf cwfVar = new cwf() { // from class: od
            @Override // defpackage.cwf
            public final void a(cwh cwhVar, cwa cwaVar) {
                og ogVar2 = ogVar;
                String str = string;
                if (cwa.ON_START != cwaVar) {
                    if (cwa.ON_STOP == cwaVar) {
                        ogVar2.e.remove(str);
                        return;
                    } else {
                        if (cwa.ON_DESTROY == cwaVar) {
                            ogVar2.e(str);
                            return;
                        }
                        return;
                    }
                }
                ok okVar2 = okVar;
                ob obVar2 = obVar;
                ogVar2.e.put(str, new byz(obVar2, okVar2, (byte[]) null));
                Map map2 = ogVar2.f;
                if (map2.containsKey(str)) {
                    Object obj = map2.get(str);
                    map2.remove(str);
                    obVar2.a(obj);
                }
                Bundle bundle = ogVar2.g;
                oa oaVar = (oa) bundle.getParcelable(str, oa.class);
                if (oaVar != null) {
                    bundle.remove(str);
                    obVar2.a(okVar2.a(oaVar.a, oaVar.b));
                }
            }
        };
        ((cwc) ebnVar.a).a(cwfVar);
        ebnVar.b.add(cwfVar);
        map.put(string, ebnVar);
        atomicReference.set(new oe());
    }
}
