package defpackage;

import android.view.ViewStub;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jjy implements nkm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jjy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, uem] */
    @Override // defpackage.nkm
    public final void a() {
        int i = this.b;
        if (i == 0) {
            ViewStub viewStub = (ViewStub) ((ocq) this.a).c(R.id.fossil_controls);
            viewStub.setLayoutResource(R.layout.blur_controls);
            viewStub.inflate();
            return;
        }
        if (i == 1) {
            ((ViewStub) ((ocq) this.a).c(R.id.compose_zoom_stub)).inflate();
            return;
        }
        if (i == 2) {
            Object obj = this.a;
            lif lifVar = (lif) obj;
            our ourVarJ = lifVar.f.j();
            ViewStub viewStub2 = (ViewStub) lifVar.g.c(R.id.help_ui_pro_feature);
            muu muuVar = lifVar.e;
            muuVar.b = viewStub2;
            muuVar.getClass();
            ksq ksqVar = new ksq(muuVar, 12);
            owf owfVar = lifVar.b;
            out outVar = lifVar.d;
            ourVarJ.d(owfVar.dK(ksqVar, outVar));
            ourVarJ.d(lifVar.c.dK(new ksq(obj, 13), outVar));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                ((ViewStub) ((ocq) this.a).c(R.id.creative_button_stub)).inflate();
                return;
            } else {
                lle lleVar = (lle) this.a.a();
                lleVar.p.j().d(lleVar.f.dK(new lld(lleVar, 6), lleVar.b));
                return;
            }
        }
        ocq ocqVar = (ocq) this.a;
        ViewStub viewStub3 = (ViewStub) ocqVar.c(R.id.ark_controls);
        ViewStub viewStub4 = (ViewStub) ocqVar.c(R.id.lens_controls);
        viewStub3.setLayoutResource(R.layout.pro_controls);
        viewStub4.setLayoutResource(R.layout.lens_controls);
        viewStub3.inflate();
        viewStub4.inflate();
    }
}
