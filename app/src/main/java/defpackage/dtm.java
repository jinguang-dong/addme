package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtm implements dua {
    public final Context a;
    public final Window b;
    private final WindowAreaComponent c;
    private final ExtensionWindowAreaPresentation d;

    public dtm(WindowAreaComponent windowAreaComponent, ExtensionWindowAreaPresentation extensionWindowAreaPresentation, int i) throws SecurityException {
        Method method;
        Window window;
        this.c = windowAreaComponent;
        this.d = extensionWindowAreaPresentation;
        Context presentationContext = extensionWindowAreaPresentation.getPresentationContext();
        presentationContext.getClass();
        this.a = presentationContext;
        if (i >= 4) {
            window = extensionWindowAreaPresentation.getWindow();
        } else {
            Method[] methods = extensionWindowAreaPresentation.getClass().getMethods();
            methods.getClass();
            int i2 = 0;
            while (true) {
                if (i2 >= methods.length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (a.ao(method != null ? method.getName() : null, "getWindow") && a.ao(method.getReturnType(), Window.class)) {
                    break;
                } else {
                    i2++;
                }
            }
            window = method == null ? null : (Window) method.invoke(extensionWindowAreaPresentation, null);
        }
        this.b = window;
    }

    @Override // defpackage.dua
    public final void a() {
        this.c.endRearDisplayPresentationSession();
    }

    public final void b(View view) {
        view.getClass();
        this.d.setPresentationView(view);
    }
}
