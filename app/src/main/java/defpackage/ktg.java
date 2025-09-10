package defpackage;

import android.graphics.drawable.RotateDrawable;
import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonBc25Impl;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktg implements ViewSmoothRotationUtil$Rotatee {
    final /* synthetic */ OptionsEntryButtonBc25Impl a;

    public ktg(OptionsEntryButtonBc25Impl optionsEntryButtonBc25Impl) {
        this.a = optionsEntryButtonBc25Impl;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final float a() {
        return ((this.a.b.getLevel() * 720.0f) / 10000.0f) - 360.0f;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final /* synthetic */ String c() {
        return "rotationDegree";
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final void setRotationDegree(float f) {
        OptionsEntryButtonBc25Impl optionsEntryButtonBc25Impl = this.a;
        RotateDrawable rotateDrawable = optionsEntryButtonBc25Impl.b;
        rotateDrawable.setLevel((int) (((f + 360.0f) * 10000.0f) / 720.0f));
        optionsEntryButtonBc25Impl.invalidateDrawable(rotateDrawable);
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final /* synthetic */ Object b() {
        return this;
    }
}
