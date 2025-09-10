package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bip extends ujq implements uiw {
    final /* synthetic */ int a;
    final /* synthetic */ bit b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bip(bit bitVar, int i) {
        super(4);
        this.b = bitVar;
        this.a = i;
    }

    @Override // defpackage.uiw
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        Rect rect = new Rect(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        bit bitVar = this.b;
        ((AutofillManager) bitVar.h.a).notifyViewEntered(bitVar.a, this.a, rect);
        return ufg.a;
    }
}
