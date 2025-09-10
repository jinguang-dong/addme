package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RotateDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;
import defpackage.fuo;
import defpackage.inl;
import defpackage.jkf;
import defpackage.kcm;
import defpackage.kso;
import defpackage.ktf;
import defpackage.ktg;
import defpackage.kth;
import defpackage.kti;
import defpackage.nkw;
import defpackage.nlr;
import defpackage.ojl;
import defpackage.our;
import defpackage.out;
import defpackage.owf;
import defpackage.paq;
import defpackage.ujk;
import defpackage.ujp;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OptionsEntryButtonBc25Impl extends MaterialButton implements ktf {
    public static final /* synthetic */ int i = 0;
    public final RotateDrawable b;
    public final ViewSmoothRotationUtil$Rotatee c;
    public owf d;
    public owf e;
    public out f;
    public boolean g;
    public our h;
    private final nlr p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionsEntryButtonBc25Impl(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public static final int i(nkw nkwVar) {
        switch (nkwVar.ordinal()) {
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 10:
            case 15:
            case 16:
            case 17:
            case 18:
                return R.drawable.gs_settings_photo_camera_fill1_vd_theme_24;
            case 2:
            case 5:
            case 8:
            case 11:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 19:
                return R.drawable.gs_settings_video_camera_fill1_vd_theme_24;
            case 9:
            case 12:
            default:
                return R.drawable.gs_settings_fill1_vd_theme_24;
        }
    }

    @Override // defpackage.ktf
    public final paq a() {
        setImportantForAccessibility(4);
        return new jkf(this, 20);
    }

    @Override // defpackage.ktf
    public final void b() throws Resources.NotFoundException {
        this.p.c();
    }

    @Override // defpackage.ktf
    public final void c() throws Resources.NotFoundException {
        this.p.d();
    }

    @Override // defpackage.ktf
    public final void d(boolean z) {
        setBackgroundColor(z ? ojl.aP(this) : getResources().getColor(R.color.camera_protection_background_opaque, null));
        this.k.setColorFilter(z ? new PorterDuffColorFilter(ojl.aK(this), PorterDuff.Mode.SRC_IN) : null);
    }

    @Override // defpackage.ktf
    public final void e(Runnable runnable, Runnable runnable2) {
        setOnTouchListener(new fuo(new GestureDetector(getContext(), new kti(runnable)), 5, null));
        setOnClickListener(new kcm(runnable2, 7));
    }

    public final out f() {
        out outVar = this.f;
        if (outVar != null) {
            return outVar;
        }
        ujp.c("mainThread");
        return null;
    }

    public final owf g() {
        owf owfVar = this.d;
        if (owfVar != null) {
            return owfVar;
        }
        ujp.c("gcaMode");
        return null;
    }

    public final our h() {
        our ourVar = this.h;
        if (ourVar != null) {
            return ourVar;
        }
        ujp.c("activityLifetime");
        return null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        h().d(g().dK(new kso(this, 3), f()));
        our ourVarH = h();
        owf owfVar = this.e;
        if (owfVar == null) {
            ujp.c("uiOrientation");
            owfVar = null;
        }
        ourVarH.d(owfVar.dK(new kso(this, 4), f()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionsEntryButtonBc25Impl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.p = new nlr(this, true);
        this.g = true;
        ((kth) ((inl) context).d(kth.class)).b(this);
        RotateDrawable rotateDrawable = new RotateDrawable();
        Resources resources = getResources();
        Object objDL = g().dL();
        objDL.getClass();
        rotateDrawable.setDrawable(resources.getDrawable(i((nkw) objDL), null));
        rotateDrawable.setFromDegrees(-360.0f);
        rotateDrawable.setToDegrees(360.0f);
        rotateDrawable.setLevel(5000);
        this.b = rotateDrawable;
        this.c = new ktg(this);
        l(rotateDrawable);
    }

    public /* synthetic */ OptionsEntryButtonBc25Impl(Context context, AttributeSet attributeSet, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
