package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjj implements pns {
    public final Object a = new Object();
    public final OutputConfiguration b;

    public pjj(OutputConfiguration outputConfiguration) {
        this.b = outputConfiguration;
    }

    @Override // defpackage.pns
    public final qaq j() {
        throw null;
    }

    public final String toString() {
        String string;
        synchronized (this.a) {
            rwb rwbVar = new rwb("AndroidOutputConfiguration");
            rwbVar.b("outputConfiguration", this.b);
            string = rwbVar.toString();
        }
        return string;
    }
}
