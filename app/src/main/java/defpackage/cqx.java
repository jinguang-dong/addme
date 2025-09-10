package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqx extends uht implements uiu {
    Object a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqx(List list, List list2, uhb uhbVar) {
        super(2, uhbVar);
        this.f = list;
        this.g = list2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqx) c(obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.d;
        if (i == 0) {
            rnt.aN(obj);
            return this.e;
        }
        if (i != 1) {
            rnt.aN(obj);
            return obj;
        }
        List list = (List) this.e;
        rnt.aN(obj);
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        list.add(new acr((cqv) null, (uhb) null, 2));
        this.e = list;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 2;
        throw null;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        cqx cqxVar = new cqx(this.f, this.g, uhbVar);
        cqxVar.e = obj;
        return cqxVar;
    }
}
