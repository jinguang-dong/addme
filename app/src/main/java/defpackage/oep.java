package defpackage;

import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oep extends Exception {

    @Deprecated
    public final Status a;

    public final int a() {
        return this.a.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oep(Status status) {
        int i = status.e;
        String str = status.f;
        super(i + uCzt.zEGzUXABThGlp + (str == null ? "" : str));
        this.a = status;
    }
}
