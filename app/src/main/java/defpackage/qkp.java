package defpackage;

import android.util.Pair;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkp implements qfo {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final qin b;
    public final Map c = new HashMap();

    public qkp(qin qinVar) {
        this.b = qinVar;
    }

    public final qkl c(String str, String str2) {
        return (qkl) Map.EL.computeIfAbsent(this.c, Pair.create(str, str2), new npd(this, 5));
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.Map map = this.c;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((qkl) it.next()).close();
        }
        map.clear();
    }

    public final String toString() {
        return "GLTextureCopier[" + String.valueOf(this.b) + "]";
    }

    public final void a(qin qinVar) {
        qin qinVar2 = this.b;
        if (qinVar != qinVar2) {
            throw new IllegalArgumentException(mn.j(qinVar2, qinVar, "Input to GLTextureCopier must be on the copier's GL context. Found input on context ", CZAHo.Gjb));
        }
    }

    public final void b(qjn qjnVar, qim qimVar, float[] fArr) {
        a(qjnVar.b);
        qin qinVar = qimVar.b;
        a(qinVar);
        tym tymVarL = qji.l(qjw.a(qinVar));
        this.b.f();
        qji qjiVarA = tymVarL.a(c("attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(uImgTex, texCoord);\n}"));
        qjiVarA.d("uImgTex", qjnVar);
        qjiVarA.g(OPuAVreQM.irrCrKRapMn, fArr);
        qjiVarA.c("aPosition", 0);
        qjiVarA.c("aTexCoord", 1);
        qjiVarA.a(qimVar);
    }
}
