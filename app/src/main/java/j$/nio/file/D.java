package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.C0003a;
import j$.nio.file.attribute.InterfaceC0007e;
import j$.util.C0033e;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class D {
    public static final C a = new C(0, "OVERFLOW", Object.class);
    public static final C b;
    public static final C c;
    public static final C d;

    static {
        Class<Path> cls = Path.class;
        b = new C(0, "ENTRY_CREATE", cls);
        int i = 0;
        c = new C(i, "ENTRY_DELETE", cls);
        d = new C(i, "ENTRY_MODIFY", cls);
    }

    public static /* synthetic */ StandardOpenOption a(B b2) {
        if (b2 == null) {
            return null;
        }
        return b2 == B.READ ? StandardOpenOption.READ : b2 == B.WRITE ? StandardOpenOption.WRITE : b2 == B.APPEND ? StandardOpenOption.APPEND : b2 == B.TRUNCATE_EXISTING ? StandardOpenOption.TRUNCATE_EXISTING : b2 == B.CREATE ? StandardOpenOption.CREATE : b2 == B.CREATE_NEW ? StandardOpenOption.CREATE_NEW : b2 == B.DELETE_ON_CLOSE ? StandardOpenOption.DELETE_ON_CLOSE : b2 == B.SPARSE ? StandardOpenOption.SPARSE : b2 == B.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? t.h((Path) obj) : r.m(obj) ? s.h(r.d(obj)) : obj;
    }

    public static Class c(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.y()) {
            return InterfaceC0007e.class;
        }
        if (cls == InterfaceC0007e.class) {
            return j$.adapter.b.y();
        }
        if (cls == j$.adapter.b.A()) {
            return j$.nio.file.attribute.w.class;
        }
        if (cls == j$.nio.file.attribute.w.class) {
            return j$.adapter.b.A();
        }
        if (cls == j$.adapter.b.B()) {
            return j$.nio.file.attribute.s.class;
        }
        if (cls == j$.nio.file.attribute.s.class) {
            return j$.adapter.b.B();
        }
        if (cls == j$.nio.file.attribute.h.class) {
            return j$.adapter.b.C();
        }
        if (cls == j$.adapter.b.C()) {
            return j$.nio.file.attribute.h.class;
        }
        if (cls == j$.nio.file.attribute.z.class) {
            return j$.adapter.b.D();
        }
        if (cls == j$.adapter.b.D()) {
            return j$.nio.file.attribute.z.class;
        }
        if (cls == C0003a.class) {
            return j$.adapter.b.z();
        }
        if (cls == j$.adapter.b.z()) {
            return C0003a.class;
        }
        C0033e.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.a()) {
            return BasicFileAttributes.class;
        }
        if (cls == BasicFileAttributes.class) {
            return j$.adapter.b.a();
        }
        if (cls == j$.adapter.b.r()) {
            return j$.nio.file.attribute.x.class;
        }
        if (cls == j$.nio.file.attribute.x.class) {
            return j$.adapter.b.r();
        }
        if (cls == j$.nio.file.attribute.i.class) {
            return j$.adapter.b.v();
        }
        if (cls == j$.adapter.b.v()) {
            return j$.nio.file.attribute.i.class;
        }
        C0033e.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map e(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, f(map.get(str)));
        }
        return map2;
    }

    public static Object f(Object obj) {
        if (j$.adapter.b.p(obj)) {
            try {
                return j$.desugar.sun.nio.fs.g.A(j$.adapter.b.i(obj));
            } catch (ClassCastException e) {
                C0033e.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.u)) {
            return obj;
        }
        try {
            return j$.desugar.sun.nio.fs.g.B((j$.nio.file.attribute.u) obj);
        } catch (ClassCastException e2) {
            C0033e.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set g(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof o) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(n.a((o) it.next()));
                } catch (ClassCastException e) {
                    C0033e.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.x(next)) {
                C0033e.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(m.a(j$.adapter.b.e(it2.next())));
                } catch (ClassCastException e2) {
                    C0033e.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set h(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.y) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.y yVar = (j$.nio.file.attribute.y) it.next();
                    hashSet.add(yVar == null ? null : yVar == j$.nio.file.attribute.y.OWNER_READ ? PosixFilePermission.OWNER_READ : yVar == j$.nio.file.attribute.y.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : yVar == j$.nio.file.attribute.y.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : yVar == j$.nio.file.attribute.y.GROUP_READ ? PosixFilePermission.GROUP_READ : yVar == j$.nio.file.attribute.y.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : yVar == j$.nio.file.attribute.y.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : yVar == j$.nio.file.attribute.y.OTHERS_READ ? PosixFilePermission.OTHERS_READ : yVar == j$.nio.file.attribute.y.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    C0033e.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.t(next)) {
                C0033e.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermissionJ = j$.adapter.b.j(it2.next());
                    hashSet.add(posixFilePermissionJ == null ? null : posixFilePermissionJ == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.y.OWNER_READ : posixFilePermissionJ == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.y.OWNER_WRITE : posixFilePermissionJ == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.y.OWNER_EXECUTE : posixFilePermissionJ == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.y.GROUP_READ : posixFilePermissionJ == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.y.GROUP_WRITE : posixFilePermissionJ == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.y.GROUP_EXECUTE : posixFilePermissionJ == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.y.OTHERS_READ : posixFilePermissionJ == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.y.OTHERS_WRITE : j$.nio.file.attribute.y.OTHERS_EXECUTE);
                } catch (ClassCastException e2) {
                    C0033e.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static /* synthetic */ LinkOption[] i(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static G[] j(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        G[] gArr = new G[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            gArr[i] = kind == null ? null : kind == StandardWatchEventKinds.ENTRY_CREATE ? b : kind == StandardWatchEventKinds.ENTRY_DELETE ? c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? d : kind == StandardWatchEventKinds.OVERFLOW ? a : kind instanceof F ? ((F) kind).a : new E(kind);
        }
        return gArr;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static WatchEvent.Kind[] l(G[] gArr) {
        if (gArr == null) {
            return null;
        }
        int length = gArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            G g = gArr[i];
            kindArr[i] = g == null ? null : g == b ? StandardWatchEventKinds.ENTRY_CREATE : g == c ? StandardWatchEventKinds.ENTRY_DELETE : g == d ? StandardWatchEventKinds.ENTRY_MODIFY : g == a ? StandardWatchEventKinds.OVERFLOW : g instanceof E ? ((E) g).a : new F(g);
        }
        return kindArr;
    }
}
