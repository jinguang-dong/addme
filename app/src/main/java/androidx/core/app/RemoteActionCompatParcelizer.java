package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.dhy;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(dhy dhyVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) dhyVar.t(remoteActionCompat.a);
        remoteActionCompat.b = dhyVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = dhyVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) dhyVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = dhyVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = dhyVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, dhy dhyVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dhyVar.u(remoteActionCompat.a);
        dhyVar.g(remoteActionCompat.b, 2);
        dhyVar.g(remoteActionCompat.c, 3);
        dhyVar.i(remoteActionCompat.d, 4);
        dhyVar.f(remoteActionCompat.e, 5);
        dhyVar.f(remoteActionCompat.f, 6);
    }
}
