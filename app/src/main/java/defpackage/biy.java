package defpackage;

import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class biy extends ujq implements uiw {
    final /* synthetic */ ViewStructure a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public biy(ViewStructure viewStructure) {
        super(4);
        this.a = viewStructure;
    }

    @Override // defpackage.uiw
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        this.a.setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
        return ufg.a;
    }
}
