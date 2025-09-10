package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myi implements nkm {
    public final Context a;
    public final myl b;
    public final Executor c;
    public final pbn d;
    public final moc e;
    public final out f;
    public final View g;
    public final MainActivityLayout h;
    public syu i;
    public final jgt j;

    public myi(Context context, myl mylVar, uem uemVar, Executor executor, pbn pbnVar, jgt jgtVar, moc mocVar, out outVar) {
        this.a = context;
        this.b = mylVar;
        this.c = executor;
        this.d = pbnVar;
        this.j = jgtVar;
        this.e = mocVar;
        this.f = outVar;
        ngx ngxVar = (ngx) uemVar;
        this.h = (MainActivityLayout) ngxVar.a().c;
        this.g = (View) ((ThumbnailView) ngxVar.a().g).getParent().getParent();
    }

    public static boolean b(ram ramVar) {
        return ramVar == ram.DISABLED || ramVar == ram.NEEDS_SIGN_IN || ramVar == ram.ACCESS_DENIED || ramVar == ram.UNSUPPORTED_FOR_ALL_USERS;
    }

    @Override // defpackage.nkm
    public final void a() {
        syu syuVar = this.i;
        syuVar.getClass();
        ojl.cj(syuVar, new miz(this, 3));
    }
}
