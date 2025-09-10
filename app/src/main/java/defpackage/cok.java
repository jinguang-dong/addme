package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cok {
    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static void b(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(TextView textView, int i) {
        coe.c(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void f(ActionMode.Callback callback) {
        if (callback instanceof cql) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(Activity activity, cwa cwaVar) {
        cwaVar.getClass();
        if (activity instanceof cwj) {
            ((cwj) activity).a().b(cwaVar);
        } else if (activity instanceof cwh) {
            cwc lifecycle = ((cwh) activity).getLifecycle();
            if (lifecycle instanceof cwc) {
                lifecycle.b(cwaVar);
            }
        }
    }

    public static final void h(Activity activity) {
        cwy cwyVar = cwz.Companion;
        cwy.a(activity);
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new cxa(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final cwb i(cwb cwbVar, cwb cwbVar2) {
        cwbVar.getClass();
        return (cwbVar2 == null || cwbVar2.compareTo(cwbVar) >= 0) ? cwbVar : cwbVar2;
    }
}
