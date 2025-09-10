package com.google.android.libraries.microvideo;

import android.util.Log;
import com.google.common.io.ByteStreams;
import defpackage.edv;
import defpackage.edw;
import defpackage.qsp;
import defpackage.rca;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MicrovideoFiles {
    private static final byte[] MPEG4_FTYP_MARKER = {102, 116, 121, 112};
    private static final String TAG = "MicrovideoFiles";

    private MicrovideoFiles() {
    }

    public static void extractVideo(File file, File file2) throws edv, IOException {
        long videoOffset = getVideoOffset(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, videoOffset);
                ByteStreams.copy(fileInputStream, fileOutputStream);
                fileInputStream.close();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static edw extractXMPData(File file) {
        String path = file.getPath();
        Logger logger = rca.a;
        try {
            return rca.a(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            rca.a.logp(Level.SEVERE, "com.google.android.libraries.social.xmp.XmpUtil", "extractXMPMeta", "Could not read file: ".concat(String.valueOf(path)), (Throwable) e);
            return null;
        }
    }

    public static long getVideoOffset(File file) throws edv, IOException {
        int iR = qsp.r(extractXMPData(file));
        long length = file.length() - iR;
        if (length <= 0 || !validateOffset(file, length)) {
            Log.w(TAG, String.format("MicroVideoOffset %d invalid. Attempting recovery", Integer.valueOf(iR)));
            long jScanForMpeg4FtypAtom = scanForMpeg4FtypAtom(file);
            if (jScanForMpeg4FtypAtom >= 0) {
                return jScanForMpeg4FtypAtom;
            }
            throw new IOException("Could not recover starting offset.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.skip((-2) + length);
            fileInputStream.close();
            return length;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean isMicrovideo(InputStream inputStream) throws IOException {
        if (rca.a(inputStream) != null) {
            try {
                if (qsp.r(r5) > 0) {
                    return true;
                }
            } catch (edv unused) {
            }
        }
        return false;
    }

    public static InputStream openVideoStream(File file) throws edv, IOException {
        long videoOffset = getVideoOffset(file);
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.skip(videoOffset);
        return fileInputStream;
    }

    private static long scanForMpeg4FtypAtom(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[4];
            ByteStreams.readFully(fileInputStream, bArr);
            long j = 4;
            while (true) {
                if (Arrays.equals(bArr, MPEG4_FTYP_MARKER)) {
                    long length = j - r3.length;
                    fileInputStream.close();
                    return length - 4;
                }
                int i = 0;
                while (i < 3) {
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int i3 = fileInputStream.read();
                if (i3 < 0) {
                    fileInputStream.close();
                    return -1L;
                }
                bArr[3] = (byte) i3;
                j++;
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static boolean validateOffset(File file, long j) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, j + 4);
                byte[] bArr = new byte[4];
                ByteStreams.readFully(fileInputStream, bArr);
                boolean zEquals = Arrays.equals(bArr, MPEG4_FTYP_MARKER);
                fileInputStream.close();
                return zEquals;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
