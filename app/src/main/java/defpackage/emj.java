package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class emj implements Camera.AutoFocusCallback {
    final /* synthetic */ Handler a;
    final /* synthetic */ emu b;
    final /* synthetic */ emm c;

    public emj(emm emmVar, Handler handler, emu emuVar) {
        this.c = emmVar;
        this.a = handler;
        this.b = emuVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        ent entVar = this.c.a.e;
        if (entVar.a() != 16) {
            enz.c(emr.a, "onAutoFocus callback returning when not focusing");
        } else {
            entVar.c(2);
        }
        this.a.post(new emz(this, z, 1));
    }
}
