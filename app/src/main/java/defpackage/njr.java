package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njr implements nkm {
    private final uem a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public njr(gli gliVar, uem uemVar, hbj hbjVar, int i) {
        this.b = i;
        this.d = gliVar;
        this.a = uemVar;
        this.c = hbjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, mxl] */
    @Override // defpackage.nkm
    public final void a() throws Resources.NotFoundException {
        int i = this.b;
        if (i == 0) {
            rwc rwcVar = (rwc) this.c;
            if (rwcVar.h()) {
                ((mhe) rwcVar.c()).k((FocusIndicatorView) ((MainActivityLayout) ((ocq) ((mwq) this.a.a()).b).c(R.id.activity_root_view)).findViewById(R.id.focus_indicator_view), (Context) this.d);
                return;
            }
            return;
        }
        if (i == 1) {
            if (((hbj) this.d).p(gzo.bJ)) {
                ngw ngwVarA = ((ngx) this.a).a();
                ViewStub viewStub = (ViewStub) ((ocq) ngwVarA.j).c(R.id.help_ui_camera_hub);
                ?? r4 = this.c;
                ((muu) r4).b = viewStub;
                ((MainActivityLayout) ngwVarA.c).h(r4);
                return;
            }
            return;
        }
        if (i == 2) {
            rwc rwcVar2 = (rwc) this.c;
            if (rwcVar2.h()) {
                ((mhe) rwcVar2.c()).k((FocusIndicatorView) ((MainActivityLayout) ((ngx) this.a).a().c).findViewById(R.id.focus_indicator_view), (Context) this.d);
                return;
            }
            return;
        }
        if (((hbj) this.c).p(gzo.by)) {
            return;
        }
        ngw ngwVarA2 = ((ngx) this.a).a();
        ViewStub viewStub2 = (ViewStub) ((ocq) ngwVarA2.j).c(R.id.mode_slider_ui_stub);
        ?? r42 = this.d;
        View viewA = ((gli) r42).a(viewStub2);
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ngwVarA2.c;
        mainActivityLayout.k(viewA);
        mainActivityLayout.h(r42);
    }

    public njr(Object obj, uem uemVar, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.a = uemVar;
        this.d = obj2;
    }
}
