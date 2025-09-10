package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpt {
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    public cpt(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private final List J(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static cpt b() {
        return new cpt(AccessibilityNodeInfo.obtain());
    }

    static String e(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case ImageMetadata.CONTROL_AE_ANTIBANDING_MODE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case ImageMetadata.LENS_APERTURE /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return uCzt.KEd;
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return CGlJpiVWrCQOq.vPkto;
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final boolean A() {
        return this.a.isCheckable();
    }

    public final boolean B() {
        return this.a.isClickable();
    }

    public final boolean C() {
        return this.a.isFocusable();
    }

    public final boolean D() {
        return this.a.isFocused();
    }

    public final boolean E() {
        return this.a.isLongClickable();
    }

    public final boolean F() {
        return this.a.isPassword();
    }

    public final boolean G() {
        return this.a.isScrollable();
    }

    public final void H(cps cpsVar) {
        this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cpsVar.N);
    }

    public final void I() {
        Bundle bundleA = a();
        if (bundleA != null) {
            bundleA.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
        }
    }

    public final Bundle a() {
        return this.a.getExtras();
    }

    public final CharSequence c() {
        return this.a.getClassName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cpt)) {
            return false;
        }
        cpt cptVar = (cpt) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (cptVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cptVar.a)) {
            return false;
        }
        return this.c == cptVar.c && this.b == cptVar.b;
    }

    public final List f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new cps(actionList.get(i), 0, null, null, null));
        }
        return arrayList;
    }

    public final void g(int i) {
        this.a.addAction(i);
    }

    public final void h(cps cpsVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) cpsVar.N);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void j(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void k(boolean z) {
        this.a.setCheckable(z);
    }

    @Deprecated
    public final void l(boolean z) {
        this.a.setChecked(z);
    }

    public final void m(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void n(boolean z) {
        this.a.setClickable(z);
    }

    public final void o(Object obj) {
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((ejs) obj).a);
    }

    public final void p(Object obj) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((ejs) obj).a);
    }

    public final void q(boolean z) {
        this.a.setDismissable(z);
    }

    public final void r(boolean z) {
        this.a.setHeading(z);
    }

    public final void s(boolean z) {
        this.a.setLongClickable(z);
    }

    public final void t(int i) {
        this.a.setMovementGranularities(i);
    }

    public final void u(CharSequence charSequence) {
        this.a.setPaneTitle(charSequence);
    }

    public final void w(boolean z) {
        this.a.setScreenReaderFocusable(z);
    }

    public final void x(boolean z) {
        this.a.setScrollable(z);
    }

    public final void y(CharSequence charSequence) {
        this.a.setStateDescription(charSequence);
    }

    public final void z(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final CharSequence d() {
        String str = INRGuObcrHjSQz.MdV;
        if (J(str).isEmpty()) {
            return this.a.getText();
        }
        List listJ = J(str);
        List listJ2 = J("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listJ3 = J("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listJ4 = J("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < listJ.size(); i++) {
            spannableString.setSpan(new cpr(((Integer) listJ4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listJ.get(i)).intValue(), ((Integer) listJ2.get(i)).intValue(), ((Integer) listJ3.get(i)).intValue());
        }
        return spannableString;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        accessibilityNodeInfo.getBoundsInParent(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        accessibilityNodeInfo.getBoundsInScreen(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        accessibilityNodeInfo.getBoundsInWindow(rect);
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(d());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(accessibilityNodeInfo.getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(accessibilityNodeInfo.getSupplementalDescription());
        sb.append("; tooltipText: ");
        sb.append(accessibilityNodeInfo.getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(accessibilityNodeInfo.getUniqueId());
        sb.append("; checkable: ");
        sb.append(A());
        sb.append("; checked: ");
        int checked = accessibilityNodeInfo.getChecked();
        String str = "PARTIAL";
        sb.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(accessibilityNodeInfo.isFieldRequired());
        sb.append("; focusable: ");
        sb.append(C());
        sb.append("; focused: ");
        sb.append(D());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append(VnmwoBe.eHL);
        sb.append(B());
        sb.append("; longClickable: ");
        sb.append(E());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int expandedState = accessibilityNodeInfo.getExpandedState();
        if (expandedState == 0) {
            str = "UNDEFINED";
        } else if (expandedState == 1) {
            str = "COLLAPSED";
        } else if (expandedState != 2) {
            str = expandedState != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(F());
        sb.append("; scrollable: " + G());
        sb.append("; containerTitle: ");
        sb.append(accessibilityNodeInfo.getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        Bundle bundleA = a();
        sb.append(bundleA != null && (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 67108864) == 67108864);
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(accessibilityNodeInfo.isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(accessibilityNodeInfo.isAccessibilityDataSensitive());
        sb.append("; [");
        List listF = f();
        for (int i = 0; i < listF.size(); i++) {
            cps cpsVar = (cps) listF.get(i);
            String strE = e(cpsVar.a());
            if (strE.equals("ACTION_UNKNOWN") && cpsVar.b() != null) {
                strE = cpsVar.b().toString();
            }
            sb.append(strE);
            if (i != listF.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void v(CharSequence charSequence) {
        this.a.getExtras().putCharSequence(nWEkBGOQPWQp.KNHncBdWqPxlfJ, charSequence);
    }
}
