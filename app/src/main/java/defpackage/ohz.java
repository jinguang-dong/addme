package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohz {
    public static final Object a = new Object();
    public static HandlerThread b;
    public static ohz i;
    public final HashMap c;
    public final Context d;
    public volatile Handler e;
    public final ojf f;
    public final long g;
    public volatile Executor h;
    private final oib j;
    private final long k;

    public ohz() {
        throw null;
    }

    public ohz(Context context, Looper looper) {
        this.c = new HashMap();
        oib oibVar = new oib(this);
        this.j = oibVar;
        this.d = context.getApplicationContext();
        this.e = new ols(looper, oibVar);
        this.f = ojf.a();
        this.k = 5000L;
        this.g = 300000L;
        this.h = null;
    }

    public final void a(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        ohy ohyVar = new ohy(str, str2, z);
        HashMap map = this.c;
        synchronized (map) {
            oia oiaVar = (oia) map.get(ohyVar);
            if (oiaVar == null) {
                throw new IllegalStateException(mn.g(ohyVar.a, "Nonexistent connection status for service config: "));
            }
            if (!oiaVar.a(serviceConnection)) {
                throw new IllegalStateException(mn.g(ohyVar.a, PJGqOKsIpSdZ.bskhGFrQEgCrqAc));
            }
            oiaVar.a.remove(serviceConnection);
            if (oiaVar.b()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, ohyVar), this.k);
            }
        }
    }
}
