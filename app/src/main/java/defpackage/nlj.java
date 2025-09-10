package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.TypedValue;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.TouchDelegate;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlj {
    private static final sgv a = sgv.g("nlj");

    public static float a(float f) {
        return f * 0.0624f;
    }

    public static int b(float f) {
        return Math.round(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
    }

    public static int c(Activity activity, WindowInsets windowInsets) {
        if (activity.isInMultiWindowMode()) {
            return 0;
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.navigationBars());
        return Math.max(insets.bottom, Math.max(insets.left, insets.right));
    }

    public static Point d(View view) {
        DisplayCutout cutout;
        Display display = view.getDisplay();
        Point point = new Point();
        if (display != null && (cutout = display.getCutout()) != null) {
            RectF rectFG = g(cutout);
            point.set((int) rectFG.centerX(), (int) rectFG.centerY());
        }
        return point;
    }

    public static Point e(View view) {
        DisplayCutout cutout = view.getDisplay().getCutout();
        if (cutout == null) {
            return new Point(0, 0);
        }
        RectF rectFG = g(cutout);
        Point point = new Point();
        if (view.getDisplay().getRotation() == 3) {
            point.set((int) (f(view.getContext()).x - rectFG.centerX()), (int) rectFG.centerY());
            return point;
        }
        if (view.getDisplay().getRotation() != 1) {
            point.set((int) rectFG.centerX(), (int) rectFG.centerY());
            return point;
        }
        float width = view.getWidth() / 2.0f;
        point.set((int) rectFG.centerX(), (int) ((((float) ((int) rectFG.top)) >= width || rectFG.bottom <= width) ? cutout.getBoundingRectLeft().bottom - rectFG.centerY() : rectFG.centerY()));
        return point;
    }

    public static Point f(Context context) {
        Point point = new Point();
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static RectF g(DisplayCutout displayCutout) {
        RectF rectF = new RectF();
        Path cutoutPath = displayCutout.getCutoutPath();
        if (cutoutPath != null) {
            cutoutPath.computeBounds(rectF, true);
        }
        return rectF;
    }

    public static Size h(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        return new Size(bounds.width() - i, bounds.height() - i2);
    }

    public static mxm i(Display display, Context context) {
        int rotation;
        if (qpt.bj(context, display) || (rotation = display.getRotation()) == 0) {
            return mxm.PORTRAIT;
        }
        if (rotation == 2) {
            return mxm.REVERSE_PORTRAIT;
        }
        if (rotation == 1) {
            return mxm.LANDSCAPE;
        }
        if (rotation == 3) {
            return mxm.REVERSE_LANDSCAPE;
        }
        throw new IllegalStateException("Unknown display rotation");
    }

    public static void j(View view, View view2, int i, int i2) {
        Rect rect = new Rect();
        view2.getHitRect(rect);
        rect.top -= i;
        rect.left -= i2;
        rect.bottom += i;
        rect.right += i2;
        view.setTouchDelegate(new TouchDelegate(rect, view2));
    }

    public static boolean k(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            return rootWindowInsets.getDisplayCutout() != null;
        }
        ((sgt) a.b().M(5406)).s("WindowInsets is null. Not able to check cutouts status!");
        return false;
    }

    public static boolean l(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        View decorView = ((Activity) context).getWindow().getDecorView();
        return Math.min(decorView.getWidth(), decorView.getHeight()) < context.getResources().getDimensionPixelSize(R.dimen.felix_third_screen_threshold);
    }

    public static int[] m(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }
}
