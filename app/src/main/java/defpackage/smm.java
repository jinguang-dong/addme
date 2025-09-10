package defpackage;

import com.google.common.io.ByteStreams;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smm {
    public static final byte[] a(File file) throws Throwable {
        smk smkVar = new smk();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            smkVar.a(fileInputStream);
            return ByteStreams.toByteArray(fileInputStream, DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size());
        } finally {
        }
    }
}
