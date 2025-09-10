package com.google.android.libraries.camera.jni.yuv;

import android.graphics.Bitmap;
import defpackage.paw;
import defpackage.plw;
import defpackage.poi;
import defpackage.poj;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class YuvUtilNative {
    public static final /* synthetic */ int a = 0;

    static {
        paw.a(YuvUtilNative.class, "yuv-jni");
    }

    public static Bitmap a(poj pojVar, plw plwVar) {
        List listG = pojVar.g();
        poi poiVar = (poi) listG.get(0);
        poi poiVar2 = (poi) listG.get(1);
        poi poiVar3 = (poi) listG.get(2);
        ByteBuffer buffer = poiVar.getBuffer();
        ByteBuffer buffer2 = poiVar2.getBuffer();
        ByteBuffer buffer3 = poiVar3.getBuffer();
        int iC = pojVar.c();
        int iB = pojVar.b();
        int[] iArr = new int[iC * iB];
        if (convertYUV420ToARGBNative(pojVar.c(), pojVar.b(), buffer, poiVar.getPixelStride(), poiVar.getRowStride(), buffer2, poiVar2.getPixelStride(), poiVar2.getRowStride(), buffer3, poiVar3.getPixelStride(), poiVar3.getRowStride(), iArr, plwVar.i)) {
            return plwVar.j ? Bitmap.createBitmap(iArr, iB, iC, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(iArr, iC, iB, Bitmap.Config.ARGB_8888);
        }
        return null;
    }

    private static native boolean convertYUV420ToARGBNative(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, int[] iArr, int i9);

    public static native boolean copyYUV_420_888Native(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native boolean downsampleYUV_420_888toNV21Native(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i9);

    private static native boolean generateCircleThumbnailNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int[] iArr);
}
