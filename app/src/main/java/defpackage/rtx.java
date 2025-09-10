package defpackage;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtx extends rqp {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Activity b;
    final /* synthetic */ rtr c;

    public rtx(AtomicBoolean atomicBoolean, rtr rtrVar, Activity activity) {
        this.a = atomicBoolean;
        this.c = rtrVar;
        this.b = activity;
    }

    @Override // defpackage.rqq
    public final void b(Bundle bundle) {
    }

    @Override // defpackage.rqq
    public final void c(Bundle bundle) throws IntentSender.SendIntentException {
        if (this.a.getAndSet(true)) {
        }
        int i = bundle.getInt("error.code", -100);
        int i2 = bundle.getInt("install.status", 0);
        if (i2 == 4) {
            this.c.a(rts.COMPLETED);
            return;
        }
        if (i != 0) {
            Log.w("ARCore-InstallService", a.bE(i, "requestInstall = ", ", launching fullscreen."));
            rtt.g(this.b, this.c);
            return;
        }
        if (bundle.containsKey("resolution.intent")) {
            rtt.i(this.b, bundle, this.c);
            return;
        }
        if (i2 == 10) {
            this.c.b(new FatalException(YyLACfm.DuXaZvBpCme));
            return;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.c.a(rts.ACCEPTED);
                break;
            case 4:
                this.c.a(rts.COMPLETED);
                break;
            case 5:
                this.c.b(new FatalException("Unexpected FAILED install status without error."));
                break;
            case 6:
                this.c.a(rts.CANCELLED);
                break;
            default:
                this.c.b(new FatalException(a.bv(i2, "Unexpected install status: ")));
                break;
        }
    }
}
