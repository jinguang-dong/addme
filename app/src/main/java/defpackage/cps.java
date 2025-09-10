package defpackage;

import android.R;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cps {
    public static final cps M;
    final Object N;
    public final int O;
    public final Class P;
    public final cqe Q;
    public static final cps a = new cps(1, (CharSequence) null);
    public static final cps b = new cps(2, (CharSequence) null);
    public static final cps c = new cps(4, (CharSequence) null);
    public static final cps d = new cps(8, (CharSequence) null);
    public static final cps e = new cps(16, (CharSequence) null);
    public static final cps f = new cps(32, (CharSequence) null);
    public static final cps g = new cps(64, (CharSequence) null);
    public static final cps h = new cps(128, (CharSequence) null);
    public static final cps i = new cps(256, cpx.class);
    public static final cps j = new cps(512, cpx.class);
    public static final cps k = new cps(1024, cpy.class);
    public static final cps l = new cps(2048, cpy.class);
    public static final cps m = new cps(4096, (CharSequence) null);
    public static final cps n = new cps(8192, (CharSequence) null);
    public static final cps o = new cps(16384, (CharSequence) null);
    public static final cps p = new cps(32768, (CharSequence) null);
    public static final cps q = new cps(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, (CharSequence) null);
    public static final cps r = new cps(131072, cqc.class);
    public static final cps s = new cps(262144, (CharSequence) null);
    public static final cps t = new cps(ImageMetadata.LENS_APERTURE, (CharSequence) null);
    public static final cps u = new cps(ImageMetadata.SHADING_MODE, (CharSequence) null);
    public static final cps v = new cps(2097152, cqd.class);
    public static final cps w = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
    public static final cps x = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, cqa.class);
    public static final cps y = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
    public static final cps z = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
    public static final cps A = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
    public static final cps B = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
    public static final cps C = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
    public static final cps D = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
    public static final cps E = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
    public static final cps F = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
    public static final cps G = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
    public static final cps H = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, cqb.class);
    public static final cps I = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, cpz.class);
    public static final cps J = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
    public static final cps K = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
    public static final cps L = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);

    static {
        new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
        new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, R.id.accessibilityActionDragStart, null, null, null);
        new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, R.id.accessibilityActionDragDrop, null, null, null);
        new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, R.id.accessibilityActionDragCancel, null, null, null);
        new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        M = new cps(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public cps(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof cps) && this.N.equals(((cps) obj).N);
    }

    public final int hashCode() {
        return this.N.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strE = cpt.e(this.O);
        if (strE.equals("ACTION_UNKNOWN") && b() != null) {
            strE = b().toString();
        }
        sb.append(strE);
        return sb.toString();
    }

    private cps(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public cps(Object obj, int i2, CharSequence charSequence, cqe cqeVar, Class cls) {
        this.O = i2;
        this.Q = cqeVar;
        this.N = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.P = cls;
    }
}
