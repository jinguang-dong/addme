package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class elu extends ena {
    public final enm a;
    public final /* synthetic */ emd c;
    private final emd d;
    private final int e;
    private final eme f;
    private ens g = null;
    public boolean b = true;

    public elu(emd emdVar, emd emdVar2, int i, enm enmVar, CameraCharacteristics cameraCharacteristics) {
        this.c = emdVar;
        this.d = emdVar2;
        this.e = i;
        this.a = enmVar;
        this.f = new eme(cameraCharacteristics);
    }

    @Override // defpackage.ena
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ena
    public final Camera.Parameters b() {
        return null;
    }

    @Override // defpackage.ena
    public final Handler c() {
        return this.c.b;
    }

    @Override // defpackage.ena
    public final ene d() {
        return this.d;
    }

    @Override // defpackage.ena
    public final enl e() {
        return this.f;
    }

    @Override // defpackage.ena
    public final ens f() {
        if (this.g == null) {
            this.g = this.c.b.b();
        }
        return this.g;
    }

    @Override // defpackage.ena
    public final ent g() {
        return this.c.c;
    }

    @Override // defpackage.ena
    public final enu h() {
        return this.c.d;
    }

    @Override // defpackage.ena
    public final void j(Handler handler, emu emuVar) {
        try {
            this.c.d.a(new as(this, emuVar, handler, 7));
        } catch (RuntimeException e) {
            this.d.g.c(e);
        }
    }

    @Override // defpackage.ena
    public final void k(boolean z) {
        this.b = z;
    }

    @Override // defpackage.ena
    public final void l(SurfaceTexture surfaceTexture) {
        f().g = true;
        super.l(surfaceTexture);
    }

    @Override // defpackage.ena
    public final void m(ens ensVar) {
        if (ensVar == null) {
            enz.c(emd.a, "null parameters in applySettings()");
        } else if (!(ensVar instanceof emf)) {
            enz.a(emd.a, "Provided settings not compatible with the backing framework API");
        } else if (s(ensVar, -2)) {
            this.g = ensVar;
        }
    }

    @Override // defpackage.ena
    public final void n() {
        f().g = true;
        super.l(null);
    }

    @Override // defpackage.ena
    public final void o(Handler handler, AmbientMode.AmbientController ambientController, emy emyVar, emy emyVar2) {
        try {
            this.c.d.a(new eao((Object) this, (Object) new emc(this, ambientController, handler, emyVar2), 5, (byte[]) null));
        } catch (RuntimeException e) {
            this.d.g.c(e);
        }
    }

    @Override // defpackage.ena
    public final void i(byte[] bArr) {
    }

    @Override // defpackage.ena
    public final void p(Handler handler, AmbientMode.AmbientController ambientController) {
    }

    @Override // defpackage.ena
    public final void q(Handler handler, AmbientMode.AmbientController ambientController) {
    }
}
