package defpackage;

import android.animation.PointFEvaluator;
import android.animation.RectEvaluator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqv {
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final int e;
    public final PointFEvaluator f = new PointFEvaluator();
    public final RectEvaluator g = new RectEvaluator();
    public Integer h;
    public Integer i;

    public gqv(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i) {
        this.a = drawable;
        this.b = drawable2;
        this.c = drawable3;
        this.d = drawable4;
        this.e = i;
    }

    public final void a(Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this.a.setBounds(rect);
        this.b.setBounds(rect2);
        this.c.setBounds(rect3);
        this.d.setBounds(rect4);
    }
}
