package defpackage;

import android.animation.Animator;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irg implements irj {
    final /* synthetic */ irk a;

    public irg(irk irkVar) {
        this.a = irkVar;
    }

    private final void c(iqq iqqVar) {
        irk irkVar = this.a;
        Optional optionalA = irkVar.a(irk.c, iqqVar);
        byte[] bArr = null;
        if (optionalA.isPresent()) {
            ojl.cj(((iqy) optionalA.get()).f, new fct(irkVar, iqqVar, 5, bArr));
        } else {
            irkVar.c(iri.c);
        }
        Optional optionalA2 = irkVar.a(irk.b, iqqVar);
        if (optionalA2.isPresent()) {
            ojl.cj(((iqy) optionalA2.get()).f, new fct(irkVar, iqqVar, 6, bArr));
        } else {
            irkVar.c(iri.CHARACTER_MAIN);
        }
        irkVar.k(iqqVar);
    }

    @Override // defpackage.irj
    public final void a(Animator animator, iqq iqqVar) {
        isj isjVar;
        iqy iqyVar;
        elh elhVar = (elh) animator;
        irk irkVar = this.a;
        Map map = irkVar.g;
        iri iriVar = iri.CHARACTER_MAIN;
        if (((efs) map.get(iriVar)) == null || !irkVar.l.d() || (isjVar = (isj) irk.b.get(iqqVar)) == null || (iqyVar = (iqy) irkVar.d.get(isjVar)) == null) {
            return;
        }
        if (!iqyVar.h) {
            sbp sbpVar = iqyVar.i;
            if (sbpVar.isEmpty() || !sbpVar.contains(Integer.valueOf(Math.round(elhVar.f)))) {
                return;
            }
        }
        iru iruVar = irkVar.j;
        iruVar.d();
        iqp iqpVarA = iruVar.a();
        if (irkVar.o != iqpVarA) {
            irkVar.n = Optional.of(iqpVarA);
            irkVar.o();
            efs efsVar = (efs) map.get(iriVar);
            if (efsVar != null) {
                efsVar.l();
            }
        }
    }

    @Override // defpackage.irj
    public final void b(iqq iqqVar) {
        sgv sgvVar = irk.a;
        irk irkVar = this.a;
        if (!irkVar.l.d()) {
            c(irkVar.p);
            irkVar.n = Optional.empty();
            return;
        }
        List list = irkVar.e;
        list.remove(irkVar.p);
        Object objA = irkVar.o;
        if (list.isEmpty()) {
            if (irkVar.n.isPresent()) {
                objA = irkVar.n.get();
                irkVar.n = Optional.empty();
            } else {
                iru iruVar = irkVar.j;
                iruVar.d();
                objA = iruVar.a();
                irkVar.o();
            }
            sbv sbvVar = iqr.a;
            if (sbvVar.containsKey(irkVar.o)) {
                iqo iqoVar = (iqo) sbvVar.get(irkVar.o);
                iqoVar.getClass();
                iqoVar.c.ifPresent(new ird(irkVar, 1));
            }
            if (sbvVar.containsKey(objA)) {
                iqo iqoVar2 = (iqo) sbvVar.get(objA);
                iqoVar2.getClass();
                iqoVar2.b.ifPresent(new ird(irkVar, 0));
                iqo iqoVar3 = (iqo) sbvVar.get(objA);
                iqoVar3.getClass();
                iqq iqqVar2 = iqoVar3.a;
                if (irkVar.n(iqqVar2)) {
                    list.add(iqqVar2);
                }
            }
        }
        iqq iqqVar3 = list.isEmpty() ? irkVar.p : (iqq) list.get(0);
        c(iqqVar3);
        irkVar.p = iqqVar3;
        irkVar.o = (iqp) objA;
        irkVar.j.c(irkVar.o);
    }
}
