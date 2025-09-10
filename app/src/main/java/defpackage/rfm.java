package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfm implements rev {
    private static final SparseArray a;
    private static final SparseArray b;
    private static final SparseArray c;

    private static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // defpackage.rev
    public final void a(rfo rfoVar, View view) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        int[] iArr = con.a;
        if (!view.isAttachedToWindow() || (view.getParent() instanceof ViewGroup)) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = view;
        }
        Activity activityB = b(viewFindViewById.getContext());
        if (activityB != null) {
            Window window = activityB.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                SparseArray sparseArray = a;
                if (i >= sparseArray.size()) {
                    break;
                }
                if (window.hasFeature(sparseArray.keyAt(i))) {
                    arrayList.add((String) sparseArray.valueAt(i));
                }
                i++;
            }
            rfoVar.b("window_features", TextUtils.join(" | ", arrayList));
            rfoVar.b("window_layoutParams_flags", c(b, attributes.flags));
            int i2 = attributes.systemUiVisibility;
            rfoVar.b("window_layoutParams_systemUiVisibility", i2 == 0 ? "SYSTEM_UI_FLAG_VISIBLE" : c(c, i2));
            rfoVar.b("rootWindowInsets", view.getRootWindowInsets().toString());
            rfoVar.e("window_statusBarColor", window.getStatusBarColor());
            rfoVar.e("window_navigationBarColor", window.getNavigationBarColor());
            rfk.c(activityB, activityB, rfoVar, "activity_");
        }
    }

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(8, "FEATURE_ACTION_BAR");
        sparseArray.put(9, "FEATURE_ACTION_BAR_OVERLAY");
        sparseArray.put(10, "FEATURE_ACTION_MODE_OVERLAY");
        sparseArray.put(13, "FEATURE_ACTIVITY_TRANSITIONS");
        sparseArray.put(12, "FEATURE_CONTENT_TRANSITIONS");
        sparseArray.put(6, "FEATURE_CONTEXT_MENU");
        sparseArray.put(7, "FEATURE_CUSTOM_TITLE");
        sparseArray.put(3, "FEATURE_LEFT_ICON");
        sparseArray.put(1, GAQqzWiWWcYOgy.TIrBcWOiP);
        sparseArray.put(0, "FEATURE_OPTIONS_PANEL");
        sparseArray.put(4, "FEATURE_RIGHT_ICON");
        sparseArray.put(11, "FEATURE_SWIPE_TO_DISMISS");
        a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        sparseArray2.put(1, "FLAG_ALLOW_LOCK_WHILE_SCREEN_ON");
        sparseArray2.put(131072, "FLAG_ALT_FOCUSABLE_IM");
        sparseArray2.put(2, "FLAG_DIM_BEHIND");
        sparseArray2.put(4194304, "FLAG_DISMISS_KEYGUARD");
        sparseArray2.put(Integer.MIN_VALUE, ibINv.KSRPxZdtEm);
        sparseArray2.put(2048, "FLAG_FORCE_NOT_FULLSCREEN");
        sparseArray2.put(1024, "FLAG_FULLSCREEN");
        sparseArray2.put(16777216, "FLAG_HARDWARE_ACCELERATED");
        sparseArray2.put(32768, "FLAG_IGNORE_CHEEK_PRESSES");
        sparseArray2.put(128, "FLAG_KEEP_SCREEN_ON");
        sparseArray2.put(1073741824, "FLAG_LAYOUT_ATTACHED_IN_DECOR");
        sparseArray2.put(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, "FLAG_LAYOUT_INSET_DECOR");
        sparseArray2.put(33554432, "FLAG_LAYOUT_IN_OVERSCAN");
        sparseArray2.put(256, PJGqOKsIpSdZ.tNABuJGLfBVF);
        sparseArray2.put(512, "FLAG_LAYOUT_NO_LIMITS");
        sparseArray2.put(268435456, "FLAG_LOCAL_FOCUS_MODE");
        sparseArray2.put(8, "FLAG_NOT_FOCUSABLE");
        sparseArray2.put(32, "FLAG_NOT_TOUCH_MODAL");
        sparseArray2.put(16384, "FLAG_SCALED");
        sparseArray2.put(8192, "FLAG_SECURE");
        sparseArray2.put(ImageMetadata.SHADING_MODE, "FLAG_SHOW_WALLPAPER");
        sparseArray2.put(ImageMetadata.LENS_APERTURE, "FLAG_SHOW_WHEN_LOCKED");
        sparseArray2.put(8388608, "FLAG_SPLIT_TOUCH");
        sparseArray2.put(134217728, "FLAG_TRANSLUCENT_NAVIGATION");
        sparseArray2.put(67108864, "FLAG_TRANSLUCENT_STATUS");
        sparseArray2.put(2097152, "FLAG_TURN_SCREEN_ON");
        sparseArray2.put(262144, "FLAG_WATCH_OUTSIDE_TOUCH");
        b = sparseArray2;
        c = qpt.V();
    }

    private static String c(SparseArray sparseArray, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            if ((i & iKeyAt) == iKeyAt) {
                arrayList.add((String) sparseArray.valueAt(i2));
            }
        }
        return TextUtils.join(VnmwoBe.BkJgUupmrjPKv, arrayList);
    }
}
