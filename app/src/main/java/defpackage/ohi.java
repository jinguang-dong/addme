package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohi implements ServiceConnection {
    final /* synthetic */ ohm a;
    private final int b;

    public ohi(ohm ohmVar, int i) {
        this.a = ohmVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            ohm ohmVar = this.a;
            synchronized (ohmVar.e) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                ohmVar.o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof oii)) ? new oii(iBinder) : (oii) iInterfaceQueryLocalInterface;
            }
            this.a.y(0, null, this.b);
            return;
        }
        ohm ohmVar2 = this.a;
        synchronized (ohmVar2.d) {
            i = ohmVar2.h;
        }
        if (i == 3) {
            ohmVar2.l = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = ohmVar2.c;
        handler.sendMessage(handler.obtainMessage(i2, ohmVar2.n.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ohm ohmVar = this.a;
        synchronized (ohmVar.e) {
            ohmVar.o = null;
        }
        ohm ohmVar2 = this.a;
        int i = this.b;
        Handler handler = ohmVar2.c;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
