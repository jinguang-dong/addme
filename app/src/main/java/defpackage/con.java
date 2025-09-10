package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class con {
    private static WeakHashMap b;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final cod c = new cod();

    public static cnn a(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = col.a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof cnm ? ((cnm) accessibilityDelegateA).a : new cnn(accessibilityDelegateA);
    }

    public static cpp b(View view, cpp cppVar) {
        WindowInsets windowInsetsE = cppVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = com.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return cpp.o(windowInsetsA, view);
            }
        }
        return cppVar;
    }

    public static cpp c(View view, cpp cppVar) {
        WindowInsets windowInsetsE = cppVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = coe.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return cpp.o(windowInsetsA, view);
            }
        }
        return cppVar;
    }

    public static List d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void e(View view, cps cpsVar) {
        g(view);
        n(cpsVar.a(), view);
        d(view).add(cpsVar);
        l(view);
    }

    public static void f(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void g(View view) {
        cnn cnnVarA = a(view);
        if (cnnVarA == null) {
            cnnVarA = new cnn();
        }
        i(view, cnnVarA);
    }

    public static void h(View view, int i) {
        n(i, view);
        l(view);
    }

    public static void i(View view, cnn cnnVar) {
        if (cnnVar == null && (col.a(view) instanceof cnm)) {
            cnnVar = new cnn();
        }
        o(view);
        view.setAccessibilityDelegate(cnnVar == null ? null : cnnVar.H);
    }

    public static void j(View view, CharSequence charSequence) {
        cok.b(view, charSequence);
        if (charSequence == null) {
            cod codVar = c;
            codVar.a.remove(view);
            view.removeOnAttachStateChangeListener(codVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(codVar);
            return;
        }
        cod codVar2 = c;
        WeakHashMap weakHashMap = codVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(codVar2);
        if (view.isAttachedToWindow()) {
            codVar2.a(view);
        }
    }

    public static void k(View view, cps cpsVar, cqe cqeVar) {
        if (cqeVar == null) {
            h(view, cpsVar.a());
        } else {
            e(view, new cps(null, cpsVar.O, null, cqeVar, cpsVar.P));
        }
    }

    static void l(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = cok.a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 0);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            int i = true != z ? 2048 : 32;
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(i);
            accessibilityEventObtain.setContentChangeTypes(0);
            if (z) {
                accessibilityEventObtain.getText().add(cok.a(view));
                o(view);
            }
            view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
        }
    }

    @Deprecated
    public static ejs m(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        ejs ejsVar = (ejs) b.get(view);
        if (ejsVar != null) {
            return ejsVar;
        }
        ejs ejsVar2 = new ejs(view);
        b.put(view, ejsVar2);
        return ejsVar2;
    }

    private static void n(int i, View view) {
        List listD = d(view);
        for (int i2 = 0; i2 < listD.size(); i2++) {
            if (((cps) listD.get(i2)).a() == i) {
                listD.remove(i2);
                return;
            }
        }
    }

    private static void o(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }
}
