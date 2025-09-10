package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxe implements nxg {
    private final float a;
    private final float b;
    private final float c;

    public nxe(float f, float f2, float f3) {
        this.a = f2;
        this.b = f;
        this.c = f3;
    }

    @Override // defpackage.nxg
    public final void a(Rect rect, Canvas canvas, int i, float f) {
        canvas.translate((rect.width() / 2.0f) - ((f - i) * this.a), (rect.height() - this.c) - (this.b / 2.0f));
    }

    @Override // defpackage.nxg
    public final void b(Rect rect, Canvas canvas) {
        canvas.translate(this.a, 0.0f);
    }
}
