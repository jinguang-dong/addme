package com.google.ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.google.ar.core.exceptions.FatalException;
import defpackage.ae;
import defpackage.af;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ArImage extends af {
    public final Session a;
    long b;
    private final long c;

    public ArImage(Session session, long j) {
        this.a = session;
        this.b = j;
        this.c = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j, long j2);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    static native void nativeLoadSymbols();

    @Override // android.media.Image, java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.c, this.b);
        this.b = 0L;
    }

    @Override // android.media.Image
    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // android.media.Image
    public final int getFormat() {
        int iNativeGetFormat = nativeGetFormat(this.a.nativeWrapperHandle, this.b);
        if (iNativeGetFormat != -1) {
            return iNativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    @Override // android.media.Image
    public final int getHeight() {
        int iNativeGetHeight = nativeGetHeight(this.a.nativeWrapperHandle, this.b);
        if (iNativeGetHeight != -1) {
            return iNativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    @Override // android.media.Image
    public final Image.Plane[] getPlanes() {
        int iNativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.a.nativeWrapperHandle, this.b);
        if (iNativeGetNumberOfPlanes == -1) {
            throw new FatalException("Unknown error in ArImage.getPlanes().");
        }
        ae[] aeVarArr = new ae[iNativeGetNumberOfPlanes];
        for (int i = 0; i < iNativeGetNumberOfPlanes; i++) {
            aeVarArr[i] = new ae(this, this.b, i);
        }
        return aeVarArr;
    }

    @Override // android.media.Image
    public final long getTimestamp() {
        long jNativeGetTimestamp = nativeGetTimestamp(this.a.nativeWrapperHandle, this.b);
        if (jNativeGetTimestamp != -1) {
            return jNativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    @Override // android.media.Image
    public final int getWidth() {
        int iNativeGetWidth = nativeGetWidth(this.a.nativeWrapperHandle, this.b);
        if (iNativeGetWidth != -1) {
            return iNativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    public native ByteBuffer nativeGetBuffer(long j, long j2, int i);

    public native int nativeGetPixelStride(long j, long j2, int i);

    public native int nativeGetRowStride(long j, long j2, int i);

    @Override // android.media.Image
    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    @Override // android.media.Image
    public final void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
