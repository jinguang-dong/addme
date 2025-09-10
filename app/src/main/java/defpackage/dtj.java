package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.SparseArray;
import android.view.VelocityTracker;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dtj {
    public final dtc a;
    public final int b;
    public final Drawable c;
    public final boolean d;
    public VelocityTracker f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public cto l;
    public cto m;
    private final SparseArray o = new SparseArray();
    public final Paint e = new Paint();
    public Drawable n = null;

    public dtj(dtc dtcVar) {
        this.a = dtcVar;
        this.d = dtcVar.getResources().getConfiguration().isScreenRound();
        int i = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.b = i;
        int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setBounds(0, 0, i, i2);
        shapeDrawable.getPaint().setColor(-16777216);
        this.c = shapeDrawable;
    }

    public final ViewGroup a() {
        dtc dtcVar = this.a;
        if (dtcVar.getParent() instanceof ViewGroup) {
            return (ViewGroup) dtcVar.getParent();
        }
        return null;
    }

    public final cto b(float f, float f2, float f3, cth cthVar, ctg ctgVar) {
        cto ctoVar = new cto(new ctn());
        ctoVar.l(f);
        ctoVar.k(0.5f);
        ctp ctpVar = new ctp();
        ctpVar.d(f2);
        ctpVar.c(1.0f);
        ctpVar.e(600.0f);
        ctoVar.p = 0.0f;
        ctoVar.o = this.b;
        ctoVar.i = f3;
        ctoVar.s = ctpVar;
        ctoVar.j(cthVar);
        ctoVar.i(ctgVar);
        ctoVar.g();
        return ctoVar;
    }

    public final void c(float f) {
        int width = this.a.getWidth();
        this.h = f;
        float f2 = 1.0f - ((f + f) / width);
        this.i = f2;
        float fMax = Math.max(0.7f, Math.min(f2, 1.0f));
        this.i = fMax;
        float f3 = (fMax - 1.0f) / (-0.3f);
        float f4 = this.j;
        if (f3 > f4) {
            this.j = f3;
        } else {
            f3 = f4;
        }
        this.k = Math.min(0.3f, f3 / 2.0f);
        e();
    }

    public final void d() {
        this.g = false;
        this.h = 0.0f;
        this.j = 0.0f;
        this.i = 1.0f;
        dtc dtcVar = this.a;
        dtcVar.setTranslationX(0.0f);
        dtcVar.setScaleX(1.0f);
        dtcVar.setScaleY(1.0f);
        dtcVar.setAlpha(1.0f);
        this.c.setAlpha(0);
        this.e.setColorFilter(null);
        dtcVar.setLayerType(0, null);
        dtcVar.setClipToOutline(false);
        ViewGroup viewGroupA = a();
        if (viewGroupA != null) {
            viewGroupA.setBackground(this.n);
        }
        this.n = null;
    }

    public final void e() {
        dtc dtcVar = this.a;
        dtcVar.setScaleX(this.i);
        dtcVar.setScaleY(this.i);
        dtcVar.setTranslationX(this.h);
        float fMax = Math.max(0.0f, Math.min(1.0f, this.k)) * 255.0f;
        SparseArray sparseArray = this.o;
        int i = (int) fMax;
        int iArgb = Color.argb(i, 0, 0, 0);
        ColorFilter porterDuffColorFilter = (ColorFilter) sparseArray.get(i);
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(iArgb, PorterDuff.Mode.SRC_ATOP);
            sparseArray.put(i, porterDuffColorFilter);
        }
        Paint paint = this.e;
        paint.setColorFilter(porterDuffColorFilter);
        dtcVar.setLayerPaint(paint);
        this.c.setAlpha((int) ((1.0f - this.j) * 0.5f * 255.0f));
    }
}
