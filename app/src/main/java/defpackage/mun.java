package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mun {
    int a;
    boolean b;
    final Paint c;

    public mun(Paint paint) {
        this.c = paint;
    }

    public final void a(int i) {
        this.c.setAlpha(i);
    }

    public void b(Canvas canvas, RectF rectF) {
        if (this.b) {
            return;
        }
        canvas.drawLine(rectF.left, rectF.top + this.a, rectF.right, rectF.top + this.a, this.c);
    }
}
