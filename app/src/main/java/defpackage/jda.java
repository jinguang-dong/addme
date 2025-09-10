package defpackage;

import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jda extends no {
    final /* synthetic */ CameraSettingsActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jda(CameraSettingsActivity cameraSettingsActivity) {
        super(true);
        this.a = cameraSettingsActivity;
    }

    @Override // defpackage.no
    public final void b() {
        CameraSettingsActivity cameraSettingsActivity = this.a;
        if ((cameraSettingsActivity.getIntent().getFlags() & 33554432) != 0) {
            cameraSettingsActivity.setResult(-1);
        }
        g(false);
        cameraSettingsActivity.j().d();
    }
}
