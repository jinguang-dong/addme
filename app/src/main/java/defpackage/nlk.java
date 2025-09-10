package defpackage;

import android.view.View;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlk implements ViewSmoothRotationUtil$Rotatee {
    final /* synthetic */ View a;

    public nlk(View view) {
        this.a = view;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final float a() {
        return this.a.getRotation();
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final Object b() {
        return this.a;
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final String c() {
        return "rotation";
    }

    @Override // com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee
    public final void setRotationDegree(float f) {
        this.a.setRotation(f);
    }
}
