package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyt {
    private static final HashSet a = new HashSet();
    private static String b = "media3.common";

    public static synchronized void a() {
        if (a.add("media3.muxer")) {
            b = String.valueOf(b).concat(", media3.muxer");
        }
    }
}
