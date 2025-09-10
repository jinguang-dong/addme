package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ska extends sjd {
    private final sjy a;
    private final ske b;
    private final sjz c;
    private final sjc d;

    private static Object p(Class cls, String str) throws ClassNotFoundException {
        String property;
        Object objCast;
        try {
            property = System.getProperty(str, null);
        } catch (SecurityException e) {
            sla.a("cannot read property name %s: %s", str, e);
            property = null;
        }
        if (property == null) {
            objCast = null;
        } else {
            int iIndexOf = property.indexOf(35);
            String strSubstring = iIndexOf == -1 ? property : property.substring(0, iIndexOf);
            String strSubstring2 = iIndexOf == -1 ? "getInstance" : property.substring(iIndexOf + 1);
            String str2 = strSubstring + "#" + strSubstring2 + "()";
            try {
                Class<?> cls2 = Class.forName(strSubstring);
                try {
                    objCast = cls.cast(cls2.getMethod(strSubstring2, null).invoke(null, null));
                } catch (NoSuchMethodException e2) {
                    if (iIndexOf != -1 && strSubstring2.equals("getInstance")) {
                        a.bw(strSubstring, "new ", "()");
                        objCast = cls.cast(cls2.getConstructor(null).newInstance(null));
                    }
                    sla.a("method '%s' does not exist: %s\n", property, e2);
                }
            } catch (ClassCastException e3) {
                sla.a("cannot cast result of calling '%s' to '%s': %s\n", str2, cls.getName(), e3);
            } catch (ClassNotFoundException unused) {
            } catch (Exception e4) {
                sla.a("cannot call expected no-argument constructor or static method '%s': %s\n", str2, e4);
            }
        }
        if (objCast != null) {
            return objCast;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return arrayList.get(0);
        }
        System.err.printf("Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the '%s' system property. The default implementation will be used instead.%n", cls.getName(), arrayList, str);
        return null;
    }

    @Override // defpackage.sjd
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.sjd
    protected final sif e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.sjd
    protected final sjc h() {
        return this.d;
    }

    @Override // defpackage.sjd
    protected final ske j() {
        return this.b;
    }

    @Override // defpackage.sjd
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }

    public ska() {
        sjy sjyVar = (sjy) p(sjy.class, wzgaYJqO.Fiy);
        this.a = sjyVar == null ? skb.a : sjyVar;
        ske skeVar = (ske) p(ske.class, "flogger.logging_context");
        this.b = skeVar == null ? skg.a : skeVar;
        sjz sjzVar = (sjz) p(sjz.class, clFzVRcygwbq.FQV);
        this.c = sjzVar == null ? skd.a : sjzVar;
        this.d = skc.a;
    }
}
