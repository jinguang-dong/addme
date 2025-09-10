package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.ar.core.R;
import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rka {
    private static final int[] a = {R.attr.dynamicColorThemeOverlay};
    private static final rjz b;
    private static final rjz c;

    private rka() {
    }

    public static void a(Activity activity) {
        View viewPeekDecorView;
        Context context;
        int i = cmo.a;
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        activity.getTheme().applyStyle(resourceId, true);
        Window window = activity.getWindow();
        Resources.Theme theme = null;
        if (window != null && (viewPeekDecorView = window.peekDecorView()) != null && (context = viewPeekDecorView.getContext()) != null) {
            theme = context.getTheme();
        }
        if (theme != null) {
            theme.applyStyle(resourceId, true);
        }
    }

    static {
        rjy rjyVar = new rjy();
        b = rjyVar;
        rjy rjyVar2 = new rjy();
        c = rjyVar2;
        HashMap map = new HashMap();
        map.put("fcnt", rjyVar);
        map.put("google", rjyVar);
        map.put("hmd global", rjyVar);
        map.put("infinix", rjyVar);
        map.put("infinix mobility limited", rjyVar);
        map.put("itel", rjyVar);
        map.put("kyocera", rjyVar);
        map.put("lenovo", rjyVar);
        map.put("lge", rjyVar);
        map.put("meizu", rjyVar);
        map.put("motorola", rjyVar);
        map.put("nothing", rjyVar);
        map.put("oneplus", rjyVar);
        map.put("oppo", rjyVar);
        map.put("realme", rjyVar);
        map.put("robolectric", rjyVar);
        map.put("samsung", rjyVar2);
        map.put("sharp", rjyVar);
        map.put("shift", rjyVar);
        map.put("sony", rjyVar);
        map.put("tcl", rjyVar);
        map.put("tecno", rjyVar);
        map.put("tecno mobile limited", rjyVar);
        map.put("vivo", rjyVar);
        map.put(VnmwoBe.ByK, rjyVar);
        map.put("xiaomi", rjyVar);
        DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", rjyVar);
        map2.put("jio", rjyVar);
        DesugarCollections.unmodifiableMap(map2);
    }
}
