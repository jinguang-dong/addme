package defpackage;

import java.io.File;
import java.io.FileFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lsq implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
