package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrb implements ServiceConnection {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rrb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        nvf nvfVar;
        int i = this.b;
        if (i == 0) {
            ((rrc) this.a).c(new rqz(this, iBinder));
            return;
        }
        if (i != 1) {
            ((rtt) this.a).c(iBinder);
            return;
        }
        if (iBinder == null) {
            nvfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.photos.cameraassistant.ICameraAssistantService");
            nvfVar = iInterfaceQueryLocalInterface instanceof nvf ? (nvf) iInterfaceQueryLocalInterface : new nvf(iBinder);
        }
        RemoteControlService remoteControlService = (RemoteControlService) this.a;
        remoteControlService.g = nvfVar;
        remoteControlService.c = true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.b;
        if (i == 0) {
            ((rrc) this.a).c(new rra(this));
        } else {
            if (i != 1) {
                ((rtt) this.a).d();
                return;
            }
            RemoteControlService remoteControlService = (RemoteControlService) this.a;
            remoteControlService.g = null;
            remoteControlService.c = false;
        }
    }
}
