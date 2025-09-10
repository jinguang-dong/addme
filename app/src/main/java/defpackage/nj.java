package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nj {
    private static final int a = Color.argb(230, 255, 255, 255);
    private static final int b = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uiq] */
    public static final void a(nh nhVar) {
        nw nwVarE = e.e(0, 0);
        nw nwVarE2 = e.e(a, b);
        View decorView = nhVar.getWindow().getDecorView();
        decorView.getClass();
        ?? r0 = nwVarE.c;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) r0.a(resources)).booleanValue();
        ?? r02 = nwVarE2.c;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) r02.a(resources2)).booleanValue();
        nn nnVar = new nn();
        Window window = nhVar.getWindow();
        window.getClass();
        nnVar.g(nwVarE, nwVarE2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = nhVar.getWindow();
        window2.getClass();
        nnVar.f(window2);
    }
}
