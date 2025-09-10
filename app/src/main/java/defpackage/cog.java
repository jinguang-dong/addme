package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.google.ar.core.R;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cog {
    public static float a(View view) {
        return view.getZ();
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static cpp d(View view, cpp cppVar, Rect rect) {
        WindowInsets windowInsetsE = cppVar.e();
        if (windowInsetsE != null) {
            return cpp.o(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return cppVar;
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f) {
        view.setElevation(f);
    }

    public static void i(View view, cny cnyVar) {
        cof cofVar = cnyVar != null ? new cof(view, cnyVar) : null;
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (cofVar != null) {
            view.setOnApplyWindowInsetsListener(cofVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void j(View view, String str) {
        view.setTransitionName(str);
    }

    static void k(View view) {
        view.stopNestedScroll();
    }

    public static final void l(View view, uiq uiqVar) {
        view.addOnLayoutChangeListener(new fvf(uiqVar, 1, null));
    }

    public static final Method m() {
        return (Method) dfj.c.a();
    }

    public static final Method n() {
        return (Method) dfj.b.a();
    }

    public static final dfc o(Context context, String str, dfb dfbVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new dfc(context, str, dfbVar, z, z2);
    }

    public static final void p(ddo ddoVar, String str) {
        ddw ddwVarA = ddoVar.a(str);
        try {
            ddwVarA.j();
            ske.ay(ddwVarA, null);
        } finally {
        }
    }

    public static final void q(int i, String str) {
        throw new SQLException(a.bv(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final dfj r(sgh sghVar, SQLiteDatabase sQLiteDatabase) {
        sghVar.getClass();
        Object obj = sghVar.a;
        if (obj != null) {
            dfj dfjVar = (dfj) obj;
            if (a.ao(dfjVar.d, sQLiteDatabase)) {
                return dfjVar;
            }
        }
        dfj dfjVar2 = new dfj(sQLiteDatabase);
        sghVar.a = dfjVar2;
        return dfjVar2;
    }
}
