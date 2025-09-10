package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muq extends mup {
    private final float[] j;

    public muq(float[] fArr, boolean z, boolean z2) {
        super(false, z, z2);
        this.j = fArr;
        rnt.L((!z && fArr.length == 2) || fArr.length == 3);
    }

    @Override // defpackage.mup
    public final void a(RectF rectF) {
        if (!this.h) {
            float fWidth = rectF.width();
            float[] fArr = this.j;
            this.a = Math.round(fWidth * fArr[0]);
            this.b = Math.round(rectF.width() * fArr[1]);
            this.c = Math.round(rectF.height() * fArr[0]);
            this.d = Math.round(rectF.height() * fArr[1]);
            return;
        }
        float fWidth2 = rectF.width();
        float[] fArr2 = this.j;
        this.a = Math.round(fWidth2 * fArr2[0]);
        this.e = Math.round(rectF.width() * fArr2[1]);
        this.b = Math.round(rectF.width() * fArr2[2]);
        this.c = Math.round(rectF.height() * fArr2[0]);
        this.f = Math.round(rectF.height() * fArr2[1]);
        this.d = Math.round(rectF.height() * fArr2[2]);
    }
}
