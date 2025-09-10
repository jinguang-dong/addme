package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asd implements url {
    final /* synthetic */ List a;
    final /* synthetic */ und b;
    final /* synthetic */ ass c;

    public asd(List list, und undVar, ass assVar) {
        this.a = list;
        this.b = undVar;
        this.c = assVar;
    }

    @Override // defpackage.url
    public final /* bridge */ /* synthetic */ Object a(Object obj, uhb uhbVar) {
        akb akbVar = (akb) obj;
        if (akbVar instanceof ajz) {
            this.a.add(akbVar);
        } else if (akbVar instanceof aka) {
            this.a.remove(((aka) akbVar).a);
        } else if (akbVar instanceof ajx) {
            this.a.add(akbVar);
        } else if (akbVar instanceof ajy) {
            this.a.remove(((ajy) akbVar).a);
        } else if (akbVar instanceof akd) {
            this.a.add(akbVar);
        } else if (akbVar instanceof ake) {
            this.a.remove(((ake) akbVar).a);
        } else if (akbVar instanceof akc) {
            this.a.remove(((akc) akbVar).a);
        }
        ukc.C(this.b, null, 0, new aej(this.c, (akb) ske.bG(this.a), (uhb) null, 11), 3);
        return ufg.a;
    }
}
