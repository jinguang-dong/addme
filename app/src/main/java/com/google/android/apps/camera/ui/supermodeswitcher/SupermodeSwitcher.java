package com.google.android.apps.camera.ui.supermodeswitcher;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.google.ar.core.R;
import defpackage.ape;
import defpackage.ayc;
import defpackage.bai;
import defpackage.bay;
import defpackage.bdq;
import defpackage.bxg;
import defpackage.cqh;
import defpackage.cwq;
import defpackage.cxb;
import defpackage.cxp;
import defpackage.cxs;
import defpackage.cxy;
import defpackage.dx;
import defpackage.fdi;
import defpackage.gno;
import defpackage.gvi;
import defpackage.gzo;
import defpackage.hhw;
import defpackage.jhg;
import defpackage.jhh;
import defpackage.mxj;
import defpackage.mxl;
import defpackage.mxm;
import defpackage.ned;
import defpackage.neg;
import defpackage.nei;
import defpackage.nej;
import defpackage.nfb;
import defpackage.nkx;
import defpackage.ojl;
import defpackage.ujk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SupermodeSwitcher extends bxg implements View.OnClickListener, mxl, jhh, jhg {
    public nfb a;
    public final AccessibilityManager b;
    private boolean c;
    private boolean d;
    private final neg e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SupermodeSwitcher(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(996734958);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            bay.K(nej.a.b(this.e), bdq.k(-802177874, new gvi(this, 4), aycVarC), aycVarC, 56);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 9);
        }
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        mxjVar.getClass();
        mxmVar.getClass();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (mxjVar == mxj.PHONE_LAYOUT || mxjVar == mxj.JARVIS_LAYOUT) {
            layoutParams2.bottomMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.gravity = 17;
        } else if (this.a.i) {
            layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.freeway_unfold_supermode_bottom_margin);
            layoutParams2.rightMargin = getResources().getDimensionPixelSize(R.dimen.freeway_unfold_supermode_right_margin);
            layoutParams2.gravity = 8388629;
        } else {
            layoutParams2.bottomMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.gravity = 8388629;
        }
        setLayoutParams(layoutParams2);
        nfb nfbVar = this.a;
        boolean z = this.c;
        cwq cwqVar = nfbVar.g;
        cwq cwqVar2 = nfbVar.f;
        Object objA = cwqVar2.a();
        objA.getClass();
        cwqVar.h(ojl.bn((mxm) objA, mxmVar, z));
        cwqVar2.h(mxmVar);
        if (this.c) {
            this.c = false;
            if (this.d) {
                setVisibility(0);
                this.d = false;
            }
        }
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.c = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nfb nfbVar = this.a;
        Object objA = nfbVar.b.a();
        objA.getClass();
        nfbVar.c((nkx) objA, true);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (this.c && i == 0) {
            this.d = true;
        } else {
            super.setVisibility(i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SupermodeSwitcher(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SupermodeSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.c = true;
        this.e = ((context instanceof fdi) && ((fdi) context).b().p(gzo.bw)) ? new nei() : new ned();
        dx dxVar = (dx) context;
        cxb viewModelStore$ar$class_merging = dxVar.getViewModelStore$ar$class_merging();
        cxp defaultViewModelProviderFactory = dxVar.getDefaultViewModelProviderFactory();
        cxy cxyVarD = cqh.d(dxVar);
        defaultViewModelProviderFactory.getClass();
        cxyVarD.getClass();
        this.a = (nfb) cxs.a(nfb.class, new gno(viewModelStore$ar$class_merging, defaultViewModelProviderFactory, cxyVarD));
        Object systemService = dxVar.getSystemService("accessibility");
        systemService.getClass();
        this.b = (AccessibilityManager) systemService;
        setOnHoverListener(new hhw(this, 4));
    }

    public /* synthetic */ SupermodeSwitcher(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
