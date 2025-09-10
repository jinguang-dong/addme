package com.google.common.io;

import defpackage.a;
import defpackage.rnt;
import defpackage.ske;
import defpackage.smc;
import defpackage.smd;
import defpackage.sme;
import defpackage.smf;
import defpackage.smg;
import defpackage.smh;
import defpackage.smi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM = new smf();
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    private ByteStreams() {
    }

    private static boolean arraysEqual(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] combineBuffers(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
            i2 -= iMin;
        }
        return bArrCopyOf;
    }

    static boolean contentsEqual(InputStream inputStream, InputStream inputStream2) throws IOException {
        int i;
        byte[] bArrCreateBuffer = createBuffer();
        byte[] bArrCreateBuffer2 = createBuffer();
        do {
            i = read(inputStream, bArrCreateBuffer, 0, BUFFER_SIZE);
            if (i != read(inputStream2, bArrCreateBuffer2, 0, BUFFER_SIZE) || !arraysEqual(bArrCreateBuffer, bArrCreateBuffer2, i)) {
                return false;
            }
        } while (i == BUFFER_SIZE);
        return true;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArrCreateBuffer = createBuffer();
        long j = 0;
        while (true) {
            int i = inputStream.read(bArrCreateBuffer);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArrCreateBuffer, 0, i);
            j += i;
        }
    }

    static byte[] createBuffer() {
        return new byte[BUFFER_SIZE];
    }

    public static long exhaust(InputStream inputStream) {
        byte[] bArrCreateBuffer = createBuffer();
        long j = 0;
        while (true) {
            long j2 = inputStream.read(bArrCreateBuffer);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public static InputStream limit(InputStream inputStream, long j) {
        return new smi(inputStream, j);
    }

    public static smc newDataInput(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.getClass();
        return new smg(byteArrayInputStream);
    }

    public static smd newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        inputStream.getClass();
        bArr.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
        }
        rnt.K(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    public static Object readBytes(InputStream inputStream, sme smeVar) {
        inputStream.getClass();
        smeVar.getClass();
        byte[] bArrCreateBuffer = createBuffer();
        while (inputStream.read(bArrCreateBuffer) != -1 && smeVar.b()) {
        }
        return smeVar.a();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void skipFully(InputStream inputStream, long j) throws IOException {
        long jSkipUpTo = skipUpTo(inputStream, j);
        if (jSkipUpTo >= j) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + jSkipUpTo + " bytes; " + j + " bytes expected");
    }

    private static long skipSafely(InputStream inputStream, long j) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j));
    }

    static long skipUpTo(InputStream inputStream, long j) throws IOException {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long jSkipSafely = skipSafely(inputStream, j3);
            if (jSkipSafely == 0) {
                int iMin = (int) Math.min(j3, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jSkipSafely = inputStream.read(bArr, 0, iMin);
                if (jSkipSafely == -1) {
                    break;
                }
            }
            j2 += jSkipSafely;
        }
        return j2;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        inputStream.getClass();
        return toByteArrayInternal(inputStream, new ArrayDeque(TO_BYTE_ARRAY_DEQUE_SIZE), 0);
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue queue, int i) throws IOException {
        int iHighestOneBit = Integer.highestOneBit(i);
        int iMin = Math.min(BUFFER_SIZE, Math.max(128, iHighestOneBit + iHighestOneBit));
        while (i < MAX_ARRAY_LEN) {
            int iMin2 = Math.min(iMin, MAX_ARRAY_LEN - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return combineBuffers(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = ske.af(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static smd newDataOutput(int i) {
        if (i >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i)));
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = read(inputStream, bArr, i, i2);
        if (i3 != i2) {
            throw new EOFException(a.bD(i2, i3, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static byte[] toByteArray(InputStream inputStream, long j) throws IOException {
        rnt.E(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int i4 = inputStream.read(bArr, i3, i2);
                if (i4 == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= i4;
            }
            int i5 = inputStream.read();
            if (i5 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) i5});
            return toByteArrayInternal(inputStream, arrayDeque, i + 1);
        }
        throw new OutOfMemoryError(j + " bytes is too large to fit in a byte array");
    }

    public static smc newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    public static smd newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.getClass();
        return new smh(byteArrayOutputStream);
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        readableByteChannel.getClass();
        writableByteChannel.getClass();
        long jWrite = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long jPosition = fileChannel.position();
            long j = jPosition;
            while (true) {
                WritableByteChannel writableByteChannel2 = writableByteChannel;
                long jTransferTo = fileChannel.transferTo(j, 524288L, writableByteChannel2);
                j += jTransferTo;
                fileChannel.position(j);
                if (jTransferTo <= 0 && j >= fileChannel.size()) {
                    return j - jPosition;
                }
                writableByteChannel = writableByteChannel2;
            }
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(createBuffer());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                byteBufferWrap.flip();
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += writableByteChannel.write(byteBufferWrap);
                }
                byteBufferWrap.clear();
            }
            return jWrite;
        }
    }

    public static smc newDataInput(byte[] bArr, int i) {
        int length = bArr.length;
        rnt.T(i, length);
        return newDataInput(new ByteArrayInputStream(bArr, i, length - i));
    }
}
