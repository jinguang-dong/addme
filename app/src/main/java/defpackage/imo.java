package defpackage;

import android.app.Activity;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imo implements tzt {
    private final iso a;

    public imo(iso isoVar) {
        this.a = isoVar;
    }

    public static Window c(iso isoVar) {
        Window window = ((Activity) isoVar.b).getWindow();
        window.getClass();
        return window;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Window a() {
        return c(this.a);
    }
}
