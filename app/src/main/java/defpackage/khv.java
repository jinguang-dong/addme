package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khv implements mmg {
    final /* synthetic */ ovx a;
    final /* synthetic */ Float[] b;

    public khv(ovx ovxVar, Float[] fArr) {
        this.a = ovxVar;
        this.b = fArr;
    }

    @Override // defpackage.mmg
    public final void c(RectF rectF, float f, mly mlyVar) {
        if (mlyVar == mly.GYRO) {
            f = 0.0f;
        }
        this.a.a(new Float[]{Float.valueOf(f)});
    }

    @Override // defpackage.mmg
    public final void eV() {
        this.a.a(this.b);
    }

    @Override // defpackage.mmg
    public final void eQ() {
    }
}
