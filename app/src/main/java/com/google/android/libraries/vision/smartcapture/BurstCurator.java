package com.google.android.libraries.vision.smartcapture;

import defpackage.rkf;
import defpackage.tow;
import defpackage.tuw;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BurstCurator implements Closeable {
    public final tow a;
    public final long b;
    public boolean c;

    static {
        rkf.f();
    }

    public BurstCurator(long j) {
        if (j == 0) {
            throw new IllegalStateException("Could not initialize BurstCurator.");
        }
        this.b = j;
        this.c = false;
        tow towVarB = tow.b();
        this.a = towVarB;
        towVarB.d(tuw.j);
    }

    private native void nativeClose(long j);

    public static native long nativeCreateFromOptions(byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        nativeClose(this.b);
        this.c = true;
    }

    protected final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public native byte[] nativeProcessMetadata(long j, byte[] bArr);

    public native byte[] nativeProcessYUV(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, byte[] bArr, int i9);

    public native byte[] nativeProcessYUVWithPolicy(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, byte[] bArr, int i9, byte[] bArr2);
}
