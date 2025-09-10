package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class evo implements eqv {
    private final Object a;
    private final /* synthetic */ int b;

    public evo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqv
    public final Class a() {
        return this.b != 0 ? ByteBuffer.class : this.a.getClass();
    }

    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        if (this.b == 0) {
            equVar.b(this.a);
            return;
        }
        try {
            Object obj = this.a;
            int i = fak.a;
            FileChannel fileChannel = null;
            try {
                long length = ((File) obj).length();
                if (length > 2147483647L) {
                    throw new IOException("File too large to map into memory");
                }
                if (length == 0) {
                    throw new IOException("File unsuitable for memory mapping");
                }
                randomAccessFile = new RandomAccessFile((File) obj, "r");
                try {
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                        try {
                            fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                        } catch (IOException unused) {
                        }
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    equVar.b(mappedByteBufferLoad);
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        } catch (IOException e) {
            equVar.e(e);
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return 1;
    }

    @Override // defpackage.eqv
    public final void d() {
    }

    @Override // defpackage.eqv
    public final void dE() {
    }
}
