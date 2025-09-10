package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tby {
    public static final tby a = new tby("kOff");
    public static final tby b = new tby("kSingle");
    public static final tby c = new tby(PNlJufQ.JUFFkxaamLe);
    private static int e;
    public final int d;
    private final String f;

    private tby(String str) {
        this.f = str;
        int i = e;
        e = i + 1;
        this.d = i;
    }

    public final String toString() {
        return this.f;
    }

    static {
        new tby("kUnknown");
        e = 0;
    }
}
