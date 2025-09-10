package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.build.data.JKx.wzgaYJqO;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class reu implements rev {
    private static final sbv a;

    @Override // defpackage.rev
    public final void a(rfo rfoVar, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        if (accessibilityNodeInfoCreateAccessibilityNodeInfo != null) {
            cpt cptVar = new cpt(accessibilityNodeInfoCreateAccessibilityNodeInfo);
            rfoVar.c("accessibility_clickable", cptVar.B());
            rfoVar.c("checkable", cptVar.A());
            rfoVar.c("scrollable", cptVar.G());
            rfoVar.c("password", cptVar.F());
            rfoVar.c("long_clickable", cptVar.E());
            AccessibilityNodeInfo accessibilityNodeInfo = cptVar.a;
            rfoVar.c("accessibility_screenReaderFocusable", accessibilityNodeInfo.isScreenReaderFocusable());
            rfoVar.b("accessibility_className", cptVar.c());
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            ejs ejsVar = collectionInfo != null ? new ejs(collectionInfo) : null;
            if (ejsVar != null) {
                AccessibilityNodeInfo.CollectionInfo collectionInfo2 = (AccessibilityNodeInfo.CollectionInfo) ejsVar.a;
                rfoVar.e("accessibility_collectionInfo_rowCount", collectionInfo2.getRowCount());
                rfoVar.e("accessibility_collectionInfo_columnCount", collectionInfo2.getColumnCount());
                rfoVar.e("accessibility_collectionInfo_selectionMode", collectionInfo2.getSelectionMode());
            }
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
            ejs ejsVar2 = collectionItemInfo != null ? new ejs(collectionItemInfo) : null;
            if (ejsVar2 != null) {
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) ejsVar2.a;
                rfoVar.e("accessibility_collectionItemInfo_rowIndex", collectionItemInfo2.getRowIndex());
                rfoVar.e("accessibility_collectionItemInfo_rowSpan", collectionItemInfo2.getRowSpan());
                rfoVar.e("accessibility_collectionItemInfo_columnIndex", collectionItemInfo2.getColumnIndex());
                rfoVar.e("accessibility_collectionItemInfo_columnSpan", collectionItemInfo2.getColumnSpan());
            }
            Resources resources = view.getResources();
            List listF = cptVar.f();
            int i = 0;
            while (i < listF.size()) {
                cps cpsVar = (cps) listF.get(i);
                i++;
                String strBv = a.bv(i, "accessibility_action_");
                int iA = cpsVar.a() & (-16777216);
                String strC = (String) a.get(cpsVar);
                boolean z = iA != 0;
                if (strC == null && z) {
                    strC = qsz.c(resources, cpsVar.a());
                }
                if (strC == null) {
                    strC = String.format("%s (%d)", true != z ? "unknown" : "custom", Integer.valueOf(cpsVar.a()));
                }
                CharSequence charSequenceB = cpsVar.b();
                if (charSequenceB != null) {
                    strC = String.format("%s: `%s`", strC, charSequenceB);
                }
                rfoVar.b(strBv, strC);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(cps.g, "accessibility_focus");
        map.put(cps.h, "clear_accessibility_focus");
        map.put(cps.b, "clear_focus");
        map.put(cps.d, "clear_selection");
        map.put(cps.e, "click");
        map.put(cps.t, wzgaYJqO.loyyR);
        map.put(cps.G, "context_click");
        map.put(cps.o, "copy");
        map.put(cps.q, "cut");
        map.put(cps.u, "dismiss");
        map.put(cps.s, "expand");
        map.put(cps.a, "focus");
        map.put(cps.K, "hide_tooltip");
        map.put(cps.f, "long_click");
        map.put(cps.I, "move_window");
        map.put(cps.i, "next_at_movement_granularity");
        map.put(cps.k, "next_html_element");
        map.put(cps.D, "page_down");
        map.put(cps.E, "page_left");
        map.put(cps.F, "page_right");
        map.put(cps.C, "page_up");
        map.put(cps.p, "paste");
        map.put(cps.L, "press_and_hold");
        map.put(cps.j, "previous_at_movement_granularity");
        map.put(cps.l, "previous_html_element");
        map.put(cps.n, "scroll_backward");
        map.put(cps.A, "scroll_down");
        map.put(cps.m, "scroll_forward");
        map.put(cps.z, "scroll_left");
        map.put(cps.B, "scroll_right");
        map.put(cps.x, "scroll_to_position");
        map.put(cps.y, "scroll_up");
        map.put(cps.c, "select");
        map.put(cps.H, "set_progress");
        map.put(cps.r, "set_selection");
        map.put(cps.v, "set_text");
        map.put(cps.w, "show_on_screen");
        map.put(cps.J, "show_tooltip");
        a = sbv.m(map);
    }
}
