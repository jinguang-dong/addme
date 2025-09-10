package defpackage;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtr {
    boolean a = false;
    final /* synthetic */ InstallActivity b;

    public rtr(InstallActivity installActivity) {
        this.b = installActivity;
    }

    public final void a(rts rtsVar) {
        InstallActivity installActivity = this.b;
        synchronized (installActivity) {
            if (this.a) {
                return;
            }
            installActivity.lastEvent = rtsVar;
            ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
            ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
            int iOrdinal = rtsVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    installActivity.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                } else if (iOrdinal == 2) {
                    if (!installActivity.waitingForCompletion && rtj.a.e) {
                        installActivity.closeInstaller();
                    }
                    installActivity.finishWithFailure(null);
                }
                this.a = true;
            }
        }
    }

    public final void b(Exception exc) {
        InstallActivity installActivity = this.b;
        synchronized (installActivity) {
            if (this.a) {
                return;
            }
            this.a = true;
            installActivity.lastEvent = rts.CANCELLED;
            installActivity.finishWithFailure(exc);
        }
    }
}
