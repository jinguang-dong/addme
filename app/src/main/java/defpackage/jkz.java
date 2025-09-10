package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkz extends lc {
    private final int a;

    public jkz(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // defpackage.lc
    protected final int b(int i) {
        int iB = super.b(i);
        return iB + iB;
    }

    @Override // defpackage.lc
    public final int g(int i, int i2, int i3, int i4, int i5) {
        return this.a + (-1) != 0 ? (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2)) : i3 - i;
    }

    @Override // defpackage.lc
    public final int h(View view, int i) {
        kq kqVar = this.d;
        if (kqVar == null || !kqVar.X()) {
            return 0;
        }
        kr krVar = (kr) view.getLayoutParams();
        int left = view.getLeft();
        krVar.getClass();
        return g(left - krVar.leftMargin, view.getRight() + krVar.rightMargin, kqVar.au(), kqVar.C - kqVar.av(), i);
    }
}
