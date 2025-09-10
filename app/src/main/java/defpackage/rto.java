package defpackage;

import android.view.View;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rto implements View.OnClickListener {
    final /* synthetic */ InstallActivity a;
    private final /* synthetic */ int b;

    public rto(InstallActivity installActivity, int i) {
        this.b = i;
        this.a = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.finishWithFailure(new UnavailableUserDeclinedInstallationException());
        } else {
            InstallActivity installActivity = this.a;
            installActivity.animateToSpinner();
            installActivity.startInstaller();
        }
    }
}
