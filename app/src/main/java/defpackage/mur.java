package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mur extends mun {
    public mur(Paint paint) {
        super(paint);
    }

    @Override // defpackage.mun
    public final void b(Canvas canvas, RectF rectF) {
        if (this.b) {
            return;
        }
        canvas.drawLine(rectF.left + this.a, rectF.top, rectF.left + this.a, rectF.bottom, this.c);
    }
}
