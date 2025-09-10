package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class niq extends uht implements uiu {
    final /* synthetic */ azr a;
    final /* synthetic */ azr b;
    final /* synthetic */ azr c;
    final /* synthetic */ nhy d;
    final /* synthetic */ View e;
    final /* synthetic */ azr f;
    final /* synthetic */ azr g;
    final /* synthetic */ azr h;
    final /* synthetic */ gox i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niq(azr azrVar, azr azrVar2, azr azrVar3, nhy nhyVar, View view, gox goxVar, azr azrVar4, azr azrVar5, azr azrVar6, uhb uhbVar) {
        super(2, uhbVar);
        this.a = azrVar;
        this.b = azrVar2;
        this.c = azrVar3;
        this.d = nhyVar;
        this.e = view;
        this.i = goxVar;
        this.f = azrVar4;
        this.g = azrVar5;
        this.h = azrVar6;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((niq) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        Float f = (Float) this.a.a();
        if (f == null) {
            azr azrVar = this.h;
            if (((Boolean) azrVar.a()).booleanValue()) {
                azr azrVar2 = this.b;
                if (azrVar2 != null && !((Boolean) azrVar2.a()).booleanValue()) {
                    jsv.N(azrVar, false);
                    azr azrVar3 = this.c;
                    if (azrVar3 != null) {
                        azrVar3.b(false);
                    }
                }
                jsv.U(niz.c, this.d, this.e, this.i);
            }
        } else {
            jsv.N(this.h, true);
            azr azrVar4 = this.c;
            if (azrVar4 != null) {
                azrVar4.b(true);
            }
            jsv.Y(f.floatValue(), this.f, this.g, new jkc(this.e, 9), this.i);
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new niq(this.a, this.b, this.c, this.d, this.e, this.i, this.f, this.g, this.h, uhbVar);
    }
}
