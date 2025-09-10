package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnp implements jhe, jhc, jhh {
    public volatile int a = 1;
    private final owq b;
    private final jmw c;
    private final hbj d;

    public jnp(jmw jmwVar, owq owqVar, hbj hbjVar) {
        this.c = jmwVar;
        this.b = owqVar;
        this.d = hbjVar;
        owqVar.dK(new jjl(this, 14), sxo.a);
    }

    public final boolean d() {
        nkw nkwVar = (nkw) this.b.dL();
        int i = this.a;
        if (i != 3 && i != 2) {
            return false;
        }
        if (nkwVar == nkw.PHOTO) {
            return true;
        }
        gzi gziVar = gzo.a;
        return false;
    }

    @Override // defpackage.jhc
    public final void ea() {
        jmw jmwVar = this.c;
        jmwVar.a(false);
        jmwVar.d(this);
    }

    @Override // defpackage.jhe
    public final void eb() {
        this.c.c(this);
        a();
    }

    public final void a() {
        jmw jmwVar = this.c;
        boolean zD = d();
        jmwVar.a(zD);
        if (zD) {
            int i = this.a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                jmwVar.f = 1;
            } else {
                if (i2 != 2) {
                    int i3 = this.a;
                    throw new RuntimeException("Unknown enabled microvideo mode: ".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "MICROVIDEO_MODE_ON" : "MICROVIDEO_MODE_AUTO" : yoGAhrpjU.zbPfIepkXKRrFSS));
                }
                jmwVar.f = 2;
            }
        }
    }
}
