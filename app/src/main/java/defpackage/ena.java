package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ena {
    public abstract int a();

    @Deprecated
    public abstract Camera.Parameters b();

    public abstract Handler c();

    public abstract ene d();

    public abstract enl e();

    public abstract ens f();

    public abstract ent g();

    public abstract enu h();

    public void i(byte[] bArr) {
        try {
            h().a(new eao((Object) this, (Object) bArr, 11, (byte[]) null));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public abstract void j(Handler handler, emu emuVar);

    public void k(boolean z) {
        try {
            h().a(new emz(this, z, 0));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public void l(SurfaceTexture surfaceTexture) {
        try {
            h().a(new eao(this, surfaceTexture, 12, (short[]) null));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public abstract void m(ens ensVar);

    public void n() {
        if (g().d()) {
            return;
        }
        end endVar = new end();
        try {
            h().b(new eao((Object) this, (Object) endVar, 13, (byte[]) null), endVar.b, "set preview texture");
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public abstract void o(Handler handler, AmbientMode.AmbientController ambientController, emy emyVar, emy emyVar2);

    public abstract void p(Handler handler, AmbientMode.AmbientController ambientController);

    public abstract void q(Handler handler, AmbientMode.AmbientController ambientController);

    public final void r(Handler handler, enb enbVar) {
        try {
            h().a(new as(this, handler, (Object) enbVar, 13));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean s(defpackage.ens r8, int r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ena.s(ens, int):boolean");
    }
}
