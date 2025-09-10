package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzn extends ujq implements uiq {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzn(int i, int i2) {
        super(1);
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        if (this.b != 0) {
            return Boolean.valueOf(((bkb) obj).e(this.a));
        }
        return Boolean.valueOf(((View) obj).getId() == this.a);
    }
}
