package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emm extends ena {
    public final /* synthetic */ emr a;
    private final ene b;
    private final int c;
    private final Camera d;
    private final ems e;

    public emm(emr emrVar, ene eneVar, int i, Camera camera, ems emsVar) {
        this.a = emrVar;
        this.b = eneVar;
        this.d = camera;
        this.c = i;
        this.e = emsVar;
    }

    @Override // defpackage.ena
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ena
    @Deprecated
    public final Camera.Parameters b() {
        end endVar = new end();
        Camera.Parameters[] parametersArr = new Camera.Parameters[1];
        try {
            this.a.f.b(new as(this, parametersArr, endVar, 8), endVar.b, "get parameters");
        } catch (RuntimeException e) {
            ((emr) this.b).g.c(e);
        }
        return parametersArr[0];
    }

    @Override // defpackage.ena
    public final Handler c() {
        return this.a.d;
    }

    @Override // defpackage.ena
    public final ene d() {
        return this.b;
    }

    @Override // defpackage.ena
    public final enl e() {
        return new ems(this.e);
    }

    @Override // defpackage.ena
    public final ens f() {
        return new emt(this.e, b());
    }

    @Override // defpackage.ena
    public final ent g() {
        return this.a.e;
    }

    @Override // defpackage.ena
    public final enu h() {
        return this.a.f;
    }

    @Override // defpackage.ena
    public final void j(Handler handler, emu emuVar) {
        this.a.f.a(new eao(this, new emj(this, handler, emuVar), 6, (short[]) null));
    }

    @Override // defpackage.ena
    public final void m(ens ensVar) {
        s(ensVar, 6);
    }

    @Override // defpackage.ena
    public final void o(Handler handler, AmbientMode.AmbientController ambientController, emy emyVar, emy emyVar2) {
        emm emmVar;
        emk emkVar = new emk(this, handler, emyVar2);
        try {
            emmVar = this;
        } catch (RuntimeException e) {
            e = e;
            emmVar = this;
        }
        try {
            this.a.f.a(new eml(emmVar, handler, ambientController, emyVar, emkVar, 0));
        } catch (RuntimeException e2) {
            e = e2;
            ((emr) emmVar.b).g.c(e);
        }
    }

    @Override // defpackage.ena
    public final void p(Handler handler, AmbientMode.AmbientController ambientController) {
        this.a.f.a(new as((ena) this, handler, (Object) ambientController, 9));
    }

    @Override // defpackage.ena
    public final void q(Handler handler, AmbientMode.AmbientController ambientController) {
        this.a.f.a(new as((ena) this, handler, (Object) ambientController, 10));
    }
}
