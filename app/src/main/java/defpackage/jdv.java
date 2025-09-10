package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jdv extends jdr {
    public static final sgv f = sgv.g("jdv");
    public float h;
    public float i;
    public int k;
    private int n;
    public final Point g = new Point();
    public final float[] j = new float[16];
    private final float[] m = new float[16];
    public boolean l = false;
    private final ArrayList o = new ArrayList();

    public final void e() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ood oodVar = (ood) arrayList.get(i);
            if (oodVar != null) {
                oodVar.c();
            }
        }
        arrayList.clear();
    }

    public final void f(float[] fArr, float f2, float f3, float f4) throws jds {
        if (!this.l) {
            ((sgt) f.b().M(2699)).s("Sprite not initialized.");
            return;
        }
        jdt jdtVar = this.e;
        if (jdtVar == null) {
            return;
        }
        jdtVar.c();
        this.a.position(0);
        this.b.position(0);
        this.e.g(this.a);
        this.e.e(this.b);
        float[] fArr2 = this.j;
        Matrix.translateM(fArr2, 0, fArr, 0, f2, f3, 0.0f);
        Matrix.rotateM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        if (f4 != 1.0f) {
            Matrix.scaleM(fArr2, 0, f4, f4, f4);
        }
        this.e.f(fArr2);
        Vector vector = this.d;
        if (vector.isEmpty()) {
            return;
        }
        ((ood) vector.get(0)).d();
        this.c.position(0);
        GLES20.glDrawElements(4, this.k, 5123, this.c);
    }

    public final void g(Context context, int i, float f2) {
        ood oodVar = new ood(null);
        Vector vector = this.d;
        vector.add(0, oodVar);
        this.o.add(oodVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
        if (bitmapDecodeResource == null) {
            return;
        }
        this.g.set(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        try {
            ood oodVar2 = (ood) vector.get(0);
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i2 = iArr[0];
            oodVar2.a = i2;
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmapDecodeResource, 0);
            jds.a("Texture : loadBitmap");
            bitmapDecodeResource.recycle();
        } catch (jds e) {
            e.printStackTrace();
        }
        bitmapDecodeResource.recycle();
        this.k = 6;
        this.n = 4;
        this.a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i3 = this.n;
        this.b = ByteBuffer.allocateDirect((i3 + i3) * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i4 = this.k;
        this.c = ByteBuffer.allocateDirect(i4 + i4).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        Point point = this.g;
        this.h = point.x / 2.0f;
        this.i = point.y / 2.0f;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        for (int i5 = 0; i5 < 8; i5++) {
            this.b.put(i5, fArr[i5]);
        }
        short[] sArr = {0, 1, 2, 0, 2, 3};
        for (int i6 = 0; i6 < 6; i6++) {
            this.c.put(i6, sArr[i6]);
        }
        Matrix.setIdentityM(this.m, 0);
        float f3 = this.h;
        float f4 = this.i;
        float f5 = -f3;
        float f6 = -f4;
        float[] fArr2 = {f5, f4, f2, f3, f4, f2, f3, f6, f2, f5, f6, f2};
        for (int i7 = 0; i7 < 12; i7++) {
            this.a.put(i7, fArr2[i7]);
        }
        this.l = true;
    }

    @Override // defpackage.jdr
    public final void c(float[] fArr) {
    }
}
