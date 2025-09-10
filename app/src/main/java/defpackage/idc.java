package defpackage;

import j$.nio.file.Paths;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idc {
    private static final sgv a = sgv.g("idc");

    public static void a(byte[] bArr, rwc rwcVar) throws IOException {
        rwc rwcVarB = rwcVar.b(new idb(0));
        if (!rwcVarB.h() || ((String) rwcVarB.c()).isEmpty()) {
            return;
        }
        b(bArr, (String) rwcVarB.c());
    }

    public static void b(byte[] bArr, String str) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Paths.get(str, "debug_3a.bin").toString());
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            ((sgt) a.c().M(1868)).v("3A_DEBUG, error putting 3a debug data to additional path. %s.", e.getMessage());
        }
    }
}
