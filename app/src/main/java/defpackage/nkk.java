package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkk implements nkm {
    public final nqm a;
    private final uem b;
    private final Context c;
    private final nqa d;
    private final npy e;
    private final mzz f;
    private final fvu g;
    private final itl h;
    private final mmk i;
    private final rww j;
    private final luj k;
    private final hbj l;
    private final qwz m;

    public nkk(uem uemVar, Context context, nqa nqaVar, npy npyVar, itl itlVar, mzz mzzVar, fvu fvuVar, hbj hbjVar, luj lujVar, mmk mmkVar, rww rwwVar, nqm nqmVar, qwz qwzVar) {
        this.b = uemVar;
        this.c = context;
        this.d = nqaVar;
        this.e = npyVar;
        this.f = mzzVar;
        this.g = fvuVar;
        this.h = itlVar;
        this.l = hbjVar;
        this.k = lujVar;
        this.i = mmkVar;
        this.j = rwwVar;
        this.a = nqmVar;
        this.m = qwzVar;
    }

    @Override // defpackage.nkm
    public final void a() {
        PreviewOverlay previewOverlay = (PreviewOverlay) ((ocq) ((mwq) this.b.a()).b).c(R.id.preview_overlay);
        Context context = this.c;
        Handler handler = new Handler(context.getMainLooper());
        hbj hbjVar = this.l;
        nki nkiVar = new nki(context, handler, hbjVar);
        mzz mzzVar = this.f;
        nqm nqmVar = this.a;
        mzm mzmVarU = mzzVar.u();
        rww rwwVar = this.j;
        mmk mmkVar = this.i;
        nkf nkfVar = new nkf(nqmVar, mzmVarU, rwwVar, mmkVar);
        nkg nkgVar = new nkg(nqmVar, mzzVar.u(), rwwVar, mmkVar);
        nkh nkhVar = new nkh(this.d);
        qwz qwzVar = this.m;
        nql nqlVar = new nql(nkiVar, nkfVar, nkgVar, this.e, nkhVar, new nkj(qwzVar), new noy(qwzVar, this.g), new rnu(mzzVar.u()), this.k.a(luf.h), previewOverlay.getRootView(), context, hbjVar);
        this.h.b(nqlVar.o);
        previewOverlay.e = new noy(this, nqlVar);
    }
}
