package com.google.android.libraries.oliveoil.natives;

import android.graphics.Bitmap;
import com.google.android.libraries.oliveoil.util.JniUtil;
import defpackage.a;
import defpackage.qfq;
import defpackage.qhx;
import defpackage.qmk;
import defpackage.rnt;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BitmapNativeBuffer extends qmk {
    private final Bitmap a;
    private int c;
    private ByteBuffer d;

    public BitmapNativeBuffer(Bitmap bitmap) {
        super(new qhx(new qfq(bitmap.getWidth(), bitmap.getHeight()), bitmap.getRowBytes() * 8));
        this.c = 0;
        a.I(bitmap.getConfig() == Bitmap.Config.ARGB_8888);
        this.a = bitmap;
        int i = JniUtil.a;
    }

    private static native ByteBuffer lockBitmapPixels(Bitmap bitmap);

    private static native void unlockBitmapPixels(Bitmap bitmap);

    public final synchronized ByteBuffer a() {
        ByteBuffer byteBuffer;
        int i = this.c;
        this.c = i + 1;
        if (i == 0) {
            this.d = lockBitmapPixels(this.a);
        }
        byteBuffer = this.d;
        if (byteBuffer == null) {
            this.c--;
            throw new RuntimeException("Could not lock bitmap pixels!");
        }
        return byteBuffer;
    }

    public final synchronized void b() {
        rnt.L(this.d != null);
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            unlockBitmapPixels(this.a);
            this.d = null;
        }
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
