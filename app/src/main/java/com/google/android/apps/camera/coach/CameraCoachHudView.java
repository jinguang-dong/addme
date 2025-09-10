package com.google.android.apps.camera.coach;

import android.content.Context;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import defpackage.gua;
import defpackage.guj;
import defpackage.guq;
import defpackage.pao;
import defpackage.rvk;
import defpackage.rwc;
import java.util.function.BooleanSupplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraCoachHudView extends View {
    public float a;
    public rwc b;
    public rwc c;
    public rwc d;
    public volatile boolean e;
    public final rwc f;

    public CameraCoachHudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        rvk rvkVar = rvk.a;
        this.b = rvkVar;
        this.c = rvkVar;
        this.d = rvkVar;
        this.e = true;
        this.f = rwc.i((PowerManager) context.getSystemService("power"));
    }

    public final float a() {
        return pao.c(getDisplay()).e;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.coach.CameraCoachHudView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        BooleanSupplier booleanSupplier = new BooleanSupplier() { // from class: gtp
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                CameraCoachHudView cameraCoachHudView = this.a;
                if (!cameraCoachHudView.e) {
                    return false;
                }
                rwc rwcVar = cameraCoachHudView.f;
                return rwcVar.h() && !((PowerManager) rwcVar.c()).isPowerSaveMode();
            }
        };
        this.b = rwc.j(new guj(this, booleanSupplier));
        this.c = rwc.j(new guq(this, booleanSupplier));
        this.d = rwc.j(new gua(this));
    }
}
