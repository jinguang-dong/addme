package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tww {
    private Context a;
    private ILoadedInstanceCreator b;
    private final twx c;

    public tww(twx twxVar) {
        this.c = twxVar;
    }

    public final synchronized Context a(Context context) {
        if (this.a == null) {
            try {
                this.a = context.createPackageContext(this.c.a, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new twv();
            }
        }
        return this.a;
    }

    public final synchronized ILoadedInstanceCreator b(Context context) {
        ILoadedInstanceCreator twtVar;
        if (this.b == null) {
            IBinder iBinderC = c(a(context).getClassLoader());
            if (iBinderC == null) {
                twtVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                twtVar = iInterfaceQueryLocalInterface instanceof ILoadedInstanceCreator ? (ILoadedInstanceCreator) iInterfaceQueryLocalInterface : new twt(iBinderC);
            }
            this.b = twtVar;
        }
        return this.b;
    }

    private static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass(cdVQ.PIY).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.dynamite.LoadedInstanceCreator", e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(YyLACfm.VLvcrwtOSRmk, e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("No constructor for dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e5);
        }
    }
}
