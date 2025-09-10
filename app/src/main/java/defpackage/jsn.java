package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsn implements jsq {
    private final /* synthetic */ int a;

    public jsn(int i) {
        this.a = i;
    }

    @Override // defpackage.jsq
    public final jsl a() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? jsl.OUT_OF_FOCUS : jsl.CROP_REGION : jsl.ROTATION : jsl.TOTAL_SENSITIVITY;
    }

    @Override // defpackage.jsq
    public final boolean b(lnl lnlVar, lnl lnlVar2) {
        Rect rect;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return lnlVar.u != lnlVar2.u;
            }
            if (i != 2) {
                return lnlVar.k == 6;
            }
            Rect rect2 = lnlVar.p;
            if (rect2 == null || (rect = lnlVar2.p) == null) {
                return true;
            }
            return ((float) Math.hypot((double) (rect2.width() - rect.width()), (double) (rect2.height() - rect.height()))) > 1.0E-6f;
        }
        if (lnlVar.w != 1 || lnlVar.x != 0) {
            if (Math.abs((((lnlVar.f * lnlVar.d) * lnlVar.g) / 100) - r9) > (((lnlVar2.f * lnlVar2.d) * lnlVar2.g) / 100) * 0.5f) {
                return true;
            }
        }
        return false;
    }
}
