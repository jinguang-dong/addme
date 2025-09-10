package com.google.android.apps.camera.ui.creativebutton;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import defpackage.ape;
import defpackage.ayc;
import defpackage.bai;
import defpackage.bdq;
import defpackage.bxg;
import defpackage.coj;
import defpackage.dx;
import defpackage.gsn;
import defpackage.gvi;
import defpackage.gzo;
import defpackage.hbj;
import defpackage.hhw;
import defpackage.inl;
import defpackage.msp;
import defpackage.mte;
import defpackage.si;
import defpackage.uhb;
import defpackage.ujk;
import defpackage.ujp;
import defpackage.ukc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CreativeButton extends bxg implements View.OnClickListener {
    public final AccessibilityManager a;
    public final boolean b;
    public mte c;
    public hbj d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreativeButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // defpackage.bxg
    public final void a(ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-756975790);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            gsn.l(this.b, false, bdq.k(869286886, new gvi(this, 2), aycVarC), aycVarC, 384, 2);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 8);
        }
    }

    public final mte e() {
        mte mteVar = this.c;
        if (mteVar != null) {
            return mteVar;
        }
        ujp.c("viewModel");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e().l().a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreativeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreativeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        ((msp) ((inl) context).d(msp.class)).d(this);
        hbj hbjVar = this.d;
        if (hbjVar == null) {
            ujp.c("gcaConfig");
            hbjVar = null;
        }
        this.b = hbjVar.p(gzo.bw);
        ukc.C(coj.d((dx) context), null, 0, new si(this, (uhb) null, 14), 3);
        Object systemService = ((Activity) context).getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
        setOnHoverListener(new hhw(this, 2));
    }

    public /* synthetic */ CreativeButton(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
