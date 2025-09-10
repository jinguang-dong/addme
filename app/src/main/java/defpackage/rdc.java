package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdc {
    public static final Pattern a = Pattern.compile(GdpuLBytnYW.lPqzZdyzY);

    public static String a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(rnt.Z(list, "+"));
    }
}
