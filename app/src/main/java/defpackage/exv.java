package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exv implements esw {
    private final /* synthetic */ int a;
    private final Object b;

    public exv(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.esw
    public final int a() {
        int i = this.a;
        if (i == 0) {
            return ((byte[]) this.b).length;
        }
        if (i == 1) {
            return fax.a((Bitmap) this.b);
        }
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.b;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight() * fax.b(Bitmap.Config.ARGB_8888);
        return intrinsicWidth + intrinsicWidth;
    }

    @Override // defpackage.esw
    public final Class b() {
        int i = this.a;
        return i != 0 ? i != 1 ? Drawable.class : Bitmap.class : byte[].class;
    }

    @Override // defpackage.esw
    public final /* synthetic */ Object c() {
        return this.a != 0 ? this.b : this.b;
    }

    @Override // defpackage.esw
    public final void e() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.b;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }

    public exv(AnimatedImageDrawable animatedImageDrawable, int i) {
        this.a = i;
        this.b = animatedImageDrawable;
    }

    public exv(byte[] bArr, int i) {
        this.a = i;
        eoz.k(bArr);
        this.b = bArr;
    }
}
