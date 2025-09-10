package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nit implements PointerInputEventHandler {
    final /* synthetic */ azr a;
    final /* synthetic */ azr b;
    final /* synthetic */ azr c;
    final /* synthetic */ azr d;
    final /* synthetic */ azr e;
    final /* synthetic */ nhy f;
    final /* synthetic */ View g;
    final /* synthetic */ gox h;

    public nit(azr azrVar, azr azrVar2, azr azrVar3, azr azrVar4, azr azrVar5, nhy nhyVar, View view, gox goxVar) {
        this.a = azrVar;
        this.b = azrVar2;
        this.c = azrVar3;
        this.d = azrVar4;
        this.e = azrVar5;
        this.f = nhyVar;
        this.g = view;
        this.h = goxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(bqc bqcVar, uhb uhbVar) {
        final azr azrVar = this.a;
        azr azrVar2 = this.b;
        final azr azrVar3 = this.c;
        au auVar = new au(azrVar, azrVar2, azrVar3, 9);
        final azr azrVar4 = this.d;
        final azr azrVar5 = this.e;
        final nhy nhyVar = this.f;
        final gox goxVar = this.h;
        final View view = this.g;
        Object objK = jsv.K(bqcVar, auVar, new uif() { // from class: nir
            @Override // defpackage.uif
            public final Object a() {
                jsv.N(azrVar3, false);
                azr azrVar6 = azrVar4;
                if (azrVar6 != null) {
                    azrVar6.b(false);
                }
                azr azrVar7 = azrVar;
                if (azrVar7 != null) {
                    azrVar7.b(false);
                }
                azr azrVar8 = azrVar5;
                if (azrVar8 != null) {
                    azrVar8.b(null);
                }
                gox goxVar2 = goxVar;
                View view2 = view;
                jsv.U(niz.c, nhyVar, view2, goxVar2);
                return ufg.a;
            }
        }, new nis(azrVar4, azrVar5, azrVar2, goxVar, view, 0), uhbVar);
        return objK == uhi.a ? objK : ufg.a;
    }
}
