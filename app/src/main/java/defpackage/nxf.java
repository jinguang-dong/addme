package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxf implements nxg {
    private final float a;
    private final float b;

    public nxf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    private final float c(Rect rect) {
        return (Math.min(rect.width() / 2, rect.height() / 2) - this.b) - (this.a / 2.0f);
    }

    @Override // defpackage.nxg
    public final void a(Rect rect, Canvas canvas, int i, float f) {
        float fC = c(rect);
        canvas.translate(rect.width() / 2.0f, rect.height() / 2.0f);
        canvas.rotate(-((i - f) * 6.6f));
        canvas.translate(0.0f, fC);
    }

    @Override // defpackage.nxg
    public final void b(Rect rect, Canvas canvas) {
        float fC = c(rect);
        canvas.translate(0.0f, -fC);
        canvas.rotate(-6.6f);
        canvas.translate(0.0f, fC);
    }
}
