package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hte implements nqh {
    final /* synthetic */ hti a;

    public hte(hti htiVar) {
        this.a = htiVar;
    }

    @Override // defpackage.nqh
    public final boolean a(PointF pointF) {
        return false;
    }

    @Override // defpackage.nqh
    public final boolean g(PointF pointF) {
        int width;
        int height;
        hti htiVar = this.a;
        huq huqVar = htiVar.d;
        owf owfVar = huqVar.b;
        huv huvVarA = ((huw) owfVar.dL()).a(false);
        huv huvVar = huv.a;
        int iOrdinal = huvVarA.ordinal();
        if (iOrdinal == 0) {
            width = (huqVar.getWidth() / 2) + huqVar.a();
        } else if (iOrdinal == 1) {
            width = (huqVar.getWidth() / 2) - huqVar.a();
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new uet();
            }
            width = huqVar.getWidth() / 2;
        }
        int iOrdinal2 = ((huw) owfVar.dL()).a(false).ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            height = huqVar.getHeight() / 2;
        } else if (iOrdinal2 == 2) {
            height = (huqVar.getHeight() / 2) - huqVar.a();
        } else {
            if (iOrdinal2 != 3) {
                throw new uet();
            }
            height = (huqVar.getHeight() / 2) + huqVar.a();
        }
        int i = huqVar.c / 2;
        int i2 = height + i;
        if (!new Rect(width - i, height - i, width + i, i2).contains((int) pointF.x, (int) pointF.y)) {
            return false;
        }
        htiVar.M.b();
        return false;
    }

    @Override // defpackage.nqh
    public final void b() {
    }
}
