package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nx {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void a(nh nhVar, uiu uiuVar) {
        View childAt = ((ViewGroup) nhVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        cxt cxtVar = null;
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.e(uiuVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(nhVar, null, 0, 6, null);
        composeView2.e(uiuVar);
        View decorView = nhVar.getWindow().getDecorView();
        if (col.e(decorView) == null) {
            col.f(decorView, nhVar);
        }
        decorView.getClass();
        View view = decorView;
        while (true) {
            if (view == null) {
                break;
            }
            Object tag = view.getTag(com.google.ar.core.R.id.view_tree_view_model_store_owner);
            cxt cxtVar2 = tag instanceof cxt ? (cxt) tag : null;
            if (cxtVar2 != null) {
                cxtVar = cxtVar2;
                break;
            } else {
                Object objC = coj.c(view);
                view = objC instanceof View ? (View) objC : null;
            }
        }
        if (cxtVar == null) {
            col.d(decorView, nhVar);
        }
        if (coe.h(decorView) == null) {
            coe.i(decorView, nhVar);
        }
        nhVar.setContentView(composeView2, a);
    }
}
