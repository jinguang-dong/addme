package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class its extends uht implements uiu {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ iuh e;
    final /* synthetic */ iuf f;
    final /* synthetic */ itu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public its(iuh iuhVar, iuf iufVar, itu ituVar, uhb uhbVar) {
        super(2, uhbVar);
        this.e = iuhVar;
        this.f = iufVar;
        this.g = ituVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((its) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        uhi uhiVar = uhi.a;
        if (this.d != 0) {
            obj4 = this.c;
            obj3 = this.b;
            obj2 = this.a;
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            iuh iuhVar = this.e;
            iuf iufVar = this.f;
            itu ituVar = this.g;
            ocq ocqVarAt = ske.at(srg.a.m());
            ocqVarAt.T(iuhVar.f);
            List listUnmodifiableList = DesugarCollections.unmodifiableList(((srg) ((tpc) ocqVarAt.a).b).d);
            listUnmodifiableList.getClass();
            tsd tsdVar = new tsd(listUnmodifiableList);
            itr itrVar = new itr(iufVar, ituVar, iuhVar, null);
            this.a = ocqVarAt;
            this.b = ocqVarAt;
            this.c = tsdVar;
            this.d = 1;
            obj = ujp.P(itrVar, this);
            if (obj == uhiVar) {
                return uhiVar;
            }
            obj2 = ocqVarAt;
            obj3 = obj2;
            obj4 = tsdVar;
        }
        Iterable iterable = (Iterable) obj;
        obj4.getClass();
        iterable.getClass();
        tpc tpcVar = (tpc) ((ocq) obj3).a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        srg srgVar = (srg) tpcVar.b;
        srg srgVar2 = srg.a;
        tpw tpwVar = srgVar.d;
        if (!tpwVar.c()) {
            srgVar.d = tph.v(tpwVar);
        }
        tnq.e(iterable, srgVar.d);
        return ((ocq) obj2).S();
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new its(this.e, this.f, this.g, uhbVar);
    }
}
