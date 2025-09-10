package defpackage;

import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czq implements AutoCloseable {
    public final czo a;
    public final czr b;
    public final List c;
    public final List d;
    public int e;
    private final FileOutputStream f;
    private final FileChannel g;

    static {
        int i = sbp.d;
        sbp.h("video/av01", "video/3gpp", "video/avc", "video/hevc", "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision");
        sbp.q("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw");
    }

    public czq(FileOutputStream fileOutputStream, int i, czl czlVar, boolean z, boolean z2) {
        this.f = fileOutputStream;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
        this.g = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        czo czoVar = new czo();
        this.a = czoVar;
        this.b = new czr(fileChannelConvertMaybeLegacyFileChannelFromLibrary, czoVar, czlVar, i, z, z2);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException, czs {
        czs czsVar;
        List list;
        try {
            com.k(0L);
            czr czrVar = this.b;
            int i = 0;
            while (true) {
                List list2 = czrVar.e;
                if (i >= list2.size()) {
                    break;
                }
                czrVar.c((czt) list2.get(i));
                i++;
            }
            int i2 = 0;
            while (true) {
                list = czrVar.f;
                if (i2 >= list.size()) {
                    break;
                }
                czrVar.c((czt) list.get(i2));
                i2++;
            }
            czsVar = null;
            if (czrVar.g.get()) {
                czrVar.a();
                if (!list.isEmpty()) {
                    czo czoVar = czrVar.b;
                    czb czbVarK = com.k(0L);
                    czoVar.a(czbVarK);
                    ByteBuffer byteBufferC = czm.c();
                    czo czoVar2 = new czo();
                    czoVar2.a(czoVar.d);
                    czoVar2.a(new czb("auxiliary.tracks.interleaved", new byte[]{1}, 75));
                    int size = list.size();
                    byte[] bArr = new byte[size + 2];
                    bArr[0] = 1;
                    bArr[1] = (byte) size;
                    if (size > 0) {
                        cyr cyrVar = ((czt) list.get(0)).b;
                        throw new IllegalArgumentException("Unsupported auxiliary track type 0");
                    }
                    czoVar2.a(new czb("auxiliary.tracks.map", bArr, 0));
                    ByteBuffer byteBufferG = czm.g(list, czoVar2, czrVar.c);
                    int iRemaining = byteBufferC.remaining() + byteBufferG.remaining();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    byteBufferAllocate.putInt(1);
                    byteBufferAllocate.put(cza.d("axte"));
                    byteBufferAllocate.putLong(iRemaining + 16);
                    byteBufferAllocate.flip();
                    ByteBuffer byteBufferL = com.l(byteBufferAllocate, byteBufferC, byteBufferG);
                    czoVar.a(new czb("auxiliary.tracks.length", rup.w(byteBufferL.remaining()), 78));
                    czrVar.a();
                    czoVar.c.remove(czbVarK);
                    FileChannel fileChannel = czrVar.a;
                    czoVar.a(com.k(fileChannel.size()));
                    long size2 = fileChannel.size();
                    czrVar.a();
                    coi.x(size2 == fileChannel.size());
                    fileChannel.position(fileChannel.size());
                    fileChannel.write(byteBufferL);
                }
            }
        } catch (IOException e) {
            czsVar = new czs("Failed to finish writing data", e);
        }
        try {
            this.f.close();
        } catch (IOException e2) {
            if (czsVar == null) {
                czsVar = new czs("Failed to close output stream", e2);
            } else {
                synchronized (cyy.a) {
                    Log.e("Mp4Muxer", cyy.a("Failed to close output stream", e2));
                }
            }
        }
        if (czsVar != null) {
            throw czsVar;
        }
    }
}
