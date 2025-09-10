package defpackage;

import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lps implements lpr {
    private final /* synthetic */ int a;

    public lps(int i) {
        this.a = i;
    }

    @Override // defpackage.lpr
    public final pao a(lmg lmgVar) {
        return this.a != 0 ? pao.CLOCKWISE_0 : lmgVar.b;
    }

    @Override // defpackage.lpr
    public final int b(lmg lmgVar, ByteBuffer byteBuffer) {
        if (this.a != 0) {
            return JpegUtilNative.a(lmgVar.a, byteBuffer.duplicate(), lmgVar.e, lmgVar.b);
        }
        return JpegUtilNative.a(lmgVar.a, byteBuffer.duplicate(), lmgVar.e, pao.CLOCKWISE_0);
    }

    public final String toString() {
        return this.a != 0 ? "byteRotatingCompressor" : "exifRotatingCompressor";
    }
}
