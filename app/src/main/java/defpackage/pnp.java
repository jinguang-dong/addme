package defpackage;

import android.os.Build;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnp {
    public final boolean a = true;
    public final boolean b = true;
    public final boolean c = true;
    public final boolean d = true;
    public final boolean e = true;
    public final boolean f;

    static {
        Pattern.compile("^[A-Z][A-Z0-9]{3}\\.\\d{6}\\.\\d{3}(\\..*)?$");
    }

    private pnp(String str) {
        "MASTER".equals(str);
        this.f = true;
    }

    public static pnp a() {
        Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String str = Build.ID;
        numValueOf.getClass();
        numValueOf.getClass();
        if (str == null) {
            str = "AAA01";
        }
        return new pnp(str);
    }
}
