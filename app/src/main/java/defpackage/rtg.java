package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rtg extends Handler {
    final /* synthetic */ rtj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtg(rtj rtjVar, Looper looper) {
        super(looper);
        this.a = rtjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        rtj rtjVar = this.a;
        rtjVar.d();
        int i = message.what;
        if (i == 1) {
            rtjVar.d = new RuntimeException("Failed to install module.");
        } else if (i != 2) {
            if (i != 3) {
                int i2 = message.what;
            } else {
                rtjVar.d = new UnavailableUserDeclinedInstallationException("User pressed back during the download.");
            }
        }
    }
}
