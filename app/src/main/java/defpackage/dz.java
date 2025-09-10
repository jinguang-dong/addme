package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dz {
    static final dy a = new dy(new oo(1));
    public static final int b = -100;
    private static Boolean f = null;
    public static boolean c = false;
    public static final yf d = new yf();
    public static final Object e = new Object();

    public static void i(dz dzVar) {
        synchronized (e) {
            ye yeVar = new ye(d);
            while (yeVar.hasNext()) {
                dz dzVar2 = (dz) ((WeakReference) yeVar.next()).get();
                if (dzVar2 == dzVar || dzVar2 == null) {
                    yeVar.remove();
                }
            }
        }
    }

    static boolean n(Context context) throws PackageManager.NameNotFoundException {
        if (f == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) es.class), 640);
                if (serviceInfo.metaData != null) {
                    f = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f = false;
            }
        }
        return f.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract dm b();

    public abstract View c(int i);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int i);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract void o();

    public abstract void p(int i);
}
