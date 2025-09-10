package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgs implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final dgp a;
    final ViewGroup b;

    public dgs(dgp dgpVar, ViewGroup viewGroup) {
        this.a = dgpVar;
        this.b = viewGroup;
    }

    private final void a() {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d8 A[EDGE_INSN: B:154:0x01d8->B:87:0x01d8 BREAK  A[LOOP:1: B:18:0x0080->B:86:0x01d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02aa A[EDGE_INSN: B:196:0x02aa->B:133:0x02aa BREAK  A[LOOP:8: B:102:0x0227->B:210:0x0227], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgs.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ArrayList arrayList = dgt.b;
        ViewGroup viewGroup = this.b;
        arrayList.remove(viewGroup);
        ArrayList arrayList2 = (ArrayList) dgt.a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((dgp) arrayList2.get(i)).w(viewGroup);
            }
        }
        this.a.q(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
