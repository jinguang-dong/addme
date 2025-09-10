package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwj {
    public static final String a;

    static {
        String str = (Build.TAGS == null || !Build.TAGS.contains("release-keys")) ? "test" : "release";
        a = str + "-keys_" + Build.DEVICE + "_" + Build.ID.substring(0, 4) + "_com.google.pixel.camera.hal.apex";
    }
}
