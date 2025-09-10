package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0015i;
import j$.nio.file.EnumC0002a;
import j$.nio.file.G;
import j$.nio.file.H;
import j$.nio.file.I;
import j$.nio.file.J;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.util.DesugarArrays;
import j$.util.stream.C0065g;
import j$.util.stream.Collectors;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class o implements Path {
    public static final Pattern h = Pattern.compile("/+");
    public final AbstractC0015i a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public o(AbstractC0015i abstractC0015i, String str, String str2, String str3) {
        this(abstractC0015i, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) DesugarArrays.stream(h.split(str)).filter(new n(0)).collect(new C0065g(new n(14), new n(15), new n(16), new n(17), Collectors.b)), str2, str3);
    }

    @Override // j$.nio.file.Path
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.d) {
            return this;
        }
        String str = this.e;
        return new o(this.a, str, str, this.f).i(this);
    }

    @Override // j$.nio.file.Path
    public final I H(J j, G... gArr) {
        g(j, gArr, new H[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return r(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    @Override // j$.nio.file.Path
    public final I g(J j, G[] gArr, H... hArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new o(this.a, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final AbstractC0015i getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.d) {
            return null;
        }
        String str = this.f;
        return new o(this.a, str, this.e, str);
    }

    @Override // j$.nio.file.Path
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final o getName(int i) {
        if (i >= 0) {
            List list = this.c;
            if (i < list.size()) {
                return new o(this.a, (String) list.get(i), this.e, this.f);
            }
        }
        throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
    }

    @Override // j$.nio.file.Path
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new j$.nio.file.p(this);
    }

    @Override // j$.nio.file.Path
    public final Path j(LinkOption[] linkOptionArr) {
        AbstractC0015i abstractC0015i = this.a;
        abstractC0015i.i().a(this, EnumC0002a.READ);
        return Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS) ? toAbsolutePath() : new o(abstractC0015i, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        List list = this.c;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        boolean z = this.d;
        if (size == 1 && !z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("/");
        }
        sb.append(g.G(list.subList(0, size - 1)));
        return new o(this.a, sb.toString(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final o i(Path path) {
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (((o) path).d) {
            return (o) path;
        }
        return new o(this.a, this.b + "/" + String.valueOf(path), this.e, this.f);
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.b.compareTo(((o) path).b);
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new o(this.a, (this.d ? "/" : "") + g.G(arrayDeque), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean p(Path path) {
        int nameCount;
        path.getClass();
        if ((path instanceof o) && this.d == path.isAbsolute() && this.c.size() >= (nameCount = path.getNameCount())) {
            for (int i = 0; i < nameCount; i++) {
                if (getName(i).equals(path.getName(i))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.nio.file.Path
    public final boolean r(Path path) {
        path.getClass();
        if (!(path instanceof o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        List list = this.c;
        if (list.size() < nameCount) {
            return false;
        }
        int size = list.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final Path resolve(String str) {
        return i(getFileSystem().b(str, new String[0]));
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return t(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final o t(Path path) {
        path.getClass();
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o parent = getParent();
        return parent == null ? (o) path : parent.i(path);
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return p(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new o(this.a, g.G(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.b);
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = p.c;
        o absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(q.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = p.a;
            long j2 = p.b;
            if (c >= '@' ? c >= 128 || ((1 << (c - '@')) & j2) == 0 : (j & (1 << c)) == 0) {
                sb.append('%');
                char[] cArr2 = p.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            } else {
                sb.append(c);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // j$.nio.file.Path
    public final Path z(Path path) {
        int i = 0;
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (this.d != ((o) path).d) {
            throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
        }
        List list = ((o) path).c;
        List list2 = this.c;
        int size = list2.size();
        int size2 = list.size();
        while (i < size && i < size2 && ((String) list2.get(i)).equals(list.get(i))) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((String) list.get(i));
            i++;
        }
        return new o(this.a, false, arrayList, this.e, this.f);
    }

    public o(AbstractC0015i abstractC0015i, boolean z, List list, String str, String str2) {
        this.a = abstractC0015i;
        this.d = z;
        this.c = list;
        String str3 = z ? "/" : "";
        this.b = str3 + g.G(list);
        this.e = str;
        this.f = str2;
    }
}
