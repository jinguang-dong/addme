package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kli extends klh {
    public final szh d;
    private final Executor e;

    public kli(Set set, szh szhVar, Executor executor, pbn pbnVar) {
        super(set, pbnVar);
        this.d = szhVar;
        this.e = new pbs(executor, pbnVar, "CameraStarter");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [sgt, shi] */
    public final syu a() {
        Set set = this.b;
        set.size();
        Collection.EL.stream(set).map(new jkv(12)).collect(Collectors.joining(","));
        ArrayList arrayList = new ArrayList(set);
        List.EL.sort(arrayList, Comparator$CC.comparing(new jkv(13)));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        pbn pbnVar = this.c;
        pbnVar.f("CameraStarter.start");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fre freVar = (fre) arrayList.get(i);
            try {
                String strC = freVar.c();
                String str = "!";
                if (freVar.a() != -1) {
                    str = "";
                }
                String str2 = "task:" + strC + str;
                pbnVar.f(str2);
                syu syuVarB = freVar.b();
                pbnVar.g();
                if (!syuVarB.isDone()) {
                    syuVarB.c(new kdx(pbnVar.a(str2), 8), sxo.a);
                }
                arrayList2.add(swz.i(syuVarB, new iaz(freVar, arrayList3, 2), sxo.a));
            } catch (Throwable th) {
                ((sgt) ((sgt) klh.a.b().i(th)).M((char) 3309)).s("Failed to run task");
                arrayList2.add(ske.L(th));
            }
        }
        pbn pbnVar2 = this.c;
        pbnVar2.g();
        syu syuVarI = swz.i(ske.I(arrayList2), new iaz(arrayList3, pbnVar2.a("CameraStarter.startAsync:" + Collection.EL.stream(arrayList2).map(new jkv(14)).filter(new hsj(10)).count()), 3, null), sxo.a);
        ojl.ck(syuVarI, new iyn(this, 6), this.e);
        return syuVarI;
    }
}
