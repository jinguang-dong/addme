package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcy extends rdb implements rcr {
    public final FileOutputStream a;
    private final File b;

    public rcy(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.rcr
    public final File a() {
        return this.b;
    }
}
