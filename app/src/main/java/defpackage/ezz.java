package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ezz extends fac {
    private Animatable c;

    public ezz(ImageView imageView) {
        super(imageView);
    }

    private final void n(Object obj) {
        k(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.ezv, defpackage.faa
    public final void b(Drawable drawable) {
        this.b.v();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        n(null);
        m(drawable);
    }

    @Override // defpackage.ezv, defpackage.faa
    public final void c(Drawable drawable) {
        n(null);
        m(drawable);
    }

    @Override // defpackage.ezv, defpackage.faa
    public final void d(Drawable drawable) {
        n(null);
        m(drawable);
    }

    @Override // defpackage.ezv, defpackage.eyu
    public final void g() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.ezv, defpackage.eyu
    public final void h() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    protected abstract void k(Object obj);

    @Override // defpackage.faa
    public final void l(Object obj) {
        n(obj);
    }

    public final void m(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
