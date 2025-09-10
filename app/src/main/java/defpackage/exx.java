package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class exx implements esw, est {
    protected final Drawable a;

    public exx(Drawable drawable) {
        eoz.k(drawable);
        this.a = drawable;
    }

    @Override // defpackage.est
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof eyd) {
            ((eyd) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.esw
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
