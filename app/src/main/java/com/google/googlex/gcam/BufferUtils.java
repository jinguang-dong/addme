package com.google.googlex.gcam;

import defpackage.rnt;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BufferUtils {
    private BufferUtils() {
    }

    public static long a(Buffer buffer) {
        buffer.getClass();
        return getDirectBufferAddressImpl(buffer);
    }

    public static ByteBuffer b(long j, int i) {
        rnt.B(j != 0, "ptr must not be 0.");
        rnt.D(i > 0, "capacity must be positive, got: %s", i);
        return byteBufferViewOfNativePointerImpl(j, i).order(ByteOrder.nativeOrder());
    }

    private static native ByteBuffer byteBufferViewOfNativePointerImpl(long j, int i);

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return d(byteBuffer, byteBuffer.isDirect());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBufferAllocateDirect = z ? ByteBuffer.allocateDirect(byteBuffer.capacity()) : ByteBuffer.allocate(byteBuffer.capacity());
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byteBufferAsReadOnlyBuffer.clear();
        byteBufferAllocateDirect.put(byteBufferAsReadOnlyBuffer);
        byteBufferAllocateDirect.position(byteBuffer.position());
        byteBufferAllocateDirect.limit(byteBuffer.limit());
        byteBufferAllocateDirect.order(byteBuffer.order());
        return byteBufferAllocateDirect;
    }

    public static void e(float[] fArr, FloatVector floatVector) {
        floatVector.getClass();
        setFloatVectorImpl(fArr, floatVector.a);
    }

    private static native long getDirectBufferAddressImpl(Buffer buffer);

    private static native long getDirectBufferCapacityImpl(Buffer buffer);

    private static native void setByteVectorImpl(byte[] bArr, long j);

    private static native void setFloatVectorImpl(float[] fArr, long j);
}
