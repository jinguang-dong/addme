package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohl extends ohe {
    final /* synthetic */ ohm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohl(ohm ohmVar, int i, Bundle bundle) {
        super(ohmVar, i, bundle);
        this.g = ohmVar;
    }

    @Override // defpackage.ohe
    protected final void a(odj odjVar) {
        this.g.f.a(odjVar);
        System.currentTimeMillis();
    }

    @Override // defpackage.ohe
    protected final boolean b() {
        this.g.f.a(odj.a);
        return true;
    }
}
