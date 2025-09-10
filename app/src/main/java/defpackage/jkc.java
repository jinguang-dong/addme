package defpackage;

import android.view.View;
import com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView;
import com.google.android.apps.camera.wear.wearappv2.ui.settings.ComposeMenuButton;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jkc implements uif {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jkc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.uif
    public final Object a() {
        switch (this.b) {
            case 0:
                jkd jkdVar = (jkd) this.a;
                if (((jjq) jkdVar.j.dL()).e.isPresent()) {
                    jkdVar.o.j().d(jkdVar.i.a());
                }
                jkdVar.e();
                return ufg.a;
            case 1:
                ((jka) this.a).e();
                return ufg.a;
            case 2:
                jkg jkgVar = (jkg) this.a;
                if (((jjq) jkgVar.f.dL()).d.isPresent()) {
                    jkgVar.t.j().d(jkgVar.g.a());
                }
                jkgVar.e();
                return ufg.a;
            case 3:
                jki jkiVar = (jki) this.a;
                if (((jjq) jkiVar.e.dL()).d.isPresent()) {
                    jkiVar.n.j().d(jkiVar.f.a());
                }
                jkiVar.e();
                return ufg.a;
            case 4:
                ((jkj) this.a).e();
                return ufg.a;
            case 5:
                jkl jklVar = (jkl) this.a;
                if (((jjq) jklVar.m.dL()).b.isPresent()) {
                    jklVar.s.j().d(jklVar.n.a());
                }
                jklVar.e();
                return ufg.a;
            case 6:
                ((jkm) this.a).e();
                return ufg.a;
            case 7:
                ((ljj) this.a).e();
                return ufg.a;
            case 8:
                ((lkn) this.a).e();
                return ufg.a;
            case 9:
                ((View) this.a).performHapticFeedback(4);
                return ufg.a;
            case 10:
                ((View) this.a).performHapticFeedback(4);
                return ufg.a;
            case 11:
                int i = WearCountdownView.b;
                return Float.valueOf(((Number) ((abr) this.a).d()).floatValue());
            case 12:
                new nrs().d(((ComposeMenuButton) this.a).a.eo(), "key_setting_category");
                return ufg.a;
            case 13:
                Object obj = this.a;
                ((nrx) obj).p.h(nsk.b);
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj2 = this.a;
                ((nrx) obj2).t.h(nsk.c);
                return ufg.a;
            case 15:
                Object obj3 = this.a;
                ((nrx) obj3).t.h(nsk.d);
                return ufg.a;
            case 16:
                return new ujd((int[]) this.a);
            default:
                return this.a;
        }
    }
}
