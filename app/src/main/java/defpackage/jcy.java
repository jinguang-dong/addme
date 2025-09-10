package defpackage;

import com.google.android.apps.camera.legacy.app.settings.CameraGm3SettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcy extends no {
    final /* synthetic */ CameraGm3SettingsActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcy(CameraGm3SettingsActivity cameraGm3SettingsActivity) {
        super(false);
        this.a = cameraGm3SettingsActivity;
    }

    @Override // defpackage.no
    public final void b() {
        CameraGm3SettingsActivity cameraGm3SettingsActivity = this.a;
        if (cameraGm3SettingsActivity.s.C()) {
            return;
        }
        g(false);
        cameraGm3SettingsActivity.j().d();
    }
}
