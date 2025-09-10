package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnf extends ScaleGestureDetector {
    public float a;
    public float b;
    public int c;
    private final Context d;
    private final ScaleGestureDetector.OnScaleGestureListener e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private boolean s;
    private final int t;
    private final int u;
    private final Handler v;
    private GestureDetector w;
    private boolean x;

    /* JADX WARN: Multi-variable type inference failed */
    public nnf(Context context, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, Handler handler) {
        super(context, onScaleGestureListener, handler);
        this.c = 0;
        this.d = context;
        this.e = onScaleGestureListener;
        hbj hbjVarB = context instanceof fdi ? ((fdi) context).b() : null;
        int iB = b(context, hba.e, 1, R.dimen.touch_slop, hbjVarB);
        this.t = iB + iB;
        this.u = b(context, hba.f, 5, R.dimen.min_span, hbjVarB);
        this.v = handler;
        this.h = true;
        this.i = true;
    }

    private final boolean a() {
        return this.c != 0;
    }

    private static final int b(Context context, gzi gziVar, int i, int i2, hbj hbjVar) {
        Resources resources = context.getResources();
        return (hbjVar == null ? Optional.empty() : hbjVar.a(gziVar)).isPresent() ? Math.round(TypedValue.applyDimension(i, ((Integer) r1.get()).intValue(), resources.getDisplayMetrics())) : Math.round(resources.getDimension(i2));
    }

    @Override // android.view.ScaleGestureDetector
    public final float getCurrentSpan() {
        return this.j;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getCurrentSpanX() {
        return this.m;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getCurrentSpanY() {
        return this.n;
    }

    @Override // android.view.ScaleGestureDetector
    public final long getEventTime() {
        return this.q;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getFocusX() {
        return this.f;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getFocusY() {
        return this.g;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getPreviousSpan() {
        return this.k;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getPreviousSpanX() {
        return this.o;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getPreviousSpanY() {
        return this.p;
    }

    @Override // android.view.ScaleGestureDetector
    public final float getScaleFactor() {
        if (!a()) {
            float f = this.k;
            if (f > 0.0f) {
                return this.j / f;
            }
            return 1.0f;
        }
        boolean z = true;
        if (!this.x ? this.j <= this.k : this.j >= this.k) {
            z = false;
        }
        float fAbs = Math.abs(1.0f - (this.j / this.k)) * 0.5f;
        if (this.k <= this.t) {
            return 1.0f;
        }
        return z ? fAbs + 1.0f : 1.0f - fAbs;
    }

    @Override // android.view.ScaleGestureDetector
    public final long getTimeDelta() {
        return this.q - this.r;
    }

    @Override // android.view.ScaleGestureDetector
    public final boolean isInProgress() {
        return this.s;
    }

    @Override // android.view.ScaleGestureDetector
    public final boolean isQuickScaleEnabled() {
        return this.h;
    }

    @Override // android.view.ScaleGestureDetector
    public final boolean isStylusScaleEnabled() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    @Override // android.view.ScaleGestureDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnf.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ScaleGestureDetector
    public final void setQuickScaleEnabled(boolean z) {
        this.h = z;
        if (z && this.w == null) {
            this.w = new GestureDetector(this.d, new nne(this), this.v);
        }
    }

    @Override // android.view.ScaleGestureDetector
    public final void setStylusScaleEnabled(boolean z) {
        this.i = z;
    }
}
