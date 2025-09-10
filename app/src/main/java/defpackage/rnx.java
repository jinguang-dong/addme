package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.wear.ambient.AmbientModeSupport;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rnx extends Drawable implements rol {
    public static final /* synthetic */ int k = 0;
    private static final Paint l;
    private static final rnw[] m;
    private final RectF A;
    private boolean B;
    private roc C;
    private ctp D;
    private float[] E;
    private final rnu F;
    private final rnu G;
    public rnv a;
    public final roj[] b;
    public final roj[] c;
    public final BitSet d;
    public boolean e;
    public boolean f;
    public int g;
    cto[] h;
    public float[] i;
    public AmbientModeSupport.AmbientController j;
    private final Matrix n;
    private final Path o;
    private final Path p;
    private final RectF q;
    private final RectF r;
    private final Region s;
    private final Region t;
    private final Paint u;
    private final Paint v;
    private final rnn w;
    private final roe x;
    private PorterDuffColorFilter y;
    private PorterDuffColorFilter z;

    static {
        rob robVar = new rob();
        int i = 0;
        rnt rntVarQ = rnt.q(0);
        robVar.d(rntVarQ);
        robVar.e(rntVarQ);
        robVar.c(rntVarQ);
        robVar.b(rntVarQ);
        robVar.a(0.0f);
        Paint paint = new Paint(1);
        l = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m = new rnw[4];
        while (true) {
            rnw[] rnwVarArr = m;
            int length = rnwVarArr.length;
            if (i >= 4) {
                return;
            }
            rnwVarArr[i] = new rnw(i);
            i++;
        }
    }

    public rnx() {
        this(new roc());
    }

    private final void A(RectF rectF, Path path) {
        rnv rnvVar = this.a;
        this.x.a(rnvVar.a, this.i, rnvVar.l, rectF, this.F, path);
        if (this.a.k != 1.0f) {
            Matrix matrix = this.n;
            matrix.reset();
            float f = this.a.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A, true);
    }

    private final void B(Canvas canvas, Paint paint, Path path, roc rocVar, float[] fArr, RectF rectF) {
        float fG = G(rectF, rocVar, fArr);
        if (fG < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fG * this.a.l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    private final void C(int[] iArr, boolean z) {
        boolean z2;
        RectF rectFH = h();
        if (this.a.b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.D == null);
        if (this.i == null) {
            this.i = new float[4];
        }
        rom romVar = this.a.b;
        int iA = romVar.a(iArr);
        if (iA < 0) {
            iA = romVar.a(StateSet.WILD_CARD);
        }
        roc rocVar = romVar.d[iA];
        for (int i = 0; i < 4; i++) {
            float fA = roe.b(i, rocVar).a(rectFH);
            if (z3) {
                this.i[i] = fA;
                z2 = true;
            } else {
                z2 = false;
            }
            cto ctoVar = this.h[i];
            if (ctoVar != null) {
                ctoVar.m(fA);
                if (z2) {
                    this.h[i].n();
                }
            }
        }
        if (z3) {
            invalidateSelf();
        }
    }

    private final boolean D() {
        return (this.a.w == Paint.Style.FILL_AND_STROKE || this.a.w == Paint.Style.STROKE) && this.v.getStrokeWidth() > 0.0f;
    }

    private final boolean E(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.e != null && color2 != (colorForState2 = this.a.e.getColorForState(iArr, (color2 = (paint2 = this.u).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.f == null || color == (colorForState = this.a.f.getColorForState(iArr, (color = (paint = this.v).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean F() {
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        rnv rnvVar = this.a;
        this.y = y(rnvVar.h, rnvVar.i, this.u, true);
        rnv rnvVar2 = this.a;
        ColorStateList colorStateList = rnvVar2.g;
        this.z = y(null, rnvVar2.i, this.v, false);
        boolean z = this.a.v;
        return (Objects.equals(porterDuffColorFilter, this.y) && Objects.equals(porterDuffColorFilter2, this.z)) ? false : true;
    }

    private static final float G(RectF rectF, roc rocVar, float[] fArr) {
        if (fArr == null) {
            if (rocVar.g(rectF)) {
                return rocVar.b.a(rectF);
            }
            return -1.0f;
        }
        if (qsy.p(fArr) && rocVar.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private static int x(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter y(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = f(colorForState);
            }
            this.g = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int iF = f(color);
            this.g = iF;
            if (iF != color) {
                return new PorterDuffColorFilter(iF, PorterDuff.Mode.SRC_IN);
            }
        }
        return null;
    }

    private final RectF z() {
        RectF rectF = this.r;
        rectF.set(h());
        float fB = b();
        rectF.inset(fB, fB);
        return rectF;
    }

    public final float a() {
        float[] fArr = this.i;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        return (((i().b.a(rectFH) + i().e.a(rectFH)) - i().d.a(rectFH)) - roe.b(0, i()).a(rectFH)) / 2.0f;
    }

    public final float b() {
        if (D()) {
            return this.v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        float[] fArr = this.i;
        return fArr != null ? fArr[3] : this.a.a.b.a(h());
    }

    public final float d() {
        float[] fArr = this.i;
        return fArr != null ? fArr[0] : this.a.a.c.a(h());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Paint paint2 = this.u;
        paint2.setColorFilter(this.y);
        int alpha = paint2.getAlpha();
        paint2.setAlpha(x(alpha, this.a.n));
        Paint paint3 = this.v;
        paint3.setColorFilter(this.z);
        paint3.setStrokeWidth(this.a.m);
        int alpha2 = paint3.getAlpha();
        paint3.setAlpha(x(alpha2, this.a.n));
        if (this.a.w == Paint.Style.FILL_AND_STROKE || this.a.w == Paint.Style.FILL) {
            if (this.e) {
                A(h(), this.o);
                this.e = false;
            }
            rnv rnvVar = this.a;
            int i = rnvVar.r;
            if (rnvVar.s > 0 && !u()) {
                this.o.isConvex();
            }
            B(canvas, paint2, this.o, this.a.a, this.i, h());
        }
        if (D()) {
            if (this.f) {
                roc rocVarI = i();
                rnu rnuVar = this.G;
                rob robVar = new rob(rocVarI);
                robVar.a = rnuVar.a(rocVarI.b);
                robVar.b = rnuVar.a(rocVarI.c);
                robVar.d = rnuVar.a(rocVarI.e);
                robVar.c = rnuVar.a(rocVarI.d);
                this.C = new roc(robVar);
                if (this.i != null) {
                    if (this.E == null) {
                        this.E = new float[4];
                    }
                    float fB = b();
                    int i2 = 0;
                    while (true) {
                        float[] fArr = this.i;
                        int length = fArr.length;
                        if (i2 >= 4) {
                            break;
                        }
                        this.E[i2] = Math.max(0.0f, fArr[i2] - fB);
                        i2++;
                    }
                } else {
                    this.E = null;
                }
                this.x.a(this.C, this.E, this.a.l, z(), null, this.p);
                this.f = false;
            }
            paint = paint3;
            B(canvas, paint, this.p, this.C, this.E, z());
        } else {
            paint = paint3;
        }
        paint2.setAlpha(alpha);
        paint.setAlpha(alpha2);
    }

    public final float e() {
        rnv rnvVar = this.a;
        float f = rnvVar.p;
        float f2 = rnvVar.q;
        return f + 0.0f;
    }

    protected final int f(int i) {
        float fE = e();
        rnv rnvVar = this.a;
        float f = fE + rnvVar.o;
        rkg rkgVar = rnvVar.c;
        return rkgVar != null ? rkgVar.b(i, f) : i;
    }

    public final ColorStateList g() {
        return this.a.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i = this.a.r;
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fG = G(rectFH, this.a.a, this.i);
        if (fG >= 0.0f) {
            outline.setRoundRect(getBounds(), fG * this.a.l);
            return;
        }
        if (this.e) {
            A(rectFH, this.o);
            this.e = false;
        }
        rkf.a(outline, this.o);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.s;
        region.set(getBounds());
        RectF rectFH = h();
        Path path = this.o;
        A(rectFH, path);
        Region region2 = this.t;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.q;
        rectF.set(getBounds());
        return rectF;
    }

    public final roc i() {
        return this.a.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        this.f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        rnv rnvVar = this.a;
        ColorStateList colorStateList2 = rnvVar.g;
        ColorStateList colorStateList3 = rnvVar.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.a.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        rom romVar = this.a.b;
        return romVar != null && romVar.a > 1;
    }

    public final void j(Context context) {
        this.a.c = new rkg(context);
        t();
    }

    public final void k(ctp ctpVar) {
        if (this.D == ctpVar) {
            return;
        }
        this.D = ctpVar;
        int i = 0;
        while (true) {
            cto[] ctoVarArr = this.h;
            int length = ctoVarArr.length;
            if (i >= 4) {
                C(getState(), true);
                invalidateSelf();
                return;
            }
            if (ctoVarArr[i] == null) {
                ctoVarArr[i] = new cto(this, m[i]);
            }
            cto ctoVar = this.h[i];
            ctp ctpVar2 = new ctp();
            ctpVar2.c((float) ctpVar.b);
            double d = ctpVar.a;
            ctpVar2.e((float) (d * d));
            ctoVar.s = ctpVar2;
            i++;
        }
    }

    public final void l(float f) {
        rnv rnvVar = this.a;
        if (rnvVar.p != f) {
            rnvVar.p = f;
            t();
        }
    }

    @Override // defpackage.rol
    public final void m(roc rocVar) {
        rnv rnvVar = this.a;
        rnvVar.a = rocVar;
        rnvVar.b = null;
        this.i = null;
        this.E = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new rnv(this.a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        rnv rnvVar = this.a;
        if (rnvVar.e != colorStateList) {
            rnvVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(float f) {
        rnv rnvVar = this.a;
        if (rnvVar.l != f) {
            rnvVar.l = f;
            this.e = true;
            this.f = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        this.f = true;
        super.onBoundsChange(rect);
        if (this.a.b != null && !rect.isEmpty()) {
            C(getState(), this.B);
        }
        this.B = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.a.b != null) {
            C(iArr, false);
        }
        boolean z = E(iArr) || F();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(rom romVar) {
        rnv rnvVar = this.a;
        if (rnvVar.b != romVar) {
            rnvVar.b = romVar;
            C(getState(), true);
            invalidateSelf();
        }
    }

    public final void q(float f, ColorStateList colorStateList) {
        s(f);
        r(colorStateList);
    }

    public final void r(ColorStateList colorStateList) {
        rnv rnvVar = this.a;
        if (rnvVar.f != colorStateList) {
            rnvVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(float f) {
        this.a.m = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        rnv rnvVar = this.a;
        if (rnvVar.n != i) {
            rnvVar.n = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.d = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.h = colorStateList;
        F();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        rnv rnvVar = this.a;
        if (rnvVar.i != mode) {
            rnvVar.i = mode;
            F();
            super.invalidateSelf();
        }
    }

    public final void t() {
        float fE = e();
        this.a.s = (int) Math.ceil(0.75f * fE);
        this.a.t = (int) Math.ceil(fE * 0.25f);
        F();
        super.invalidateSelf();
    }

    public final boolean u() {
        if (this.a.a.g(h())) {
            return true;
        }
        float[] fArr = this.i;
        return fArr != null && qsy.p(fArr) && this.a.a.f();
    }

    public final void v() {
        this.w.a(-12303292);
        this.a.v = false;
        super.invalidateSelf();
    }

    public final void w(float f) {
        s(f);
        r(ColorStateList.valueOf(0));
    }

    public rnx(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new roc(roc.c(context, attributeSet, i, i2)));
    }

    protected rnx(rnv rnvVar) {
        roe roeVar;
        this.G = new rnu(this);
        this.b = new roj[4];
        this.c = new roj[4];
        this.d = new BitSet(8);
        this.n = new Matrix();
        this.o = new Path();
        this.p = new Path();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new Region();
        this.t = new Region();
        Paint paint = new Paint(1);
        this.u = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.w = new rnn();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            roeVar = rod.a;
        } else {
            roeVar = new roe();
        }
        this.x = roeVar;
        this.A = new RectF();
        this.B = true;
        this.h = new cto[4];
        this.a = rnvVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        F();
        E(getState());
        this.F = new rnu(this);
    }

    public rnx(roc rocVar) {
        this(new rnv(rocVar));
    }
}
