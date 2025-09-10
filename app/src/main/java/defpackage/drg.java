package defpackage;

import androidx.window.area.reflectionguard.ExtensionWindowAreaStatusRequirements;
import androidx.window.area.reflectionguard.WindowAreaComponentApi3Requirements;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class drg implements uif {
    private final /* synthetic */ int a;

    public /* synthetic */ drg(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.window.extensions.WindowExtensions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.window.extensions.area.WindowAreaComponent] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.uif
    public final Object a() {
        ebn ebnVar;
        ?? r0;
        WindowAreaComponent windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        windowAreaComponent = 0;
        switch (this.a) {
            case 4:
                cdo cdoVar = drw.a;
                break;
            case 5:
                try {
                    ClassLoader classLoader = dtr.a.getClass().getClassLoader();
                    if (classLoader != null && (r0 = (ebnVar = new ebn(classLoader)).a) != 0 && coh.c("WindowExtensions#getWindowAreaComponent is not valid", new aet(r0, ebnVar, 14, windowAreaComponent))) {
                        Class clsA = ebnVar.a();
                        int i = dug.a;
                        if (dug.a() > 2 && coh.g(clsA, WindowAreaComponentApi3Requirements.class)) {
                            Object obj = ebnVar.b;
                            Class<?> clsLoadClass = ((ClassLoader) obj).loadClass("androidx.window.extensions.area.ExtensionWindowAreaStatus");
                            clsLoadClass.getClass();
                            if (dug.a() > 2 && coh.g(clsLoadClass, ExtensionWindowAreaStatusRequirements.class)) {
                                Class<?> clsLoadClass2 = ((ClassLoader) obj).loadClass("androidx.window.extensions.area.ExtensionWindowAreaPresentation");
                                clsLoadClass2.getClass();
                                if (dug.a() > 2 && coh.g(clsLoadClass2, ExtensionWindowAreaPresentation.class)) {
                                    windowAreaComponent = r0.getWindowAreaComponent();
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                if (windowAreaComponent != 0) {
                    int i2 = dug.a;
                    if (dug.a() >= 3) {
                        break;
                    }
                }
                break;
        }
        return ufg.a;
    }
}
