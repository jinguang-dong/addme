package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.google.ar.core.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lj {
    private static lj b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private ut h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final zd g = new zd(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        zd zdVar = g;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) zdVar.a(Integer.valueOf(zd.d(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        return porterDuffColorFilter2;
    }

    public static synchronized lj e() {
        if (b == null) {
            b = new lj();
        }
        return b;
    }

    static void g(Drawable drawable, lz lzVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilterB = null;
            if (lzVar.d) {
                colorStateList = lzVar.a;
            } else {
                if (!lzVar.c) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = lzVar.c ? lzVar.b : a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterB);
        }
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        zb zbVar = (zb) this.d.get(context);
        if (zbVar != null && (weakReference = (WeakReference) zbVar.d(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            zbVar.h(j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.d;
            zb zbVar = (zb) weakHashMap.get(context);
            if (zbVar == null) {
                zbVar = new zb();
                weakHashMap.put(context, zbVar);
            }
            zbVar.g(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        aab aabVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateListB = null;
        ColorStateList colorStateList = (weakHashMap == null || (aabVar = (aab) weakHashMap.get(context)) == null) ? null : (ColorStateList) aac.a(aabVar, i);
        if (colorStateList == null) {
            ut utVar = this.h;
            if (utVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateListB = clu.b(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListB = clu.b(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListC = lw.c(context, R.attr.colorSwitchThumbNormal);
                    if (colorStateListC == null || !colorStateListC.isStateful()) {
                        iArr[0] = lw.a;
                        iArr2[0] = lw.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = lw.d;
                        iArr2[1] = lw.b(context, R.attr.colorControlActivated);
                        iArr[2] = lw.e;
                        iArr2[2] = lw.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = lw.a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                        iArr[1] = lw.d;
                        iArr2[1] = lw.b(context, R.attr.colorControlActivated);
                        iArr[2] = lw.e;
                        iArr2[2] = colorStateListC.getDefaultColor();
                    }
                    colorStateListB = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateListB = ut.e(context, lw.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateListB = ut.e(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateListB = ut.e(context, lw.b(context, R.attr.colorAccent));
                } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    colorStateListB = clu.b(context, R.color.abc_tint_spinner);
                } else if (ut.d((int[]) utVar.d, i)) {
                    colorStateListB = lw.c(context, R.attr.colorControlNormal);
                } else if (ut.d((int[]) utVar.e, i)) {
                    colorStateListB = clu.b(context, R.color.abc_tint_default);
                } else if (ut.d((int[]) utVar.a, i)) {
                    colorStateListB = clu.b(context, R.color.abc_tint_btn_checkable);
                } else if (i == R.drawable.abc_seekbar_thumb_material) {
                    colorStateListB = clu.b(context, R.color.abc_tint_seek_thumb);
                    i = R.drawable.abc_seekbar_thumb_material;
                }
            }
            if (colorStateListB != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                aab aabVar2 = (aab) this.c.get(context);
                if (aabVar2 == null) {
                    aabVar2 = new aab();
                    this.c.put(context, aabVar2);
                }
                int i2 = aabVar2.d;
                if (i2 == 0 || i > aabVar2.b[i2 - 1]) {
                    if (aabVar2.a && i2 >= aabVar2.b.length) {
                        aac.b(aabVar2);
                    }
                    int i3 = aabVar2.d;
                    int[] iArr4 = aabVar2.b;
                    if (i3 >= iArr4.length) {
                        int iD = aae.d(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(iArr4, iD);
                        iArrCopyOf.getClass();
                        aabVar2.b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(aabVar2.c, iD);
                        objArrCopyOf.getClass();
                        aabVar2.c = objArrCopyOf;
                    }
                    aabVar2.b[i3] = i;
                    aabVar2.c[i3] = colorStateListB;
                    aabVar2.d = i3 + 1;
                } else {
                    aabVar2.f(i, colorStateListB);
                }
                return colorStateListB;
            }
            colorStateList = colorStateListB;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188 A[Catch: all -> 0x01b2, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00aa, B:36:0x00b0, B:38:0x00b6, B:45:0x00cb, B:83:0x01a3, B:43:0x00c7, B:47:0x00d1, B:51:0x00e8, B:55:0x0116, B:57:0x0140, B:76:0x0188, B:78:0x0199, B:62:0x0151, B:65:0x015d, B:67:0x016a, B:70:0x0172, B:19:0x005c, B:32:0x00a0, B:24:0x0067, B:26:0x0081, B:28:0x008b, B:30:0x0095, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x01a8, B:87:0x01b1), top: B:91:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        zb zbVar = (zb) this.d.get(context);
        if (zbVar != null) {
            zbVar.f();
        }
    }

    public final synchronized void h(ut utVar) {
        this.h = utVar;
    }
}
