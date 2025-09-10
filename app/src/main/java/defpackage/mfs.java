package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfs {
    private final File a;

    public mfs(File file) {
        this.a = file;
    }

    public final File a() {
        File file = this.a;
        boolean z = true;
        if (!file.mkdirs() && !file.isDirectory()) {
            z = false;
        }
        rnt.M(z, "Folder doesn't exist and cannot be created: ".concat(file.toString()));
        return file;
    }

    public final String b() {
        return this.a.getAbsolutePath();
    }

    public final String toString() {
        return this.a.toString();
    }
}
