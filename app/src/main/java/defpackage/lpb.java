package defpackage;

import android.os.IInterface;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpb extends fbi implements IInterface {
    public TimerTask a;
    final /* synthetic */ RemoteControlService b;
    private final Timer c;

    public lpb() {
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
    }

    private final synchronized void c(int i) {
        d();
        lpg lpgVar = new lpg(this, i);
        this.a = lpgVar;
        this.c.schedule(lpgVar, 250L);
    }

    private final synchronized boolean d() {
        TimerTask timerTask = this.a;
        if (timerTask == null) {
            return false;
        }
        boolean zCancel = timerTask.cancel();
        this.a = null;
        return zCancel;
    }

    public final boolean b() {
        RemoteControlService remoteControlService = this.b;
        return remoteControlService.e() && remoteControlService.b.c > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    @Override // defpackage.fbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean y(int r7, android.os.Parcel r8, android.os.Parcel r9) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpb.y(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpb(RemoteControlService remoteControlService) {
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
        this.b = remoteControlService;
        this.c = new Timer();
        this.a = null;
    }
}
