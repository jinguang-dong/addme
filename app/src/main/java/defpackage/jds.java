package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jds extends Exception {
    private static final sgv a = sgv.g(CZAHo.TEjlnfCaXj);

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public jds(String str) {
        super(str);
        ((sgt) ((sgt) a.b().i(this)).M((char) 2697)).v("%s", str);
    }

    public static void a(String str) throws jds {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new jds(str + ": glError " + GLU.gluErrorString(iGlGetError) + " " + iGlGetError);
    }

    public jds(String str, String str2) {
        super(str);
        ((sgt) ((sgt) a.b().i(this)).M(2698)).E("%s : %s", str, str2);
    }
}
