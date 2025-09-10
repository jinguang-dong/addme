package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ib extends jl {
    final /* synthetic */ C0001if a;
    final /* synthetic */ ii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(ii iiVar, View view, C0001if c0001if) {
        super(view);
        this.b = iiVar;
        this.a = c0001if;
    }

    @Override // defpackage.jl
    public final gq a() {
        return this.a;
    }

    @Override // defpackage.jl
    public final boolean b() {
        ii iiVar = this.b;
        if (iiVar.b.u()) {
            return true;
        }
        iiVar.b();
        return true;
    }
}
