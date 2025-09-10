package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxh extends LinearLayoutManager {
    public CenteredRecyclerView a;
    public int b;
    public scf c;
    private Handler d;
    private final Runnable e;

    public nxh(int i) {
        super(i);
        this.e = new ntd(this, 6);
    }

    private final int bx(int i, ld ldVar) {
        CenteredRecyclerView centeredRecyclerView;
        if (i == 0 || ldVar.a() == 0 || ldVar.o != 0 || ldVar.p != 0 || (centeredRecyclerView = this.a) == null) {
            return i;
        }
        if (ldVar.a() != 1) {
            View viewO = O(0);
            int iA = centeredRecyclerView.a(viewO) - i;
            View viewO2 = O(ldVar.a() - 1);
            int iA2 = centeredRecyclerView.a(viewO2) - i;
            if ((viewO == null || iA < 0) && (viewO2 == null || iA2 > 0)) {
                return i;
            }
        }
        return i / 2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final int D(ld ldVar) {
        if (an() != 0 && ldVar.a() != 0) {
            View viewAz = az(0);
            View viewAz2 = az(an() - 1);
            if (viewAz != null && viewAz2 != null) {
                return Math.min(this.D, bs(viewAz2) - bv(viewAz));
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void Q(ld ldVar, int[] iArr) {
        int i = this.b;
        if (ldVar.c()) {
            super.Q(ldVar, iArr);
            return;
        }
        int iMax = Math.max(i, Math.max(au(), aw()));
        int iMax2 = Math.max(i, Math.max(av(), at()));
        iArr[0] = iMax;
        iArr[1] = iMax2;
    }

    @Override // defpackage.kq
    public final int a(kv kvVar, ld ldVar) {
        if (this.k == 1) {
            return 1;
        }
        return ldVar.a();
    }

    @Override // defpackage.kq
    public final void aL(RecyclerView recyclerView) {
        if (recyclerView instanceof CenteredRecyclerView) {
            this.a = (CenteredRecyclerView) recyclerView;
            this.d = new Handler();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final void aj(RecyclerView recyclerView) {
        this.a = null;
        this.d = null;
    }

    @Override // defpackage.kq
    public final int b(kv kvVar, ld ldVar) {
        if (this.k == 1) {
            return ldVar.a();
        }
        return 1;
    }

    @Override // defpackage.kq
    public final int bk() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.animation.Interpolator, java.lang.Object] */
    public final void c() {
        scf scfVar = this.c;
        if (scfVar != null) {
            for (int i = 0; i < an(); i++) {
                View viewAz = az(i);
                if (viewAz != null && this.k != 0) {
                    float f = this.D;
                    int height = viewAz.getHeight();
                    int width = viewAz.getWidth();
                    float f2 = f / 2.0f;
                    float f3 = height;
                    float f4 = f3 / 2.0f;
                    float top = f2 - (((viewAz.getTop() + viewAz.getBottom()) / 2.0f) + viewAz.getTranslationY());
                    float fAbs = Math.abs(top) / (f2 + f4);
                    Context context = viewAz.getContext();
                    if (scfVar.a == null) {
                        scfVar.a = AnimationUtils.loadInterpolator(context, R.anim.wear_picker_skew_interpolator);
                    }
                    float interpolation = (scfVar.a.getInterpolation(1.0f - clc.C(fAbs, 0.0f, 1.0f)) * 0.55f) + 0.45f;
                    if (interpolation == 1.0f) {
                        viewAz.resetPivot();
                    } else {
                        viewAz.setPivotY(clc.C(f4 + top, 0.0f, f3));
                        viewAz.setPivotX(width / 2.0f);
                    }
                    viewAz.setScaleX(interpolation);
                    viewAz.setScaleY(interpolation);
                }
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final int d(int i, kv kvVar, ld ldVar) {
        int iD = super.d(bx(i, ldVar), kvVar, ldVar);
        if (this.k == 0) {
            c();
        }
        return iD;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final int e(int i, kv kvVar, ld ldVar) {
        int iE = super.e(bx(i, ldVar), kvVar, ldVar);
        if (this.k == 1) {
            c();
        }
        return iE;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.kq
    public final void p(ld ldVar) {
        super.p(ldVar);
        Handler handler = this.d;
        if (handler != null) {
            Runnable runnable = this.e;
            handler.removeCallbacks(runnable);
            handler.postAtFrontOfQueue(runnable);
        }
    }
}
