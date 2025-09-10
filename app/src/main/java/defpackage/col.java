package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class col {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static final void c(View view) {
        Iterator itA = new ull(new cor(view, (uhb) null, 0)).a();
        while (itA.hasNext()) {
            g((View) itA.next()).t();
        }
    }

    public static final void d(View view, cxt cxtVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, cxtVar);
    }

    public static final cwh e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            cwh cwhVar = tag instanceof cwh ? (cwh) tag : null;
            if (cwhVar != null) {
                return cwhVar;
            }
            Object objC = coj.c(view);
            view = objC instanceof View ? (View) objC : null;
        }
        return null;
    }

    public static final void f(View view, cwh cwhVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, cwhVar);
    }

    public static final pfl g(View view) {
        pfl pflVar = (pfl) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (pflVar != null) {
            return pflVar;
        }
        pfl pflVar2 = new pfl((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        view.setTag(R.id.pooling_container_listener_holder_tag, pflVar2);
        return pflVar2;
    }
}
