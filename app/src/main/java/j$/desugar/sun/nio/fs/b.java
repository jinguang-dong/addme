package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0002a;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.InterfaceC0007e;
import j$.nio.file.attribute.u;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b implements InterfaceC0007e {
    public static final HashSet b;
    public final Path a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = q.a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final void a(u uVar, u uVar2, u uVar3) {
        long jConvert;
        if (uVar == null && uVar2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().i().a(path, EnumC0002a.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.getClass();
        Objects.a(timeUnit, "unit");
        if (timeUnit != null) {
            jConvert = timeUnit.convert(uVar.a, timeUnit);
        } else {
            long jConvert2 = timeUnit.convert(uVar.b.getEpochSecond(), TimeUnit.SECONDS);
            if (jConvert2 == Long.MIN_VALUE || jConvert2 == Long.MAX_VALUE) {
                jConvert = jConvert2;
            } else {
                long jConvert3 = timeUnit.convert(uVar.b.getNano(), TimeUnit.NANOSECONDS);
                long j = jConvert2 + jConvert3;
                jConvert = ((jConvert3 ^ j) & (jConvert2 ^ j)) < 0 ? jConvert2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j;
            }
        }
        if (!file.setLastModified(jConvert)) {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.o
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final BasicFileAttributes readAttributes() {
        boolean z;
        Path path = this.a;
        path.getFileSystem().i().a(path, new EnumC0002a[0]);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        Objects.a(TimeUnit.MILLISECONDS, "unit");
        u uVar = new u(jLastModified);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new c(uVar, uVar, uVar, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
