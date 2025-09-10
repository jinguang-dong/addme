package defpackage;

import android.content.res.AssetFileDescriptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgj implements paq {
    public final Object a;
    private final /* synthetic */ int b;

    public lgj(AssetFileDescriptor assetFileDescriptor, int i) {
        this.b = i;
        this.a = assetFileDescriptor;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b != 0) {
            ((qiu) this.a).close();
            return;
        }
        Object obj = this.a;
        if (obj != null) {
            try {
                ((AssetFileDescriptor) obj).close();
            } catch (IOException e) {
                ((sgt) ((sgt) lgk.a.b().i(e)).M((char) 4137)).s("Unable to close asset file");
            }
        }
    }

    public lgj(qin qinVar, int i, int i2) {
        this.b = i2;
        qjv qjvVar = new qjv(qinVar);
        qjvVar.a(new qml(qkl.d(qinVar, "#version 320 es\nin vec4 aPosition;\nin vec2 aTexCoord;\nuniform mat4 uTransform;\nout vec2 vTexCoord;\nvoid main() {\n  vTexCoord = aTexCoord;\n  gl_Position = uTransform * aPosition;\n}")));
        qjvVar.a(new qml(qkl.b(qinVar, i == 35 ? "#version 320 es\n#extension GL_EXT_YUV_target : enable\nprecision highp float;\nuniform highp __samplerExternal2DY2YEXT uImgTex;\nin vec2 vTexCoord;\nlayout (yuv) out vec3 outColor;\nvoid main() {\n    outColor = texture(uImgTex, vTexCoord).rgb;\n}" : "#version 320 es\n#extension GL_EXT_YUV_target : enable\nprecision highp float;\nuniform highp __samplerExternal2DY2YEXT uImgTex;\nin vec2 vTexCoord;\nout vec4 outColor;\nvoid main() {\n    outColor = vec4(yuv_2_rgb(texture(uImgTex, vTexCoord).rgb,\n                              itu_601_full_range), 1.0);\n}")));
        this.a = qjvVar.b();
    }
}
