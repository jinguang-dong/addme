package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apo {
    public static final apn a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = a.ao(lowerCase, "robolectric") ? new apn() : null;
    }
}
