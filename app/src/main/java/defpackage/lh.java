package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lh extends cnn {
    final li a;
    public final Map b = new WeakHashMap();

    public lh(li liVar) {
        this.a = liVar;
    }

    @Override // defpackage.cnn
    public final cpw a(View view) {
        cnn cnnVar = (cnn) this.b.get(view);
        return cnnVar != null ? cnnVar.a(view) : super.a(view);
    }

    @Override // defpackage.cnn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        cnn cnnVar = (cnn) this.b.get(view);
        if (cnnVar != null) {
            cnnVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.cnn
    public void c(View view, cpt cptVar) {
        kq kqVar;
        li liVar = this.a;
        if (liVar.k() || (kqVar = liVar.a.m) == null) {
            super.c(view, cptVar);
            return;
        }
        kqVar.aM(view, cptVar);
        cnn cnnVar = (cnn) this.b.get(view);
        if (cnnVar != null) {
            cnnVar.c(view, cptVar);
        } else {
            super.c(view, cptVar);
        }
    }

    @Override // defpackage.cnn
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        cnn cnnVar = (cnn) this.b.get(view);
        if (cnnVar != null) {
            cnnVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.cnn
    public final void e(View view, int i) {
        cnn cnnVar = (cnn) this.b.get(view);
        if (cnnVar != null) {
            cnnVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.cnn
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        cnn cnnVar = (cnn) this.b.get(view);
        if (cnnVar != null) {
            cnnVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.cnn
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        cnn cnnVar = (cnn) this.b.get(view);
        return cnnVar != null ? cnnVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.cnn
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        cnn cnnVar = (cnn) this.b.get(viewGroup);
        return cnnVar != null ? cnnVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.cnn
    public boolean i(View view, int i, Bundle bundle) {
        li liVar = this.a;
        if (!liVar.k()) {
            RecyclerView recyclerView = liVar.a;
            if (recyclerView.m != null) {
                cnn cnnVar = (cnn) this.b.get(view);
                if (cnnVar != null) {
                    if (cnnVar.i(view, i, bundle)) {
                        return true;
                    }
                } else if (super.i(view, i, bundle)) {
                    return true;
                }
                RecyclerView recyclerView2 = recyclerView.m.s;
                kv kvVar = recyclerView2.e;
                ld ldVar = recyclerView2.O;
                return false;
            }
        }
        return super.i(view, i, bundle);
    }
}
