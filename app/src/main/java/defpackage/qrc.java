package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qrc {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public qrc(Context context) throws Throwable {
        qpm.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
