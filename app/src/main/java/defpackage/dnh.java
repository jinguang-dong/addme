package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnh {
    public static final dng a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = a.ao(lowerCase, "robolectric") ? new dng() : null;
    }
}
