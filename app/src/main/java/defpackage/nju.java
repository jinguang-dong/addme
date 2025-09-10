package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.supermodeswitcher.SupermodeSwitcher;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nju implements nkm {
    private final mzz a;
    private final uem b;
    private final jgt c;
    private final out d;
    private final boolean e;

    public nju(mzz mzzVar, uem uemVar, out outVar, jgt jgtVar, hbj hbjVar) {
        this.a = mzzVar;
        this.b = uemVar;
        this.d = outVar;
        this.c = jgtVar;
        this.e = hbjVar.p(gzo.bw);
    }

    @Override // defpackage.nkm
    public final void a() {
        ngx ngxVar = (ngx) this.b;
        mzz mzzVar = this.a;
        ngw ngwVarA = ngxVar.a();
        mzzVar.g(ngwVarA);
        Object obj = ngwVarA.j;
        Object obj2 = ngwVarA.c;
        ocq ocqVar = (ocq) obj;
        Object objC = ocqVar.c(R.id.mode_switcher);
        MainActivityLayout mainActivityLayout = (MainActivityLayout) obj2;
        mainActivityLayout.k((View) objC);
        mainActivityLayout.h((mxl) objC);
        SupermodeSwitcher supermodeSwitcher = (SupermodeSwitcher) ocqVar.c(R.id.supermode_switcher);
        if (this.e) {
            mxk mxkVar = mxk.TO_LEFT;
            mainActivityLayout.j(supermodeSwitcher, mxkVar);
            mainActivityLayout.i(supermodeSwitcher, mxkVar);
        } else {
            mainActivityLayout.k(supermodeSwitcher);
            mainActivityLayout.h(supermodeSwitcher);
        }
        ins.g(this.d, this.c, supermodeSwitcher);
    }
}
