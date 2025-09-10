package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhx extends dhp {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public dhv b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public dhx() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new dhv();
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static dhx b(Resources resources, int i, Resources.Theme theme) {
        dhx dhxVar = new dhx();
        ThreadLocal threadLocal = cme.a;
        dhxVar.e = resources.getDrawable(i, theme);
        return dhxVar;
    }

    final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (rect.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        dhv dhvVar = this.b;
        Bitmap bitmap = dhvVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != dhvVar.f.getHeight()) {
            dhvVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            dhvVar.k = true;
        }
        if (this.c) {
            dhv dhvVar2 = this.b;
            if (dhvVar2.k || dhvVar2.g != dhvVar2.c || dhvVar2.h != dhvVar2.d || dhvVar2.j != dhvVar2.e || dhvVar2.i != dhvVar2.b.getRootAlpha()) {
                this.b.a(iMin, iMin2);
                dhv dhvVar3 = this.b;
                dhvVar3.g = dhvVar3.c;
                dhvVar3.h = dhvVar3.d;
                dhvVar3.i = dhvVar3.b.getRootAlpha();
                dhvVar3.j = dhvVar3.e;
                dhvVar3.k = false;
            }
        } else {
            this.b.a(iMin, iMin2);
        }
        dhv dhvVar4 = this.b;
        if (dhvVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (dhvVar4.l == null) {
                dhvVar4.l = new Paint();
                dhvVar4.l.setFilterBitmap(true);
            }
            dhvVar4.l.setAlpha(dhvVar4.b.getRootAlpha());
            dhvVar4.l.setColorFilter(colorFilter);
            paint = dhvVar4.l;
        }
        canvas.drawBitmap(dhvVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new dhw(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        dhv dhvVar = this.b;
        if (dhvVar == null) {
            return false;
        }
        if (dhvVar.b()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new dhv(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.dhp, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        dhv dhvVar = this.b;
        ColorStateList colorStateList = dhvVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = dhvVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (dhvVar.b()) {
            boolean zQ = dhvVar.b.d.q(iArr);
            dhvVar.k |= zQ;
            if (zQ) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        dhv dhvVar = this.b;
        if (dhvVar.c != colorStateList) {
            dhvVar.c = colorStateList;
            this.d = c(colorStateList, dhvVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        dhv dhvVar = this.b;
        if (dhvVar.d != mode) {
            dhvVar.d = mode;
            this.d = c(dhvVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        boolean z;
        int i;
        int i2;
        int i3;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        dhv dhvVar = this.b;
        dhvVar.b = new dhu();
        TypedArray typedArrayK = clc.K(resources, theme, attributeSet, dhh.a);
        dhv dhvVar2 = this.b;
        dhu dhuVar = dhvVar2.b;
        dhvVar2.d = a.n(clc.I(typedArrayK, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListT = clc.T(typedArrayK, xmlPullParser, theme);
        if (colorStateListT != null) {
            dhvVar2.c = colorStateListT;
        }
        dhvVar2.e = clc.R(typedArrayK, xmlPullParser, dhvVar2.e);
        dhuVar.g = clc.G(typedArrayK, xmlPullParser, "viewportWidth", 7, dhuVar.g);
        float fG = clc.G(typedArrayK, xmlPullParser, "viewportHeight", 8, dhuVar.h);
        dhuVar.h = fG;
        if (dhuVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fG > 0.0f) {
            int i4 = 3;
            dhuVar.e = typedArrayK.getDimension(3, dhuVar.e);
            int i5 = 2;
            float dimension = typedArrayK.getDimension(2, dhuVar.f);
            dhuVar.f = dimension;
            if (dhuVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > 0.0f) {
                dhuVar.setAlpha(clc.G(typedArrayK, xmlPullParser, "alpha", 4, dhuVar.getAlpha()));
                boolean z2 = false;
                String string = typedArrayK.getString(0);
                if (string != null) {
                    dhuVar.j = string;
                    dhuVar.l.put(string, dhuVar);
                }
                typedArrayK.recycle();
                dhvVar.a = getChangingConfigurations();
                dhvVar.k = true;
                dhv dhvVar3 = this.b;
                dhu dhuVar2 = dhvVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(dhuVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i6 = 1; eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i4); i6 = 1) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        dhs dhsVar = (dhs) arrayDeque.peek();
                        if (dhsVar != null) {
                            if ("path".equals(name)) {
                                dhr dhrVar = new dhr();
                                TypedArray typedArrayK2 = clc.K(resources, theme, attributeSet, dhh.c);
                                dhrVar.a = null;
                                if (clc.O(xmlPullParser, "pathData")) {
                                    String string2 = typedArrayK2.getString(0);
                                    if (string2 != null) {
                                        dhrVar.n = string2;
                                    }
                                    String string3 = typedArrayK2.getString(2);
                                    if (string3 != null) {
                                        dhrVar.m = chx.l(string3);
                                    }
                                    dhrVar.l = clc.V(typedArrayK2, xmlPullParser, theme, "fillColor", 1);
                                    i2 = depth;
                                    dhrVar.d = clc.G(typedArrayK2, xmlPullParser, "fillAlpha", 12, dhrVar.d);
                                    int I = clc.I(typedArrayK2, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = dhrVar.h;
                                    if (I == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (I == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (I == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    dhrVar.h = cap;
                                    int I2 = clc.I(typedArrayK2, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = dhrVar.i;
                                    if (I2 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (I2 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (I2 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    dhrVar.i = join;
                                    dhrVar.j = clc.G(typedArrayK2, xmlPullParser, "strokeMiterLimit", 10, dhrVar.j);
                                    dhrVar.k = clc.V(typedArrayK2, xmlPullParser, theme, "strokeColor", 3);
                                    dhrVar.c = clc.G(typedArrayK2, xmlPullParser, "strokeAlpha", 11, dhrVar.c);
                                    dhrVar.b = clc.G(typedArrayK2, xmlPullParser, "strokeWidth", 4, dhrVar.b);
                                    dhrVar.f = clc.G(typedArrayK2, xmlPullParser, "trimPathEnd", 6, dhrVar.f);
                                    dhrVar.g = clc.G(typedArrayK2, xmlPullParser, "trimPathOffset", 7, dhrVar.g);
                                    dhrVar.e = clc.G(typedArrayK2, xmlPullParser, "trimPathStart", 5, dhrVar.e);
                                    dhrVar.o = clc.I(typedArrayK2, xmlPullParser, "fillType", 13, dhrVar.o);
                                } else {
                                    i2 = depth;
                                }
                                typedArrayK2.recycle();
                                dhsVar.b.add(dhrVar);
                                if (dhrVar.getPathName() != null) {
                                    dhuVar2.l.put(dhrVar.getPathName(), dhrVar);
                                }
                                int i7 = dhvVar3.a;
                                z = false;
                                i = 3;
                                z3 = false;
                            } else {
                                i2 = depth;
                                if ("clip-path".equals(name)) {
                                    dhq dhqVar = new dhq();
                                    if (clc.O(xmlPullParser, "pathData")) {
                                        TypedArray typedArrayK3 = clc.K(resources, theme, attributeSet, dhh.d);
                                        String string4 = typedArrayK3.getString(0);
                                        if (string4 != null) {
                                            dhqVar.n = string4;
                                        }
                                        String string5 = typedArrayK3.getString(1);
                                        if (string5 != null) {
                                            dhqVar.m = chx.l(string5);
                                        }
                                        dhqVar.o = clc.I(typedArrayK3, xmlPullParser, "fillType", 2, 0);
                                        typedArrayK3.recycle();
                                    }
                                    dhsVar.b.add(dhqVar);
                                    if (dhqVar.getPathName() != null) {
                                        dhuVar2.l.put(dhqVar.getPathName(), dhqVar);
                                    }
                                    int i8 = dhvVar3.a;
                                    z = false;
                                    i = 3;
                                } else if ("group".equals(name)) {
                                    dhs dhsVar2 = new dhs();
                                    TypedArray typedArrayK4 = clc.K(resources, theme, attributeSet, dhh.b);
                                    dhsVar2.l = null;
                                    dhsVar2.c = clc.G(typedArrayK4, xmlPullParser, "rotation", 5, dhsVar2.c);
                                    dhsVar2.d = typedArrayK4.getFloat(1, dhsVar2.d);
                                    dhsVar2.e = typedArrayK4.getFloat(2, dhsVar2.e);
                                    dhsVar2.f = clc.G(typedArrayK4, xmlPullParser, "scaleX", 3, dhsVar2.f);
                                    dhsVar2.g = clc.G(typedArrayK4, xmlPullParser, "scaleY", 4, dhsVar2.g);
                                    dhsVar2.h = clc.G(typedArrayK4, xmlPullParser, HHdu.ETFZr, 6, dhsVar2.h);
                                    dhsVar2.i = clc.G(typedArrayK4, xmlPullParser, "translateY", 7, dhsVar2.i);
                                    z = false;
                                    String string6 = typedArrayK4.getString(0);
                                    if (string6 != null) {
                                        dhsVar2.m = string6;
                                    }
                                    dhsVar2.z();
                                    typedArrayK4.recycle();
                                    dhsVar.b.add(dhsVar2);
                                    arrayDeque.push(dhsVar2);
                                    if (dhsVar2.getGroupName() != null) {
                                        dhuVar2.l.put(dhsVar2.getGroupName(), dhsVar2);
                                    }
                                    int i9 = dhvVar3.a;
                                    i = 3;
                                } else {
                                    z = false;
                                }
                            }
                            i3 = 2;
                        } else {
                            z = z2;
                            i2 = depth;
                        }
                        i = 3;
                        i3 = 2;
                    } else {
                        z = z2;
                        i = i4;
                        i2 = depth;
                        i3 = i5;
                        if (eventType == i && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i;
                    i5 = i3;
                    depth = i2;
                    z2 = z;
                }
                if (!z3) {
                    this.d = c(dhvVar.c, dhvVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public dhx(dhv dhvVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = dhvVar;
        this.d = c(dhvVar.c, dhvVar.d);
    }
}
