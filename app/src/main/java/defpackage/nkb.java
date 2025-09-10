package defpackage;

import android.view.ViewStub;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkb implements nkm {
    private final nby a;
    private final uem b;
    private final imi c;
    private final hbj d;
    private final jgt e;

    public nkb(nby nbyVar, uem uemVar, hbj hbjVar, jgt jgtVar, imi imiVar) {
        this.a = nbyVar;
        this.b = uemVar;
        this.d = hbjVar;
        this.e = jgtVar;
        this.c = imiVar;
    }

    @Override // defpackage.nkm
    public final void a() {
        if (this.d.p(gzo.bf)) {
            ViewStub viewStub = (ViewStub) ((ocq) ((mwq) this.b.a()).b).c(R.id.camera_remote_control_layout_stub);
            nby nbyVar = this.a;
            imi imiVar = this.c;
            nbyVar.d = viewStub;
            nbyVar.j = imiVar;
            this.e.k(nbyVar);
        }
    }
}
