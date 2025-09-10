package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.apps.camera.focusindicator.EyesFocusIndicatorRectView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnw {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final boolean g;
    private final Object h;

    public hnw(nle nleVar, mye myeVar, owf owfVar, owf owfVar2, mdy mdyVar, owf owfVar3, boolean z, fbl fblVar) {
        this.e = nleVar;
        this.d = myeVar;
        this.c = owfVar;
        this.h = owfVar2;
        this.b = mdyVar;
        this.a = fblVar;
        this.g = z;
        this.f = owfVar3;
    }

    public final rwc a() {
        return this.g ? rvk.a : rwc.j(this.h);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r9v7, types: [fbl, java.lang.Object] */
    public final fda b(our ourVar, pka pkaVar, PointF pointF, fcy fcyVar) {
        RectF rectFA = ((mye) this.d).a();
        boolean z = true;
        if (!pkaVar.equals(pka.FRONT) && (!this.g || !((Boolean) this.h.dL()).booleanValue())) {
            z = false;
        }
        PointF pointFA = ((nle) this.e).a(pointF, rectFA, z);
        fda fdaVarA = this.a.a(new ejt(new PointF(nwj.e(pointFA.x), nwj.e(pointFA.y)), (byte[]) null));
        ourVar.d(fcyVar.a.dK(new gcf(this, pointF, rectFA, 1, null), sxo.a));
        return fdaVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hnw(Context context, FocusIndicatorView focusIndicatorView) {
        this.a = context;
        this.f = focusIndicatorView;
        this.b = context.getResources();
        this.c = (FocusIndicatorRingView) focusIndicatorView.findViewById(R.id.focus_indicator_ring);
        this.d = (EyesFocusIndicatorRectView) focusIndicatorView.findViewById(R.id.eyes_focus_indicator_rect);
        this.e = (FocusIndicatorAccessoryView) focusIndicatorView.findViewById(R.id.focus_lock_view);
        this.h = (FocusIndicatorAccessoryView) focusIndicatorView.findViewById(R.id.focus_taxi_view);
        boolean z = false;
        if ((context instanceof fdi) && ((fdi) context).b().p(gzy.q)) {
            z = true;
        }
        this.g = z;
    }
}
