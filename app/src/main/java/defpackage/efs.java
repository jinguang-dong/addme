package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efs extends Drawable implements Drawable.Callback, Animatable {
    private RectF A;
    private Matrix B;
    private Matrix C;
    private gml D;
    public efh a;
    public final elh b;
    public boolean c;
    public boolean d;
    public final ValueAnimator.AnimatorUpdateListener e;
    public ehv f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public eji k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    private final ArrayList q;
    private final Matrix r;
    private Bitmap s;
    private Canvas t;
    private Rect u;
    private RectF v;
    private Paint w;
    private Rect x;
    private Rect y;
    private RectF z;

    public efs() {
        elh elhVar = new elh();
        this.b = elhVar;
        this.c = true;
        this.d = false;
        this.o = 1;
        this.q = new ArrayList();
        fve fveVar = new fve(this, 1, null);
        this.e = fveVar;
        this.j = true;
        this.l = 255;
        this.p = 1;
        this.m = false;
        this.r = new Matrix();
        this.n = false;
        elhVar.addUpdateListener(fveVar);
    }

    private final boolean x() {
        return this.c || this.d;
    }

    private static final void y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.m) {
            p(canvas, this.k);
        } else {
            eji ejiVar = this.k;
            efh efhVar = this.a;
            if (ejiVar != null && efhVar != null) {
                Matrix matrix = this.r;
                matrix.reset();
                if (!getBounds().isEmpty()) {
                    matrix.preScale(r3.width() / efhVar.g.width(), r3.height() / efhVar.g.height());
                    matrix.preTranslate(r3.left, r3.top);
                }
                ejiVar.b(canvas, matrix, this.l);
            }
        }
        this.n = false;
        efa.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final void f(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.b.addUpdateListener(animatorUpdateListener);
    }

    public final void g(final eia eiaVar, final Object obj, final elq elqVar) {
        List list;
        if (this.k == null) {
            this.q.add(new efr() { // from class: efn
                @Override // defpackage.efr
                public final void a() {
                    this.a.g(eiaVar, obj, elqVar);
                }
            });
            return;
        }
        if (eiaVar == eia.a) {
            this.k.a(obj, elqVar);
        } else {
            eib eibVar = eiaVar.b;
            if (eibVar != null) {
                eibVar.a(obj, elqVar);
            } else {
                if (this.k == null) {
                    elg.a("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.k.e(eiaVar, 0, arrayList, new eia(new String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((eia) list.get(i)).b.a(obj, elqVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == efx.E) {
            s(c());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        efh efhVar = this.a;
        if (efhVar == null) {
            return -1;
        }
        return efhVar.g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        efh efhVar = this.a;
        if (efhVar == null) {
            return -1;
        }
        return efhVar.g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        efh efhVar = this.a;
        if (efhVar == null) {
            return;
        }
        int i = ekl.a;
        Rect rect = efhVar.g;
        eji ejiVar = new eji(this, new ejk(Collections.EMPTY_LIST, efhVar, "__container", -1L, 1, -1L, null, Collections.EMPTY_LIST, new eio(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.EMPTY_LIST, 1, null, false, null, null), efhVar.f, efhVar);
        this.k = ejiVar;
        ejiVar.j = this.j;
    }

    public final void i() {
        this.q.clear();
        this.b.cancel();
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.n) {
            return;
        }
        this.n = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return u();
    }

    public final void j() {
        elh elhVar = this.b;
        if (elhVar.k) {
            elhVar.cancel();
            if (!isVisible()) {
                this.o = 1;
            }
        }
        this.a = null;
        this.k = null;
        this.f = null;
        elhVar.j = null;
        elhVar.h = -2.1474836E9f;
        elhVar.i = 2.1474836E9f;
        invalidateSelf();
    }

    public final void k() {
        efh efhVar = this.a;
        if (efhVar == null) {
            return;
        }
        int i = this.p - 1;
        int i2 = efhVar.k;
        boolean z = false;
        if (i != 1 && (i == 2 || i2 > 4)) {
            z = true;
        }
        this.m = z;
    }

    public final void l() {
        this.q.clear();
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void m() {
        this.q.clear();
        elh elhVar = this.b;
        elhVar.h();
        Iterator it = elhVar.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(elhVar);
        }
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void n() {
        if (this.k == null) {
            this.q.add(new efo(this, 0));
            return;
        }
        k();
        if (x() || e() == 0) {
            if (isVisible()) {
                elh elhVar = this.b;
                elhVar.k = true;
                Set set = elhVar.a;
                boolean zM = elhVar.m();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(elhVar, zM);
                }
                elhVar.k((int) (elhVar.m() ? elhVar.d() : elhVar.e()));
                elhVar.d = 0L;
                elhVar.g = 0;
                elhVar.g();
                this.o = 1;
            } else {
                this.o = 2;
            }
        }
        if (x()) {
            return;
        }
        r((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void o() {
        this.b.removeAllListeners();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.graphics.Canvas r9, defpackage.eji r10) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efs.p(android.graphics.Canvas, eji):void");
    }

    public final void q() {
        if (this.k == null) {
            this.q.add(new efo(this, 1));
            return;
        }
        k();
        if (x() || e() == 0) {
            if (isVisible()) {
                elh elhVar = this.b;
                elhVar.k = true;
                elhVar.g();
                elhVar.d = 0L;
                if (elhVar.m() && elhVar.f == elhVar.e()) {
                    elhVar.k(elhVar.d());
                } else if (!elhVar.m() && elhVar.f == elhVar.d()) {
                    elhVar.k(elhVar.e());
                }
                Iterator it = elhVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(elhVar);
                }
                this.o = 1;
            } else {
                this.o = 3;
            }
        }
        if (x()) {
            return;
        }
        r((int) (d() < 0.0f ? b() : a()));
        this.b.f();
        if (isVisible()) {
            return;
        }
        this.o = 1;
    }

    public final void r(final int i) {
        if (this.a == null) {
            this.q.add(new efr() { // from class: efq
                @Override // defpackage.efr
                public final void a() {
                    this.a.r(i);
                }
            });
        } else {
            this.b.k(i);
        }
    }

    public final void s(final float f) {
        efh efhVar = this.a;
        if (efhVar == null) {
            this.q.add(new efr() { // from class: efp
                @Override // defpackage.efr
                public final void a() {
                    this.a.s(f);
                }
            });
            return;
        }
        elh elhVar = this.b;
        float f2 = efhVar.h;
        float f3 = efhVar.i;
        PointF pointF = eli.a;
        elhVar.k(f2 + (f * (f3 - f2)));
        efa.a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.l = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        elg.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.o;
            if (i == 2) {
                n();
                return visible;
            }
            if (i == 3) {
                q();
                return visible;
            }
        } else {
            if (this.b.k) {
                m();
                this.o = 3;
                return visible;
            }
            if (zIsVisible) {
                this.o = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        n();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        l();
    }

    public final void t(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean u() {
        elh elhVar = this.b;
        if (elhVar == null) {
            return false;
        }
        return elhVar.k;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final boolean v(efh efhVar) {
        if (this.a == efhVar) {
            return false;
        }
        this.n = true;
        j();
        this.a = efhVar;
        h();
        elh elhVar = this.b;
        efh efhVar2 = elhVar.j;
        elhVar.j = efhVar;
        if (efhVar2 == null) {
            elhVar.l(Math.max(elhVar.h, efhVar.h), Math.min(elhVar.i, efhVar.i));
        } else {
            elhVar.l((int) efhVar.h, (int) efhVar.i);
        }
        float f = elhVar.f;
        elhVar.f = 0.0f;
        elhVar.e = 0.0f;
        elhVar.k((int) f);
        elhVar.b();
        s(elhVar.getAnimatedFraction());
        ArrayList arrayList = this.q;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            efr efrVar = (efr) it.next();
            if (efrVar != null) {
                efrVar.a();
            }
            it.remove();
        }
        arrayList.clear();
        coh cohVar = efhVar.l;
        k();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final gml w() {
        if (getCallback() == null) {
            return null;
        }
        if (this.D == null) {
            gml gmlVar = new gml(getCallback());
            this.D = gmlVar;
            String str = this.h;
            if (str != null) {
                gmlVar.e = str;
            }
        }
        return this.D;
    }
}
