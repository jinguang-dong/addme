package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edd {
    public static final String a = dwj.a("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String strConcat = cdVQ.ZlsntZqAh.concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (ede.a) {
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
