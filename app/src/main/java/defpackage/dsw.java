package defpackage;

import android.graphics.drawable.Drawable;
import androidx.wear.widget.CircledImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsw implements Drawable.Callback {
    final /* synthetic */ CircledImageView a;

    public dsw(CircledImageView circledImageView) {
        this.a = circledImageView;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidate();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
