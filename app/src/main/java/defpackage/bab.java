package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bab implements uif {
    final /* synthetic */ bac a;

    public bab(bac bacVar) {
        this.a = bacVar;
    }

    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        List list = this.a.a;
        zu zuVar = new zu(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            azh azhVar = (azh) list.get(i);
            Object obj = azhVar.b;
            bdl.b(zuVar, obj != null ? new azg(Integer.valueOf(azhVar.a), obj) : Integer.valueOf(azhVar.a), azhVar);
        }
        return new bdl(zuVar);
    }
}
