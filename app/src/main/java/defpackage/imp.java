package defpackage;

import android.app.Activity;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imp implements tzt {
    private final iso a;

    public imp(iso isoVar) {
        this.a = isoVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final WindowManager a() {
        WindowManager windowManager = ((Activity) this.a.b).getWindowManager();
        windowManager.getClass();
        return windowManager;
    }
}
