package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonBc25Impl;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jkf implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jkf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r8v42, types: [hgj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Object, owq] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() throws Resources.NotFoundException {
        boolean z;
        switch (this.b) {
            case 0:
                jkg jkgVar = (jkg) this.a;
                jkgVar.r = false;
                View view = jkgVar.i;
                if (view == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                view.setVisibility(8);
                View view2 = jkgVar.j;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            case 1:
                jcv jcvVar = (jcv) this.a;
                jcvVar.i.g(jcvVar.P);
                return;
            case 2:
                jkg jkgVar2 = (jkg) this.a;
                if (!jkgVar2.h.compareAndSet(true, false)) {
                    ((sgt) jkg.c.c().M(2799)).s("Already unbound.");
                }
                jkgVar2.e();
                our ourVar = jkgVar2.q;
                if (ourVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ourVar.close();
                return;
            case 3:
                jki jkiVar = (jki) this.a;
                if (!jkiVar.g.compareAndSet(true, false)) {
                    ((sgt) jki.c.c().M(2801)).s("Already unbound.");
                }
                jkiVar.e();
                our ourVar2 = jkiVar.l;
                if (ourVar2 != null) {
                    ourVar2.close();
                    return;
                }
                return;
            case 4:
                jkl jklVar = (jkl) this.a;
                jklVar.q = false;
                jklVar.e.setVisibility(8);
                View view3 = jklVar.f;
                if (view3 != null) {
                    view3.setVisibility(8);
                    return;
                }
                return;
            case 5:
                ((jkm) this.a).h.setVisibility(8);
                return;
            case 6:
                mns mnsVar = (mns) this.a;
                ((imi) mnsVar.c).f(mnsVar.f);
                return;
            case 7:
                Object obj = this.a;
                joo jooVar = (joo) obj;
                synchronized (jooVar.c) {
                    z = ((joo) obj).f;
                    if (!z) {
                        ((joo) obj).f = true;
                        Iterator it = new ArrayList(((joo) obj).g).iterator();
                        while (it.hasNext()) {
                            jon jonVar = (jon) it.next();
                            if (!jonVar.b.l()) {
                                jonVar.b(((Long) jonVar.b.h()).longValue() + 3000000, jsl.COOKIE_CUTTER_SHUTTING_DOWN);
                            }
                        }
                    }
                }
                if (z) {
                    return;
                }
                jooVar.h.close();
                rwc rwcVar = jooVar.b;
                if (rwcVar.h()) {
                    ((jom) rwcVar.c()).close();
                    return;
                }
                return;
            case 8:
                ((jmv) this.a).b.close();
                return;
            case 9:
                ((AmbientMode.AmbientController) this.a).g();
                return;
            case 10:
                ((hpj) this.a.a()).j("microvideo-metadata");
                return;
            case 11:
                this.a.h();
                return;
            case 12:
                ((mle) this.a).i();
                return;
            case 13:
                Object obj2 = this.a;
                ((jxi) obj2).f.a(obj2);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj3 = this.a;
                ((jxp) obj3).r.a(obj3);
                return;
            case 15:
                Object obj4 = this.a;
                ((kai) obj4).n.post(new jxr(obj4, 10));
                return;
            case 16:
                sgv sgvVar = kcu.a;
                this.a.a(Float.valueOf(-999.0f));
                return;
            case 17:
                Object obj5 = this.a;
                ((keb) obj5).d.a(obj5);
                return;
            case 18:
                int i = kok.a;
                ((ovx) this.a).a(jhr.PSL);
                return;
            case 19:
                ((krj) this.a).j();
                return;
            default:
                ((OptionsEntryButtonBc25Impl) this.a).setImportantForAccessibility(0);
                return;
        }
    }
}
