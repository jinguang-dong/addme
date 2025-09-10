package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ael extends uht implements uiu {
    Object a;
    int b;
    final /* synthetic */ aen c;
    final /* synthetic */ long d;
    final /* synthetic */ ocq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ael(aen aenVar, long j, ocq ocqVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = aenVar;
        this.d = j;
        this.e = ocqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ael) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        Object obj2;
        uhi uhiVar = uhi.a;
        int i = this.b;
        if (i == 0) {
            rnt.aN(obj);
            aen aenVar = this.c;
            ujw ujwVar = new ujw();
            bad.A(aenVar, ain.b, new sh(ujwVar, 7));
            if (!ujwVar.a) {
                long j = aex.a;
                ViewParent parent = amo.u(aenVar).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
            }
            long j2 = aex.a;
            this.b = 1;
            if (ung.e(j2, this) != uhiVar) {
            }
            return uhiVar;
        }
        if (i != 1) {
            obj2 = this.a;
            rnt.aN(obj);
            this.c.d = (akd) obj2;
            return ufg.a;
        }
        rnt.aN(obj);
        akd akdVar = new akd(this.d);
        ocq ocqVar = this.e;
        this.a = akdVar;
        this.b = 2;
        if (ocqVar.aE(akdVar, this) != uhiVar) {
            obj2 = akdVar;
            this.c.d = (akd) obj2;
            return ufg.a;
        }
        return uhiVar;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new ael(this.c, this.d, this.e, uhbVar);
    }
}
