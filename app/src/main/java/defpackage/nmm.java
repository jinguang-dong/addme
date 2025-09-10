package defpackage;

import android.app.Activity;
import android.content.IntentSender;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nmm implements jhh, jgu, jgz {
    public static final sgv a = sgv.g("nmm");
    public final out b;
    public nmh c = new nml();
    public rqc d;
    public final tdy e;
    AmbientModeSupport.AmbientController f;
    private final Activity g;
    private final Executor h;

    public nmm(Activity activity, jgt jgtVar, tdy tdyVar, Executor executor, out outVar) {
        this.g = activity;
        this.e = tdyVar;
        this.h = executor;
        this.b = outVar;
        ins.g(outVar, jgtVar, this);
    }

    public final void b() {
        this.d = null;
        this.c.a();
        this.h.execute(new nhp(this, 10));
    }

    public final void c() {
        if (this.f == null) {
            this.f = new AmbientModeSupport.AmbientController(this);
        }
        tdy tdyVar = this.e;
        AmbientModeSupport.AmbientController ambientController = this.f;
        ambientController.getClass();
        tdyVar.p(ambientController);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [sgt, shi] */
    public final void d() {
        rqc rqcVar = this.d;
        if (rqcVar == null || rqcVar.b != 2 || !rqcVar.a()) {
            ((sgt) a.c().M(5438)).v("App update info is null or not valid: %s", this.d);
            return;
        }
        c();
        try {
            rqc rqcVar2 = this.d;
            rqcVar2.getClass();
            Activity activity = this.g;
            if (rqcVar2.b() != null && !rqcVar2.e) {
                rqcVar2.e = true;
                activity.startIntentSenderForResult(rqcVar2.b().getIntentSender(), 57439, null, 0, 0, 0, null);
                return;
            }
            ((sgt) a.c().M(5439)).s("startUpdateFlowForResult returned false. Update has not started.");
        } catch (IntentSender.SendIntentException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5440)).s("Failed to start update flow");
            this.c.v(2, 1);
        }
    }

    @Override // defpackage.jgz
    public final void et() {
        AmbientModeSupport.AmbientController ambientController = this.f;
        if (ambientController != null) {
            this.e.q(ambientController);
        }
    }

    @Override // defpackage.jgu
    public final void f(int i, int i2) {
        if (i == 57439) {
            if (i2 == -1) {
                this.c.o();
                this.c.t();
            } else if (i2 == 0) {
                this.c.s();
            } else {
                ((sgt) a.c().M(5437)).t("Failed to update during user confirmation. resultCode: %s", i2);
                this.c.v(3, i2);
            }
        }
    }
}
