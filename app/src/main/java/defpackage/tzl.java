package defpackage;

import android.app.Service;
import android.content.ComponentCallbacks2;
import com.google.android.libraries.mdi.download.foreground.dagger.ForegroundDownloadService;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tzl extends Service {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // android.app.Service
    public final void onCreate() {
        ComponentCallbacks2 application = getApplication();
        if (!(application instanceof tzo)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), tzo.class.getCanonicalName()));
        }
        tzo tzoVar = (tzo) application;
        tzk tzkVarF = tzoVar.f();
        tzoVar.getClass();
        ?? r0 = ((tzn) tzkVarF).a;
        uem uemVar = (uem) r0.get(getClass().getName());
        if (uemVar == null) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (r0.containsKey(superclass.getCanonicalName())) {
                    arrayList.add(superclass.getCanonicalName());
                }
            }
            throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", getClass().getCanonicalName(), arrayList));
        }
        ejt ejtVar = (ejt) uemVar.a();
        try {
            tzn tznVar = new tzn((izm) ejtVar.a);
            ejtVar.getClass();
            ((ForegroundDownloadService) this).a = (pvu) ((izm) tznVar.a).fQ.a();
            super.onCreate();
        } catch (ClassCastException e) {
            throw new tzm(String.format("%s does not implement AndroidInjector.Factory<%s>", ejtVar.getClass().getCanonicalName(), getClass().getCanonicalName()), e);
        }
    }
}
