package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byl extends ujq implements uiu {
    final /* synthetic */ bxv a;
    final /* synthetic */ uiu b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byl(bxv bxvVar, uiu uiuVar, int i) {
        super(2);
        this.a = bxvVar;
        this.b = uiuVar;
        this.c = i;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iJ = bay.j(this.c | 1);
        AndroidCompositionLocals_androidKt.a(this.a, this.b, (ayc) obj, iJ);
        return ufg.a;
    }
}
