package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzb extends ujq implements uiu {
    final /* synthetic */ ComposeView a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzb(ComposeView composeView, int i) {
        super(2);
        this.a = composeView;
        this.b = i;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iJ = bay.j(this.b | 1);
        this.a.a((ayc) obj, iJ);
        return ufg.a;
    }
}
