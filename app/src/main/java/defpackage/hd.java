package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hd extends jl {
    final /* synthetic */ he a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(he heVar, View view) {
        super(view);
        this.a = heVar;
    }

    @Override // defpackage.jl
    public final gq a() {
        hf hfVar = this.a.a.i;
        if (hfVar == null) {
            return null;
        }
        return hfVar.a();
    }

    @Override // defpackage.jl
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.jl
    public final boolean c() {
        hg hgVar = this.a.a;
        if (hgVar.k != null) {
            return false;
        }
        hgVar.k();
        return true;
    }
}
