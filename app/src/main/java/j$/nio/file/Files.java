package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.InterfaceC0007e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Files {
    public static final Set a = j$.desugar.sun.nio.fs.g.I(new Object[]{B.CREATE_NEW, B.WRITE});

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        inputStream.getClass();
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption != null) {
                    throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
                }
                throw new NullPointerException("options contains 'null'");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                path.getFileSystem().i().g(path);
                e = null;
            } catch (SecurityException e) {
                e = e;
            }
        } else {
            e = null;
        }
        try {
            OutputStream outputStreamW = path.getFileSystem().i().w(path, B.CREATE_NEW, B.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamW);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamW);
                }
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
            } catch (Throwable th) {
                if (outputStreamW != null) {
                    try {
                        outputStreamW.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            c(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                c(path).a(path, new EnumC0002a[0]);
                return true;
            }
            readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static j$.nio.file.spi.d c(Path path) {
        return path.getFileSystem().i();
    }

    public static Path createDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws FileSystemException {
        boolean zIsDirectory;
        boolean zIsDirectory2;
        try {
            try {
                c(path).c(path, fileAttributeArr);
            } catch (FileAlreadyExistsException e) {
                try {
                    try {
                        zIsDirectory = readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS).isDirectory();
                    } catch (IOException unused) {
                        zIsDirectory = false;
                    }
                    if (!zIsDirectory) {
                        throw e;
                    }
                } catch (FileAlreadyExistsException e2) {
                    throw e2;
                }
            }
            return path;
        } catch (IOException unused2) {
            try {
                path = path.toAbsolutePath();
                e = null;
            } catch (SecurityException e3) {
                e = e3;
            }
            Path parent = path.getParent();
            while (parent != null) {
                try {
                    parent.getFileSystem().i().a(parent, new EnumC0002a[0]);
                    break;
                } catch (NoSuchFileException unused3) {
                    parent = parent.getParent();
                }
            }
            if (parent == null) {
                if (e == null) {
                    throw new FileSystemException(path.toString(), null, "Unable to determine if root directory exists");
                }
                throw e;
            }
            Iterator it = parent.z(path).iterator();
            while (it.hasNext()) {
                parent = parent.i((Path) it.next());
                try {
                    c(parent).c(parent, fileAttributeArr);
                } catch (FileAlreadyExistsException e4) {
                    try {
                        zIsDirectory2 = readAttributes(parent, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS).isDirectory();
                    } catch (IOException unused4) {
                        zIsDirectory2 = false;
                    }
                    if (!zIsDirectory2) {
                        throw e4;
                    }
                }
            }
            return path;
        }
    }

    public static Path createFile(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        c(path).q(path, a, fileAttributeArr).close();
        return path;
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        j$.nio.file.spi.d dVarC = c(path);
        if (c(path2).equals(dVarC)) {
            dVarC.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + String.valueOf(copyOption2) + "' is not a recognized copy option");
                }
                z3 = true;
            }
        }
        BasicFileAttributes attributes = readAttributes(path, BasicFileAttributes.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (attributes.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().i().g(path2);
        } else if (b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (attributes.isDirectory()) {
            c(path2).c(path2, new FileAttribute[0]);
        } else {
            InputStream inputStreamV = c(path).v(path, new o[0]);
            try {
                a(inputStreamV, path2, new CopyOption[0]);
                inputStreamV.close();
            } catch (Throwable th) {
                if (inputStreamV != null) {
                    try {
                        inputStreamV.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((InterfaceC0007e) path2.getFileSystem().i().h(path2, InterfaceC0007e.class, new LinkOption[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            } catch (Throwable th3) {
                try {
                    path2.getFileSystem().i().f(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        path.getFileSystem().i().f(path);
        return path2;
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path) {
        return c(path).r(path, l.a);
    }

    public static List<String> readAllLines(Path path) throws IOException {
        j$.sun.nio.cs.f fVar = j$.sun.nio.cs.f.a;
        fVar.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c(path).v(path, new o[0]), new j$.sun.nio.cs.a(fVar, 1)));
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return arrayList;
                }
                arrayList.add(line);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) c(path).x(path, cls, linkOptionArr);
    }
}
