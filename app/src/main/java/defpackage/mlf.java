package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlf implements ksf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mlf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ksf
    public final void a() {
        int i = this.b;
        if (i == 0) {
            mlg mlgVar = (mlg) this.a;
            if (mlgVar.c != null) {
                mlgVar.a();
                return;
            }
            return;
        }
        if (i == 1) {
            krj krjVar = (krj) this.a;
            krjVar.D.a(false);
            krjVar.M.f = true;
        } else {
            if (i == 2) {
                ((View) this.a).setFocusable(true);
                return;
            }
            njz njzVar = (njz) this.a;
            Object obj = ((ngx) njzVar.a).a().c;
            ((MainActivityLayout) obj).post(new mzq(this, obj, 11, null));
            if (njzVar.c.dL() == ltw.AUTO) {
                ((mbj) njzVar.d.a()).j();
            } else {
                ((mbj) njzVar.d.a()).h();
            }
        }
    }

    @Override // defpackage.ksf
    public final void c() {
        int i = this.b;
        if (i == 0) {
            dv dvVar = ((mlg) this.a).c;
            if (dvVar != null) {
                dvVar.hide();
                return;
            }
            return;
        }
        if (i == 1) {
            krj krjVar = (krj) this.a;
            krjVar.D.a(true);
            krjVar.M.f = false;
        } else {
            if (i == 2) {
                ((View) this.a).setFocusable(false);
                return;
            }
            njz njzVar = (njz) this.a;
            Object obj = ((ngx) njzVar.a).a().c;
            out.a();
            ((MainActivityLayout) obj).o.add(njzVar.p);
        }
    }

    @Override // defpackage.ksf
    public final /* synthetic */ void b() {
    }
}
