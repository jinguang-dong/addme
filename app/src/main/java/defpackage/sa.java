package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sa implements ri {
    private final OutputConfiguration a;
    private final Surface b;

    public sa(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
        this.b = outputConfiguration.getSurface();
    }

    public final void a(Surface surface) {
        surface.getClass();
        this.a.addSurface(surface);
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(OutputConfiguration.class))) {
            return this.a;
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
