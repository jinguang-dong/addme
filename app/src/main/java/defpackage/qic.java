package defpackage;

import android.opengl.EGL14;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qic extends RuntimeException {
    public qic(String str) {
        super(str);
    }

    public static qic a(qkq qkqVar) {
        return new qic("Could not create EGL context for version " + qkqVar.toString() + " (EGL error: " + EGL14.eglGetError() + ").");
    }
}
