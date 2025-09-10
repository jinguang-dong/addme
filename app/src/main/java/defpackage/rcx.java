package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcx extends rda implements rcr {
    private final FileInputStream a;
    private final File b;

    public rcx(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.rcr
    public final File a() {
        return this.b;
    }
}
