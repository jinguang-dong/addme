package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class paw {
    public static final Object a = new Object();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();

    private paw() {
    }

    public static void a(Class cls, String str) {
        pav pavVar;
        synchronized (a) {
            String str2 = (String) c.get(cls);
            if (str2 != null) {
                pavVar = (pav) b.get(str2);
            } else if (str != null) {
                Map map = b;
                pav pavVar2 = (pav) map.get(str);
                if (pavVar2 == null) {
                    pavVar2 = new pav(str);
                    map.put(str, pavVar2);
                }
                pavVar = pavVar2;
            } else {
                pavVar = null;
            }
        }
        if (pavVar == null) {
            throw new IllegalStateException(cdVQ.LpeBZMAFDo.concat(String.valueOf(cls.getName())));
        }
        try {
            pavVar.b();
        } catch (UnsatisfiedLinkError e) {
            String str3 = pavVar.a;
            String strMapLibraryName = System.mapLibraryName(str3);
            String message = e.getMessage();
            if (message != null && message.contains(a.bw(strMapLibraryName, "couldn't find \"", "\""))) {
                throw new UnsatisfiedLinkError(String.format(null, "Failed to resolve \"%s\" for \"%s\". Did you forget to include the .so or register it with %s.register(%s.class, %s)? \n%s", strMapLibraryName, cls.getSimpleName(), "paw", cls.getSimpleName(), str3, e.getMessage()));
            }
            throw e;
        }
    }
}
