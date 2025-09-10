package j$.nio.file;

import java.security.PrivilegedAction;

/* renamed from: j$.nio.file.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0016j implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        j$.nio.file.spi.d dVar = j$.adapter.c.a;
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    dVar = (j$.nio.file.spi.d) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.d.class).newInstance(dVar);
                    if (!dVar.l().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
        }
        return dVar;
    }
}
