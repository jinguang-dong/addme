package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class in {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private lz e;
    private lz f;
    private lz g;
    private lz h;
    private lz i;
    private lz j;
    private final is k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public in(TextView textView) {
        this.d = textView;
        this.k = new is(textView);
    }

    public static void b(TextView textView, Typeface typeface, int i) {
        zd zdVar = il.a;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            il.b(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        il.b(textView, fontVariationSettings);
    }

    private static lz f(Context context, hr hrVar, int i) {
        ColorStateList colorStateListA = hrVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        lz lzVar = new lz();
        lzVar.d = true;
        lzVar.a = colorStateListA;
        return lzVar;
    }

    private final void g(Drawable drawable, lz lzVar) {
        if (drawable == null || lzVar == null) {
            return;
        }
        lj.g(drawable, lzVar, this.d.getDrawableState());
    }

    private final void h(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.l == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            il.b(this.d, str);
        }
    }

    private final boolean i(Context context, pmg pmgVar) {
        String strC;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = fa.a;
        this.a = pmgVar.u(2, this.a);
        int iU = pmgVar.u(14, -1);
        this.l = iU;
        if (iU != -1) {
            this.a &= 2;
        }
        if (pmgVar.F(16)) {
            this.m = pmgVar.C(16);
        }
        if (!pmgVar.F(10) && !pmgVar.F(15)) {
            if (!pmgVar.F(1)) {
                int i = this.l;
                if (i == -1 || (typeface = this.b) == null) {
                    return false;
                }
                this.b = Typeface.create(typeface, i, (2 & this.a) != 0);
                return true;
            }
            this.c = false;
            int iU2 = pmgVar.u(1, 1);
            if (iU2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (iU2 != 2) {
                    if (iU2 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typefaceB = null;
        this.b = null;
        int i2 = true == pmgVar.F(15) ? 15 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            ij ijVar = new ij(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ((TypedArray) pmgVar.b).getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (pmgVar.c == null) {
                        pmgVar.c = new TypedValue();
                    }
                    Object obj = pmgVar.a;
                    Object obj2 = pmgVar.c;
                    ThreadLocal threadLocal = cme.a;
                    if (!((Context) obj).isRestricted()) {
                        typefaceB = cme.b((Context) obj, resourceId, (TypedValue) obj2, i5, ijVar, true, false);
                    }
                }
                if (typefaceB != null) {
                    if (this.l != -1) {
                        this.b = Typeface.create(Typeface.create(typefaceB, 0), this.l, (this.a & 2) != 0);
                    } else {
                        this.b = typefaceB;
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (strC = pmgVar.C(i2)) != null) {
            if (this.l != -1) {
                this.b = Typeface.create(Typeface.create(strC, 0), this.l, (2 & this.a) != 0);
            } else {
                this.b = Typeface.create(strC, this.a);
            }
        }
        return true;
    }

    public final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            g(compoundDrawables[0], this.e);
            g(compoundDrawables[1], this.f);
            g(compoundDrawables[2], this.g);
            g(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        g(compoundDrawablesRelative[0], this.i);
        g(compoundDrawablesRelative[2], this.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.c(android.util.AttributeSet, int):void");
    }

    public final void d(Context context, int i) {
        pmg pmgVarH = pmg.H(context, i, fa.w);
        if (pmgVarH.F(17)) {
            e(pmgVarH.E(17, false));
        }
        if (pmgVarH.F(0) && pmgVarH.t(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zI = i(context, pmgVarH);
        pmgVarH.D();
        h(zI);
    }

    final void e(boolean z) {
        this.d.setAllCaps(z);
    }
}
