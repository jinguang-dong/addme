package defpackage;

import android.opengl.GLUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjk extends RuntimeException {
    public qjk(String str, int i, Throwable th) {
        super(a.by(GLUtils.getEGLErrorString(i), str, "Executing EGL task '", "' caused error: ", "!"), th);
    }
}
