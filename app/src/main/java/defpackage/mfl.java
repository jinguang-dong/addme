package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfl {
    public static final Object a = new Object();

    public final void a(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("Failed to delete file: ".concat(String.valueOf(file2.getAbsolutePath())));
                }
            }
            file.delete();
        }
    }
}
