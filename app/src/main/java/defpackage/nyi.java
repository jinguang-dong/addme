package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyi extends DrawableWrapper {
    public nyi(Drawable drawable) {
        super(drawable);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getLayoutDirection() == 0) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().centerX(), 0.0f);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
