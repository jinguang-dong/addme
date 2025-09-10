package defpackage;

import android.media.Image;
import android.util.Size;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class teo {
    public static final sgv a = sgv.g("teo");
    public final fnp b;
    public final teu c;
    public final boolean d;
    public final fon e;
    private final foy f;

    public teo(rtl rtlVar, foy foyVar, fon fonVar, Size size, fnp fnpVar, txk txkVar, boolean z) {
        this.f = foyVar;
        this.e = fonVar;
        this.b = fnpVar;
        this.c = rtlVar.j(size, fnpVar, txkVar);
        this.d = z;
    }

    public final float a(Image image, float f, float f2) {
        float[] fArr = new float[2];
        ezh.m(new as(this.e, new float[]{f, f2}, fArr, 18, (short[]) null));
        int height = image.getHeight();
        int width = image.getWidth();
        float f3 = width * fArr[0];
        float f4 = height * fArr[1];
        int iMax = Math.max(3, Math.min(width - 3, (int) f3));
        int iMax2 = Math.max(3, Math.min(height - 3, (int) f4));
        Image.Plane plane = image.getPlanes()[0];
        return (float) (((char) plane.getBuffer().order(ByteOrder.nativeOrder()).getShort((iMax * plane.getPixelStride()) + (iMax2 * plane.getRowStride()))) / 1000.0d);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [sgt, shi] */
    public final foi b(float[] fArr, float f) {
        try {
            return this.f.c(new fow(this.c.a(fArr, f).j(), this.b.i()));
        } catch (fnx | fnz | foa e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5859)).s("Unable to create anchor.");
            return null;
        }
    }
}
