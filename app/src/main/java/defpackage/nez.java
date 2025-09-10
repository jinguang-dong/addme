package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nez extends uht implements uiu {
    final /* synthetic */ View a;
    final /* synthetic */ bbo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nez(View view, bbo bboVar, uhb uhbVar) {
        super(2, uhbVar);
        this.a = view;
        this.b = bboVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((nez) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        if (((Boolean) this.b.a()).booleanValue()) {
            this.a.performHapticFeedback(6);
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new nez(this.a, this.b, uhbVar);
    }
}
