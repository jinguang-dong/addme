package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.ThumbnailView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ikl extends ikj {
    final /* synthetic */ ikm b;

    public ikl(ikm ikmVar) {
        this.b = ikmVar;
    }

    @Override // defpackage.ikj, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        ikm ikmVar = this.b;
        ikmVar.h.k();
        mzz mzzVar = ikmVar.g;
        mzzVar.m(false);
        mzzVar.w(false);
        fvu fvuVar = ikmVar.e;
        boolean zK = ikmVar.f.k();
        fvuVar.c.setClickable(false);
        BottomBar bottomBar = fvuVar.a;
        mxm mxmVar = bottomBar.r;
        boolean z = mxmVar == mxm.REVERSE_LANDSCAPE || mxmVar == mxm.LANDSCAPE;
        if (zK) {
            z = !z;
        }
        bottomBar.x(z);
        bottomBar.p(sbv.n(fvo.CENTER_RIGHT, rwc.j(bottomBar.h())), true);
        ikmVar.d.W();
    }

    @Override // defpackage.ikj, defpackage.mcz, defpackage.mda
    public final void b() throws Resources.NotFoundException {
        ikm ikmVar = this.b;
        ikmVar.h.j();
        mzz mzzVar = ikmVar.g;
        mzzVar.m(true);
        mzzVar.w(true);
        fvu fvuVar = ikmVar.e;
        ThumbnailView thumbnailView = fvuVar.c;
        thumbnailView.setClickable(true);
        BottomBar bottomBar = fvuVar.a;
        bottomBar.x(true);
        bottomBar.p(sbv.n(fvo.CENTER_LEFT, rwc.j(thumbnailView)), true);
        ikmVar.d.r();
    }

    @Override // defpackage.ikj
    public void d() {
    }
}
