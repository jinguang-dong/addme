package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exy extends exx {
    private exy(Drawable drawable) {
        super(drawable);
    }

    static esw g(Drawable drawable) {
        if (drawable != null) {
            return new exy(drawable);
        }
        return null;
    }

    @Override // defpackage.esw
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.esw
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.esw
    public final void e() {
    }
}
