package defpackage;

import android.os.Handler;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ene {
    public static final eny i = new eny("CamAgnt");

    public abstract Handler a();

    public abstract enn b();

    public abstract enr c();

    protected abstract ent d();

    public abstract enu e();

    public abstract void f(enr enrVar);

    public final void g(boolean z) {
        try {
            if (!z) {
                e().a(new dzd(this, 6, null));
            } else {
                if (d().d()) {
                    return;
                }
                end endVar = new end();
                e().b(new eao(this, endVar, 9, (short[]) null), endVar.b, nWEkBGOQPWQp.Prh);
            }
        } catch (RuntimeException e) {
            c().c(e);
        }
    }
}
