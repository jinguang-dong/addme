package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oib implements Handler.Callback {
    final /* synthetic */ ohz a;

    public oib(ohz ohzVar) {
        this.a = ohzVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap map = this.a.c;
            synchronized (map) {
                ohy ohyVar = (ohy) message.obj;
                oia oiaVar = (oia) map.get(ohyVar);
                if (oiaVar != null && oiaVar.b()) {
                    if (oiaVar.c) {
                        ohz ohzVar = oiaVar.g;
                        ohzVar.e.removeMessages(1, oiaVar.e);
                        ohzVar.f.b(ohzVar.d, oiaVar);
                        oiaVar.c = false;
                        oiaVar.b = 2;
                    }
                    map.remove(ohyVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        HashMap map2 = this.a.c;
        synchronized (map2) {
            ohy ohyVar2 = (ohy) message.obj;
            oia oiaVar2 = (oia) map2.get(ohyVar2);
            if (oiaVar2 != null && oiaVar2.b == 3) {
                Log.e("GmsClientSupervisor", eld.b(ohyVar2, "Timeout waiting for ServiceConnection callback "), new Exception());
                ComponentName componentName = oiaVar2.f;
                if (componentName == null) {
                    componentName = null;
                }
                if (componentName == null) {
                    componentName = new ComponentName(ohyVar2.b, "unknown");
                }
                oiaVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
