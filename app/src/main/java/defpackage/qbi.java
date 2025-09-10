package defpackage;

import android.net.Uri;
import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbi implements rch {
    private final Uri a;

    public qbi(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.rch
    public final /* bridge */ /* synthetic */ Object a(rcg rcgVar) throws IOException {
        Object obj = rcgVar.a;
        try {
            rdn rdnVar = new rdn();
            rdnVar.a = true;
            ZipInputStream zipInputStream = new ZipInputStream(rdnVar.a(rcgVar));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return null;
                    }
                    String name = nextEntry.getName();
                    if (name.contains("..")) {
                        for (File file = new File(name); file != null; file = file.getParentFile()) {
                            if (file.getName().equals("..")) {
                                throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                            }
                        }
                    }
                    Uri uriBuild = this.a.buildUpon().appendPath(name).build();
                    if (nextEntry.isDirectory()) {
                        ((lat) obj).n(uriBuild);
                    } else {
                        OutputStream outputStream = (OutputStream) ((lat) obj).m(uriBuild, new rdr());
                        try {
                            ByteStreams.copy(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            ((lat) obj).t(this.a);
            throw e;
        }
    }
}
